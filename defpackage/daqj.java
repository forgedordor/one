package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daqj extends fcyz implements fdat {
    int a;
    final /* synthetic */ daql b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daqj(fcxy fcxyVar, daql daqlVar, List list) {
        super(2, fcxyVar);
        this.b = daqlVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daqj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eksl ekslVar = (eksl) daql.a.h();
        ekslVar.X(cqnc.S, "ConversationsPageDataBuilder");
        ekslVar.q("Loading conversations and their messages.");
        daql daqlVar = this.b;
        aeum aeumVarI = daqlVar.a().i(daqb.a(20), (cogw) daqlVar.b.b());
        List list = this.c;
        this.a = 1;
        Object objA = fdin.a(eicg.a(daqlVar.c), new daqe(null, aeumVarI, daqlVar, list), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        daqj daqjVar = new daqj(fcxyVar, this.b, this.c);
        daqjVar.d = obj;
        return daqjVar;
    }
}
