package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnms extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnms(dnmw dnmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnms) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture listenableFutureB = this.b.f().b();
        listenableFutureB.getClass();
        this.a = 1;
        Object objC = fdxs.c(listenableFutureB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnms(this.b, fcxyVar);
    }
}
