import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-test-work',
  templateUrl: './test-work.component.html',
  styleUrls: ['./test-work.component.scss'],
})
export class TestWorkComponent implements OnInit {
  // tslint:disable-next-line:no-any
  test$: Observable<any> | undefined;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.test$ = this.http.get('/api/profile/test-user');
  }
}
