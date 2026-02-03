package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmng b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmmq(dmng dmngVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmngVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmmq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmng dmngVar = this.b;
            Uri uri = this.c;
            this.a = 1;
            if (dmngVar.j.a.b(uri) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmmq(this.b, this.c, fcxyVar);
    }
}
