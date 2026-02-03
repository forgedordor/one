package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qmk extends fcyz implements fdat {
    int a;
    final /* synthetic */ qgr b;
    final /* synthetic */ qjn c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ ListenableFuture e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmk(qgr qgrVar, qjn qjnVar, AtomicInteger atomicInteger, ListenableFuture listenableFuture, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qgrVar;
        this.c = qjnVar;
        this.d = atomicInteger;
        this.e = listenableFuture;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qmk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            qgr qgrVar = this.b;
            qjn qjnVar = this.c;
            this.a = 1;
            obj = qmt.a(qgrVar, qjnVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        this.d.set(((Number) obj).intValue());
        this.e.cancel(true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qmk(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
