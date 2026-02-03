package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cmnu {
    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract String d();

    public final boolean equals(Object obj) {
        if (obj instanceof cmnu) {
            return TextUtils.equals(d(), ((cmnu) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        String strD = d();
        if (strD != null) {
            return strD.hashCode();
        }
        return 0;
    }
}
