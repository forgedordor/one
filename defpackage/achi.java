package defpackage;

import android.app.Activity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achi implements achf {
    private static final cqce a = cqce.g("Bugle", "GaiaPairingPromo");

    @Override // defpackage.achf
    public final void b(Activity activity) {
        if (abxb.b()) {
            ea eaVarH = ((eg) activity).a().h("conversation_list_root_fragment_tag");
            ea eaVarH2 = null;
            if (eaVarH != null && eaVarH.I() != null) {
                eaVarH2 = eaVarH.I().h("home_fragment_tag");
            }
            if (eaVarH2 == null) {
                a.p("Fragment is null");
                return;
            }
            final acrt acrtVar = (acrt) ehle.a(eaVarH2);
            ekrw ekrwVarE = acrt.a.e();
            ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onGaiaPromoAllowButtonClicked", 2661, "HomeFragmentPeer.java")).q("HomeFragment onGaiaPromoAllowButtonClicked called");
            ((Optional) acrtVar.e.b()).ifPresent(new Consumer() { // from class: acqi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    acrt acrtVar2 = acrtVar;
                    ((achk) obj).c(acrtVar2.am, acrtVar2.C, acrtVar2.aC);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.achf
    public final /* synthetic */ void a(Activity activity) {
    }
}
