package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cyqt implements egps<Void, String> {
    final /* synthetic */ cyqw a;

    public cyqt(cyqw cyqwVar) {
        this.a = cyqwVar;
    }

    @Override // defpackage.egps
    public final /* synthetic */ void c(Object obj, Object obj2) {
        String str = (String) obj2;
        if (!abxb.b()) {
            cyqw.a.r("No need to launch Device pairing page as the isGaiaPairingUiEnabled flag is off");
            return;
        }
        cyqw cyqwVar = this.a;
        eg egVarFg = cyqwVar.b.fg();
        if (str.equals("QR_PAIRING")) {
            ((aijh) cyqwVar.e.b()).A(egVarFg, cyqwVar.c);
            return;
        }
        if (str.equals("GAIA_PAIRING_SETTINGS")) {
            ((cyrb) cyqwVar.d.b()).a(egVarFg, false);
            return;
        }
        if (str.equals("EXPRESS_SIGN_IN")) {
            egVarFg.getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", 2);
            acbn.a((efxf) cyqwVar.g.b());
        } else {
            cqbd cqbdVarB = cyqw.a.b();
            cqbdVarB.I("Unsupported device pairing page: ".concat(String.valueOf(str)));
            cqbdVarB.r();
        }
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        cyqw.a.s("Failed to get device pairing page", th);
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
