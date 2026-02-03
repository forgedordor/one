package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbhl b;
    final /* synthetic */ caxu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbhj(fcxy fcxyVar, cbhl cbhlVar, caxu caxuVar) {
        super(2, fcxyVar);
        this.b = cbhlVar;
        this.c = caxuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbhj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture listenableFutureB = this.b.b.b(this.c.a);
        this.a = 1;
        Object objC = fdxs.c(listenableFutureB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbhj cbhjVar = new cbhj(fcxyVar, this.b, this.c);
        cbhjVar.d = obj;
        return cbhjVar;
    }
}
