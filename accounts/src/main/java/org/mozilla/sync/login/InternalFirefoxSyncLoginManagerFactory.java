/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.sync.login;

import android.content.Context;
import org.mozilla.sync.FirefoxSyncLoginManager;

/**
 * <b>NON-PUBLIC API:</b> please use {@link org.mozilla.sync.FirefoxSync} instead. This class is used to escalate
 * visibility of {@code protected} components for internal library use.
 */
public class InternalFirefoxSyncLoginManagerFactory {
    private InternalFirefoxSyncLoginManagerFactory() {}

    /** Please use {@link org.mozilla.sync.FirefoxSync#getLoginManager(android.content.Context)} instead. */
    public static FirefoxSyncLoginManager internalGetLoginManager(final Context context) {
        return new FirefoxSyncWebViewLoginManager(context);
    }
}