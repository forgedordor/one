package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlvk extends fcyz implements fdat {
    final /* synthetic */ dlvl a;
    final /* synthetic */ dlvp b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlvk(dlvl dlvlVar, dlvp dlvpVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlvlVar;
        this.b = dlvpVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlvk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Uri uri = this.c;
        String strA = dngu.a(uri);
        dlvj dlvjVar = new dlvj(this.a, uri);
        return dlvl.b(this.b, "ofSingle for ".concat(strA), true, dlvjVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlvk(this.a, this.b, this.c, fcxyVar);
    }
}
