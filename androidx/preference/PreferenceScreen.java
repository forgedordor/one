package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.ozw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean e;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, kyz.b(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.e = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ad() {
        return false;
    }

    public final void ag() {
        if (((PreferenceGroup) this).c) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.e = false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        ozw ozwVar;
        if (this.t != null || this.u != null || k() == 0 || (ozwVar = this.k.e) == null) {
            return;
        }
        ozwVar.aX();
    }
}
