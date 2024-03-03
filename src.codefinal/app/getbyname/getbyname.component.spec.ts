import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetbynameComponent } from './getbyname.component';

describe('GetbynameComponent', () => {
  let component: GetbynameComponent;
  let fixture: ComponentFixture<GetbynameComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetbynameComponent]
    });
    fixture = TestBed.createComponent(GetbynameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
