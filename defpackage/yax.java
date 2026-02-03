package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yax extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ int b;
    /* synthetic */ boolean c;
    final /* synthetic */ ybd d;
    final /* synthetic */ fdvc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yax(ybd ybdVar, fdvc fdvcVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = ybdVar;
        this.e = fdvcVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        yax yaxVar = new yax(this.d, this.e, (fcxy) obj4);
        yaxVar.a = (ekgb) obj;
        yaxVar.b = iIntValue;
        yaxVar.c = zBooleanValue;
        return yaxVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        int i = this.b;
        boolean z = this.c;
        int iA = this.d.a();
        final fdvc fdvcVar = this.e;
        return new ybf((ekgb) obj2, i > iA, z, new fdae() { // from class: yaw
            /* JADX WARN: Type inference failed for: r0v0, types: [fduf, fdvc] */
            @Override // defpackage.fdae
            public final Object invoke() {
                fdvcVar.f(false);
                return fctx.a;
            }
        });
    }
}
