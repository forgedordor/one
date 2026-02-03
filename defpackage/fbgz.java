package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgz {
    public static final eadc a;
    public static volatile String b;

    static {
        eadg eadgVar = new eadg(new ejvr() { // from class: fbgy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = fbgz.b;
                if (str != null) {
                    return str;
                }
                synchronized (fbgz.class) {
                    strC = fbgz.b;
                    if (strC == null) {
                        strC = dzyc.c(context, "com.google.android.libraries.performance.primes");
                        fbgz.b = strC;
                    }
                }
                return strC;
            }
        });
        eadgVar.c(new ekph("CLIENT_LOGGING_PROD"));
        ejwl.l(true);
        ejwl.l(true);
        eadgVar.c = true;
        a = eadgVar.a();
        b = null;
    }

    private fbgz() {
    }
}
