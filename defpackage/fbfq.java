package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfq {
    public static final eadc a;
    public static volatile String b;

    static {
        eadg eadgVar = new eadg(new ejvr() { // from class: fbfp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = fbfq.b;
                if (str != null) {
                    return str;
                }
                synchronized (fbfq.class) {
                    strC = fbfq.b;
                    if (strC == null) {
                        strC = dzyc.c(context, "com.google.android.libraries.mdi.sync");
                        fbfq.b = strC;
                    }
                }
                return strC;
            }
        });
        eadgVar.c(ekhx.r("MDI_SYNC_COMPONENTS_VERBOSE", "MDI_SYNC_COMPONENTS_GAIA"));
        a = eadgVar.a();
        b = null;
    }

    private fbfq() {
    }
}
