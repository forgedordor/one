package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xih extends fcyz implements fdat {
    int a;
    final /* synthetic */ xij b;
    final /* synthetic */ Uri c;
    final /* synthetic */ dnhn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xih(xij xijVar, Uri uri, dnhn dnhnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xijVar;
        this.c = uri;
        this.d = dnhnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xih) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xij xijVar = this.b;
            Uri uri = this.c;
            dnhn dnhnVar = this.d;
            this.a = 1;
            Object objA = fdin.a(eicg.a(xijVar.f), new xib(null, xijVar, uri, dnhnVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xih(this.b, this.c, this.d, fcxyVar);
    }
}
