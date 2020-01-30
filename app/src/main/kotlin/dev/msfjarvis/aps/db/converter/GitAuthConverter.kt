/*
 * Copyright © 2019-2020 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */
package dev.msfjarvis.aps.db.converter

import androidx.room.TypeConverter
import dev.msfjarvis.aps.db.entity.GitAuth

class GitAuthConverter {
    @TypeConverter
    fun stringToGitAuth(authType: String) = GitAuth.valueOf(authType)

    @TypeConverter
    fun gitAuthToString(authType: GitAuth): String = authType.name
}
