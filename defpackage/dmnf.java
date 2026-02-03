package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmnf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmng b;
    final /* synthetic */ Uri c;
    final /* synthetic */ dmbx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmnf(dmng dmngVar, Uri uri, dmbx dmbxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmngVar;
        this.c = uri;
        this.d = dmbxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmnf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dmng dmngVar = this.b;
        Uri uri = this.c;
        dmbx dmbxVar = this.d;
        dogt dogtVar = dogt.a;
        this.a = 1;
        Object objB = dmngVar.h.b(dogtVar, uri, dmbxVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmnf(this.b, this.c, this.d, fcxyVar);
    }
}
