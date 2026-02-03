package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akzp extends fcyz implements fdat {
    final /* synthetic */ akzt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akzp(akzt akztVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = akztVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akzp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb ekgbVarZ = akzt.d(this.a.c.a).z();
        bbew bbewVar = new bbew();
        bbewVar.d(ekgbVarZ);
        return ekfv.a(bbewVar.c());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akzp(this.a, fcxyVar);
    }
}
