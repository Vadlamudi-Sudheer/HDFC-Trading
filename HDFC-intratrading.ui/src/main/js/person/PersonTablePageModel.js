import {icons} from '@eclipse-scout/core';

export default () => ({
  id: 'helloscout.PersonTablePage',
  objectType: 'PageWithTable',
  leaf: true,
  text: '${textKey:Persons}',
  detailTable: {
    id: 'helloscout.PersonTablePage.Table',
    objectType: 'Table',
    autoResizeColumns: true,
    columns: [
      {
        id: 'PersonIdColumn',
        objectType: 'Column',
        visible: false
      },
      {
        id: 'FirstNameColumn',
        objectType: 'Column',
        text: '${textKey:FirstName}',
        width: 300
      },
      {
        id: 'LastNameColumn',
        objectType: 'Column',
        text: '${textKey:LastName}',
        width: 300
      },
      {
        id: 'SalaryColumn',
        objectType: 'NumberColumn',
        text: '${textKey:Salary}',
        width: 200
      },
      {
        id: 'ExternColumn',
        objectType: 'BooleanColumn',
        text: '${textKey:External}',
        width: 150
      }
    ],
    menus: [
      {
        id: 'EditPersonMenu',
        objectType: 'Menu',
        text: '${textKey:EditPerson}',
        iconId: icons.PENCIL,
        menuTypes: [
          'Table.SingleSelection'
        ]
      },
      {
        id: 'CreatePersonMenu',
        objectType: 'Menu',
        text: '${textKey:CreatePerson}',
        iconId: icons.PLUS,
        menuTypes: [
          'Table.EmptySpace'
        ]
      },
      {
        id: 'DeletePersonMenu',
        objectType: 'Menu',
        text: '${textKey:DeletePerson}',
        iconId: icons.REMOVE,
        menuTypes: [
          'Table.SingleSelection'
        ]
      }
    ],
    tableControls: [
      {
        id: 'SearchFormTableControl',
        objectType: 'FormTableControl',
        iconId: icons.SEARCH,
        form: {
          id: 'SearchForm',
          objectType: 'helloscout.PersonSearchForm'
        }
      },
      {
        id: 'AggregateTableControl',
        objectType: 'AggregateTableControl'
      }
    ]
  }
});
