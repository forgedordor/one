package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbii implements fbig {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.e("45415027", true, "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.f("8", new eabn() { // from class: fbih
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (fehf) evsn.parseFrom(fehf.a, (byte[]) obj);
            }
        }, "EOgHGAQ", "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.c("45401381", 3600000L, "com.google.android.libraries.performance.primes", eadcVar);
        d = eacj.e("45420903", false, "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbig
    public final long a(Context context) {
        return ((Long) c.gX(context)).longValue();
    }

    @Override // defpackage.fbig
    public final fehf b(Context context) {
        return (fehf) b.gX(context);
    }

    @Override // defpackage.fbig
    public final boolean c(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbig
    public final boolean d(Context context) {
        return ((Boolean) d.gX(context)).booleanValue();
    }
}
