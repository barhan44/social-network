import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-sign-up-success',
  templateUrl: './sign-up-success.component.html',
  styleUrls: ['./sign-up-success.component.scss'],
})
export class SignUpSuccessComponent {
  profileUid: string;
  constructor(private activatedRoute: ActivatedRoute) {
    this.activatedRoute.params
      .subscribe((v) => (this.profileUid = v.uid))
      .unsubscribe();
  }
}
