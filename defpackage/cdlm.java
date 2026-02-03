package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdlu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdlm(fcxy fcxyVar, cdlu cdluVar) {
        super(2, fcxyVar);
        this.b = cdluVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdlm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture listenableFutureA = this.b.b.a();
        listenableFutureA.getClass();
        this.a = 1;
        Object objC = fdxs.c(listenableFutureA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdlm cdlmVar = new cdlm(fcxyVar, this.b);
        cdlmVar.c = obj;
        return cdlmVar;
    }
}
