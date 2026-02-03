package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozs {
    final int a;
    final int b;
    final String c;

    public ozs(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.A;
        this.b = preference.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ozs)) {
            return false;
        }
        ozs ozsVar = (ozs) obj;
        return this.a == ozsVar.a && this.b == ozsVar.b && TextUtils.equals(this.c, ozsVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
