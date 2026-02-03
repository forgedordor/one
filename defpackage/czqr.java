package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqr {
    public static final cczi a = cdag.g(cdag.b, "rcs_help_center_link_pattern", "https://support.google.com/messages/answer/7189714?hl=%1$s");
    public static final cczi b = cdag.g(cdag.b, "jibe_regional_term_of_service_pattern", "https://jibe.google.com/intl/%1s_%2s/policies/terms/");
    public static final cqce c = cqce.g("Bugle", "ProvisioningHelper");
    public final Context d;
    public final ains e;
    public final crqv f;
    public final emfe g;
    public final fcsu h;
    public final cqtj i;
    public final ckhg j;
    public final fcsu k;
    public final eigp l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final int p;
    private final fcsu q;
    private final crsg r;
    private final cogw s;
    private final eosd t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final dgjp x;

    public czqr(Context context, crqv crqvVar, fcsu fcsuVar, fcsu fcsuVar2, ains ainsVar, cqtj cqtjVar, crsg crsgVar, ckhg ckhgVar, dgjp dgjpVar, cogw cogwVar, fcsu fcsuVar3, eigp eigpVar, eosd eosdVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, emfe emfeVar, int i) {
        this.d = context;
        this.e = ainsVar;
        this.p = i;
        this.f = crqvVar;
        this.g = emfeVar;
        this.h = fcsuVar;
        this.q = fcsuVar2;
        this.i = cqtjVar;
        this.r = crsgVar;
        this.j = ckhgVar;
        this.x = dgjpVar;
        this.s = cogwVar;
        this.k = fcsuVar3;
        this.u = fcsuVar4;
        this.m = fcsuVar5;
        this.n = fcsuVar6;
        this.v = fcsuVar7;
        this.w = fcsuVar8;
        this.l = eigpVar;
        this.t = eosdVar;
        this.o = fcsuVar9;
    }

    public static String b(Locale locale) {
        String country = locale.getCountry();
        return Locale.US.getCountry().equals(country) ? (String) ccze.l.e() : String.format(locale, (String) b.e(), locale.getLanguage(), country);
    }

    private final void m() {
        auvh.h(eijx.f(new Runnable() { // from class: czql
            @Override // java.lang.Runnable
            public final void run() {
                czqr czqrVar = this.a;
                czqrVar.f.h("boew_promo_complete", true);
                czqrVar.i(cjqp.GOOGLE_TOS_CONSENTED);
                if (((arug) czqrVar.o.b()).a()) {
                    ((dgrs) czqrVar.k.b()).I(true);
                } else {
                    ((dgrs) czqrVar.k.b()).J();
                }
                czqrVar.j.j(enxe.COMPLETE_GOOGLE_TOS);
            }
        }, this.t));
    }

    public final cjxj a() {
        cjxj cjxjVarB = cjxj.b(((dgrs) this.k.b()).e().h);
        return cjxjVarB == null ? cjxj.UNRECOGNIZED : cjxjVarB;
    }

    public final void c(Context context, SpannableStringBuilder spannableStringBuilder) throws Resources.NotFoundException {
        String string = context.getResources().getString(R.string.fast_track_privacy_policy);
        int iIndexOf = TextUtils.indexOf(spannableStringBuilder, string);
        if (iIndexOf == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new eigk(this.l, "addPrivacyPolicySpan", 434, "ProvisioningHelper#addPrivacyPolicySpan", new czqo(this)), iIndexOf, string.length() + iIndexOf, 17);
    }

    public final void d(Context context, SpannableStringBuilder spannableStringBuilder) throws Resources.NotFoundException {
        String string = context.getResources().getString(R.string.rcs_chats_terms_of_service);
        int iIndexOf = TextUtils.indexOf(spannableStringBuilder, string);
        if (iIndexOf == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new eigk(this.l, "addTermsOfServiceSpan", 405, "ProvisioningHelper#addTermsOfServiceSpan", new czqn(this)), iIndexOf, string.length() + iIndexOf, 17);
    }

    public final void e() {
        cqbd cqbdVarC = c.c();
        cqbdVarC.I("Completing Legal FYI flow.");
        cqbdVarC.r();
        eijx.f(new Runnable() { // from class: czqm
            @Override // java.lang.Runnable
            public final void run() {
                czqr czqrVar = this.a;
                czqrVar.j(cjxj.LEGAL_FYI_SEEN);
                czqrVar.k();
            }
        }, this.t).k(auvh.b(), eoqg.a);
    }

    @Deprecated
    public final void f(final boolean z) {
        if (((arue) this.w.b()).a()) {
            cqbd cqbdVarC = c.c();
            cqbdVarC.I("no-op enableMoSmsNumberDiscovery");
            cqbdVarC.r();
        } else if (dfpi.G()) {
            auvh.h(eijx.f(new Runnable() { // from class: czqh
                @Override // java.lang.Runnable
                public final void run() {
                    czqr czqrVar = this.a;
                    if (dfpi.M()) {
                        cjxj cjxjVarB = cjxj.b(((dgrs) czqrVar.k.b()).e().h);
                        if (cjxjVarB == null) {
                            cjxjVarB = cjxj.UNRECOGNIZED;
                        }
                        czqrVar.j(cjxjVarB);
                    } else {
                        czqrVar.j(cjxj.LEGAL_FYI_SEEN);
                    }
                    boolean z2 = z;
                    cqbd cqbdVarC2 = czqr.c.c();
                    cqbdVarC2.I("RCS Default On, enableMoSmsNumberDiscovery:");
                    cqbdVarC2.J(z2);
                    cqbdVarC2.r();
                }
            }, this.t));
        } else {
            auvh.h(eijx.f(new Runnable() { // from class: czqi
                @Override // java.lang.Runnable
                public final void run() {
                    czqr czqrVar = this.a;
                    czqrVar.i(cjqp.GOOGLE_TOS_CONSENTED);
                    cqbd cqbdVarC2 = czqr.c.c();
                    cqbdVarC2.I("enableMoSmsNumberDiscovery:");
                    cqbdVarC2.J(z);
                    cqbdVarC2.r();
                    ((dgrs) czqrVar.k.b()).J();
                }
            }, this.t));
        }
    }

    public final void g() {
        f(true);
    }

    final void h() {
        String str;
        int i = this.p - 1;
        if (i == 0) {
            str = "Bugle.FastTrack.ConversationList.Prompt.Term.Clicked";
        } else if (i == 1) {
            str = "Bugle.FastTrack.Settings.Dialog.Term.Clicked";
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("There is no 'Terms of Service' UMA metric for the PhoneNumberInput UI.");
                }
                throw new IllegalStateException("There is no ToS user action for the Legal FYI UI.");
            }
            str = "Bugle.Welcome.TermsOfService.Clicked";
        }
        this.e.c(str);
        ((cjya) this.h.b()).e(emfc.RCS_PROVISIONING_PROMPT_TERMS_AND_CONDITION_CLICKED, this.g);
    }

    public final void i(cjqp cjqpVar) {
        if (dfpi.I() || dfpi.N()) {
            Locale localeC = craf.c(this.d);
            cjxm cjxmVar = (cjxm) ((dgrs) this.k.b()).l().map(new Function() { // from class: czqk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cczi ccziVar = czqr.a;
                    return (cjxm) ((cjxn) obj).toBuilder();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse((cjxm) cjxn.a.createBuilder());
            dgjp dgjpVar = this.x;
            cjxmVar.copyOnWrite();
            ((cjxn) cjxmVar.instance).c = cjqpVar.a();
            String strB = b(localeC);
            cjxmVar.copyOnWrite();
            cjxn cjxnVar = (cjxn) cjxmVar.instance;
            strB.getClass();
            cjxnVar.d = strB;
            String string = localeC.toString();
            cjxmVar.copyOnWrite();
            cjxn cjxnVar2 = (cjxn) cjxmVar.instance;
            string.getClass();
            cjxnVar2.e = string;
            evvp evvpVarB = evwz.b(this.s.f());
            cjxmVar.copyOnWrite();
            cjxn cjxnVar3 = (cjxn) cjxmVar.instance;
            evvpVarB.getClass();
            cjxnVar3.f = evvpVarB;
            cjxnVar3.b |= 1;
            dgjpVar.c((cjxn) cjxmVar.build());
        }
    }

    public final void j(cjxj cjxjVar) {
        cjxm cjxmVar = (dfpi.M() || ((Boolean) dfpi.t().a.ao.a()).booleanValue()) ? (cjxm) ((dgrs) this.k.b()).e().toBuilder() : (cjxm) cjxn.a.createBuilder();
        dgrs dgrsVar = (dgrs) this.k.b();
        cjxmVar.copyOnWrite();
        ((cjxn) cjxmVar.instance).h = cjxjVar.a();
        evvp evvpVarB = evwz.b(this.s.f());
        cjxmVar.copyOnWrite();
        cjxn cjxnVar = (cjxn) cjxmVar.instance;
        evvpVarB.getClass();
        cjxnVar.f = evvpVarB;
        cjxnVar.b |= 1;
        dgrsVar.z((cjxn) cjxmVar.build());
    }

    public final void k() {
        if (((apwv) this.v.b()).a() && dfpi.z()) {
            ((cmlb) this.u.b()).c().h(new ejvr() { // from class: czqj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    for (dggn dggnVar : (Set) obj) {
                        czqr czqrVar = this.a;
                        etsz etszVarC = ((cebq) czqrVar.m.b()).c(dggo.a(dggnVar).a);
                        if (etszVarC.t && etszVarC.n) {
                            ((ckhh) czqrVar.n.b()).e(dggnVar, ewjm.TRIGGER_UNKNOWN, enxe.LEGAL_FYI_SEEN);
                        }
                    }
                    return null;
                }
            }, this.t).k(auvh.b(), eoqg.a);
        } else {
            this.j.j(enxe.LEGAL_FYI_SEEN);
        }
    }

    public final void l(Activity activity, boolean z) {
        crsg crsgVar = this.r;
        if (((chza) crsgVar.c.a()).d() == enwr.AVAILABLE) {
            cqbd cqbdVarC = c.c();
            cqbdVarC.I("Migration, only send CONSENT_GRANTED");
            cqbdVarC.r();
            if (z) {
                e();
                return;
            } else {
                m();
                return;
            }
        }
        boolean zA = crsgVar.a();
        if (z) {
            e();
            return;
        }
        m();
        ((crqx) this.q.b()).s(51);
        if (zA) {
            adci.b(activity, activity.getResources().getString(R.string.fast_track_popup_accepted_snack_bar_text_v2));
        }
    }
}
