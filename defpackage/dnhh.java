package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnhh extends fcyz implements fdap {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ dnhi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnhh(List list, dnhi dnhiVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = list;
        this.c = dnhiVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dngy dngyVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            List list = this.b;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fcva.y(arrayList, ((dngy) it.next()).k);
            }
            dnhi dnhiVar = this.c;
            String strAF = fcva.aF(arrayList, "_", null, null, null, 62);
            dnhg dnhgVar = new dnhg(dnhiVar, arrayList, null);
            this.a = 1;
            obj = dnhiVar.f("compose_permission_".concat(strAF), 0, dnhgVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        List<dngy> list2 = this.b;
        Map map = (Map) obj;
        fcxe fcxeVar = new fcxe();
        if (map != null) {
            for (String str : map.keySet()) {
                dngy dngyVar2 = dngy.a;
                str.getClass();
                dngy[] dngyVarArrValues = dngy.values();
                int length = dngyVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dngyVar = null;
                        break;
                    }
                    dngyVar = dngyVarArrValues[i2];
                    if (dngyVar.k.contains(str)) {
                        break;
                    }
                    i2++;
                }
                Boolean bool = (Boolean) map.get(str);
                if (dngyVar != null && bool != null) {
                    fcxeVar.put(dngyVar, bool);
                }
            }
        }
        for (dngy dngyVar3 : list2) {
            if (!fcxeVar.containsKey(dngyVar3)) {
                fcxeVar.put(dngyVar3, false);
            }
        }
        return fcwa.b(fcxeVar);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnhh(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
