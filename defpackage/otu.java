package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otu extends fcyz implements fdat {
    final /* synthetic */ otw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otu(otw otwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = otwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((otu) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        otw otwVar = this.a;
        otwVar.h.b(new Integer(otwVar.f));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new otu(this.a, fcxyVar);
    }
}
