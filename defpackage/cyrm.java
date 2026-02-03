package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyrm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragmentPeer");
    public final cyrj b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final AnonymousClass1 g;

    /* JADX WARN: Type inference failed for: r1v1, types: [cyrm$1] */
    public cyrm(cyrj cyrjVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = cyrjVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = new egps<Void, Void>() { // from class: cyrm.1
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ekrw ekrwVarH = cyrm.a.h();
                ekrwVarH.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragmentPeer$resetPrimaryDeviceCallback$1", "onSuccess", 104, "GaiaPairingResetPrimaryFragmentPeer.kt")).q("Reset primary device successfully");
                cyrm cyrmVar = cyrm.this;
                ((ains) cyrmVar.f.b()).e("Bugle.Gaia.Pairing.Reset.Primary.Device.Count", 1);
                einf.f(cysj.a, cyrmVar.b);
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                ekrw ekrwVarJ = cyrm.a.j();
                ekrwVarJ.X(eksq.a, "BugleGDitto");
                ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragmentPeer$resetPrimaryDeviceCallback$1", "onFailure", 115, "GaiaPairingResetPrimaryFragmentPeer.kt")).q("Failed to reset primary device");
                final cyrm cyrmVar = cyrm.this;
                ((ains) cyrmVar.f.b()).e("Bugle.Gaia.Pairing.Reset.Primary.Device.Count", 2);
                cyrj cyrjVar2 = cyrmVar.b;
                final Snackbar snackbarQ = Snackbar.q(cyrjVar2.N(), cyrjVar2.Y(R.string.cannot_reset_primary_error), -2);
                snackbarQ.s(cyrjVar2.Y(R.string.dismiss_action_text), new View.OnClickListener() { // from class: cyrl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        snackbarQ.e();
                        View view2 = cyrmVar.b.Q;
                        Button button = view2 != null ? (Button) view2.findViewById(R.id.gaia_pairing_reset_primary_button) : null;
                        if (button != null) {
                            button.setEnabled(true);
                        }
                    }
                });
                snackbarQ.u(2);
                snackbarQ.i();
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }
}
