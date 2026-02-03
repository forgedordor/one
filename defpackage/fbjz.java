package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbjz {
    public static final eadc a = new eadg(new ejvr() { // from class: fbjy
        @Override // defpackage.ejvr
        public final Object apply(Object obj) {
            String strC;
            Context context = (Context) obj;
            String str = fbjz.b;
            if (str != null) {
                return str;
            }
            synchronized (fbjz.class) {
                strC = fbjz.b;
                if (strC == null) {
                    strC = dzyc.c(context, "com.google.android.libraries.surveys");
                    fbjz.b = strC;
                }
            }
            return strC;
        }
    }).a();
    public static volatile String b = null;

    private fbjz() {
    }
}
