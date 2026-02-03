package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdmk extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdml b;
    final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdmk(cdml cdmlVar, Map map, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdmlVar;
        this.c = map;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdmk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.a.a().b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((alqm) fdct.b(((aoer) it.next()).o()));
        }
        List listAe = fcva.ae(arrayList);
        Map map = this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!listAe.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collectionValues = linkedHashMap.values();
        int i2 = 0;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue() && (i2 = i2 + 1) < 0) {
                    fcva.l();
                }
            }
        }
        return i2 == 0 ? akbk.d : i2 == linkedHashMap.keySet().size() ? akbk.b : akbk.c;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdmk(this.b, this.c, fcxyVar);
    }
}
