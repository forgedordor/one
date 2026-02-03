package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aghx extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ aghy c;
    final /* synthetic */ efwo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghx(aghy aghyVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aghyVar;
        this.d = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aghx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            aghy aghyVar = this.c;
            ListenableFuture listenableFutureB = aghyVar.a.b(this.d);
            listenableFutureB.getClass();
            this.a = "Authorization";
            this.b = 1;
            obj = fdxs.c(listenableFutureB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = "Authorization";
        }
        return new aghw((String) obj2, "Bearer ".concat(String.valueOf(((ehtj) obj).a)));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aghx(this.c, this.d, fcxyVar);
    }
}
