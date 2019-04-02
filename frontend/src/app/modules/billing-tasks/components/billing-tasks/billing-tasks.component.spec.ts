import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BillingTasksComponent } from './billing-tasks.component';

describe('BillingTasksComponent', () => {
  let component: BillingTasksComponent;
  let fixture: ComponentFixture<BillingTasksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BillingTasksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BillingTasksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
