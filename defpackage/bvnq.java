package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvnq extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bvmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvnq(bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvnq) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture listenableFutureC = this.c.i.c((String) this.b);
        this.a = 1;
        Object objC = fdxs.c(listenableFutureC, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvnq bvnqVar = new bvnq(this.c, fcxyVar);
        bvnqVar.b = obj;
        return bvnqVar;
    }
}
