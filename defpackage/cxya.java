package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxya extends fcyz implements fdap {
    final /* synthetic */ cxyh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxya(cxyh cxyhVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = cxyhVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new cxxz(new cyag(this.a.b.a));
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxya(this.a, (fcxy) obj).b(fctx.a);
    }
}
