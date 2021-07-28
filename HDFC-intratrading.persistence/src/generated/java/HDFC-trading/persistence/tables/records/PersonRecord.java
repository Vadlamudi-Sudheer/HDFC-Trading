/*
 * This file is generated by jOOQ.
 */
package HDFC-trading.persistence.tables.records;

import HDFC-trading.persistence.tables.Person;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonRecord extends UpdatableRecordImpl<PersonRecord> implements Record5<String, String, String, Integer, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>Schema.person.person_id</code>.
     */
    public void setPersonId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Schema.person.person_id</code>.
     */
    public String getPersonId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Schema.person.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Schema.person.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Schema.person.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Schema.person.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Schema.person.salary</code>.
     */
    public void setSalary(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Schema.person.salary</code>.
     */
    public Integer getSalary() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Schema.person.external</code>.
     */
    public void setExternal(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Schema.person.external</code>.
     */
    public Boolean getExternal() {
        return (Boolean) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Integer, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Integer, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Person.PERSON.PERSON_ID;
    }

    @Override
    public Field<String> field2() {
        return Person.PERSON.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Person.PERSON.LAST_NAME;
    }

    @Override
    public Field<Integer> field4() {
        return Person.PERSON.SALARY;
    }

    @Override
    public Field<Boolean> field5() {
        return Person.PERSON.EXTERNAL;
    }

    @Override
    public String component1() {
        return getPersonId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public Integer component4() {
        return getSalary();
    }

    @Override
    public Boolean component5() {
        return getExternal();
    }

    @Override
    public String value1() {
        return getPersonId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public Integer value4() {
        return getSalary();
    }

    @Override
    public Boolean value5() {
        return getExternal();
    }

    @Override
    public PersonRecord value1(String value) {
        setPersonId(value);
        return this;
    }

    @Override
    public PersonRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public PersonRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public PersonRecord value4(Integer value) {
        setSalary(value);
        return this;
    }

    @Override
    public PersonRecord value5(Boolean value) {
        setExternal(value);
        return this;
    }

    @Override
    public PersonRecord values(String value1, String value2, String value3, Integer value4, Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersonRecord
     */
    public PersonRecord() {
        super(Person.PERSON);
    }

    /**
     * Create a detached, initialised PersonRecord
     */
    public PersonRecord(String personId, String firstName, String lastName, Integer salary, Boolean external) {
        super(Person.PERSON);

        setPersonId(personId);
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);
        setExternal(external);
    }
}
