/*
 * This file is part of Visual Code Space.
 *
 * Visual Code Space is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Visual Code Space is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Visual Code Space.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package com.teixeira.vcspace.utils

import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatDelegate

/**
 * Check if the app is in light or dark mode.
 *
 * @return If the app is in dark mode.
 */
fun Context.isDarkMode(): Boolean {
    val defaultNightMode = AppCompatDelegate.getDefaultNightMode()
    if (defaultNightMode == AppCompatDelegate.MODE_NIGHT_YES) {
        return true
    } else if (defaultNightMode == AppCompatDelegate.MODE_NIGHT_NO) {
        return false
    }

    val uiMode = (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK)
    return uiMode == Configuration.UI_MODE_NIGHT_YES
}
