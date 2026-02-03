package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwqf extends fcyz implements fdat {
    final /* synthetic */ bwqm a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwqf(fcxy fcxyVar, bwqm bwqmVar, List list) {
        super(2, fcxyVar);
        this.a = bwqmVar;
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwqf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb ekgbVarB = ((celq) this.a.c.b()).b(ekfv.a(this.b));
        ekgbVarB.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarB, 10)), 16));
        for (Object obj2 : ekgbVarB) {
            String strG = ((bkvw) obj2).g();
            strG.getClass();
            linkedHashMap.put(strG, obj2);
        }
        return linkedHashMap;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwqf bwqfVar = new bwqf(fcxyVar, this.a, this.b);
        bwqfVar.c = obj;
        return bwqfVar;
    }
}
