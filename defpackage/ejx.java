package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejx extends fcyz implements fdat {
    final /* synthetic */ ejy a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejx(ejy ejyVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ejyVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejx) c((dwy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.o(this.b, 0);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejx(this.a, this.b, fcxyVar);
    }
}
