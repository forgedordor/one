package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgr {
    public static final eadc a;
    public static volatile String b;

    static {
        eadg eadgVar = new eadg(new ejvr() { // from class: fbgq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = fbgr.b;
                if (str != null) {
                    return str;
                }
                synchronized (fbgr.class) {
                    strC = fbgr.b;
                    if (strC == null) {
                        strC = dzyc.c(context, "com.google.android.libraries.user.profile.photopicker");
                        fbgr.b = strC;
                    }
                }
                return strC;
            }
        });
        eadgVar.c(new ekph("OBAKE"));
        a = eadgVar.a();
        b = null;
    }

    private fbgr() {
    }
}
