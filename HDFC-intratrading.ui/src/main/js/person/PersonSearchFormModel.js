import {Action} from '@eclipse-scout/core';

export default () => ({
  id: 'helloscout.PersonSearchForm',
  rootGroupBox: {
    id: 'MainBox',
    objectType: 'GroupBox',
    fields: [
      {
        id: 'DetailBox',
        objectType: 'GroupBox',
        gridColumnCount: 2,
        fields: [
          {
            id: 'FirstNameField',
            objectType: 'StringField',
            maxLength: 200,
            label: '${textKey:FirstName}'
          },
          {
            id: 'LastNameField',
            objectType: 'StringField',
            maxLength: 200,
            label: '${textKey:LastName}'
          }
        ]
      }
    ],
    menus: [
      {
        id: 'SearchButton',
        objectType: 'Menu',
        actionStyle: Action.ActionStyle.BUTTON,
        text: '${textKey:Search}',
        keyStroke: 'ENTER'
      },
      {
        id: 'ResetMenu',
        objectType: 'ResetMenu'
      }
    ]
  }
});
