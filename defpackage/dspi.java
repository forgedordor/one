package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspi {
    public static synchronized etns a(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            return etns.LIGHT;
        }
        if (i != 32) {
            return etns.UNSPECIFIED;
        }
        return etns.DARK;
    }

    public static final etns b(etns etnsVar, etly etlyVar) throws dsph {
        if (d(etnsVar, etlyVar.k)) {
            return etns.UNSPECIFIED;
        }
        c(etnsVar, etlyVar.k);
        Iterator<E> it = etlyVar.h.iterator();
        while (it.hasNext()) {
            c(etnsVar, ((etlk) it.next()).i);
        }
        return etnsVar;
    }

    public static final etnt c(etns etnsVar, List list) throws dsph {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            etnt etntVar = (etnt) it.next();
            etns etnsVarB = etns.b(etntVar.c);
            if (etnsVarB == null) {
                etnsVarB = etns.UNSPECIFIED;
            }
            if (etnsVarB.equals(etnsVar)) {
                return etntVar;
            }
        }
        throw new dsph();
    }

    public static boolean d(etns etnsVar, List list) {
        if (etnsVar == etns.UNSPECIFIED) {
            return true;
        }
        return list.isEmpty();
    }
}
