package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejfp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejfr b;
    final /* synthetic */ Uri c;
    final /* synthetic */ kjg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejfp(ejfr ejfrVar, Uri uri, kjg kjgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejfrVar;
        this.c = uri;
        this.d = kjgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejfp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        rbr rbrVarI = ((ehrb) this.b.a.b()).a().i(this.c);
        long j = this.d.a;
        ListenableFuture listenableFutureA = rdo.a((rbr) ((rbr) rbrVarI.Q((int) (j >> 32), (int) (j & 4294967295L))).J());
        this.a = 1;
        Object objC = fdxs.c(listenableFutureA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejfp(this.b, this.c, this.d, fcxyVar);
    }
}
