package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.analytics.consent.LoggingConsentSettingsActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srf implements sre {
    @Override // defpackage.sre
    public final void a(ozm ozmVar, Optional optional) {
        if (optional.isPresent()) {
            ((Preference) optional.get()).L(R.string.logging_consent_settings_screen_title);
            ((Preference) optional.get()).t = aiiw.c(ozmVar.A(), LoggingConsentSettingsActivity.class, "android.intent.action.VIEW").a();
        }
    }
}
