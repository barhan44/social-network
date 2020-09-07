import { Component, Input } from '@angular/core';

import { ProfileHobby } from '../model/profile.class';

@Component({
  selector: 'app-profile-hobby',
  templateUrl: './profile-hobby.component.html',
  styleUrls: ['./profile-hobby.component.scss'],
})
export class ProfileHobbyComponent {
  @Input() hobbies: ProfileHobby[];

  constructor() {}
}
