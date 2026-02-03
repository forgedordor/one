package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwg extends fcyz implements fdat {
    int a;
    final /* synthetic */ axwp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axwg(axwp axwpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = axwpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axwg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        axwp axwpVar = this.b;
        this.a = 1;
        Object objF = axwpVar.f(this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new axwg(this.b, fcxyVar);
    }
}
