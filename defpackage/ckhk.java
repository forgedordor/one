package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckhk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ewjm b;
    final /* synthetic */ enxe c;
    final /* synthetic */ ckhm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckhk(ewjm ewjmVar, enxe enxeVar, ckhm ckhmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ewjmVar;
        this.c = enxeVar;
        this.d = ckhmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckhk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eksp ekspVar = ckhm.a;
            eksl ekslVar = (eksl) ekspVar.h();
            ewjm ewjmVar = this.b;
            enxe enxeVar = this.c;
            ekslVar.D("scheduleProvisioningForEligibleSims: operationTrigger: %s bugle trigger event: %s", ewjmVar, enxeVar);
            ckhm ckhmVar = this.d;
            this.a = 1;
            ((eksl) ekspVar.h()).D("scheduleProvisioningForAllEligibleSims: operationTrigger: %s bugle trigger event: %s", ewjmVar, enxeVar);
            Iterator it = ckhmVar.g().iterator();
            while (it.hasNext()) {
                ckhmVar.e((dggn) it.next(), ewjmVar, enxeVar);
            }
            if (fctx.a == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckhk(this.b, this.c, this.d, fcxyVar);
    }
}
