package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyqy implements efzm {
    final /* synthetic */ cyqz a;

    public cyqy(cyqz cyqzVar) {
        this.a = cyqzVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        GaiaDittoActivity gaiaDittoActivity = this.a.b;
        ea eaVarH = gaiaDittoActivity.a().h("gaia_pairing_settings");
        if (eaVarH == null) {
            efwo efwoVarA = efzkVar.a();
            eaVarH = new cyrn();
            eyhj.e(eaVarH);
            ehok.b(eaVarH, efwoVarA);
        }
        cg cgVar = new cg(gaiaDittoActivity.a());
        cgVar.x(R.id.fragment_container, eaVarH, "gaia_pairing_settings");
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        cqbd cqbdVarB = cyqz.a.b();
        cqbdVarB.I("Unexpected account error when opening the Gaia pairing settings page.");
        cqbdVarB.s(efygVar);
        ((abxv) this.a.c.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
