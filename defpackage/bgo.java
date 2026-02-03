package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgo implements bpu {
    final /* synthetic */ beq a;
    final /* synthetic */ bgp b;

    public bgo(bgp bgpVar, beq beqVar) {
        this.b = bgpVar;
        this.a = beqVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        beq beqVar = this.a;
        if (beqVar.b.f) {
            return;
        }
        int iA = ((bjl) beqVar.a.get(0)).a();
        if (th instanceof bbg) {
            this.b.b.b(new bel(iA, (bbg) th));
        } else {
            this.b.b.b(new bel(iA, new bbg("Failed to submit capture request", th)));
        }
        this.b.f.a();
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.f.a();
    }
}
