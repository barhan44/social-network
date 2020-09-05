import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { RootState } from '../../store/state/root.state';
import { ProfileService } from '../services/profile.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss'],
})
export class ProfileComponent implements OnInit {
  constructor(
    private store: Store<RootState>,
    private profileService: ProfileService
  ) {
    this.profileService.loadProfile();
  }

  ngOnInit(): void {}
}
