import { Action, Store } from '@ngrx/store';

import { RootState } from './root.reducer';

export abstract class StoreService {
  protected store: Store<RootState>;

  protected dispatchAction(action: Action): void {
    this.store.dispatch(action);
  }

  abstract dispatchLoadAction(): void;
  abstract dispatchCreateAction(entity: any): void;
  abstract dispatchUpdateAction(entity: any): void;
  abstract dispatchRemoveAction(id: string): void;
}
