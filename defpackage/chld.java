package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chld extends fcyz implements fdat {
    int a;
    final /* synthetic */ chle b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chld(chle chleVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chleVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chld) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chle chleVar = this.b;
            egsj egsjVarN = egsn.n(chlh.class);
            egsjVarN.g(new egsb("PROFILES_CLEANUP_WORKER", pzy.d));
            Object objB = chleVar.b.b();
            objB.getClass();
            egsjVarN.e(new egrz(new egsa(((Number) objB).longValue(), TimeUnit.MINUTES), ejud.a));
            ListenableFuture listenableFutureC = chleVar.a.c(egsjVarN.h());
            this.a = 1;
            if (fdxs.c(listenableFutureC, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chld(this.b, fcxyVar);
    }
}
