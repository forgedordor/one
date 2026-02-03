package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yph extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public yph(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yph) c((hps) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((hps) this.a).b(true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        yph yphVar = new yph(fcxyVar);
        yphVar.a = obj;
        return yphVar;
    }
}
