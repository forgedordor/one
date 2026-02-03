package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhxw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dhxx b;
    final /* synthetic */ fdap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhxw(dhxx dhxxVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dhxxVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhxw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dhxx dhxxVar = this.b;
            final fdap fdapVar = this.c;
            final fdap fdapVar2 = new fdap() { // from class: dhxu
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    dhxc dhxcVar = (dhxc) obj2;
                    dhxcVar.getClass();
                    evsf builder = dhxcVar.toBuilder();
                    builder.getClass();
                    fdapVar.invoke(builder);
                    return (dhxc) ((dhxb) builder).build();
                }
            };
            ListenableFuture listenableFutureB = dhxxVar.a.b(new ejvr() { // from class: dhxv
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    return fdapVar2.invoke(obj2);
                }
            }, eoqg.a);
            this.a = 1;
            if (fdxs.c(listenableFutureB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dhxw(this.b, this.c, fcxyVar);
    }
}
