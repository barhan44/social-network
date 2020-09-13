import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';

import { SignUpRoutingModule } from './sign-up-routing.module';
import { SignUpComponent } from './sign-up/sign-up.component';
import { SignUpSuccessComponent } from './sign-up-success/sign-up-success.component';
import { SignUpService } from './services/sign-up.service';

@NgModule({
  declarations: [SignUpComponent, SignUpSuccessComponent],
  imports: [CommonModule, SignUpRoutingModule, ReactiveFormsModule],
  providers: [SignUpService],
})
export class SignUpModule {}
