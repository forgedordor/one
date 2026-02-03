package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbad implements fbac {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;

    static {
        eadc eadcVar = fazx.a;
        a = eacj.e("45694881", false, "com.google.android.gms.clearcut_client", eadcVar);
        b = eacj.c("45694883", 1048576L, "com.google.android.gms.clearcut_client", eadcVar);
        c = eacj.c("45694884", 5L, "com.google.android.gms.clearcut_client", eadcVar);
        d = eacj.c("45694882", 100L, "com.google.android.gms.clearcut_client", eadcVar);
    }

    @Override // defpackage.fbac
    public final long a(Context context) {
        return ((Long) b.gX(context)).longValue();
    }

    @Override // defpackage.fbac
    public final long b(Context context) {
        return ((Long) c.gX(context)).longValue();
    }

    @Override // defpackage.fbac
    public final long c(Context context) {
        return ((Long) d.gX(context)).longValue();
    }

    @Override // defpackage.fbac
    public final boolean d(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }
}
