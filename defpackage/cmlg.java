package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmlg extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmlg(cmll cmllVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmllVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmlg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmll cmllVar = this.b;
        this.a = 1;
        Object objK = cmllVar.k(this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmlg(this.b, fcxyVar);
    }
}
