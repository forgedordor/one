package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dstj extends fcyz implements fdat {
    int a;
    final /* synthetic */ dstm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dstj(dstm dstmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dstmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dstj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dstm dstmVar = this.b;
            ListenableFuture listenableFutureA = dstmVar.b.a(dstmVar.a.f().toEpochMilli());
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
        return new dstj(this.b, fcxyVar);
    }
}
