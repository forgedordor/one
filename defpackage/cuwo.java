package defpackage;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusPreference;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cuwo implements egps<Bundle, Void> {
    final /* synthetic */ cuwp a;

    public cuwo(cuwp cuwpVar) {
        this.a = cuwpVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Bundle bundle = (Bundle) obj;
        fcsu fcsuVar = this.a.J;
        fcsuVar.getClass();
        String string = bundle.getString("rcs_per_sim_provisioning_id");
        string.getClass();
        ((chtr) fcsuVar.b()).j(new dggp(string), bundle.getBoolean("rcs_per_sim_toggle_state"));
    }

    @Override // defpackage.egps
    public final /* synthetic */ void f(Object obj, Throwable th) {
        RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxViewA;
        Bundle bundle = (Bundle) obj;
        cuwr cuwrVar = this.a.Z;
        cuwrVar.getClass();
        String string = bundle.getString("rcs_per_sim_provisioning_id");
        string.getClass();
        dggp dggpVar = new dggp(string);
        int i = !bundle.getBoolean("rcs_per_sim_toggle_state") ? 1 : 0;
        RcsSimStatusPreference rcsSimStatusPreference = ((cuol) cuwrVar).h;
        LinearLayout linearLayout = rcsSimStatusPreference.a;
        RcsSimStatusView rcsSimStatusView = null;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                if (((RcsSimStatusView) rcsSimStatusPreference.a.getChildAt(i2)).H().c.equals(dggpVar)) {
                    rcsSimStatusView = (RcsSimStatusView) rcsSimStatusPreference.a.getChildAt(i2);
                    break;
                }
                i2++;
            }
        }
        if (rcsSimStatusView != null && (rcsMultiSimStatusCheckboxViewA = rcsSimStatusView.H().a()) != null) {
            rcsMultiSimStatusCheckboxViewA.f(i);
        }
        ((ekrd) ((ekrd) ((ekrd) cuwp.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$3", "onFailure", (char) 494, "RcsSettingsFragmentV2Peer.java")).q("Failed to set RCS Per-Sim level");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
