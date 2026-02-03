package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmni extends fcyz implements fdat {
    final /* synthetic */ dmnj a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmni(dmnj dmnjVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dmnjVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmni) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b.play(this.b - 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmni(this.a, this.b, fcxyVar);
    }
}
