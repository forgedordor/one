package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dzpp {
    static dzpp d(Activity activity) {
        return new dzox(null, new dzfh(activity.getClass().getName()), true);
    }

    public abstract dzfh a();

    public abstract String b();

    public abstract boolean c();

    final String e() {
        dzfh dzfhVarA = a();
        if (dzfhVarA != null) {
            return dzfhVarA.a;
        }
        String strB = b();
        ejyb.e(strB);
        return strB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzpp)) {
            return false;
        }
        dzpp dzppVar = (dzpp) obj;
        return e().equals(dzppVar.e()) && c() == dzppVar.c();
    }

    public final int hashCode() {
        return (e().hashCode() * 31) ^ (true != c() ? 1237 : 1231);
    }
}
