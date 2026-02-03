package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlhd extends fcyz implements fdat {
    final /* synthetic */ dlhm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlhd(dlhm dlhmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlhmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlhd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlhd(this.a, fcxyVar);
    }
}
