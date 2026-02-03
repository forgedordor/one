package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chqi extends fcyz implements fdat {
    int a;
    final /* synthetic */ chqj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chqi(chqj chqjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chqjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chqj chqjVar = this.b;
            egsj egsjVarN = egsn.n(chql.class);
            egsjVarN.g(new egsb("PROFILES_FULL_REFRESH_WORKER", pzy.c));
            Object objB = chqjVar.c.b();
            objB.getClass();
            egsa egsaVar = new egsa(((Number) objB).longValue(), TimeUnit.MINUTES);
            Object objB2 = chqjVar.d.b();
            objB2.getClass();
            egsjVarN.e(egsk.c(egsaVar, new egsa(((Number) objB2).longValue(), TimeUnit.MINUTES)));
            ListenableFuture listenableFutureA = chqjVar.b.a(egsjVarN.h());
            this.a = 1;
            if (fdxs.c(listenableFutureA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chqi(this.b, fcxyVar);
    }
}
