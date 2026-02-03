package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbs extends fcyz implements fdat {
    int a;
    final /* synthetic */ ListenableFuture b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvbs(ListenableFuture listenableFuture, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = listenableFuture;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvbs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture listenableFuture = this.b;
        this.a = 1;
        Object objC = fdxs.c(listenableFuture, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dvbs(this.b, fcxyVar);
    }
}
