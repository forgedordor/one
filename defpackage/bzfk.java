package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzfk extends fcyz implements fdat {
    int a;
    final /* synthetic */ Map b;
    final /* synthetic */ fdau c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzfk(Map map, fdau fdauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = map;
        this.c = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzfk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            Map map = this.b;
            fcuq fcuqVar = new fcuq(map.keySet());
            List listAo = fcva.ao(fddu.r(0, 4));
            fdau fdauVar = this.c;
            ArrayList arrayList = new ArrayList(fcva.p(listAo, 10));
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                fcyi fcyiVar = fcyi.a;
                arrayList.add(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new bzfi(null, iIntValue, fcuqVar, fdauVar, map)));
            }
            this.a = 1;
            obj = fdii.a(arrayList, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Iterator it2 = ((Iterable) obj).iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = fcwa.j((Map) next, (Map) it2.next());
        }
        return next;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzfk bzfkVar = new bzfk(this.b, this.c, fcxyVar);
        bzfkVar.d = obj;
        return bzfkVar;
    }
}
