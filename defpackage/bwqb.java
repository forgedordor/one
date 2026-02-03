package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwqb extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwqd b;
    final /* synthetic */ bwvf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwqb(bwqd bwqdVar, bwvf bwvfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bwqdVar;
        this.c = bwvfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwqb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
                return obj;
            }
            fctl.b(obj);
            bwqd bwqdVar = this.b;
            egyt egytVar = bwqdVar.c;
            bwvf bwvfVar = this.c;
            bwqn bwqnVar = (bwqn) bwqdVar.b.b();
            fdjx fdjxVar = (fdjx) bwqnVar.a.b();
            fdjxVar.getClass();
            fcyh fcyhVar = (fcyh) bwqnVar.b.b();
            fcyhVar.getClass();
            fcsu fcsuVar = bwqnVar.c;
            fcsu fcsuVar2 = bwqnVar.d;
            fcsu fcsuVar3 = bwqnVar.e;
            fcsu fcsuVar4 = bwqnVar.f;
            cogw cogwVar = (cogw) bwqnVar.g.b();
            cogwVar.getClass();
            ListenableFuture listenableFutureA = egytVar.a(new bwqm(fdjxVar, fcyhVar, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, cogwVar, bwqnVar.h, bwvfVar), egzr.DONT_CARE);
            listenableFutureA.getClass();
            this.a = 1;
            Object objC = fdxs.c(listenableFutureA, this);
            return objC == fcylVar ? fcylVar : objC;
        } catch (Exception e) {
            cqbd cqbdVarE = bwqd.a.e();
            cqbdVarE.I("Failed to retrieve E2eeInfo as future");
            cqbdVarE.s(e);
            if ((e instanceof IllegalStateException) || (e instanceof bwuw) || (e instanceof ExecutionException)) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwqb(this.b, this.c, fcxyVar);
    }
}
