package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cyqu implements egps<Void, Boolean> {
    final /* synthetic */ cyqw a;

    public cyqu(cyqw cyqwVar) {
        this.a = cyqwVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (!abxb.b()) {
            cyqw.a.r("No need to launch Gaia pairing page as the isGaiaPairingUiEnabled flag is off");
            return;
        }
        cyqw cyqwVar = this.a;
        eg egVarFg = cyqwVar.b.fg();
        egVarFg.finish();
        if (bool.booleanValue()) {
            ((cyrb) cyqwVar.d.b()).a(egVarFg, true);
            return;
        }
        egVarFg.getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", 2);
        acbn.a((efxf) cyqwVar.g.b());
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        cyqw.a.s("Failed to check if any Gaia account has signed in", th);
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
