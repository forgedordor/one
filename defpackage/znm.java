package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znm extends fcyz implements fdau {
    final /* synthetic */ znp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znm(znp znpVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.a = znpVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new znm(this.a, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        zmp zmpVar = this.a.e;
        if (zmpVar != null) {
            zmpVar.close();
        }
        return fctx.a;
    }
}
