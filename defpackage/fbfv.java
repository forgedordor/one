package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfv {
    public static final eadc a;
    public static volatile String b;

    static {
        eadg eadgVar = new eadg(new ejvr() { // from class: fbfu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = fbfv.b;
                if (str != null) {
                    return str;
                }
                synchronized (fbfv.class) {
                    strC = fbfv.b;
                    if (strC == null) {
                        strC = dzyc.c(context, "com.google.android.libraries.mobileconfiguration");
                        fbfv.b = strC;
                    }
                }
                return strC;
            }
        });
        eadgVar.c(ekhx.s("ANDROID_MESSAGING", "CARRIER_SERVICES", "ANDROID_MESSAGING_PRIMES"));
        a = eadgVar.a();
        b = null;
    }

    private fbfv() {
    }
}
