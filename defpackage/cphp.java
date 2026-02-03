package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cphp extends fcyz implements fdat {
    final /* synthetic */ cphq a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cphp(fcxy fcxyVar, cphq cphqVar) {
        super(2, fcxyVar);
        this.a = cphqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cphp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cphq cphqVar = this.a;
        return Boolean.valueOf(cphqVar.c.h(cphqVar.b, 221200000) == 0);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cphp cphpVar = new cphp(fcxyVar, this.a);
        cphpVar.b = obj;
        return cphpVar;
    }
}
