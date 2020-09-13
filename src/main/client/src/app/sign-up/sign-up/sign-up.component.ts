import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { take } from 'rxjs/operators';

import { SignUpService } from '../services/sign-up.service';
import { SignUpForm } from '../types';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.scss'],
})
export class SignUpComponent {
  signUpForm = this.fb.group(
    {
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      password: ['', Validators.required],
      passwordConfirmation: ['', Validators.required],
    },
    { validators: this.confirmPasswords }
  );
  constructor(
    private fb: FormBuilder,
    private signUpService: SignUpService,
    private router: Router
  ) {}

  onSubmit(): void {
    const form: SignUpForm = {
      firstName: this.signUpForm.get('firstName').value,
      lastName: this.signUpForm.get('lastName').value,
      password: this.signUpForm.get('password').value,
    };
    this.signUpService
      .signUp(form)
      .pipe(take(1))
      .subscribe((profile) =>
        this.router.navigate(['sign-up', 'success', profile.uid])
      );
  }

  confirmPasswords(group: FormGroup): { notSame: true } {
    const pass = group.get('password').value;
    const confirm = group.get('passwordConfirmation').value;

    return pass === confirm ? null : { notSame: true };
  }
}
