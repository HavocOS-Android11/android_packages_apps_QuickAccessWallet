/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.plugin.globalactions.wallet.common

import com.android.systemui.plugin.globalactions.wallet.reactive.Eventual
import com.android.systemui.plugin.globalactions.wallet.reactive.eventualOf

/**
 * Asynchronously determines if a wallet backend is available for use. Invoked when the wallet UI
 * can be shown but isn't currently available.
 */
interface BackendAvailabilityChecker {

    /** Is the backend available? */
    val isAvailable: Eventual<Boolean>
}