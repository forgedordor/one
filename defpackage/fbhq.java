package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhq implements fbhn {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.f("15", new eabn() { // from class: fbho
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (fehf) evsn.parseFrom(fehf.a, (byte[]) obj);
            }
        }, "EAAYAg", "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.f("45357002", new eabn() { // from class: fbhp
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (dzmp) evsn.parseFrom(dzmp.a, (byte[]) obj);
            }
        }, "CAASABgAIAAoADAAOABAAA", "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.f("45355611", new eabn() { // from class: fbhp
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (dzmp) evsn.parseFrom(dzmp.a, (byte[]) obj);
            }
        }, "CAASABgAIAAoADAAOABAAA", "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbhn
    public final dzmp a(Context context) {
        return (dzmp) b.gX(context);
    }

    @Override // defpackage.fbhn
    public final dzmp b(Context context) {
        return (dzmp) c.gX(context);
    }

    @Override // defpackage.fbhn
    public final fehf c(Context context) {
        return (fehf) a.gX(context);
    }
}
