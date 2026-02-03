package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xlv extends fcyz implements fdat {
    int a;
    final /* synthetic */ xmd b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlv(xmd xmdVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xmdVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xlv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xmd xmdVar = this.b;
            Uri uri = this.c;
            this.a = 1;
            if (xmdVar.c.a(uri, null, null, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xlv(this.b, this.c, fcxyVar);
    }
}
