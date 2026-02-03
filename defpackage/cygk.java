package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygk extends owd {
    private final Map a;

    public cygk(Map map) {
        this.a = map;
    }

    @Override // defpackage.owd
    public final /* bridge */ /* synthetic */ Object b(owe oweVar) {
        throw new fcth("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.owd
    public final Object c(ovx ovxVar, fcxy fcxyVar) {
        Integer num = (Integer) ovxVar.a();
        int iIntValue = num != null ? num.intValue() : 1;
        int i = ovxVar.b;
        int iMin = Math.min((iIntValue + i) - 1, 100);
        fddq fddqVar = new fddq(iIntValue, iMin);
        ArrayList arrayList = new ArrayList(fcva.p(fddqVar, 10));
        fcvy it = fddqVar.iterator();
        while (((fddp) it).a) {
            int iA = it.a();
            cygi cygiVar = (cygi) this.a.get(new Integer(iA));
            if (cygiVar == null) {
                cygiVar = new cygi(iA, a.g(iA, "Place Holder "), "run", new fdae() { // from class: cygj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                });
            }
            arrayList.add(cygiVar);
        }
        return new owb(arrayList, iIntValue == 1 ? null : new Integer(Math.max(iIntValue - i, 1)), iMin != 100 ? new Integer(iMin + 1) : null);
    }
}
