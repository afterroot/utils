/*
 * Copyright (C) 2016-2022 Sandip Vaghela
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.afterroot.utils.data.model

import com.google.gson.annotations.SerializedName

/**
 * Definition version: 1
 */
data class VersionInfo(
    @SerializedName("currentVersion")
    val currentVersion: Int = 0,
    @SerializedName("latestLink")
    val latestLink: String? = null,
    @SerializedName("latestVersion")
    val latestVersion: Int = 0,
    @SerializedName("disabledVersions")
    val disabledVersions: List<Int> = emptyList(),
) {
    fun isDisabled() = disabledVersions.contains(currentVersion)
}
