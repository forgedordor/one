package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czsm implements agzt, czsk {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupPresenter");
    czse a;
    private agzy c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fr h;
    private LottieAnimationView i;

    public czsm(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.h = eaVar.I();
        this.d = fcsuVar;
        this.f = fcsuVar2;
        this.e = fcsuVar3;
        this.g = fcsuVar4;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        final czsd czsdVar = (czsd) this.d.b();
        return ((cjyi) czsdVar.c.b()).b().h(new ejvr() { // from class: czsc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = (String) ((Optional) obj).orElse(null);
                if (str == null) {
                    ekrw ekrwVarE = czsd.a.e();
                    ekrwVarE.X(eksq.a, "BugleRcs");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosBackgroundUtil", "hasUnseenTermsAndConditions", 53, "CarrierTosBackgroundUtil.java")).q("hasUnseenTermsAndConditions: simId is empty");
                    return false;
                }
                czsd czsdVar2 = czsdVar;
                ekrw ekrwVarE2 = czsd.a.e();
                ekrwVarE2.X(eksq.a, "BugleRcs");
                ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosBackgroundUtil", "hasUnseenTermsAndConditions", 56, "CarrierTosBackgroundUtil.java")).t("hasUnseenTermsAndConditions: setting terms and conditions request for simId:  %s", dhiz.SIM_ID.c(str));
                czsdVar2.d.set(Optional.of(str));
                return true;
            }
        }, czsdVar.b);
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.c = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        czse czseVar = this.a;
        if (czseVar != null && czseVar.aF()) {
            czseVar.hh();
        }
        this.a = null;
        this.c.b();
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        String str = (String) ((Optional) ((czsd) this.d.b()).d.get()).orElse(null);
        if (str == null) {
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupPresenter", "show", 108, "CarrierTosPopupPresenter.java")).q("show: simId is empty");
            return false;
        }
        if (this.a == null) {
            czse czseVar = (czse) this.h.h("carrierTosBottomSheetFragmentTag");
            this.a = czseVar;
            if (czseVar == null) {
                czse czseVar2 = new czse();
                eyhj.e(czseVar2);
                ehog.b(czseVar2, str);
                this.a = czseVar2;
            }
        }
        if (this.a.aF()) {
            this.a.H().b = this;
            czse czseVar3 = this.a;
            czseVar3.getClass();
            j(czseVar3);
            return true;
        }
        this.a.t(this.h, "carrierTosBottomSheetFragmentTag");
        this.a.H().b = this;
        czse czseVar4 = this.a;
        czseVar4.getClass();
        j(czseVar4);
        ((ains) this.e.b()).c("Bugle.FastTrack.ConversationList.Prompt.Seen");
        ((cjya) this.g.b()).g(str, emfc.RCS_PROVISIONING_PROMPT_SEEN);
        ((crqx) this.f.b()).s(11);
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 7;
    }

    @Override // defpackage.czsk
    public final void h() {
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    @Override // defpackage.czsk
    public final void i() {
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
    }

    final void j(ea eaVar) {
        this.i = (LottieAnimationView) eaVar.N().findViewById(R.id.carrier_tos_popup_animation);
        if (eaVar.B().getConfiguration().orientation == 2) {
            h();
        } else {
            i();
        }
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
