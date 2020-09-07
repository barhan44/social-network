import { Component, Input } from '@angular/core';
import { ProfileEducation } from '../model/profile.class';

@Component({
  selector: 'app-profile-education',
  templateUrl: './profile-education.component.html',
  styleUrls: ['./profile-education.component.scss'],
})
export class ProfileEducationComponent {
  @Input() education: ProfileEducation[];

  constructor() {}
}
