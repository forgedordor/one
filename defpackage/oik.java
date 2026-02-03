package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oik {
    public final int a;
    public okg b = null;
    public Bundle c = null;

    public oik(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oik)) {
            return false;
        }
        oik oikVar = (oik) obj;
        if (this.a != oikVar.a || !fdbq.f(this.b, oikVar.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = oikVar.c;
        if (fdbq.f(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !piu.b(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        okg okgVar = this.b;
        int iHashCode = okgVar != null ? okgVar.hashCode() : 0;
        int i = this.a;
        Bundle bundle = this.c;
        int i2 = (i * 31) + iHashCode;
        return bundle != null ? (i2 * 31) + piu.a(bundle) : i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
