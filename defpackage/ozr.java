package defpackage;

import androidx.car.app.model.Alert;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozr implements ozb {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ ozt b;

    public ozr(ozt oztVar, PreferenceGroup preferenceGroup) {
        this.b = oztVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.ozb
    public final boolean a(Preference preference) {
        this.a.ac(Alert.DURATION_SHOW_INDEFINITELY);
        this.b.b();
        return true;
    }
}
