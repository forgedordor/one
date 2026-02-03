package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbiw implements fbiu {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.e("45663934", false, "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.f("45352226", new eabn() { // from class: fbiv
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (fehf) evsn.parseFrom(fehf.a, (byte[]) obj);
            }
        }, "EAAYAw", "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbiu
    public final fehf a(Context context) {
        return (fehf) b.gX(context);
    }

    @Override // defpackage.fbiu
    public final boolean b(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }
}
