package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusPreference;
import com.google.android.apps.messaging.ui.appsettings.TurnOffRcsActivity;
import com.google.android.ims.provisioning.config.UserExperienceConfiguration;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwp implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer");
    public static final cczi b = cdag.f(cdag.b, "rcs_settings_retry_min_period_ms", 300000);
    public static final cczi c = cdag.e(cdag.b, "rcs_settings_retry_max_per_day", 5);
    public final fcsu A;
    public final fcsu B;
    public final fcsu C;
    public final fcsu D;
    public final fcsu E;
    public final fcsu F;
    public final fcsu G;
    public final fcsu H;
    public final fcsu I;
    public final fcsu J;
    public final fcsu K;
    public final fcsu L;
    public egps M;
    public final fcsu N;
    public final fcsu O;
    public final cpdt P;
    public final cpdt Q;
    public final fcsu R;
    public final fcsu S;
    public final fcsu T;
    public final fcsu U;
    public final fcsu V;
    public final fcsu W;
    public final fcsu X;
    public final fcsu Y;
    public cuwr Z;
    private final fcsu aA;
    public final ehay aa;
    public final egps ab;
    public final egps ac;
    public final egzv ad;
    public final egps ae;
    public final egps af;
    public adj ag;
    private String ah;
    private String ai;
    private String aj;
    private String ak;
    private int al = 3;
    private String am;
    private final fcsu an;
    private final fcsu ao;
    private final fcsu ap;
    private final fcsu aq;
    private final fcsu ar;
    private final fcsu as;
    private final fcsu at;
    private final fcsu au;
    private final fcsu av;
    private final fcsu aw;
    private final fcsu ax;
    private final fcsu ay;
    private final fcsu az;
    public String d;
    public String e;
    public String f;
    public int g;
    public czqr h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ekgb l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final cuvm s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public final fcsu z;

    public cuwp(cuvm cuvmVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, fcsu fcsuVar39, fcsu fcsuVar40, fcsu fcsuVar41, fcsu fcsuVar42, fcsu fcsuVar43) {
        int i = ekgb.d;
        this.l = ekoe.a;
        this.aa = new cuwm(this);
        this.ab = new cuwn(this);
        this.ac = new cuwo(this);
        this.ad = new egzv<aumq>() { // from class: cuwp.1
            @Override // defpackage.egzv
            public final void a(Throwable th) {
                ((ekrd) ((ekrd) ((ekrd) cuwp.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$4", "onError", (char) 509, "RcsSettingsFragmentV2Peer.java")).q("Error loading fi settings data");
            }

            @Override // defpackage.egzv
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cuwp.this.i = ((aumq) obj).e;
            }

            @Override // defpackage.egzv
            public final void hn() {
            }
        };
        this.ae = new egps<Void, Void>() { // from class: cuwp.2
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ((ekrd) ((ekrd) cuwp.a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$5", "onSuccess", 552, "RcsSettingsFragmentV2Peer.java")).q("Reset carrier TermsAndConditions storage.");
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                ((ekrd) ((ekrd) ((ekrd) cuwp.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$5", "onFailure", (char) 557, "RcsSettingsFragmentV2Peer.java")).q("Failed to reset carrier TermsAndConditions storage.");
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.af = new egps<Void, Void>() { // from class: cuwp.3
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                fcsu fcsuVar44 = cuwp.this.U;
                fcsuVar44.getClass();
                ((ckid) fcsuVar44.b()).a(4);
                ((ekrd) ((ekrd) cuwp.a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$6", "onSuccess", 574, "RcsSettingsFragmentV2Peer.java")).q("Successfully cancelled all Enqueued Revoke Consent(with user_disabled=true) Work Manager tasks");
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                ((ekrd) ((ekrd) ((ekrd) cuwp.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$6", "onFailure", (char) 581, "RcsSettingsFragmentV2Peer.java")).q("Failed to cancel Revoke Consent Work Manager tasks");
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.s = cuvmVar;
        this.t = fcsuVar;
        this.an = fcsuVar2;
        this.ao = fcsuVar3;
        this.ap = fcsuVar4;
        this.aq = fcsuVar5;
        this.v = fcsuVar6;
        this.w = fcsuVar7;
        this.x = fcsuVar8;
        this.y = fcsuVar9;
        this.ar = fcsuVar10;
        this.z = fcsuVar11;
        this.A = fcsuVar12;
        this.B = fcsuVar13;
        this.C = fcsuVar14;
        this.D = fcsuVar15;
        this.E = fcsuVar16;
        this.F = fcsuVar17;
        this.as = fcsuVar18;
        this.G = fcsuVar19;
        this.H = fcsuVar20;
        this.I = fcsuVar21;
        this.at = fcsuVar22;
        this.J = fcsuVar23;
        this.K = fcsuVar24;
        this.L = fcsuVar25;
        this.u = fcsuVar26;
        this.N = fcsuVar27;
        this.O = fcsuVar28;
        this.P = new cpdt("enable_legal_fyi_flow", new fdae() { // from class: cuwf
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(dfpi.G());
            }
        });
        this.Q = new cpdt("show_legal_fyi_banner", new fdae() { // from class: cuwg
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = cuwp.a;
                return false;
            }
        });
        this.R = fcsuVar29;
        this.S = fcsuVar30;
        this.T = fcsuVar31;
        this.au = fcsuVar32;
        this.av = fcsuVar33;
        this.aw = fcsuVar34;
        this.U = fcsuVar35;
        this.ax = fcsuVar36;
        this.V = fcsuVar37;
        this.W = fcsuVar38;
        this.X = fcsuVar39;
        this.Y = fcsuVar40;
        this.ay = fcsuVar41;
        this.aA = fcsuVar42;
        this.az = fcsuVar43;
    }

    private final void n() {
        LinearLayout linearLayout;
        cuwr cuwrVar = this.Z;
        cuwrVar.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = ((cuol) cuwrVar).h;
        if (rcsSimStatusPreference.k() == null || (linearLayout = (LinearLayout) rcsSimStatusPreference.k().findViewById(R.id.rcs_turned_off_banner_container)) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    private final void o(Preference preference) {
        this.s.e().af(preference);
    }

    private final void p() {
        cuwr cuwrVar = this.Z;
        cuwrVar.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = ((cuol) cuwrVar).h;
        if (rcsSimStatusPreference.k() != null) {
            LinearLayout linearLayout = (LinearLayout) rcsSimStatusPreference.k().findViewById(R.id.rcs_turned_off_banner_container);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            } else {
                rcsSimStatusPreference.k().addView((LinearLayout) LayoutInflater.from(rcsSimStatusPreference.k().getContext()).inflate(R.layout.rcs_turn_off_fyi, (ViewGroup) null));
            }
        }
    }

    private final void q() {
        cuwr cuwrVar = this.Z;
        cuwrVar.getClass();
        int iD = ((crqv) this.z.b()).d(this.aj, this.g);
        eg egVarG = this.s.G();
        egVarG.getClass();
        ((cuol) cuwrVar).e.n(egVarG.getResources().getStringArray(R.array.rcs_default_sharing_method_options)[iD]);
    }

    private final boolean r(boolean z) {
        boolean zB = dfpi.z() ? this.n : dfar.b();
        fcsu fcsuVar = this.z;
        boolean z2 = ((crqv) fcsuVar.b()).d("rcs_tos_state", 0) == 2;
        if (((arwz) this.X.b()).a() && this.o) {
            return !z2;
        }
        if (z) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "shouldShowGoogleTos", 1228, "RcsSettingsFragmentV2Peer.java")).H("shouldShowGoogleTos: showGoogleTos %s, tosAccepted %s", zB, z2);
            return zB && !z2;
        }
        boolean zQ = ((crqv) fcsuVar.b()).q("should_show_google_tos_prompt", false);
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "shouldShowGoogleTos", 1233, "RcsSettingsFragmentV2Peer.java")).I("shouldShowGoogleTos: showGoogleTos %s, tosRequested %s, tosAccepted %s", Boolean.valueOf(zB), Boolean.valueOf(zQ), Boolean.valueOf(z2));
        return zB && zQ && !z2;
    }

    public final String a(enwr enwrVar, String str, boolean z) {
        int iOrdinal = enwrVar.ordinal();
        if (iOrdinal != 2 && iOrdinal != 6 && iOrdinal != 26) {
            if (iOrdinal != 8) {
                if (iOrdinal == 9) {
                    return this.s.Z(R.string.rcs_not_available_desc_sim_absent, str);
                }
                if (iOrdinal != 11) {
                    if (iOrdinal != 12) {
                        if (iOrdinal != 14 && iOrdinal != 15) {
                            if (iOrdinal != 23) {
                                if (iOrdinal == 24) {
                                    return this.s.Z(true != z ? R.string.rcs_not_available_desc_disabled_by_it_admin_v2 : R.string.multi_sim_rcs_not_available_desc_disabled_by_it_admin, str);
                                }
                            } else if (!((arwy) this.ay.b()).a()) {
                                return this.s.Z(R.string.rcs_not_available_desc_carrier_not_supported, str);
                            }
                            return str;
                        }
                    }
                }
            }
            return this.s.Z(R.string.rcs_not_available_desc_device_not_supported, str);
        }
        return this.s.Z(R.string.rcs_not_available_desc_carrier_not_supported, str);
    }

    public final void b() {
        ((cjya) this.R.b()).d(emfc.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_SEEN);
        ((ekrd) ((ekrd) a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onLegalFyiSeen", 1368, "RcsSettingsFragmentV2Peer.java")).q("Legal FYI Banner shown, starting provisioning");
        ((crqv) this.z.b()).h("should_show_rcs_default_on_prompt", true);
        cuvm cuvmVar = this.s;
        czqr czqrVar = this.h;
        eg egVarG = cuvmVar.G();
        egVarG.getClass();
        czqrVar.l(egVarG, true);
        if (dfpi.z()) {
            ((cjzq) this.S.b()).l();
        } else {
            ((egzh) this.at.b()).a(eijx.e(null), czrg.b);
        }
    }

    public final void c() {
        p();
        ((cvdg) this.K.b()).b(3);
        i(ckbz.TOGGLE_STATE_USER_DISABLED);
        cqrd cqrdVar = (cqrd) this.ax.b();
        final Instant instantF = ((cogw) this.av.b()).f();
        auvh.h(cqrdVar.b(new ejvr() { // from class: cqqt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqqr cqqrVar = (cqqr) obj;
                cqqi cqqiVar = (cqqi) cqqrVar.toBuilder();
                cqqo cqqoVar = cqqrVar.f;
                if (cqqoVar == null) {
                    cqqoVar = cqqo.a;
                }
                Instant instant = instantF;
                cqqn cqqnVar = (cqqn) cqqoVar.toBuilder();
                evvp evvpVarB = evwz.b(instant);
                cqqnVar.copyOnWrite();
                cqqo cqqoVar2 = (cqqo) cqqnVar.instance;
                evvpVarB.getClass();
                cqqoVar2.c = evvpVarB;
                cqqoVar2.b |= 1;
                cqqiVar.copyOnWrite();
                cqqr cqqrVar2 = (cqqr) cqqiVar.instance;
                cqqo cqqoVar3 = (cqqo) cqqnVar.build();
                cqqoVar3.getClass();
                cqqrVar2.f = cqqoVar3;
                cqqrVar2.b |= 8;
                return (cqqr) cqqiVar.build();
            }
        }));
    }

    public final void d() {
        String string;
        UserExperienceConfiguration userExperienceConfigurationS;
        cuvm cuvmVar = this.s;
        cuvmVar.b.f("bugle");
        cuvmVar.s();
        cuvmVar.aV(cuvmVar.b.e(cuvmVar.A(), R.xml.rcs_preferences_per_subscription_rcs_settings_redesign_legal_fyi, null));
        cuvmVar.e().ag();
        this.d = cuvmVar.Y(R.string.enable_rcs_pref_key);
        this.ah = cuvmVar.Y(R.string.rcs_fallback_type_pref_key);
        this.e = cuvmVar.Y(R.string.rcs_auto_fallback_pref_key);
        this.aj = cuvmVar.Y(R.string.rcs_default_sharing_method_key);
        this.ai = cuvmVar.Y(R.string.rcs_mobile_data_auto_download_limit_pref_key);
        this.am = cuvmVar.Y(R.string.rcs_learn_more_pref_key);
        this.f = cuvmVar.Y(R.string.rcs_mobile_auto_download_in_roaming_pref_key);
        this.ak = cuvmVar.Y(R.string.rcs_sim_status_pref_key);
        int i = 3;
        try {
            dgiq rcsConfig = ((ciev) this.as.b()).a.getRcsConfig();
            if (rcsConfig != null && (userExperienceConfigurationS = rcsConfig.s()) != null) {
                int i2 = userExperienceConfigurationS.mMessageFallbackDefault;
                int i3 = userExperienceConfigurationS.mFileTransferFallbackDefault;
                char c2 = (i2 == -1 || i3 == -1) ? (char) 65535 : (i2 == 1 || i3 == 1) ? (char) 1 : (char) 0;
                if (c2 != 65535) {
                    i = c2 != 0 ? 2 : 1;
                }
            }
        } catch (efao e) {
            cqca.h("Bugle", e, "RcsUtils. Error getting default configuration value for fallback setting");
        }
        this.al = i;
        cuvm cuvmVar2 = this.s;
        TwoStatePreference twoStatePreference = (TwoStatePreference) cuvmVar2.a(this.d);
        twoStatePreference.getClass();
        Preference preferenceA = cuvmVar2.a(this.ah);
        preferenceA.getClass();
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) cuvmVar2.a(this.e);
        twoStatePreference2.getClass();
        Preference preferenceA2 = cuvmVar2.a(this.ai);
        preferenceA2.getClass();
        Preference preferenceA3 = cuvmVar2.a(this.aj);
        preferenceA3.getClass();
        Preference preferenceA4 = cuvmVar2.a(this.am);
        preferenceA4.getClass();
        TwoStatePreference twoStatePreference3 = (TwoStatePreference) cuvmVar2.a(this.f);
        twoStatePreference3.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = (RcsSimStatusPreference) cuvmVar2.a(this.ak);
        rcsSimStatusPreference.getClass();
        cuol cuolVar = new cuol(twoStatePreference, preferenceA, twoStatePreference2, preferenceA2, preferenceA3, preferenceA4, twoStatePreference3, rcsSimStatusPreference);
        this.Z = cuolVar;
        o(cuolVar.b);
        cuwr cuwrVar = this.Z;
        cuwrVar.getClass();
        if (((arwo) this.az.b()).a()) {
            final cuva cuvaVar = (cuva) this.aA.b();
            final TwoStatePreference twoStatePreference4 = ((cuol) cuwrVar).c;
            twoStatePreference4.M(twoStatePreference4.j.getString(R.string.enable_rcs_auto_fallback_title));
            String string2 = (cuvaVar.b.a() || cuvaVar.c.a()) ? cuvaVar.a.getString(R.string.rcs_auto_fallback_pref_description_v3_when_xms_free) : cuvaVar.a.getString(R.string.rcs_auto_fallback_pref_description_v3_default);
            string2.getClass();
            twoStatePreference4.n(string2);
            twoStatePreference4.n = new oza() { // from class: cuuz
                @Override // defpackage.oza
                public final boolean a(Preference preference, Object obj) {
                    obj.getClass();
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    final cuva cuvaVar2 = cuvaVar;
                    if (!zBooleanValue) {
                        ((crqv) cuvaVar2.d.b()).h(twoStatePreference4.s, false);
                        ((ains) cuvaVar2.e.b()).e("Bugle.RCS.Chat.AutoFallback.Tap.Counts", 2);
                        return true;
                    }
                    final eeji eejiVar = new eeji(cuvaVar2.a);
                    eejiVar.v(eejiVar.getContext().getString(R.string.enable_rcs_auto_fallback_dialog_title));
                    eejiVar.l(eejiVar.getContext().getString(cuvaVar2.c.a() ? R.string.enable_rcs_auto_fallback_dialog_description_v3_xms_free : cuvaVar2.b.a() ? R.string.enable_rcs_auto_fallback_dialog_description_v3_sms_free : R.string.enable_rcs_auto_fallback_dialog_description_v3_default));
                    eejiVar.s(eejiVar.getContext().getString(R.string.confirm_rcs_auto_fallback_yes), new eigf((eigp) cuvaVar2.f.b(), "", "", 0, "RcsSettingsFragmentPeer#setupRcsAutoFallbackPreference", new DialogInterface.OnClickListener() { // from class: cuuy
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            cuva cuvaVar3 = cuvaVar2;
                            ((crqv) cuvaVar3.d.b()).h(eejiVar.getContext().getString(R.string.rcs_auto_fallback_pref_key), true);
                            ((ains) cuvaVar3.e.b()).e("Bugle.RCS.Chat.AutoFallback.Tap.Counts", 1);
                        }
                    }));
                    eejiVar.n(eejiVar.getContext().getString(android.R.string.cancel), null);
                    eejiVar.a();
                    return false;
                }
            };
        } else {
            ((cuol) cuwrVar).c.n = new oza() { // from class: cuwc
                @Override // defpackage.oza
                public final boolean a(Preference preference, Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    final cuwp cuwpVar = this.a;
                    if (!zBooleanValue) {
                        ((crqv) cuwpVar.z.b()).h(cuwpVar.e, false);
                        ((ains) cuwpVar.x.b()).e("Bugle.RCS.Chat.AutoFallback.Tap.Counts", 2);
                        return true;
                    }
                    cuvm cuvmVar3 = cuwpVar.s;
                    eeji eejiVar = new eeji(cuvmVar3.z());
                    eejiVar.v(cuvmVar3.Y(R.string.enable_rcs_auto_fallback_dialog_title));
                    eejiVar.l(cuvmVar3.Y(R.string.enable_rcs_auto_fallback_dialog_description_v2));
                    eejiVar.s(cuvmVar3.Y(R.string.confirm_rcs_auto_fallback), new eigf((eigp) cuwpVar.G.b(), "com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "setupRcsAutoFallbackPreference", 1552, "RcsSettingsFragmentV2Peer#setupRcsAutoFallbackPreference", new DialogInterface.OnClickListener() { // from class: cuwd
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            cuwp cuwpVar2 = cuwpVar;
                            ((crqv) cuwpVar2.z.b()).h(cuwpVar2.e, true);
                            ((ains) cuwpVar2.x.b()).e("Bugle.RCS.Chat.AutoFallback.Tap.Counts", 1);
                        }
                    }));
                    eejiVar.n(cuvmVar3.Y(android.R.string.cancel), null);
                    eejiVar.a();
                    return false;
                }
            };
        }
        cuwr cuwrVar2 = this.Z;
        cuwrVar2.getClass();
        TwoStatePreference twoStatePreference5 = ((cuol) cuwrVar2).a;
        twoStatePreference5.G(false);
        fcsu fcsuVar = this.T;
        if (!((apwv) fcsuVar.b()).a() && !((arwz) this.X.b()).a() && !dfpi.z()) {
            twoStatePreference5.n = new eilq((eils) this.L.b(), "RcsSettingsFragmentV2Peer:rcsEnabledPreference", new oza() { // from class: cuwe
                @Override // defpackage.oza
                public final boolean a(Preference preference, Object obj) {
                    int i4 = ekgb.d;
                    return this.a.m(obj, ekoe.a);
                }
            });
        }
        cuwr cuwrVar3 = this.Z;
        cuwrVar3.getClass();
        if (((chwq) this.t.b()).B()) {
            o(((cuol) cuwrVar3).e);
        } else {
            int defaultSharingMethod = ((RcsProfileService) this.ao.b()).getDefaultSharingMethod();
            this.g = defaultSharingMethod;
            if (defaultSharingMethod != -1) {
                ((cuol) cuwrVar3).e.o = new ozb() { // from class: cuvq
                    @Override // defpackage.ozb
                    public final boolean a(Preference preference) {
                        cuwp cuwpVar = this.a;
                        cuvc cuvcVar = (cuvc) cuwpVar.F.b();
                        eg egVarG = cuwpVar.s.G();
                        egVarG.getClass();
                        fcsu fcsuVar2 = cuvcVar.a;
                        int i4 = cuwpVar.g;
                        crqv crqvVar = (crqv) fcsuVar2.b();
                        crqvVar.getClass();
                        new cuvb(crqvVar, egVarG, i4).c();
                        return true;
                    }
                };
                q();
            } else {
                o(((cuol) cuwrVar3).e);
            }
        }
        cuwr cuwrVar4 = this.Z;
        cuwrVar4.getClass();
        g();
        ((cuol) cuwrVar4).d.o = new ozb() { // from class: cuvn
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                cuok cuokVar = (cuok) this.a.B.b();
                Context context = (Context) cuokVar.a.b();
                context.getClass();
                cqmp cqmpVar = (cqmp) cuokVar.b.b();
                cqmpVar.getClass();
                crqv crqvVar = (crqv) cuokVar.c.b();
                crqvVar.getClass();
                new cuoj(context, cqmpVar, crqvVar).c();
                return true;
            }
        };
        cuwr cuwrVar5 = this.Z;
        cuwrVar5.getClass();
        fcsu fcsuVar2 = this.w;
        boolean zK = k(((chza) ((cqbm) fcsuVar2.b()).a()).d());
        eg egVarG = cuvmVar2.G();
        egVarG.getClass();
        Preference preference = ((cuol) cuwrVar5).f;
        preference.M(dajs.d(egVarG, R.string.rcs_learn_more_title_v2));
        preference.o = new ozb() { // from class: cuvw
            @Override // defpackage.ozb
            public final boolean a(Preference preference2) {
                cuwp cuwpVar = this.a;
                achu achuVar = (achu) cuwpVar.v.b();
                eg egVarG2 = cuwpVar.s.G();
                egVarG2.getClass();
                achuVar.g(egVarG2);
                return true;
            }
        };
        if (!zK && !((apwv) fcsuVar.b()).a() && !((arwz) this.X.b()).a()) {
            cuvmVar2.e().ab();
            cuvmVar2.e().ae(preference);
            preference.L(R.string.rcs_not_available_learn_more_title_v2);
            String strA = cpef.a(cuvmVar2.z());
            String strA2 = a(((chza) ((cqbm) fcsuVar2.b()).a()).d(), strA, false);
            eg egVarG2 = cuvmVar2.G();
            egVarG2.getClass();
            preference.n(dajs.g(egVarG2, strA2, strA));
        }
        cuwr cuwrVar6 = this.Z;
        cuwrVar6.getClass();
        ((cuol) cuwrVar6).g.n = new eilq((eils) this.L.b(), "RcsSettingsFragmentV2Peer:enableAutoDownloadInRoaming", new oza() { // from class: cuvx
            @Override // defpackage.oza
            public final boolean a(Preference preference2, Object obj) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((ekrd) ((ekrd) cuwp.a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "saveAutoDownloadFilesInRoamingPreference", 1451, "RcsSettingsFragmentV2Peer.java")).t("saveAutoDownloadFilesInRoamingPreference : enabled %s", bool);
                cuwp cuwpVar = this.a;
                ((crqv) cuwpVar.z.b()).h(cuwpVar.f, zBooleanValue);
                return zBooleanValue;
            }
        });
        if (!dfpi.z()) {
            f();
        }
        Bundle bundle = cuvmVar2.m;
        if (bundle == null || (string = bundle.getString("open_setting_directly")) == null) {
            return;
        }
        cuwr cuwrVar7 = this.Z;
        cuwrVar7.getClass();
        Preference preference2 = ((cuol) cuwrVar7).e;
        ozb ozbVar = preference2.o;
        if (!this.aj.equals(string) || ozbVar == null) {
            return;
        }
        ozbVar.a(preference2);
    }

    public final void e() {
        cuwr cuwrVar = this.Z;
        cuwrVar.getClass();
        cuvm cuvmVar = this.s;
        SpannableStringBuilder spannableStringBuilderE = dajs.e(cuvmVar.z(), cuvmVar.Z(R.string.rcs_status_legal_banner_pvaas_version, cuvmVar.Y(R.string.rcs_status_about_rcs_chats)), cuvmVar.Y(R.string.rcs_status_about_rcs_chats), new View.OnClickListener() { // from class: cuvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cuwp cuwpVar = this.a;
                ((cjya) cuwpVar.R.b()).d(emfc.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_LEARN_MORE_CLICKED);
                achu achuVar = (achu) cuwpVar.v.b();
                eg egVarG = cuwpVar.s.G();
                egVarG.getClass();
                achuVar.g(egVarG);
            }
        });
        RcsSimStatusPreference rcsSimStatusPreference = ((cuol) cuwrVar).h;
        rcsSimStatusPreference.o(spannableStringBuilderE);
        rcsSimStatusPreference.ab(0);
        cpdt cpdtVar = this.Q;
        cpdtVar.a = true;
        cpdtVar.b = true;
    }

    public final void f() {
        boolean z = false;
        if (((chvg) this.an.b()).c() && l()) {
            z = true;
        }
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateMobileDataAutoDownloadInRoaming", 1321, "RcsSettingsFragmentV2Peer.java")).t("updateMobileDataAutoDownloadInRoaming, enabled %s", Boolean.valueOf(z));
        cuwr cuwrVar = this.Z;
        cuwrVar.getClass();
        ((cuol) cuwrVar).g.k(z);
    }

    public final void g() {
        String strZ;
        cuvm cuvmVar = this.s;
        String strY = cuvmVar.Y(R.string.rcs_mobile_data_auto_download_limit_disable_entry);
        String strY2 = cuvmVar.Y(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String strF = ((crqv) this.z.b()).f(this.ai, cuvmVar.Y(R.string.rcs_mobile_data_auto_download_limit_default_entry));
        if (strF.equals(strY)) {
            strZ = cuvmVar.Y(R.string.rcs_mobile_data_auto_download_limit_disabled_summary);
        } else if (strF.equals(strY2)) {
            strZ = ((cqmp) this.ap.b()).f() ? cuvmVar.Z(R.string.rcs_mobile_data_auto_download_limit_summary_format, Formatter.formatShortFileSize(cuvmVar.G(), cuoj.a(((cqmp) r1.b()).e()))) : cuvmVar.Y(R.string.rcs_mobile_data_auto_download_limit_disabled_summary);
        } else {
            strZ = cuvmVar.Z(R.string.rcs_mobile_data_auto_download_limit_summary_format, Formatter.formatShortFileSize(cuvmVar.G(), Integer.parseInt(strF)));
        }
        cuwr cuwrVar = this.Z;
        cuwrVar.getClass();
        ((cuol) cuwrVar).d.n(strZ);
    }

    public final void h() {
        RcsSimStatusPreference rcsSimStatusPreference;
        LinearLayout linearLayout;
        boolean z = this.k && l();
        ekrg ekrgVar = a;
        ekrd ekrdVar = (ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsEnabledPreference", 858, "RcsSettingsFragmentV2Peer.java");
        Boolean boolValueOf = Boolean.valueOf(z);
        ekrdVar.I("updateRcsEnabledPreference, enabled %s, rcsEnabledGlobal %s, isReadyToEnableRcsChats %s", boolValueOf, Boolean.valueOf(this.k), Boolean.valueOf(l()));
        ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "setRcsEnabledPreference", 865, "RcsSettingsFragmentV2Peer.java")).t("setRcsEnabledPreference, checked %s", boolValueOf);
        cuwr cuwrVar = this.Z;
        cuwrVar.getClass();
        cuol cuolVar = (cuol) cuwrVar;
        cuolVar.a.k(z);
        if (z && ((linearLayout = (rcsSimStatusPreference = cuolVar.h).a) == null || linearLayout.getVisibility() == 8)) {
            ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "setRcsEnabledPreference", 873, "RcsSettingsFragmentV2Peer.java")).q("showing RCS sim status preference");
            LinearLayout linearLayout2 = rcsSimStatusPreference.a;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        }
        if (this.k) {
            n();
        } else {
            p();
        }
    }

    public final void i(ckbz ckbzVar) {
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsGlobalToggle", 884, "RcsSettingsFragmentV2Peer.java")).t("updateRcsGlobalToggle: rcsGlobalToggleState %s", ckbzVar);
        ((egpr) this.I.b()).h(egpq.b(((cjzq) this.S.b()).g(ckbzVar)), new egpo(Integer.valueOf(ckbzVar.e)), this.ab);
    }

    public final boolean j() {
        if (!this.m) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "allRcsSimStatusesShouldNotBeDisplayed", 1105, "RcsSettingsFragmentV2Peer.java")).q("allRcsSimStatusesShouldNotBeDisplayed: RCS SIM info has not been loaded yet");
            return false;
        }
        boolean zAllMatch = Collection.EL.stream(this.l).allMatch(new Predicate() { // from class: cuwb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cuwp cuwpVar = this.a;
                return !cuwpVar.k(((chza) ((cqbm) cuwpVar.w.b()).a()).e(dggo.a((dggn) obj).a));
            }
        });
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "allRcsSimStatusesShouldNotBeDisplayed", 1119, "RcsSettingsFragmentV2Peer.java")).t("allRcsSimStatusesShouldNotBeDisplayed: %s", Boolean.valueOf(zAllMatch));
        return zAllMatch;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(defpackage.enwr r7) {
        /*
            r6 = this;
            int r0 = r7.ordinal()
            r1 = 3
            if (r0 == r1) goto L35
            r1 = 4
            if (r0 == r1) goto L35
            r1 = 5
            if (r0 == r1) goto L35
            r1 = 7
            if (r0 == r1) goto L35
            r1 = 10
            if (r0 == r1) goto L35
            r1 = 21
            if (r0 == r1) goto L35
            r1 = 23
            if (r0 == r1) goto L28
            r1 = 25
            if (r0 == r1) goto L35
            switch(r0) {
                case 16: goto L35;
                case 17: goto L35;
                case 18: goto L35;
                default: goto L23;
            }
        L23:
            switch(r0) {
                case 29: goto L35;
                case 30: goto L35;
                case 31: goto L35;
                case 32: goto L35;
                case 33: goto L35;
                case 34: goto L35;
                case 35: goto L35;
                case 36: goto L35;
                case 37: goto L35;
                default: goto L26;
            }
        L26:
            r0 = 0
            goto L36
        L28:
            fcsu r0 = r6.ay
            java.lang.Object r0 = r0.b()
            arwy r0 = (defpackage.arwy) r0
            boolean r0 = r0.a()
            goto L36
        L35:
            r0 = 1
        L36:
            ekrg r1 = defpackage.cuwp.a
            ekrw r1 = r1.e()
            ekrd r1 = (defpackage.ekrd) r1
            r2 = 1692(0x69c, float:2.371E-42)
            java.lang.String r3 = "RcsSettingsFragmentV2Peer.java"
            java.lang.String r4 = "com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer"
            java.lang.String r5 = "canDisplayRcsChatsStatus"
            ekrw r1 = r1.h(r4, r5, r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "canDisplayRcsChatsStatus %s, Rcs availability %s"
            r1.G(r2, r0, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwp.k(enwr):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        if (((defpackage.crqv) r9.z.b()).d("rcs_tos_state", 0) != 2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        if (r0 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        if (r9.j == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        ((defpackage.ekrd) ((defpackage.ekrd) defpackage.cuwp.a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "isReadyToEnableRcsChatsForAllSims", 1824, "RcsSettingsFragmentV2Peer.java")).I("isReadyToEnabledRcsChatsForAllSims: %s, googleTosAccepted: %s, hasRcsDefaultOnConsent: %s", java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r0), java.lang.Boolean.valueOf(r9.j));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010f, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwp.l():boolean");
    }

    public final boolean m(Object obj, List list) throws Resources.NotFoundException {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        fcsu fcsuVar = this.T;
        boolean z = (!((apwv) fcsuVar.b()).a() || ((arwz) this.X.b()).a()) && r(true) && zBooleanValue;
        boolean zB = dfpi.z() ? this.p : this.P.b();
        if (dfpi.M() && zBooleanValue) {
            ((egpr) this.I.b()).g(egpq.b(((ckhg) this.aw.b()).b()), this.af);
        }
        ekrg ekrgVar = a;
        ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 921, "RcsSettingsFragmentV2Peer.java")).H("onRcsEnablePrefUpdate : isEnabled %s, shouldShowGoogleTos %s", zBooleanValue, z);
        if (z) {
            if (!zB || this.o) {
                ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 925, "RcsSettingsFragmentV2Peer.java")).q("onRcsEnablePrefUpdate: showing Google ToS");
                final dajd dajdVar = (dajd) this.ar.b();
                final eg egVarG = this.s.G();
                egVarG.getClass();
                final Runnable runnable = new Runnable() { // from class: cuvu
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((ekrd) ((ekrd) cuwp.a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onGoogleTosAccepted", 1443, "RcsSettingsFragmentV2Peer.java")).q("onGoogleTosAccepted");
                        cuwp cuwpVar = this.a;
                        fcsu fcsuVar2 = cuwpVar.z;
                        ((crqv) fcsuVar2.b()).h("should_show_google_tos_prompt", false);
                        ((crqv) fcsuVar2.b()).h("did_show_google_tos_prompt", true);
                        ((crqv) fcsuVar2.b()).j("rcs_tos_state", 2);
                        cuwpVar.i(ckbz.TOGGLE_STATE_ENABLED);
                    }
                };
                czqs czqsVar = dajdVar.c;
                emfe emfeVar = emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS;
                final czqr czqrVarA = czqsVar.a(emfeVar, 2);
                dajdVar.d.c("Bugle.FastTrack.Settings.Dialog.Seen");
                ((cjya) dajdVar.a.b()).e(emfc.RCS_PROVISIONING_PROMPT_SEEN, emfeVar);
                ((crqx) dajdVar.b.b()).s(21);
                String string = egVarG.getString(R.string.setting_fast_track_body_with_cost_v2, new Object[]{egVarG.getString(R.string.rcs_chats_terms_of_service), cpef.a(egVarG)});
                eeji eejiVar = new eeji(egVarG);
                eejiVar.u(R.string.settings_fast_track_dialog_title_v2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                czqrVarA.d(egVarG, spannableStringBuilder);
                czqrVarA.c(egVarG, spannableStringBuilder);
                String strA = cpef.a(egVarG);
                int iIndexOf = TextUtils.indexOf(spannableStringBuilder, strA);
                if (iIndexOf != -1) {
                    spannableStringBuilder.setSpan(new eigk(czqrVarA.l, "addLearnMoreSpan", 465, "ProvisioningHelper#addLearnMoreSpan", new czqp(czqrVarA)), iIndexOf, strA.length() + iIndexOf, 17);
                }
                eejiVar.l(spannableStringBuilder);
                eejiVar.i(false);
                eigp eigpVar = dajdVar.h;
                eejiVar.m(R.string.fast_track_negative_button_text, new eigf(eigpVar, "com/google/android/apps/messaging/ui/util/DialogUtils", "showGoogleTosDialog", 456, "GoogleTosDialog#NegativeButtonClick", new DialogInterface.OnClickListener() { // from class: dajb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dajd dajdVar2 = dajdVar;
                        ((cjya) dajdVar2.a.b()).e(emfc.RCS_PROVISIONING_PROMPT_DECLINED, emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS);
                        dajdVar2.d.c("Bugle.FastTrack.Settings.Dialog.Declined");
                        dialogInterface.dismiss();
                    }
                }));
                eejiVar.r(R.string.fast_track_positive_button_text, new eigf(eigpVar, "com/google/android/apps/messaging/ui/util/DialogUtils", "showGoogleTosDialog", 460, "GoogleTosDialog#PositiveButtonClick", new DialogInterface.OnClickListener() { // from class: daja
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        czqrVarA.l(egVarG, false);
                        dajd dajdVar2 = dajdVar;
                        ((cjya) dajdVar2.a.b()).e(emfc.RCS_PROVISIONING_PROMPT_ACCEPTED, emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS);
                        dajdVar2.d.c("Bugle.FastTrack.Settings.Dialog.Accepted");
                        runnable.run();
                    }
                }));
                iv ivVarCreate = eejiVar.create();
                ivVarCreate.show();
                View viewFindViewById = ivVarCreate.findViewById(android.R.id.message);
                if (viewFindViewById instanceof TextView) {
                    TextView textView = (TextView) viewFindViewById;
                    eebt.b(textView);
                    eebt.c(textView);
                }
                return false;
            }
            zB = true;
        }
        if (!zBooleanValue) {
            if (list.size() < 2) {
                if (this.ag != null) {
                    eg egVarG2 = this.s.G();
                    egVarG2.getClass();
                    this.ag.c(new Intent(egVarG2, (Class<?>) TurnOffRcsActivity.class));
                }
                return false;
            }
            cuvm cuvmVar = this.s;
            eg egVarG3 = cuvmVar.G();
            egVarG3.getClass();
            eeji eejiVar2 = new eeji(egVarG3);
            eejiVar2.v(cuvmVar.Y(R.string.disable_rcs_warning_title_v2));
            eejiVar2.s(cuvmVar.Y(R.string.disable_rcs_warning_accept_text), new eigf((eigp) this.G.b(), "com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 980, "RcsSettingsFragmentV2Peer#onRcsEnablePrefUpdate", new DialogInterface.OnClickListener() { // from class: cuvv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.c();
                }
            }));
            eejiVar2.n(cuvmVar.Y(android.R.string.cancel), null);
            if ((((apwv) fcsuVar.b()).a() || ((arwz) this.X.b()).a()) && list.size() > 1) {
                if (list.size() == 2) {
                    eejiVar2.l((((ckcg) list.get(0)).e.isEmpty() || ((ckcg) list.get(1)).e.isEmpty()) ? cuvmVar.Y(R.string.disable_rcs_warning_text_global_level_two_sims) : cuvmVar.Z(R.string.disable_rcs_warning_text_global_level_phone_number, ((ckcg) list.get(0)).e, ((ckcg) list.get(1)).e));
                } else {
                    eejiVar2.l(cuvmVar.Y(R.string.disable_rcs_warning_text_global_level_three_or_more_sims));
                }
            }
            eejiVar2.a();
            return false;
        }
        if (!this.i || ((aoot) this.au.b()).a()) {
            ((egpr) this.I.b()).g(egpq.b(((cjyi) this.V.b()).d()), this.ae);
            ((cvdg) this.K.b()).b(2);
            i(ckbz.TOGGLE_STATE_ENABLED);
            if ((dfpi.z() ? this.n : dfar.b()) && zB) {
                ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 955, "RcsSettingsFragmentV2Peer.java")).q("onRcsEnablePrefUpdate: showing LegalFYI Banner");
                b();
                e();
            }
            if (list.size() < 2) {
                n();
            }
            return true;
        }
        cuvm cuvmVar2 = this.s;
        eg egVarG4 = cuvmVar2.G();
        egVarG4.getClass();
        eeji eejiVar3 = new eeji(egVarG4);
        eejiVar3.v(cuvmVar2.Y(R.string.disable_multidevice_dialog_title));
        eejiVar3.l(dajs.c(cuvmVar2.z(), this.aq, this.v, R.string.disable_multidevice_dialog_message_v2, null, cpyl.i));
        fcsu fcsuVar2 = this.G;
        eejiVar3.s(cuvmVar2.Y(R.string.disable_multidevice_dialog_positive_button), new eigf((eigp) fcsuVar2.b(), "com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "showMultideviceDialogForRcs", 1402, "RcsSettingsFragmentV2Peer:enableMultideviceDialog:positive", new DialogInterface.OnClickListener() { // from class: cuvr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean zBooleanValue2 = ((Boolean) cpyl.q.e()).booleanValue();
                cuwp cuwpVar = this.a;
                if (zBooleanValue2) {
                    ((egpr) cuwpVar.I.b()).g(new egpq(((axky) cuwpVar.u.b()).a()), cuwpVar.M);
                    return;
                }
                cuvm cuvmVar3 = cuwpVar.s;
                eilp.a(cuvmVar3, tlz.c(cuvmVar3.z()));
                dialogInterface.dismiss();
            }
        }));
        eejiVar3.n(cuvmVar2.Y(android.R.string.cancel), new eigf((eigp) fcsuVar2.b(), "com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "showMultideviceDialogForRcs", 1426, "RcsSettingsFragmentV2Peer:enableMultideviceDialog:negative", new DialogInterface.OnClickListener() { // from class: cuvs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ekrg ekrgVar2 = cuwp.a;
                dialogInterface.dismiss();
            }
        }));
        final iv ivVarCreate2 = eejiVar3.create();
        ivVarCreate2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cuvt
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ekrg ekrgVar2 = cuwp.a;
                TextView textView2 = (TextView) ivVarCreate2.findViewById(android.R.id.message);
                textView2.getClass();
                eebt.b(textView2);
                eebt.c(textView2);
            }
        });
        ivVarCreate2.show();
        return false;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws Resources.NotFoundException {
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onSharedPreferenceChanged", 1721, "RcsSettingsFragmentV2Peer.java")).t("onSharedPreferenceChanged : key = %s", str);
        if (str.equals(this.ah)) {
            int iD = ((crqv) this.z.b()).d(this.ah, this.al);
            int i = this.g;
            eg egVarG = this.s.G();
            egVarG.getClass();
            String[] stringArray = egVarG.getResources().getStringArray(i == 1 ? R.array.rcs_fallback_to_sms_dialog_options : R.array.rcs_fallback_to_xms_dialog_options);
            cuwr cuwrVar = this.Z;
            cuwrVar.getClass();
            ((cuol) cuwrVar).b.n(stringArray[iD]);
            return;
        }
        if (str.equals(this.e)) {
            boolean zQ = ((crqv) this.z.b()).q(this.e, false);
            cuwr cuwrVar2 = this.Z;
            cuwrVar2.getClass();
            ((cuol) cuwrVar2).c.k(zQ);
            return;
        }
        if (str.equals(this.ai)) {
            g();
        } else if (str.equals(this.aj)) {
            q();
        } else if (this.f.equals(str)) {
            f();
        }
    }

    /* compiled from: PG */
    final class a implements egps<Void, efwo> {
        public a() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cuwp cuwpVar = cuwp.this;
            tly tlyVar = (tly) ((Optional) ((eyig) cuwpVar.N).a).get();
            cuvm cuvmVar = cuwpVar.s;
            Context context = cuvmVar.e().j;
            Intent intentA = tlyVar.a();
            efyp.c(intentA, (efwo) obj2);
            eilp.a(cuvmVar, intentA);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            ((ekrd) ((ekrd) ((ekrd) cuwp.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$LinkedAccountCallback", "onFailure", (char) 1866, "RcsSettingsFragmentV2Peer.java")).q("Failed to load linked CMS Account");
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
