package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqds extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqee b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqds(dqee dqeeVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqeeVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqds) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dqee dqeeVar = this.b;
            Uri uri = this.c;
            this.a = 1;
            if (dqeeVar.e.a.b(uri) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqds(this.b, this.c, fcxyVar);
    }
}
