import { TestBed } from '@angular/core/testing';

import { ChannelBansService } from './channel-bans.service';

describe('ChannelBansService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ChannelBansService = TestBed.get(ChannelBansService);
    expect(service).toBeTruthy();
  });
});
