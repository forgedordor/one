package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmps extends fcyz implements fdat {
    final /* synthetic */ dmpw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmps(dmpw dmpwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dmpwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmps) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.load(0);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmps(this.a, fcxyVar);
    }
}
