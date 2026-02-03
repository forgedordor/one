package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chlc extends fcyz implements fdat {
    int a;
    final /* synthetic */ chle b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chlc(chle chleVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chleVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chlc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            pzn pznVar = new pzn();
            pznVar.f("profile_cleanup_is_one_time_extra", true);
            ((egrx) egsjVarN).e = pznVar.a();
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
        return new chlc(this.b, fcxyVar);
    }
}
