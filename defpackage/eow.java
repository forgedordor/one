package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eow {
    private static final Comparator a = new Comparator() { // from class: eov
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return fdbq.a(((eou) obj).a(), ((eou) obj2).a());
        }
    };

    public static final List a(int i, int i2, List list, List list2) {
        if (list.isEmpty()) {
            return fcvo.a;
        }
        List listAq = fcva.aq(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            eou eouVar = (eou) list.get(i3);
            int iA = eouVar.a();
            if (i <= iA && iA <= i2) {
                listAq.add(eouVar);
            }
        }
        fcva.s(listAq, a);
        return listAq;
    }
}
