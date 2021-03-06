export default () => ({
  id: 'helloscout.PersonForm',
  displayHint: 'view',
  rootGroupBox: {
    id: 'MainBox',
    objectType: 'GroupBox',
    fields: [
      {
        id: 'DetailBox',
        objectType: 'GroupBox',
        fields: [
          {
            id: 'FirstNameField',
            objectType: 'StringField',
            label: '${textKey:FirstName}',
            maxLength: 200
          },
          {
            id: 'LastNameField',
            objectType: 'StringField',
            label: '${textKey:LastName}',
            maxLength: 200,
            mandatory: true
          },
          {
            id: 'SalaryField',
            objectType: 'NumberField',
            label: '${textKey:Salary}',
            minValue: 0,
            maxValue: 99999999
          },
          {
            id: 'ExternalField',
            objectType: 'CheckBoxField',
            label: '${textKey:External}'
          }
        ]
      }
    ],
    menus: [
      {
        id: 'OkMenu',
        objectType: 'OkMenu',
        tooltipText: '${textKey:OkMenuTooltip}'
      },
      {
        id: 'CancelMenu',
        objectType: 'CancelMenu',
        tooltipText: '${textKey:CancelMenuTooltip}'
      }
    ]
  }
});
