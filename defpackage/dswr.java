package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dswr implements fdae {
    final /* synthetic */ dsvd a;
    final /* synthetic */ dsvd b;
    final /* synthetic */ fdat c;
    final /* synthetic */ int d;

    public dswr(dsvd dsvdVar, dsvd dsvdVar2, fdat fdatVar, int i) {
        this.a = dsvdVar;
        this.b = dsvdVar2;
        this.c = fdatVar;
        this.d = i;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        dsvd dsvdVar = this.a;
        if (dsvdVar == null) {
            this.b.f.i();
        } else {
            dsvd dsvdVar2 = this.b;
            if (fdbq.f(dsvdVar2.f.d(), dsvdVar)) {
                dsvdVar.f.j(dsvdVar2);
            } else {
                this.c.a(Integer.valueOf(this.d), "CVE is already removed from parent");
            }
        }
        return fctx.a;
    }
}
