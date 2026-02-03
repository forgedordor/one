package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhh implements fbhf {
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
        eadc eadcVar = fbgz.a;
        a = eacj.e("45352228", true, "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.f("45352241", new eabn() { // from class: fbhg
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (feco) evsn.parseFrom(feco.a, (byte[]) obj);
            }
        }, "CAYIBAgFCAM", "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.e("45671696", true, "com.google.android.libraries.performance.primes", eadcVar);
        d = eacj.e("45633315", true, "com.google.android.libraries.performance.primes", eadcVar);
        e = eacj.e("45659478", false, "com.google.android.libraries.performance.primes", eadcVar);
        f = eacj.e("45677546", true, "com.google.android.libraries.performance.primes", eadcVar);
        g = eacj.c("45683026", -1L, "com.google.android.libraries.performance.primes", eadcVar);
        h = eacj.c("45683303", -1L, "com.google.android.libraries.performance.primes", eadcVar);
        i = eacj.c("45646085", 175500L, "com.google.android.libraries.performance.primes", eadcVar);
        j = eacj.c("45676837", -1L, "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbhf
    public final long a(Context context) {
        return ((Long) g.gX(context)).longValue();
    }

    @Override // defpackage.fbhf
    public final long b(Context context) {
        return ((Long) h.gX(context)).longValue();
    }

    @Override // defpackage.fbhf
    public final long c(Context context) {
        return ((Long) i.gX(context)).longValue();
    }

    @Override // defpackage.fbhf
    public final long d(Context context) {
        return ((Long) j.gX(context)).longValue();
    }

    @Override // defpackage.fbhf
    public final feco e(Context context) {
        return (feco) b.gX(context);
    }

    @Override // defpackage.fbhf
    public final boolean f(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhf
    public final boolean g(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhf
    public final boolean h(Context context) {
        return ((Boolean) d.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhf
    public final boolean i(Context context) {
        return ((Boolean) e.gX(context)).booleanValue();
    }

    @Override // defpackage.fbhf
    public final boolean j(Context context) {
        return ((Boolean) f.gX(context)).booleanValue();
    }
}
