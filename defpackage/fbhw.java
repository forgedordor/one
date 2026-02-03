package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhw implements fbhs {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;
    public static final eaci e;
    public static final eaci f;
    public static final eaci g;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.f("45390627", new eabn() { // from class: fbht
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (dzmy) evsn.parseFrom(dzmy.a, (byte[]) obj);
            }
        }, "CAAQAxgGIJBOLQrXIzw", "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.f("45376983", new eabn() { // from class: fbhu
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (dznn) evsn.parseFrom(dznn.a, (byte[]) obj);
            }
        }, "CAEQZBj0AyDoBw", "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.e("45625683", false, "com.google.android.libraries.performance.primes", eadcVar);
        d = eacj.e("45617767", false, "com.google.android.libraries.performance.primes", eadcVar);
        e = eacj.e("33", false, "com.google.android.libraries.performance.primes", eadcVar);
        f = eacj.c("45661178", 500L, "com.google.android.libraries.performance.primes", eadcVar);
        g = eacj.f("45371370", new eabn() { // from class: fbhv
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (dznl) evsn.parseFrom(dznl.a, (byte[]) obj);
            }
        }, "CJYBEMgB", "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbhs
    public final long a(Context context) {
        return ((Long) f.gX(context)).longValue();
    }

    @Override // defpackage.fbhs
    public final dzmy b(Context context) {
        return (dzmy) a.gX(context);
    }

    @Override // defpackage.fbhs
    public final dznl c(Context context) {
        return (dznl) g.gX(context);
    }

    @Override // defpackage.fbhs
    public final dznn d(Context context) {
        return (dznn) b.gX(context);
    }

    @Override // defpackage.fbhs
    public final boolean e(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhs
    public final boolean f(Context context) {
        return ((Boolean) d.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhs
    public final boolean g(Context context) {
        return ((Boolean) e.gX(context)).booleanValue();
    }
}
