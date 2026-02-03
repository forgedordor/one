package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csln extends fcyz implements fdat {
    int a;
    final /* synthetic */ cslz b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csln(cslz cslzVar, Uri uri, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cslzVar;
        this.c = uri;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csln) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cslz cslzVar = this.b;
        Uri uri = this.c;
        String str = this.d;
        this.a = 1;
        Object objJ = cslzVar.j(uri, str, this);
        return objJ == fcylVar ? fcylVar : objJ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csln(this.b, this.c, this.d, fcxyVar);
    }
}
