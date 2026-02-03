package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fazx {
    public static final eadc a;
    public static volatile String b;

    static {
        eadg eadgVar = new eadg(new ejvr() { // from class: fazw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = fazx.b;
                if (str != null) {
                    return str;
                }
                synchronized (fazx.class) {
                    strC = fazx.b;
                    if (strC == null) {
                        strC = dzyc.c(context, "com.google.android.gms.clearcut_client");
                        fazx.b = strC;
                    }
                }
                return strC;
            }
        });
        eadgVar.c(ekhx.t("METALOG_COUNTERS", "CLEARCUT_LOG_LOSS", "CLEARCUT_FUNNEL", "CLEARCUT_BACKSTOP"));
        a = eadgVar.a();
        b = null;
    }

    private fazx() {
    }
}
