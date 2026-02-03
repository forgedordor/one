package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csly extends fcyz implements fdat {
    int a;
    final /* synthetic */ cslz b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csly(cslz cslzVar, Uri uri, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cslzVar;
        this.c = uri;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csly) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        long j = fdhi.a;
        Object objE = crtr.K.e();
        objE.getClass();
        long jG = fdhk.g(((Number) objE).longValue(), fdhl.d);
        cslx cslxVar = new cslx(this.b, this.c, this.d, null);
        this.a = 1;
        Object objB = fdna.b(jG, cslxVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csly(this.b, this.c, this.d, fcxyVar);
    }
}
