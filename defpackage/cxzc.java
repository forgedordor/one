package defpackage;

import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxzc extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cxzd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxzc(cxzd cxzdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cxzdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxzc) c((dqwl) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarX = ((dqwl) this.b).x();
            eijuVarX.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarX, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        cxzd cxzdVar = this.c;
        Iterable<dqpd> iterable = (Iterable) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(iterable, 10)), 16));
        for (dqpd dqpdVar : iterable) {
            cxza cxzaVarA = cxzdVar.a.a();
            dqpdVar.getClass();
            Object objB = cxzaVarA.b(dqpdVar);
            String strAz = dqpdVar.az("count");
            strAz.getClass();
            fcti fctiVar = new fcti(objB, new Integer(Integer.parseInt(strAz)));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        return linkedHashMap;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxzc cxzcVar = new cxzc(this.c, fcxyVar);
        cxzcVar.b = obj;
        return cxzcVar;
    }
}
