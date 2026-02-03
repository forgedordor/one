package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.core.TartarusKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhyf implements dhys {
    public static final dhyf a = new dhyf();

    private dhyf() {
    }

    @Override // defpackage.dhys
    public final Object a(fdap fdapVar, List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            etrb etrbVarB = etrb.b(((etqv) it.next()).c);
            if (etrbVarB == null) {
                etrbVarB = etrb.UNRECOGNIZED;
            }
            if (etrbVarB == etrb.TYPE_RULE) {
                list.getClass();
                int i = dhzm.a;
                ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((etqv) it2.next()).c));
                }
                int[] iArrAC = fcva.aC(arrayList);
                ArrayList arrayList2 = new ArrayList(fcva.p(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((etqv) it3.next()).b.I());
                }
                return new dhyg(new dhzn(TartarusKt.t(iArrAC, (byte[][]) arrayList2.toArray(new byte[0][]))));
            }
        }
        return null;
    }
}
