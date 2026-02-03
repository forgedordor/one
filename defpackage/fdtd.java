package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdtd extends fcyz implements fdat {
    /* synthetic */ int a;

    public fdtd(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdtd) c(Integer.valueOf(((Number) obj).intValue()), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a > 0);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdtd fdtdVar = new fdtd(fcxyVar);
        fdtdVar.a = ((Number) obj).intValue();
        return fdtdVar;
    }
}
