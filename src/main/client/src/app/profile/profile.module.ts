import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProfileRoutingModule } from './profile-routing.module';
import { ProfileComponent } from './profile/profile.component';
import { ProfileMainComponent } from './profile-main/profile-main.component';
import { ProfileHobbyComponent } from './profile-hobby/profile-hobby.component';
import { ProfileInfoComponent } from './profile-info/profile-info.component';
import { ProfileSkillsComponent } from './profile-skills/profile-skills.component';
import { ProfileEducationComponent } from './profile-education/profile-education.component';
import { ProfileSummaryComponent } from './profile-summary/profile-summary.component';
import { ProfileStoreModule } from './store/profile-store.module';
import { ComponentsModule } from '../components/components.module';
import { ProfileEditComponent } from './profile-edit/profile-edit.component';
import { ProfileEditMainComponent } from './profile-edit-main/profile-edit-main.component';
import { ProfileEditEducationComponent } from './profile-edit-education/profile-edit-education.component';
import { ProfileEditHobbyComponent } from './profile-edit-hobby/profile-edit-hobby.component';
import { ProfileEditInfoComponent } from './profile-edit-info/profile-edit-info.component';
import { ProfileEditSkillsComponent } from './profile-edit-skills/profile-edit-skills.component';
import { ProfileEditSummaryComponent } from './profile-edit-summary/profile-edit-summary.component';

@NgModule({
  declarations: [
    ProfileComponent,
    ProfileMainComponent,
    ProfileHobbyComponent,
    ProfileInfoComponent,
    ProfileSkillsComponent,
    ProfileEducationComponent,
    ProfileSummaryComponent,
    ProfileEditComponent,
    ProfileEditMainComponent,
    ProfileEditEducationComponent,
    ProfileEditHobbyComponent,
    ProfileEditInfoComponent,
    ProfileEditSkillsComponent,
    ProfileEditSummaryComponent,
  ],
  imports: [
    CommonModule,
    ProfileRoutingModule,
    ProfileStoreModule,
    ComponentsModule,
  ],
})
export class ProfileModule {}
