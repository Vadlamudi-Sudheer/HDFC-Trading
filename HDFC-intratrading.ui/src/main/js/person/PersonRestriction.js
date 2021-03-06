import * as $ from 'jquery';

export default class PersonRestriction {

  constructor() {
    this.resourceType = 'PersonRestriction';
    this.firstName = null;
    this.lastName = null;
  }

  init(model) {
    $.extend(this, model);
  }

  setFirstName(firstName) {
    this.firstName = firstName;
  }

  setLastName(lastName) {
    this.lastName = lastName;
  }
}
