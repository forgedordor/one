package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsno extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsoa b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsno(dsoa dsoaVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsoaVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsno) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dsoa dsoaVar = this.b;
            ListenableFuture listenableFutureA = ((dski) dsoaVar.b.a(this.c)).a();
            listenableFutureA.getClass();
            this.a = 1;
            if (fdxs.c(listenableFutureA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return new dxfx(fctx.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsno(this.b, this.c, fcxyVar);
    }
}
