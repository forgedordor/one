package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbja implements fbiy {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.c("45641094", 2L, "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.e("3", false, "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.c("45357887", 1L, "com.google.android.libraries.performance.primes", eadcVar);
        d = eacj.f("19", new eabn() { // from class: fbiz
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (fehf) evsn.parseFrom(fehf.a, (byte[]) obj);
            }
        }, "EAAYAg", "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbiy
    public final long a(Context context) {
        return ((Long) a.gX(context)).longValue();
    }

    @Override // defpackage.fbiy
    public final long b(Context context) {
        return ((Long) c.gX(context)).longValue();
    }

    @Override // defpackage.fbiy
    public final fehf c(Context context) {
        return (fehf) d.gX(context);
    }

    @Override // defpackage.fbiy
    public final boolean d(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }
}
