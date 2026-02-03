package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejfq extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejfr b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejfq(ejfr ejfrVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejfrVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejfq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture listenableFutureA = rdo.a(((ehrb) this.b.a.b()).a().i(this.c));
        this.a = 1;
        Object objC = fdxs.c(listenableFutureA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejfq(this.b, this.c, fcxyVar);
    }
}
