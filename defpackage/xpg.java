package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xpg extends fcyz implements fdat {
    final /* synthetic */ xph a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpg(xph xphVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xphVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xpg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.d.b(new xpf());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xpg(this.a, fcxyVar);
    }
}
