package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbge implements fbgd {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;
    public static final eaci e;
    public static final eaci f;
    public static final eaci g;
    public static final eaci h;
    public static final eaci i;
    public static final eaci j;

    static {
        eadc eadcVar = fbfv.a;
        a = eacj.c("21", 86400L, "com.google.android.libraries.mobileconfiguration", eadcVar);
        b = eacj.c("8", 86400L, "com.google.android.libraries.mobileconfiguration", eadcVar);
        c = eacj.e("20", false, "com.google.android.libraries.mobileconfiguration", eadcVar);
        d = eacj.e("13", false, "com.google.android.libraries.mobileconfiguration", eadcVar);
        e = eacj.e("10", true, "com.google.android.libraries.mobileconfiguration", eadcVar);
        f = eacj.e("14", false, "com.google.android.libraries.mobileconfiguration", eadcVar);
        g = eacj.c("6", 604800L, "com.google.android.libraries.mobileconfiguration", eadcVar);
        h = eacj.c("9", 3600L, "com.google.android.libraries.mobileconfiguration", eadcVar);
        i = eacj.c("7", 3600L, "com.google.android.libraries.mobileconfiguration", eadcVar);
        j = eacj.c("5", 3600L, "com.google.android.libraries.mobileconfiguration", eadcVar);
    }

    @Override // defpackage.fbgd
    public final long a(Context context) {
        return ((Long) a.gX(context)).longValue();
    }

    @Override // defpackage.fbgd
    public final long b(Context context) {
        return ((Long) b.gX(context)).longValue();
    }

    @Override // defpackage.fbgd
    public final long c(Context context) {
        return ((Long) g.gX(context)).longValue();
    }

    @Override // defpackage.fbgd
    public final long d(Context context) {
        return ((Long) h.gX(context)).longValue();
    }

    @Override // defpackage.fbgd
    public final long e(Context context) {
        return ((Long) i.gX(context)).longValue();
    }

    @Override // defpackage.fbgd
    public final long f(Context context) {
        return ((Long) j.gX(context)).longValue();
    }

    @Override // defpackage.fbgd
    public final boolean g(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }

    @Override // defpackage.fbgd
    public final boolean h(Context context) {
        return ((Boolean) d.gX(context)).booleanValue();
    }

    @Override // defpackage.fbgd
    public final boolean i(Context context) {
        return ((Boolean) e.gX(context)).booleanValue();
    }

    @Override // defpackage.fbgd
    public final boolean j(Context context) {
        return ((Boolean) f.gX(context)).booleanValue();
    }
}
