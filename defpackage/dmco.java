package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmco extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmco(dmdo dmdoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmdoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmco) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmdo dmdoVar = this.b;
            dmlz dmlzVarA = dmdoVar.a();
            dojw dojwVar = dmdoVar.j;
            dojwVar.getClass();
            Uri uri = Uri.parse(dojwVar.f());
            uri.getClass();
            this.a = 1;
            if (dmlzVarA.f(uri, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.j = null;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmco(this.b, fcxyVar);
    }
}
