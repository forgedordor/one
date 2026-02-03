package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxe extends fdbr implements fdap {
    final /* synthetic */ cxf a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxe(cxf cxfVar, long j) {
        super(1);
        this.a = cxfVar;
        this.b = j;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        long jA;
        cxf cxfVar = this.a;
        if (fdbq.f(obj, cxfVar.c.a())) {
            jA = cxfVar.a(this.b);
        } else {
            hsf hsfVar = (hsf) cxfVar.c.d.f(obj);
            jA = hsfVar != null ? ((kjg) hsfVar.a()).a : 0L;
        }
        return new kjg(jA);
    }
}
