package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzfc extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzfe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzfc(bzfe bzfeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzfeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzfc) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Map map;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            map = (Map) this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            Map map2 = (Map) this.b;
            bzfe bzfeVar = this.c;
            eiju eijuVarN = bzfeVar.a.N(ekfv.a(map2.values()));
            this.b = map2;
            this.a = 1;
            Object objC = fdxs.c(eijuVarN, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            map = map2;
            obj = objC;
        }
        List<eqnl> listAo = fcva.ao(((cpvs) obj).a);
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(listAo, 10)), 16));
        for (eqnl eqnlVar : listAo) {
            eqnq eqnqVar = eqnlVar.d;
            if (eqnqVar == null) {
                eqnqVar = eqnq.a;
            }
            eqmw eqmwVar = eqnqVar.c;
            if (eqmwVar == null) {
                eqmwVar = eqmw.a;
            }
            fcti fctiVar = new fcti(eqmwVar.b, eqnlVar.c);
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (String) linkedHashMap.get(entry.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(fcwa.a(linkedHashMap3.size()));
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Object key = entry3.getKey();
            Object value = entry3.getValue();
            value.getClass();
            linkedHashMap4.put(key, new fctk(value));
        }
        return linkedHashMap4;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzfc bzfcVar = new bzfc(this.c, fcxyVar);
        bzfcVar.b = obj;
        return bzfcVar;
    }
}
