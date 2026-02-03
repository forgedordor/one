package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjc extends fcyz implements fdat {
    final /* synthetic */ agjd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjc(agjd agjdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = agjdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agjc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        agjd agjdVar = this.a;
        ((aghz) agjdVar.f.b()).d(4);
        agjdVar.e.t(agjdVar.d, cgrc.b, cgra.e);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agjc(this.a, fcxyVar);
    }
}
