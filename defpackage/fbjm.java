package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbjm implements fbjk {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.f("10", new eabn() { // from class: fbjl
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (fehf) evsn.parseFrom(fehf.a, (byte[]) obj);
            }
        }, "EOgHGAQ", "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.e("45673425", false, "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.e("45673426", true, "com.google.android.libraries.performance.primes", eadcVar);
        d = eacj.e("45684338", true, "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbjk
    public final fehf a(Context context) {
        return (fehf) a.gX(context);
    }

    @Override // defpackage.fbjk
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }

    @Override // defpackage.fbjk
    public final boolean c(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }

    @Override // defpackage.fbjk
    public final boolean d(Context context) {
        return ((Boolean) d.gX(context)).booleanValue();
    }
}
