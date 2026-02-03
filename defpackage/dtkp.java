package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkp extends dtlh {
    final /* synthetic */ dtkq a;

    public dtkp(dtkq dtkqVar) {
        this.a = dtkqVar;
    }

    @Override // defpackage.dtlh
    public final void a(int i) {
        this.a.e(i);
    }

    @Override // defpackage.dtlh
    public final void b() {
        final dtkq dtkqVar = this.a;
        if (dtkqVar.c) {
            String str = dtkqVar.b;
            if (ecei.a(str, str) && dtkqVar.ai == 1 && dtkqVar.ah != null) {
                dtkh dtkhVarB = dtkqVar.b();
                if (dtkhVarB != null) {
                    ((eksl) dsql.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onTaskComplete", 80, "FeatureHighlightController.java")).q("FeatureHighlight task complete");
                    etjv etjvVar = etjv.POSITIVE_RESPONSE;
                    dsqk dsqkVar = (dsqk) dtkhVarB;
                    dsql dsqlVar = dsqkVar.b;
                    dsqlVar.e.a(dsqlVar.b, etjvVar);
                    dsqkVar.a = true;
                }
                dtkqVar.p();
                dtkqVar.ah.f(new Runnable() { // from class: dtko
                    @Override // java.lang.Runnable
                    public final void run() {
                        dtkqVar.f();
                    }
                });
            }
        }
    }

    @Override // defpackage.dtlh
    public final void c() {
        dtkq dtkqVar = this.a;
        long j = dtkqVar.d;
        if (j > 0) {
            dtkqVar.ah.postDelayed(dtkqVar.aj, j);
        }
    }

    @Override // defpackage.dtlh
    public final void d() {
        dtkq dtkqVar = this.a;
        if (dtkqVar.d > 0) {
            dtkqVar.ah.removeCallbacks(dtkqVar.aj);
        }
    }
}
