package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.pab;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, kyz.b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        super.a(pabVar);
        if (Build.VERSION.SDK_INT >= 28) {
            pabVar.a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.T();
    }
}
