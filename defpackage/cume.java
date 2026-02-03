package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cume implements efzm {
    final /* synthetic */ cumf a;
    private final fcsu b;

    public cume(cumf cumfVar, fcsu fcsuVar) {
        this.a = cumfVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        ApplicationSettingsActivity applicationSettingsActivity = this.a.b;
        cg cgVar = new cg(applicationSettingsActivity.a());
        ea eaVarH = applicationSettingsActivity.a().h("ApplicationSettingsFragmentPeer");
        if (eaVarH != null) {
            cgVar.o(eaVarH);
        }
        efwo efwoVarA = efzkVar.a();
        cumg cumgVar = new cumg();
        eyhj.e(cumgVar);
        ehok.b(cumgVar, efwoVarA);
        cgVar.x(R.id.fragment_container, cumgVar, "ApplicationSettingsFragmentPeer");
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((abxv) this.b.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
