package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cypo implements crmf {
    final /* synthetic */ cypb a;
    final /* synthetic */ cypu b;

    public cypo(cypu cypuVar, cypb cypbVar) {
        this.a = cypbVar;
        this.b = cypuVar;
    }

    @Override // defpackage.crmf
    public final void a() {
        this.b.i.finish();
    }

    @Override // defpackage.crmf
    public final void b() {
        cypu cypuVar = this.b;
        lvb lvbVar = cypuVar.j.a.c;
        if (lvbVar == lvb.d || lvbVar == lvb.e) {
            cypuVar.s.a(new cyph(cypuVar.f, cypuVar.i, this.a));
        } else {
            ((eksl) ((eksl) cypu.a.j()).h("com/google/android/apps/messaging/ui/ditto/QrScannerFragmentPeer$1", "onGranted", 198, "QrScannerFragmentPeer.java")).t("Skip loading camera. State: %s", lvbVar.name());
            cypuVar.i.finish();
        }
    }

    @Override // defpackage.crmf
    public final /* synthetic */ boolean c() {
        return true;
    }
}
