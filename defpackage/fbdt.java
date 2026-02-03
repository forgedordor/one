package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbdt {
    public static final eadc a = new eadg(new ejvr() { // from class: fbds
        @Override // defpackage.ejvr
        public final Object apply(Object obj) {
            String strC;
            Context context = (Context) obj;
            String str = fbdt.b;
            if (str != null) {
                return str;
            }
            synchronized (fbdt.class) {
                strC = fbdt.b;
                if (strC == null) {
                    strC = dzyc.c(context, "com.google.android.libraries.abuse.hades.moirai");
                    fbdt.b = strC;
                }
            }
            return strC;
        }
    }).a();
    public static volatile String b = null;

    private fbdt() {
    }
}
