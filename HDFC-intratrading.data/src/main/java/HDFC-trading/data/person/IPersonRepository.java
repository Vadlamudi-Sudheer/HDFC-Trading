package HDFC-trading.data.person;

import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.scout.rt.platform.ApplicationScoped;

@ApplicationScoped
public interface IPersonRepository {

  void store(String id, PersonDo person);

  Stream<PersonDo> all();

  Stream<PersonDo> list(PersonRestrictionDo restrictions);

  Optional<PersonDo> getById(String id);

  int remove(String id);

  PersonDo create(PersonDo person);
}
