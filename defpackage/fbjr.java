package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbjr {
    public static final eadc a;
    public static volatile String b;

    static {
        eadg eadgVar = new eadg(new ejvr() { // from class: fbjq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = fbjr.b;
                if (str != null) {
                    return str;
                }
                synchronized (fbjr.class) {
                    strC = fbjr.b;
                    if (strC == null) {
                        strC = dzyc.c(context, "profile_primitives_android");
                        fbjr.b = strC;
                    }
                }
                return strC;
            }
        });
        eadgVar.c(ekhx.r("PROFILE_PRIMITIVES", "GMM_PRIMES"));
        a = eadgVar.a();
        b = null;
    }

    private fbjr() {
    }
}
