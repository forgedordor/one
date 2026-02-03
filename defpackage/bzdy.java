package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdy extends fcyz implements fdat {
    int a;
    final /* synthetic */ Map b;
    final /* synthetic */ bzem c;
    final /* synthetic */ bzbz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzdy(fcxy fcxyVar, Map map, bzem bzemVar, bzbz bzbzVar) {
        super(2, fcxyVar);
        this.b = map;
        this.c = bzemVar;
        this.d = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzdy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List listAo;
        List list;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
            if (i == 0) {
                fctl.b(obj);
                listAo = fcva.ao(this.b.entrySet());
                ArrayList arrayList = new ArrayList(fcva.p(listAo, 10));
                Iterator it = listAo.iterator();
                while (it.hasNext()) {
                    arrayList.add((eqnd) ((Map.Entry) it.next()).getValue());
                }
                eiju eijuVarB = this.c.c.b(arrayList, cpxz.b(this.d.c));
                this.e = listAo;
                this.a = 1;
                obj = fdxs.c(eijuVarB, this);
                if (obj != fcylVar) {
                }
                return fcylVar;
            }
            if (i != 1) {
                list = (List) this.e;
                fctl.b(obj);
                return bzhg.b(list, (Map) obj);
            }
            listAo = (List) this.e;
            fctl.b(obj);
            eqig eqigVar = (eqig) obj;
            ArrayList arrayList2 = new ArrayList(fcva.p(listAo, 10));
            Iterator it2 = listAo.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
            evtg evtgVar = eqigVar.b;
            evtgVar.getClass();
            evtg evtgVar2 = eqigVar.c;
            evtgVar2.getClass();
            List listA = bzhg.a(arrayList2, evtgVar, evtgVar2, bzdz.a);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listA) {
                if (((bzgw) obj2).c.getCode() == Status.Code.ALREADY_EXISTS) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(fcva.p(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((bzgw) it3.next()).a);
            }
            bzem bzemVar = this.c;
            this.e = listA;
            this.a = 2;
            Object objA = fdin.a(eicg.a(bzemVar.d), new bzef(null, arrayList4, bzemVar), this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            list = listA;
            obj = objA;
            return bzhg.b(list, (Map) obj);
        } catch (Exception e) {
            Map map = this.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                linkedHashMap.put(((Map.Entry) it4.next()).getKey(), new fctk(fctl.a(e)));
            }
            return linkedHashMap;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzdy bzdyVar = new bzdy(fcxyVar, this.b, this.c, this.d);
        bzdyVar.e = obj;
        return bzdyVar;
    }
}
