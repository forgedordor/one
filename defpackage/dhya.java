package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhya implements dhys {
    @Override // defpackage.dhys
    public final Object a(fdap fdapVar, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                etrb etrbVarB = etrb.b(((etqv) it.next()).c);
                if (etrbVarB == null) {
                    etrbVarB = etrb.UNRECOGNIZED;
                }
                if (etrbVarB == etrb.TYPE_RULE) {
                    return null;
                }
            }
        }
        if (fdapVar != null) {
            return new dhxz(fdapVar);
        }
        return null;
    }
}
