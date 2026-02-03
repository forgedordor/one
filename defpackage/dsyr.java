package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsyr {
    static eohz a(dsxw dsxwVar, boolean z) {
        List listB = dsxwVar.b();
        for (int i = !z ? 1 : 0; i < listB.size(); i++) {
            dsvq dsvqVar = (dsvq) listB.get(i);
            eohx eohxVar = dsvqVar.d;
            if (eohxVar == null) {
                eohxVar = eohx.a;
            }
            if ((eohxVar.b & 2048) != 0) {
                eohx eohxVar2 = dsvqVar.d;
                if (eohxVar2 == null) {
                    eohxVar2 = eohx.a;
                }
                eohz eohzVar = eohxVar2.e;
                return eohzVar == null ? eohz.a : eohzVar;
            }
        }
        return null;
    }
}
