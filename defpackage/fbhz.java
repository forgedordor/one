package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhz implements fbhy {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.e("45647279", false, "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.e("45647278", false, "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.e("45676195", true, "com.google.android.libraries.performance.primes", eadcVar);
        d = eacj.e("45683501", true, "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbhy
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhy
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhy
    public final boolean c(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhy
    public final boolean d(Context context) {
        return ((Boolean) d.gX(context)).booleanValue();
    }
}
