package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adbz extends fcyz implements fdau {
    final /* synthetic */ adcg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adbz(adcg adcgVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.a = adcgVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new adbz(this.a, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.g.compareAndSet(true, false);
        return fctx.a;
    }
}
