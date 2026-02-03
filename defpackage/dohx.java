package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohx {
    public static final doig a(String str) {
        Object next;
        dohy dohyVar;
        String str2;
        str.getClass();
        List listR = fdgn.R(str, new char[]{'/'});
        if (listR.size() != 2) {
            listR = null;
        }
        if (listR != null) {
            try {
                int i = doif.b;
                Iterator it = doic.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (fdbq.f(((doif) next).b(), fcva.N(listR))) {
                        break;
                    }
                }
                doif dohzVar = (doif) next;
                if (dohzVar == null) {
                    dohzVar = new dohz((String) fcva.N(listR));
                }
                List listR2 = fdgn.R((CharSequence) fcva.S(listR), new char[]{';'});
                String str3 = (String) fcva.N(listR2);
                if (listR2.size() != 2) {
                    listR2 = null;
                }
                if (listR2 == null || (str2 = (String) fcva.S(listR2)) == null) {
                    dohyVar = null;
                } else {
                    List listR3 = fdgn.R(str2, new char[]{'='});
                    String str4 = (String) fcva.N(listR3);
                    if (listR3.size() != 2) {
                        listR3 = null;
                    }
                    dohyVar = new dohy(str4, listR3 != null ? (String) fcva.S(listR3) : null);
                }
                return new doig(dohzVar, str3, dohyVar);
            } catch (IllegalArgumentException e) {
                ((ekrd) ((ekrd) doig.a.i()).g(e).h("com/google/android/libraries/compose/media/MediaType$Companion", "fromString", 93, "MediaType.kt")).t("Could not build MediaType from '%s'", str);
            }
        }
        return null;
    }
}
