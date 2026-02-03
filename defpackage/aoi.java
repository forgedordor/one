package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoi extends bhr {
    final /* synthetic */ kog a;

    public aoi(kog kogVar) {
        this.a = kogVar;
    }

    @Override // defpackage.bhr
    public final void a(int i) {
        this.a.c(new bbg("Capture request is cancelled because camera is closed", null));
    }

    @Override // defpackage.bhr
    public final void b(int i, bib bibVar) {
        this.a.b(null);
    }

    @Override // defpackage.bhr
    public final void c(int i, bhv bhvVar) {
        "ERROR".toString();
        this.a.c(new bbg("Capture request failed with reason ERROR", null));
    }
}
