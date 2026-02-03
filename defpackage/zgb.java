package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgb extends fcyz implements fdat {
    int a;
    final /* synthetic */ zgh b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgb(zgh zghVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zghVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zgb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zgh zghVar = this.b;
            agdn agdnVar = new agdn(9, this.c, "image/png", null, 24);
            this.a = 1;
            obj = zghVar.b.f(agdnVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zgb(this.b, this.c, fcxyVar);
    }
}
