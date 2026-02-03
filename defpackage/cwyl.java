package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwyl implements agzt, cwye {
    private static final cqce e = cqce.g("Bugle", "GoogleTosPopupPresenter");
    cwxx a;
    public final fcsu b;
    public TextView c;
    public TextView d;
    private agzy f;
    private ejxr g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final cuge l;
    private final fr m;
    private final czqx n;
    private final fcsu o;
    private final fcsu p;
    private final AtomicReference q = new AtomicReference(Optional.empty());
    private LottieAnimationView r;

    public cwyl(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cuge cugeVar, czqx czqxVar, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.m = eaVar.I();
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.h = fcsuVar3;
        this.k = fcsuVar4;
        this.b = fcsuVar5;
        this.l = cugeVar;
        this.n = czqxVar;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        cjrp cjrpVar = (cjrp) this.o.b();
        return cjrpVar.d().h(new ejvr() { // from class: cjrk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cqce cqceVar = cjrp.a;
                if (optional.isPresent() && ((cjqt) optional.get()).equals(cjqt.BOTTOMSHEET)) {
                    cjrp.a.m("shouldShowBottomsheet: decided true, bottomsheet was requested");
                    return true;
                }
                cjrp.a.m("shouldShowBottomsheet: decided false");
                return false;
            }
        }, cjrpVar.d);
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.f = agzyVar;
        this.g = ejxx.a(new ejxr() { // from class: cwyg
            @Override // defpackage.ejxr
            public final Object get() {
                return ((czqs) this.a.b.b()).a(emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST, 1);
            }
        });
    }

    @Override // defpackage.agzt
    public final void d() {
        cwxx cwxxVar = this.a;
        if (cwxxVar != null && cwxxVar.aF()) {
            cwxxVar.hh();
        }
        this.a = null;
        this.f.b();
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) throws Resources.NotFoundException {
        if (((Boolean) cwxw.b.e()).booleanValue()) {
            emfe emfeVar = emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST;
            e.m("ToS prompt counterfactual is enabled.");
            ((cjya) this.i.b()).e(emfc.RCS_PROVISIONING_PROMPT_COUNTERFACTUAL_APPLIED, emfeVar);
            return false;
        }
        ((cjqw) this.p.b()).f(4);
        if (this.a == null) {
            cwxx cwxxVar = (cwxx) this.m.h("bottomSheetFragmentTag");
            this.a = cwxxVar;
            if (cwxxVar == null) {
                this.a = new cwxx();
            }
        }
        if (this.a.aF()) {
            this.a.H().a(this);
            cwxx cwxxVar2 = this.a;
            cwxxVar2.getClass();
            m(cwxxVar2);
            return true;
        }
        this.a.t(this.m, "bottomSheetFragmentTag");
        this.a.H().a(this);
        cwxx cwxxVar3 = this.a;
        cwxxVar3.getClass();
        m(cwxxVar3);
        ((ains) this.h.b()).c("Bugle.FastTrack.ConversationList.Prompt.Seen");
        ((cjya) this.i.b()).e(emfc.RCS_PROVISIONING_PROMPT_SEEN, emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST);
        ((crqx) this.j.b()).s(11);
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 2;
    }

    @Override // defpackage.cwye
    public final void h() {
        LottieAnimationView lottieAnimationView = this.r;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cwye
    public final void i(Activity activity) throws Resources.NotFoundException {
        fcsu fcsuVar = this.p;
        ((cjqw) fcsuVar.b()).f(6);
        cjqw cjqwVar = (cjqw) fcsuVar.b();
        emfc emfcVar = emfc.RCS_PROVISIONING_PROMPT_DECLINED;
        cjqwVar.d(emfcVar, (Optional) this.q.get());
        cuge cugeVar = this.l;
        cugd cugdVar = cugeVar.a;
        emfe emfeVar = emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST;
        cugdVar.a(false);
        ((ains) cugdVar.a.b()).c("Bugle.FastTrack.ConversationList.Prompt.Declined");
        ((cjya) cugdVar.b.b()).e(emfcVar, emfeVar);
        crqv crqvVar = (crqv) cugeVar.b.b();
        crqvVar.h("fast_track_prompt_dismissed", true);
        crqvVar.h("did_show_google_tos_prompt", true);
        if (activity == 0) {
            return;
        }
        czqr czqrVar = (czqr) this.g.get();
        enxe enxeVar = enxe.DECLINED_GOOGLE_TOS;
        czqrVar.i(cjqp.GOOGLE_TOS_DECLINED);
        if (dfpi.I()) {
            czqrVar.j.l(false, enxeVar);
        }
        d();
        String string = activity.getResources().getString(R.string.fast_track_popup_declined_snack_bar_text_v2);
        if ((activity instanceof daih ? ((daih) activity).l() : null) == null) {
            int i = ekgb.d;
            ekgb ekgbVar = ekoe.a;
        }
        adci.b(activity, string);
    }

    @Override // defpackage.cwye
    public final void j(Activity activity) {
        fcsu fcsuVar = this.p;
        ((cjqw) fcsuVar.b()).f(5);
        cjqw cjqwVar = (cjqw) fcsuVar.b();
        emfc emfcVar = emfc.RCS_PROVISIONING_PROMPT_ACCEPTED;
        cjqwVar.d(emfcVar, (Optional) this.q.get());
        cuge cugeVar = this.l;
        cugd cugdVar = cugeVar.a;
        emfe emfeVar = emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST;
        cugdVar.a(true);
        ((ains) cugdVar.a.b()).c("Bugle.FastTrack.ConversationList.Prompt.Accepted");
        ((cjya) cugdVar.b.b()).e(emfcVar, emfeVar);
        crqv crqvVar = (crqv) cugeVar.b.b();
        crqvVar.j("rcs_tos_state", 2);
        crqvVar.h("fast_track_prompt_dismissed", true);
        crqvVar.h("should_show_google_tos_prompt", false);
        crqvVar.h("did_show_google_tos_prompt", true);
        if (activity == null) {
            return;
        }
        ((czqr) this.g.get()).l(activity, false);
        d();
    }

    @Override // defpackage.cwye
    public final void k(Optional optional) {
        this.q.set(optional);
    }

    @Override // defpackage.cwye
    public final void l() {
        LottieAnimationView lottieAnimationView = this.r;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
    }

    final void m(final ea eaVar) throws Resources.NotFoundException {
        View viewN = eaVar.N();
        this.c = (TextView) viewN.findViewById(R.id.google_tos_popup_multisim_text);
        fcsu fcsuVar = this.k;
        if (((crny) fcsuVar.b()).a() >= 2) {
            this.n.c(eaVar.z(), this.c);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: cwyh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cwyl cwylVar = this.a;
                    Context contextZ = eaVar.z();
                    czqx.d(contextZ, cwylVar.c, czqx.b(contextZ), contextZ.getResources().getDimensionPixelSize(R.dimen.multisim_tooltip_bottom_margin));
                }
            });
        } else {
            this.c.setVisibility(8);
        }
        this.r = (LottieAnimationView) viewN.findViewById(R.id.google_tos_popup_animation);
        if (eaVar.B().getConfiguration().orientation == 2) {
            h();
        } else {
            l();
        }
        TextView textView = (TextView) viewN.findViewById(R.id.google_tos_popup_text_paragraph);
        this.d = textView;
        Context contextZ = eaVar.z();
        Resources resources = contextZ.getResources();
        String string = resources.getString(R.string.rcs_chats_terms_of_service);
        String string2 = resources.getString(R.string.rcs_chats);
        String string3 = resources.getString(R.string.terms_summary);
        String string4 = ((crny) fcsuVar.b()).a() >= 2 ? ((Boolean) cwxw.a.e()).booleanValue() ? resources.getString(R.string.google_tos_legal_text_multi_sim_with_terms_summary_v2, string2, string, string3) : resources.getString(R.string.google_tos_legal_text_multi_sim_v2, string2, string) : ((Boolean) cwxw.a.e()).booleanValue() ? resources.getString(R.string.google_tos_legal_text_single_sim_with_terms_summary_v2, string2, string, string3) : resources.getString(R.string.google_tos_legal_text_single_sim_v2, string2, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4);
        String string5 = contextZ.getString(R.string.rcs_chats);
        int iIndexOf = string4.indexOf(string5);
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new cwyk(this, contextZ), iIndexOf, string5.length() + iIndexOf, 17);
        }
        if (((Boolean) cwxw.a.e()).booleanValue()) {
            czqr czqrVar = (czqr) this.g.get();
            String string6 = contextZ.getResources().getString(R.string.terms_summary);
            czqrVar.d(contextZ, spannableStringBuilder);
            czqrVar.c(contextZ, spannableStringBuilder);
            int iIndexOf2 = TextUtils.indexOf(spannableStringBuilder, string6);
            if (iIndexOf2 != -1) {
                spannableStringBuilder.setSpan(new eigk(czqrVar.l, "addTermsSummarySpan", 496, "ProvisioningHelper#addTermsSummarySpan", new czqq(czqrVar)), iIndexOf2, string6.length() + iIndexOf2, 17);
            }
        } else {
            czqr czqrVar2 = (czqr) this.g.get();
            czqrVar2.d(contextZ, spannableStringBuilder);
            czqrVar2.c(contextZ, spannableStringBuilder);
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = this.d;
        eebt.b(textView2);
        eebt.c(textView2);
        ((Button) viewN.findViewById(R.id.conversation_list_google_tos_popup_positive_button)).setOnClickListener(new View.OnClickListener() { // from class: cwyi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(eaVar.G());
            }
        });
        ((TextView) viewN.findViewById(R.id.conversation_list_google_tos_popup_negative_button)).setOnClickListener(new View.OnClickListener() { // from class: cwyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                this.a.i(eaVar.G());
            }
        });
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
