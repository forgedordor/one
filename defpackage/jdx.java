package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdx {
    public static final List a(ivu ivuVar) {
        ivuVar.getClass();
        jcr jcrVarL = ((jdw) ivuVar).L();
        boolean zB = b(jcrVarL);
        List listG = jcrVarL.G();
        ArrayList arrayList = new ArrayList(listG.size());
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            jcr jcrVar = (jcr) listG.get(i);
            arrayList.add(zB ? jcrVar.C() : jcrVar.D());
        }
        return arrayList;
    }

    private static final boolean b(jcr jcrVar) {
        int iAC = jcrVar.aC();
        int i = iAC - 1;
        if (iAC == 0) {
            throw null;
        }
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new fctg();
                }
                jcr jcrVarS = jcrVar.s();
                if (jcrVarS != null) {
                    return b(jcrVarS);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }
}
