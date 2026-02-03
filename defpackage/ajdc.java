package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajdc extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajdy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdc(ajdy ajdyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajdyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajdc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ListenableFuture listenableFutureA = this.b.a.a();
            listenableFutureA.getClass();
            this.a = 1;
            obj = fdxs.c(listenableFutureA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return DesugarCollections.unmodifiableMap(((ajct) obj).c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajdc(this.b, fcxyVar);
    }
}
