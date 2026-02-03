package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxd extends fdbr implements fdap {
    final /* synthetic */ cxf a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxd(cxf cxfVar, long j) {
        super(1);
        this.a = cxfVar;
        this.b = j;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long jA;
        dhe dheVar = (dhe) obj;
        Object objA = dheVar.a();
        cxf cxfVar = this.a;
        if (fdbq.f(objA, cxfVar.c.a())) {
            jA = cxfVar.a(this.b);
        } else {
            hsf hsfVar = (hsf) cxfVar.c.d.f(dheVar.a());
            jA = hsfVar != null ? ((kjg) hsfVar.a()).a : 0L;
        }
        hsf hsfVar2 = (hsf) cxfVar.c.d.f(dheVar.b());
        long j = hsfVar2 != null ? ((kjg) hsfVar2.a()).a : 0L;
        dcx dcxVar = (dcx) cxfVar.b.a();
        if (dcxVar != null) {
            dew dewVar = (dew) dcxVar.b.a(new kjg(jA), new kjg(j));
            if (dewVar != null) {
                return dewVar;
            }
        }
        return dea.b(0.0f, 400.0f, null, 5);
    }
}
