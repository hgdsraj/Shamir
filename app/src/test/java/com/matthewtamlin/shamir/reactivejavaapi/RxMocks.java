/*
 * Copyright 2018 Matthew Tamlin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.matthewtamlin.shamir.reactivejavaapi;

import com.matthewtamlin.shamir.reactivejavaapi.crypto.RxShamir;
import io.reactivex.Observable;
import io.reactivex.Single;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RxMocks {
  public static RxShamir createMockRxShamir() {
    final RxShamir rxShamir = mock(RxShamir.class);
    
    when(rxShamir.createShares(any(), any())).thenReturn(Observable.never());
    when(rxShamir.recoverSecret(any(), any())).thenReturn(Single.never());
    
    return rxShamir;
  }
}
