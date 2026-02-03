package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arj extends bhr {
    final /* synthetic */ kog a;

    public arj(kog kogVar) {
        this.a = kogVar;
    }

    @Override // defpackage.bhr
    public final void a(int i) {
        this.a.c(new ayw("Camera is closed"));
    }

    @Override // defpackage.bhr
    public final void b(int i, bib bibVar) {
        bbs.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
        this.a.b(null);
    }

    @Override // defpackage.bhr
    public final void c(int i, bhv bhvVar) {
        this.a.c(new bim());
    }
}
