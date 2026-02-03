package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rbu implements rrm {
    final /* synthetic */ rbv a;
    private final rsg b;

    public rbu(rbv rbvVar, rsg rsgVar) {
        this.a = rbvVar;
        this.b = rsgVar;
    }

    @Override // defpackage.rrm
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                rsg rsgVar = this.b;
                for (rte rteVar : rvk.h(rsgVar.a)) {
                    if (!rteVar.l() && !rteVar.k()) {
                        rteVar.c();
                        if (rsgVar.c) {
                            rsgVar.b.add(rteVar);
                        } else {
                            rteVar.b();
                        }
                    }
                }
            }
        }
    }
}
