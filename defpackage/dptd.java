package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dptd extends fcyz implements fdat {
    final /* synthetic */ dptt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dptd(dptt dpttVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dpttVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dptd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dptd(this.a, fcxyVar);
    }
}
