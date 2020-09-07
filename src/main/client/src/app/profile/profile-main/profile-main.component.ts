import { Component, Input } from '@angular/core';

import { Profile } from '../model/profile.class';

@Component({
  selector: 'app-profile-main',
  templateUrl: './profile-main.component.html',
  styleUrls: ['./profile-main.component.scss'],
})
export class ProfileMainComponent {
  @Input() profile: Profile;

  constructor() {}
}
