package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmcl extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmdo b;
    final /* synthetic */ dmlx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmcl(dmdo dmdoVar, dmlx dmlxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmdoVar;
        this.c = dmlxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmcl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmdo dmdoVar = this.b;
            dmlx dmlxVar = this.c;
            dmlz dmlzVarA = dmdoVar.a();
            Uri uri = Uri.parse(((dmlw) dmlxVar).a.f());
            uri.getClass();
            this.a = 1;
            if (dmlzVarA.f(uri, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmcl(this.b, this.c, fcxyVar);
    }
}
