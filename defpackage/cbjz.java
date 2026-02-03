package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbkq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbjz(cbkq cbkqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbkqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbjz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbkq cbkqVar = this.b;
        cbjy cbjyVar = cbjy.b;
        this.a = 1;
        Object objD = cbkqVar.d(cbjyVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbjz(this.b, fcxyVar);
    }
}
