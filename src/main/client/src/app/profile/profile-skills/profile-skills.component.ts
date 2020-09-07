import { Component, Input } from '@angular/core';

import { ProfileSkill } from '../model/profile.class';

@Component({
  selector: 'app-profile-skills',
  templateUrl: './profile-skills.component.html',
  styleUrls: ['./profile-skills.component.scss'],
})
export class ProfileSkillsComponent {
  @Input() skills: ProfileSkill[];

  constructor() {}
}
