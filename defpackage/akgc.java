package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akgc implements cqto {
    final /* synthetic */ akgi a;

    public akgc(akgi akgiVar) {
        this.a = akgiVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final akgi akgiVar = this.a;
        akgiVar.e = cqty.b(akgiVar.b.a(akgi.j(akgiVar.c.a), "PenpalObservableSupplier#penpalQuery").f(new cqtk() { // from class: akfw
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return akgiVar.d();
            }
        }, "PenpalObservableSupplier::register", "PenpalObservableSupplier::callback", "PenpalObservableSupplier::unregister"), akgiVar.d.a(new anpi() { // from class: akgb
            @Override // defpackage.anpi
            public final eiju a() {
                return akgiVar.d();
            }
        }));
    }

    @Override // defpackage.cqto
    public final void fK() {
        akgi akgiVar = this.a;
        cquc cqucVar = akgiVar.e;
        if (cqucVar != null) {
            cqucVar.a();
        }
        akgiVar.e = null;
    }
}
