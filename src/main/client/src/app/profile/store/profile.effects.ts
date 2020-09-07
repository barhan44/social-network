import { Injectable } from '@angular/core';
import { Actions, Effect, ofType } from '@ngrx/effects';
import { catchError, map, switchMap } from 'rxjs/operators';
import { Observable, of } from 'rxjs';

import { ProfileService } from '../services/profile.service';
import * as ProfileActions from './profile.actions';

@Injectable()
export class ProfileEffects {
  constructor(private api: ProfileService, private actions$: Actions) {}

  @Effect()
  loadAction$ = this.actions$.pipe(
    ofType(ProfileActions.load),
    switchMap(() =>
      this.api.load().pipe(
        map((res) => ProfileActions.loadSuccess({ profile: res })),
        catchError((error) => ProfileEffects.handleError(error))
      )
    )
  );

  private static handleError(error: string): Observable<string> {
    return of(ProfileActions.error(error));
  }
}
