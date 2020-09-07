import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { ProfileStoreService } from '../store/profile-store.service';
import { Profile } from '../model/profile.class';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss'],
})
export class ProfileComponent implements OnInit {
  public profile$: Observable<Profile>;
  public loading$: Observable<boolean>;
  public error$: Observable<string>;

  constructor(private profileStoreService: ProfileStoreService) {}

  ngOnInit(): void {
    this.profileStoreService.dispatchLoadAction();
    this.profile$ = this.profileStoreService.getProfile();
    this.loading$ = this.profileStoreService.getIsLoading();
    this.error$ = this.profileStoreService.getError();
  }
}
