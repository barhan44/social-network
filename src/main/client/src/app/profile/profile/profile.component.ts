import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { ProfileStoreService } from '../store/profile-store.service';
import { Profile } from '../model/profile.class';
import { ActivatedRoute, Params } from '@angular/router';
import { take } from 'rxjs/operators';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss'],
})
export class ProfileComponent implements OnInit {
  private uid: string;
  public profile$: Observable<Profile>;
  public loading$: Observable<boolean>;
  public error$: Observable<string>;

  constructor(
    private profileStoreService: ProfileStoreService,
    private activatedRoute: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.activatedRoute.params
      .pipe(take(1))
      .subscribe((p: Params) => (this.uid = p.uid));
    this.profileStoreService.dispatchLoadAction(this.uid);
    this.profile$ = this.profileStoreService.getProfile();
    this.loading$ = this.profileStoreService.getIsLoading();
    this.error$ = this.profileStoreService.getError();
  }
}
