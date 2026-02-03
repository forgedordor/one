package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlvt implements dlvp {
    private final fctc a;
    private final fctc b;

    public dlvt(ekhx ekhxVar, ekhx ekhxVar2) {
        ekhxVar.getClass();
        this.a = fctd.a(new dlvs(ekhxVar));
        this.b = fctd.a(new dlvr(ekhxVar2));
    }

    public static final String[] b(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = ((dlvc) it.next()).k;
            if (str != null) {
                arrayList.add(str);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        strArr.getClass();
        return strArr;
    }

    @Override // defpackage.dlvp
    public final String[] a(dlvo dlvoVar) {
        dlvoVar.getClass();
        int iOrdinal = dlvoVar.ordinal();
        if (iOrdinal == 0) {
            return ((dlvn) this.a.a()).a;
        }
        if (iOrdinal == 1) {
            return ((dlvn) this.b.a()).a;
        }
        throw new fctg();
    }
}
