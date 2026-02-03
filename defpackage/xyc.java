package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xyc implements fdpm {
    final /* synthetic */ iaf a;
    final /* synthetic */ List b;
    final /* synthetic */ xye c;
    final /* synthetic */ fdjx d;
    final /* synthetic */ fdae e;

    public xyc(iaf iafVar, List list, xye xyeVar, fdjx fdjxVar, fdae fdaeVar) {
        this.a = iafVar;
        this.b = list;
        this.c = xyeVar;
        this.d = fdjxVar;
        this.e = fdaeVar;
    }

    @Override // defpackage.fdpm
    public final /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        List list;
        int iIntValue = ((Number) obj).intValue();
        fddq fddqVar = new fddq(iIntValue - 1, iIntValue + 1);
        ArrayList arrayList = new ArrayList();
        fcvy it = fddqVar.iterator();
        while (true) {
            list = this.b;
            if (!((fddp) it).a) {
                break;
            }
            Object next = it.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 < list.size()) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(arrayList, 10)), 16));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue3 = ((Number) it2.next()).intValue();
            Integer num = new Integer(iIntValue3);
            Object obj2 = list.get(iIntValue3);
            if (obj2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            fcti fctiVar = new fcti(num, ((ajlt) obj2).b().a());
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        iaf iafVar = this.a;
        iafVar.c.retainAll(linkedHashMap.values());
        Iterator it3 = linkedHashMap.keySet().iterator();
        while (it3.hasNext()) {
            int iIntValue4 = ((Number) it3.next()).intValue();
            Object obj3 = linkedHashMap.get(new Integer(iIntValue4));
            if (obj3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            xye xyeVar = this.c;
            fdjx fdjxVar = this.d;
            fdae fdaeVar = this.e;
            if (iafVar.get(obj3) == null) {
                iafVar.put(obj3, ((xvy) xyeVar.i.a()).a((ajlt) list.get(iIntValue4), fdjxVar, fdaeVar));
            }
        }
        return fctx.a;
    }
}
