import { TestBed } from '@angular/core/testing';

import { BlockedByUserService } from './blocked-by-user.service';

describe('BlockedByUserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BlockedByUserService = TestBed.get(BlockedByUserService);
    expect(service).toBeTruthy();
  });
});
