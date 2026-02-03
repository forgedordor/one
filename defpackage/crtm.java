package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtm {
    public static final crtm a = new crtm();
    public static final cczi b = cdag.g(cdag.b, "s_allow_list", "");
    private static final cczi c = cdag.h(cdag.b, "s_allow_list_ignore_case", true);

    private crtm() {
    }

    public final boolean a(alqm alqmVar) {
        if (alqmVar == null) {
            return false;
        }
        String strL = alqmVar.l();
        Object objE = b.e();
        objE.getClass();
        List<String> listS = fdgn.S((CharSequence) objE, new String[]{","}, 0, 6);
        if (listS.isEmpty()) {
            return false;
        }
        for (String str : listS) {
            Object objE2 = c.e();
            objE2.getClass();
            if (fdgn.j(str, strL, ((Boolean) objE2).booleanValue())) {
                return true;
            }
        }
        return false;
    }
}
