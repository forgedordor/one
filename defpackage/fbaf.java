package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbaf {
    public static final eadc a = new eadg(new ejvr() { // from class: fbae
        @Override // defpackage.ejvr
        public final Object apply(Object obj) {
            String strC;
            Context context = (Context) obj;
            String str = fbaf.b;
            if (str != null) {
                return str;
            }
            synchronized (fbaf.class) {
                strC = fbaf.b;
                if (strC == null) {
                    strC = dzyc.c(context, "com.google.android.libraries.consentverifier");
                    fbaf.b = strC;
                }
            }
            return strC;
        }
    }).a();
    public static volatile String b = null;

    private fbaf() {
    }
}
