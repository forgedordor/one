package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuty implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final cczv a = cdag.q(181632590, "hide_fi_settings_when_satellite_enabled");
    public static final cczv b = cdag.q(187729732, "go_fi_settings_when_acct_linked_nothing_is_on");
    public static final cczv c = cdag.q(169244616, "enableXmsConfigsChangedCallback");
    public static final eksp d = eksp.c("BugleSettings");
    public static final cqce e = cqce.g("BugleCms", "PerSubscriptionSettingsFragmentPeer");
    public String A;
    public String B;
    public String C;
    public String D;
    public final cmwd E;
    public final cmut F;
    public final Optional G;
    public final Optional H;
    public final ains I;
    public final cmum J;
    public final crny K;
    public final crmx L;
    public final eosc M;
    public final aijh N;
    public final cukm O;
    public final fcsu P;
    public final cupv Q;
    public final cute R;
    public final ehac S;
    public final egzh T;
    public final fcsu U;
    public final egpr V;
    public final eils W;
    public final dakl X;
    public final Optional Y;
    public final Optional Z;
    public final fcsu aa;
    public final Optional ab;
    public final fcsu ac;
    public final fcsu ad;
    public final Optional ae;
    public final tpp af;
    public final fcsu ag;
    public final apqc ah;
    public final efwo ai;
    public final axky aj;
    public g ak;
    public egps al;
    public final fcsu am;
    public final fcsu an;
    public final aiif ao;
    public final ayge ap;
    public final crqu aq;
    private final cuur ar;
    private final fcsu as;
    private final fcsu at;
    private final fcsu au;
    private cuuq aw;
    public PreferenceScreen f;
    public PhoneNumberPreference g;
    public PhoneNumberPreference h;
    public PhoneNumberPreference i;
    public Preference j;
    public Preference k;
    public String l;
    public String m;
    public int n;
    public cmuh o;
    public String p;
    public crqv q;
    public boolean r;
    public cuud s;
    public cupu u;
    public egps v;
    public egps w;
    public String x;
    public String y;
    public String z;
    private final Object av = new Object();
    public Optional t = Optional.empty();

    public cuty(Optional optional, Optional optional2, ains ainsVar, cmwd cmwdVar, ayge aygeVar, cmut cmutVar, cmum cmumVar, crny crnyVar, crmx crmxVar, crqu crquVar, eosc eoscVar, aijh aijhVar, cukm cukmVar, fcsu fcsuVar, cupv cupvVar, cute cuteVar, ehac ehacVar, egpr egprVar, cuur cuurVar, eils eilsVar, fcsu fcsuVar2, dakl daklVar, egzh egzhVar, Optional optional3, Optional optional4, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, Optional optional5, fcsu fcsuVar7, fcsu fcsuVar8, Optional optional6, tpp tppVar, apqc apqcVar, fcsu fcsuVar9, efwo efwoVar, cutf cutfVar, axky axkyVar, fcsu fcsuVar10, fcsu fcsuVar11) {
        this.ai = efwoVar;
        this.ao = cutfVar;
        this.G = optional;
        this.H = optional2;
        this.I = ainsVar;
        this.E = cmwdVar;
        this.ap = aygeVar;
        this.F = cmutVar;
        this.J = cmumVar;
        this.K = crnyVar;
        this.L = crmxVar;
        this.aq = crquVar;
        this.M = eoscVar;
        this.N = aijhVar;
        this.O = cukmVar;
        this.P = fcsuVar;
        this.Q = cupvVar;
        this.R = cuteVar;
        this.S = ehacVar;
        this.T = egzhVar;
        this.U = fcsuVar5;
        this.V = egprVar;
        this.ar = cuurVar;
        this.W = eilsVar;
        this.as = fcsuVar2;
        this.X = daklVar;
        this.Y = optional3;
        this.Z = optional4;
        this.at = fcsuVar3;
        this.au = fcsuVar4;
        this.aa = fcsuVar6;
        this.ab = optional5;
        this.ac = fcsuVar7;
        this.ad = fcsuVar8;
        this.ae = optional6;
        this.af = tppVar;
        this.ah = apqcVar;
        this.ag = fcsuVar9;
        this.aj = axkyVar;
        this.am = fcsuVar10;
        this.an = fcsuVar11;
    }

    public final SwitchPreferenceCompat a(String str) {
        Preference preferenceA = this.ao.a(str);
        preferenceA.getClass();
        return (SwitchPreferenceCompat) preferenceA;
    }

    public final cuuq b() {
        cuuq cuuqVar;
        synchronized (this.av) {
            if (this.aw == null) {
                this.aw = this.ar.a(this.n);
            }
            cuuqVar = this.aw;
        }
        return cuuqVar;
    }

    public final PhoneNumberPreference c(String str) {
        Preference preferenceA = this.ao.a(str);
        preferenceA.getClass();
        return (PhoneNumberPreference) preferenceA;
    }

    public final void d(String str) {
        Preference preferenceA = this.ao.a(str);
        if (preferenceA != null) {
            preferenceA.G(false);
        }
    }

    public final void e(String str, boolean z, oza ozaVar) {
        SwitchPreferenceCompat switchPreferenceCompatA = a(str);
        switchPreferenceCompatA.k(z);
        switchPreferenceCompatA.n = new eilq(this.W, "PerSubscriptionSettingsFragmentPeer:changeBooleanPreference", ozaVar);
    }

    public final void f() {
        aiif aiifVar = this.ao;
        Optional optionalOfNullable = Optional.ofNullable((PreferenceScreen) aiifVar.a(aiifVar.Y(R.string.etouffee_pref_key)));
        if (optionalOfNullable.isEmpty()) {
            return;
        }
        if (!this.Z.isPresent() || !((bvur) this.at.b()).q()) {
            ((PreferenceScreen) optionalOfNullable.get()).N(false);
            ((PreferenceScreen) optionalOfNullable.get()).o = null;
            return;
        }
        final eg egVarG = aiifVar.G();
        egVarG.getClass();
        ozb ozbVar = new ozb() { // from class: cutq
            @Override // defpackage.ozb
            public final boolean a(Preference preference) throws IOException {
                ahbk ahbkVar = (ahbk) this.a.Z.get();
                eg egVar = egVarG;
                eiid.o(egVar, ahbkVar.d(egVar));
                return true;
            }
        };
        PreferenceScreen preferenceScreen = (PreferenceScreen) optionalOfNullable.get();
        preferenceScreen.L(R.string.user_toggle_for_etouffee);
        ((PreferenceScreen) optionalOfNullable.get()).o = ozbVar;
        ((PreferenceScreen) optionalOfNullable.get()).N(true);
    }

    public final void g() {
        aiif aiifVar = this.ao;
        Optional optionalOfNullable = Optional.ofNullable((PreferenceScreen) aiifVar.a(aiifVar.Y(R.string.security_pref_key)));
        if (optionalOfNullable.isEmpty()) {
            return;
        }
        if (!this.Z.isPresent() || !((bvur) this.at.b()).l()) {
            ((PreferenceScreen) optionalOfNullable.get()).N(false);
            ((PreferenceScreen) optionalOfNullable.get()).o = null;
            return;
        }
        final eg egVarG = aiifVar.G();
        egVarG.getClass();
        ozb ozbVar = new ozb() { // from class: cutp
            @Override // defpackage.ozb
            public final boolean a(Preference preference) throws IOException {
                ahbk ahbkVar = (ahbk) this.a.Z.get();
                eg egVar = egVarG;
                eiid.o(egVar, ahbkVar.c(egVar));
                return true;
            }
        };
        PreferenceScreen preferenceScreen = (PreferenceScreen) optionalOfNullable.get();
        preferenceScreen.L(R.string.etouffee_to_telephony_setting);
        ((PreferenceScreen) optionalOfNullable.get()).o = ozbVar;
        ((PreferenceScreen) optionalOfNullable.get()).N(true);
    }

    public final void h(int i) {
        this.I.e("Bugle.Cms.Fi.Entry.Flow.Count", i);
    }

    public final void i(String str) {
        Preference preferenceA = this.ao.a(str);
        if (preferenceA != null) {
            preferenceA.N(true);
        }
    }

    public final void j(PhoneNumberPreference phoneNumberPreference, String str) {
        phoneNumberPreference.o(((alrj) this.ag.b()).u(str, this.n));
    }

    public final void k(PhoneNumberPreference phoneNumberPreference, int i) {
        phoneNumberPreference.e = ((alrj) this.ag.b()).n(this.ao.B().getString(i));
    }

    public final void l(PhoneNumberPreference phoneNumberPreference) {
        phoneNumberPreference.c = this.ao.B().getString(R.string.smsc_number_pref_summary);
        final eigp eigpVar = (eigp) this.as.b();
        final oza ozaVar = new oza() { // from class: cutu
            @Override // defpackage.oza
            public final boolean a(Preference preference, Object obj) {
                final String string = obj.toString();
                final cuty cutyVar = this.a;
                cutyVar.V.h(new egpq(eika.h(new Callable() { // from class: cutl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cuty cutyVar2 = cutyVar;
                        return Boolean.valueOf(cutyVar2.F.d(cutyVar2.n, string));
                    }
                }, cutyVar.M)), new egpo(string), cutyVar.ak);
                return true;
            }
        };
        phoneNumberPreference.n = new oza() { // from class: eijn
            @Override // defpackage.oza
            public final boolean a(Preference preference, Object obj) {
                oza ozaVar2 = ozaVar;
                if (eidc.v()) {
                    ozaVar2.a(preference, obj);
                    return true;
                }
                eieh eiehVarC = eigpVar.c("PerSubscriptionSettingsFragmentPeer:changeSmscPreference", "com/google/apps/tiktok/tracing/contrib/androidx/preference/AndroidXTraceCreation", "onPreferenceChangeListener", 46);
                try {
                    ozaVar2.a(preference, obj);
                    eiehVarC.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
        phoneNumberPreference.o = new ozb() { // from class: cuth
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                this.a.I.c("Bugle.Preference.Smsc.Editor.Open");
                return false;
            }
        };
        phoneNumberPreference.h = new cuti(this);
        phoneNumberPreference.g = true;
    }

    public final void m() {
        cuud cuudVar = this.s;
        this.j.J(true != ((cuudVar.b & 64) != 0 ? cuudVar.i : this.o.l()) ? R.string.disable_group_mms : R.string.enable_group_mms);
    }

    public final boolean n(String str) {
        return this.ao.a(str) instanceof SwitchPreferenceCompat;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(this.l)) {
            m();
        } else if (str.equals(this.m)) {
            this.g.k();
            this.T.a(eijx.e(null), "SIM_SELECTION_SETTINGS_DATASERVICE_KEY");
            this.ap.b().K();
        }
    }

    /* compiled from: PG */
    final class b implements egzv<Boolean> {
        public b() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cqca.n("BugleCms", "Error getting Fi setting status");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            Boolean bool = (Boolean) obj;
            final cuty cutyVar = cuty.this;
            if (cutyVar.G.isPresent()) {
                fcsu fcsuVar = cutyVar.aa;
                if ((!((Boolean) cuty.a.e()).booleanValue() || !((Optional) fcsuVar.b()).isPresent() || !((abdk) ((Optional) fcsuVar.b()).get()).m()) && bool.booleanValue()) {
                    cutyVar.f.N(true);
                    cutyVar.f.o = new eilr(cutyVar.W, "Fi Entry clicked", new ozb() { // from class: cutr
                        @Override // defpackage.ozb
                        public final boolean a(Preference preference) {
                            eiju eijuVarI;
                            cuty cutyVar2 = cutyVar;
                            Object obj2 = cutyVar2.ab.get();
                            if (((Boolean) cpyl.q.e()).booleanValue()) {
                                tpy tpyVar = (tpy) tqa.a.createBuilder();
                                tpyVar.copyOnWrite();
                                tqa tqaVar = (tqa) tpyVar.instance;
                                tqaVar.c = tpz.a(8);
                                tqaVar.b |= 1;
                                eijuVarI = eijx.e(tpyVar.build());
                            } else {
                                final tqd tqdVar = (tqd) obj2;
                                eijuVarI = tqdVar.b.a().i(new eooz() { // from class: tqb
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        if (((Boolean) obj3).booleanValue()) {
                                            tqd tqdVar2 = tqdVar;
                                            return tqdVar2.a.k().h(new ejvr() { // from class: tqc
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj4) {
                                                    aumq aumqVar = (aumq) obj4;
                                                    tpy tpyVar2 = (tpy) tqa.a.createBuilder();
                                                    if (aumqVar.q) {
                                                        if (aumqVar.e) {
                                                            tpyVar2.copyOnWrite();
                                                            tqa tqaVar2 = (tqa) tpyVar2.instance;
                                                            tqaVar2.c = tpz.a(5);
                                                            tqaVar2.b |= 1;
                                                            return tpyVar2.build();
                                                        }
                                                        tpyVar2.copyOnWrite();
                                                        tqa tqaVar3 = (tqa) tpyVar2.instance;
                                                        tqaVar3.c = tpz.a(4);
                                                        tqaVar3.b |= 1;
                                                        return tpyVar2.build();
                                                    }
                                                    if (aumqVar.e) {
                                                        tpyVar2.copyOnWrite();
                                                        tqa tqaVar4 = (tqa) tpyVar2.instance;
                                                        tqaVar4.c = tpz.a(7);
                                                        tqaVar4.b |= 1;
                                                        return tpyVar2.build();
                                                    }
                                                    tpyVar2.copyOnWrite();
                                                    tqa tqaVar5 = (tqa) tpyVar2.instance;
                                                    tqaVar5.c = tpz.a(6);
                                                    tqaVar5.b |= 1;
                                                    return tpyVar2.build();
                                                }
                                            }, tqdVar2.c);
                                        }
                                        tpy tpyVar2 = (tpy) tqa.a.createBuilder();
                                        tpyVar2.copyOnWrite();
                                        tqa tqaVar2 = (tqa) tpyVar2.instance;
                                        tqaVar2.c = tpz.a(3);
                                        tqaVar2.b |= 1;
                                        return eijx.e(tpyVar2.build());
                                    }
                                }, eoqg.a);
                            }
                            cutyVar2.V.h(egpq.a(eijuVarI), new egpo(null), cutyVar2.w);
                            return true;
                        }
                    });
                    return;
                }
            }
            cutyVar.ao.e().af(cutyVar.f);
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    }

    /* compiled from: PG */
    final class e implements egzv<cuud> {
        public e() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cqca.g("Bugle", "Error getting per subscription settings for subId(%s)", Integer.valueOf(cuty.this.n));
        }

        /* JADX WARN: Type inference failed for: r9v46, types: [cknb, java.lang.Object] */
        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final cuty cutyVar = cuty.this;
            cutyVar.s = (cuud) obj;
            int i = cutyVar.s.b & 8;
            aiif aiifVar = cutyVar.ao;
            Preference preferenceA = aiifVar.a(cutyVar.x);
            preferenceA.getClass();
            if (i != 0) {
                preferenceA.N(true);
            }
            if (preferenceA.w) {
                cuud cuudVar = cutyVar.s;
                cutyVar.e(cutyVar.x, (cuudVar.b & 8) != 0 ? cuudVar.f : cutyVar.o.s(), new oza() { // from class: cutj
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuty cutyVar2 = cutyVar;
                        cuuq cuuqVarB = cutyVar2.b();
                        eiju eijuVarJ = cuuqVarB.b.j(new ejvr() { // from class: cuum
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cuud cuudVar2 = (cuud) obj3;
                                int i2 = cuuq.d;
                                cuudVar2.getClass();
                                cuuc builder = cuudVar2.toBuilder();
                                builder.copyOnWrite();
                                cuud cuudVar3 = (cuud) builder.instance;
                                cuudVar3.b |= 8;
                                cuudVar3.f = zEquals;
                                return builder.build();
                            }
                        });
                        cuuqVarB.j(eijuVarJ);
                        cutyVar2.V.h(egpq.b(eijuVarJ), new egpo(cutyVar2.x), cutyVar2.v);
                        return true;
                    }
                });
                if (!cutyVar.r) {
                    cutyVar.d(cutyVar.x);
                }
            }
            Preference preferenceA2 = aiifVar.a(cutyVar.y);
            preferenceA2.getClass();
            if (preferenceA2.w) {
                cuud cuudVar2 = cutyVar.s;
                cutyVar.e(cutyVar.y, (cuudVar2.b & 1) != 0 ? cuudVar2.c : cutyVar.o.n(), new oza() { // from class: cutt
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuty cutyVar2 = cutyVar;
                        cuuq cuuqVarB = cutyVar2.b();
                        eiju eijuVarJ = cuuqVarB.b.j(new ejvr() { // from class: cuun
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cuud cuudVar3 = (cuud) obj3;
                                int i2 = cuuq.d;
                                cuudVar3.getClass();
                                cuuc builder = cuudVar3.toBuilder();
                                builder.copyOnWrite();
                                cuud cuudVar4 = (cuud) builder.instance;
                                cuudVar4.b |= 1;
                                cuudVar4.c = zEquals;
                                return builder.build();
                            }
                        });
                        cuuqVarB.j(eijuVarJ);
                        cutyVar2.V.h(egpq.b(eijuVarJ), new egpo(cutyVar2.y), cutyVar2.v);
                        return true;
                    }
                });
                if (!cutyVar.r) {
                    cutyVar.d(cutyVar.y);
                }
            }
            boolean z = cutyVar.o.p() && (cutyVar.o.j() || (cutyVar.s.b & 2) != 0) && ((cdzw) cutyVar.ad.b()).a();
            Preference preferenceA3 = aiifVar.a(cutyVar.z);
            preferenceA3.getClass();
            if (z) {
                preferenceA3.N(true);
            }
            if (preferenceA3.w) {
                cuud cuudVar3 = cutyVar.s;
                cutyVar.e(cutyVar.z, (cuudVar3.b & 2) != 0 ? cuudVar3.d : cutyVar.o.o(), new oza() { // from class: cutk
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuty cutyVar2 = cutyVar;
                        cuuq cuuqVarB = cutyVar2.b();
                        eiju eijuVarJ = cuuqVarB.b.j(new ejvr() { // from class: cuuf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cuud cuudVar4 = (cuud) obj3;
                                int i2 = cuuq.d;
                                cuudVar4.getClass();
                                cuuc builder = cuudVar4.toBuilder();
                                builder.copyOnWrite();
                                cuud cuudVar5 = (cuud) builder.instance;
                                cuudVar5.b |= 2;
                                cuudVar5.d = zEquals;
                                return builder.build();
                            }
                        });
                        cuuqVarB.j(eijuVarJ);
                        cutyVar2.V.h(egpq.b(eijuVarJ), new egpo(cutyVar2.z), cutyVar2.v);
                        return true;
                    }
                });
            }
            Preference preferenceA4 = aiifVar.a(cutyVar.A);
            preferenceA4.getClass();
            if (preferenceA4.w) {
                cuud cuudVar4 = cutyVar.s;
                cutyVar.e(cutyVar.A, (cuudVar4.b & 4) != 0 ? cuudVar4.e : cutyVar.o.u(), new oza() { // from class: cutg
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuty cutyVar2 = cutyVar;
                        cuuq cuuqVarB = cutyVar2.b();
                        eiju eijuVarJ = cuuqVarB.b.j(new ejvr() { // from class: cuuo
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cuud cuudVar5 = (cuud) obj3;
                                int i2 = cuuq.d;
                                cuudVar5.getClass();
                                cuuc builder = cuudVar5.toBuilder();
                                builder.copyOnWrite();
                                cuud cuudVar6 = (cuud) builder.instance;
                                cuudVar6.b |= 4;
                                cuudVar6.e = zEquals;
                                return builder.build();
                            }
                        });
                        cuuqVarB.j(eijuVarJ);
                        cutyVar2.V.h(egpq.b(eijuVarJ), new egpo(cutyVar2.A), cutyVar2.v);
                        return true;
                    }
                });
                if (!cutyVar.r) {
                    cutyVar.d(cutyVar.A);
                }
            }
            Preference preferenceA5 = aiifVar.a(cutyVar.B);
            preferenceA5.getClass();
            if (preferenceA5.w) {
                cuud cuudVar5 = cutyVar.s;
                cutyVar.e(cutyVar.B, (cuudVar5.b & 16) != 0 ? cuudVar5.g : cutyVar.o.k(), new oza() { // from class: cuto
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuty cutyVar2 = cutyVar;
                        cuuq cuuqVarB = cutyVar2.b();
                        eiju eijuVarJ = cuuqVarB.b.j(new ejvr() { // from class: cuue
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cuud cuudVar6 = (cuud) obj3;
                                int i2 = cuuq.d;
                                cuudVar6.getClass();
                                cuuc builder = cuudVar6.toBuilder();
                                builder.copyOnWrite();
                                cuud cuudVar7 = (cuud) builder.instance;
                                cuudVar7.b |= 16;
                                cuudVar7.g = zEquals;
                                return builder.build();
                            }
                        });
                        cuuqVarB.j(eijuVarJ);
                        cutyVar2.V.h(egpq.b(eijuVarJ), new egpo(cutyVar2.B), cutyVar2.v);
                        if (!zEquals) {
                            return true;
                        }
                        cqca.n("Bugle", "WAP Push SI enabled but no permission to receive. Requesting.");
                        ((crmg) cutyVar2.P.b()).h(new cutx(cutyVar2));
                        return true;
                    }
                });
                if (!cutyVar.r) {
                    cutyVar.d(cutyVar.B);
                }
            }
            cutyVar.m = aiifVar.Y(R.string.mms_phone_number_pref_key);
            PhoneNumberPreference phoneNumberPreference = (PhoneNumberPreference) aiifVar.a(cutyVar.m);
            phoneNumberPreference.getClass();
            cutyVar.g = phoneNumberPreference;
            cutyVar.t = cutyVar.K.h(cutyVar.n).i(false);
            Optional optional = cutyVar.t;
            final PhoneNumberPreference phoneNumberPreference2 = cutyVar.g;
            phoneNumberPreference2.getClass();
            optional.ifPresent(new Consumer() { // from class: cutm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    phoneNumberPreference2.o((alqm) obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((Boolean) cutyVar.am.b()).booleanValue()) {
                cutyVar.g.G(false);
            }
            cutyVar.g.f = true;
            cuud cuudVar6 = cutyVar.s;
            cutyVar.g.b = new cvcs(Optional.of(((alrj) cutyVar.ag.b()).u((cuudVar6.b & 32) != 0 ? cuudVar6.h : null, cutyVar.n)), new cutz(cutyVar));
            cutyVar.g.ab();
            Preference preferenceA6 = aiifVar.a(cutyVar.l);
            preferenceA6.getClass();
            cutyVar.j = preferenceA6;
            if (cutyVar.j.w) {
                cupv cupvVar = cutyVar.Q;
                int i2 = cutyVar.n;
                cmum cmumVar = (cmum) cupvVar.a.b();
                cmumVar.getClass();
                Context context = (Context) cupvVar.b.b();
                cuur cuurVar = (cuur) cupvVar.c.b();
                cuurVar.getClass();
                cutyVar.u = new cupu(cmumVar, context, cuurVar, cutyVar, i2);
                cutyVar.j.o = new cutv(cutyVar);
                cutyVar.m();
                if (!cutyVar.r) {
                    cutyVar.j.G(false);
                }
            }
            Optional optional2 = cutyVar.ae;
            if (optional2.isEmpty()) {
                Preference preferenceA7 = aiifVar.a(cutyVar.D);
                if (preferenceA7 != null) {
                    aiifVar.e().af(preferenceA7);
                    return;
                }
                return;
            }
            Preference preferenceA8 = aiifVar.a(cutyVar.D);
            preferenceA8.getClass();
            optional2.get();
            preferenceA8.L(R.string.ios_reaction_classification_pref_title);
            if (preferenceA8.w) {
                cutyVar.e(cutyVar.D, optional2.get().b(), new oza() { // from class: cutn
                    /* JADX WARN: Type inference failed for: r0v2, types: [cknb, java.lang.Object] */
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        boolean zEquals = Boolean.TRUE.equals(obj2);
                        cuty cutyVar2 = cutyVar;
                        cutyVar2.V.h(egpq.b(cutyVar2.ae.get().a(zEquals)), new egpo(cutyVar2.D), cutyVar2.v);
                        return true;
                    }
                });
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    }

    /* compiled from: PG */
    final class f implements egzv<String> {
        public f() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cqca.d("Bugle", "Error getting SMSC for subId(%s)", Integer.valueOf(cuty.this.n));
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cuty cutyVar = cuty.this;
            String str = (String) obj;
            if (cutyVar.F.c(cutyVar.n) || craf.d) {
                if (!craf.d) {
                    cutyVar.j(cutyVar.h, str);
                    cutyVar.h.ab();
                } else if (ejwk.c(str)) {
                    PhoneNumberPreference phoneNumberPreference = cutyVar.i;
                    cutyVar.j(phoneNumberPreference, cutyVar.K.h(cutyVar.n).x());
                    phoneNumberPreference.ab();
                } else {
                    cutyVar.j(cutyVar.i, str);
                    cutyVar.i.ab();
                }
                cutyVar.p = str;
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    }

    /* compiled from: PG */
    final class a implements egps<Void, evwl<tqa>> {
        public a() {
        }

        private final void d() throws IOException {
            cuty.e.m("Fi Entry point launching Fi Account activity");
            cuty cutyVar = cuty.this;
            aiif aiifVar = cutyVar.ao;
            Context contextZ = aiifVar.z();
            contextZ.getClass();
            Intent intentA = tlz.a(aiifVar.e().j);
            intentA.putExtra("entry_point", 1);
            eiid.o(contextZ, intentA);
        }

        private final void e() throws IOException {
            cuty.e.m("Fi Entry point launching Fi Settings activity");
            cuty cutyVar = cuty.this;
            Context contextZ = cutyVar.ao.z();
            contextZ.getClass();
            Intent intentC = tlz.c(contextZ);
            intentC.putExtra("entry_point", 1);
            eiid.o(contextZ, intentC);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) throws IOException {
            int i;
            switch (((tqa) ((evwl) obj2).a(tqa.a, evrr.a())).c) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                i = 1;
            }
            switch (i - 2) {
                case 1:
                    d();
                    return;
                case 2:
                    cuty.this.h(1);
                    cuty.e.r("User tries to turn on MD when B&R is ON from existing Fi entry point in Advanced Settings while on a non-B&R build, launching the Fi Account Activity");
                    d();
                    return;
                case 3:
                    cuty.this.h(0);
                    e();
                    return;
                case 4:
                    cuty.this.h(2);
                    if (((Boolean) cuty.b.e()).booleanValue()) {
                        e();
                        return;
                    } else {
                        cuty.e.r("User encounters ACCT_LINKED_NOTHING_IS_ON");
                        throw new IllegalStateException("Cms account linked, but nothing is on");
                    }
                case 5:
                    cuty.this.h(3);
                    e();
                    return;
                case 6:
                    if (((Boolean) cpyl.q.e()).booleanValue()) {
                        cuty.e.m("Fi Entry point launching Fi Settings redirect activity");
                        cuty cutyVar = cuty.this;
                        cutyVar.V.g(new egpq(cutyVar.aj.a()), cutyVar.al);
                        return;
                    }
                    break;
            }
            cuty cutyVar2 = cuty.this;
            cutyVar2.h(4);
            if (cutyVar2.ah.a()) {
                cpri.a("FLOW_UNSPECIFIED: Not expected to happen");
            } else {
                ((cden) cutyVar2.ac.b()).b(new IllegalStateException("FLOW_UNSPECIFIED: Not expected to happen")).k(auvh.b(), eoqg.a);
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            cuty cutyVar = cuty.this;
            cutyVar.h(5);
            ((cden) cutyVar.ac.b()).b(th).k(auvh.b(), eoqg.a);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class c implements egps<String, Void> {
        public c() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            String str = (String) obj;
            cuty cutyVar = cuty.this;
            if (cutyVar.n(str)) {
                cutyVar.a(str).G(true);
            } else if (str.equals(cutyVar.m)) {
                cutyVar.T.a(eijx.e(null), "SIM_SELECTION_SETTINGS_DATASERVICE_KEY");
                cutyVar.c(str).G(true);
                cutyVar.ap.b().K();
            } else if (str.equals(cutyVar.l)) {
                cutyVar.m();
            } else {
                cqca.o("Bugle", "handlePreferenceChangedCallback.onSuccess called for unexpected preference key %s", str);
            }
            if (((Boolean) cuty.c.e()).booleanValue()) {
                cutyVar.Y.ifPresent(new Consumer() { // from class: cuts
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        ((cmuu) obj3).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        /* JADX WARN: Type inference failed for: r7v15, types: [cknb, java.lang.Object] */
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            cuty cutyVar = cuty.this;
            String str = (String) obj;
            cutyVar.X.i(R.string.error_failed_to_save_setting);
            boolean zBooleanValue = false;
            cqca.g("Bugle", "Error saving per subscription settings for subId(%s), preference key(%s), error: %s", Integer.valueOf(cutyVar.n), str, th.getMessage());
            if (!cutyVar.n(str)) {
                if (!str.equals(cutyVar.m)) {
                    if (str.equals(cutyVar.l)) {
                        cutyVar.m();
                        return;
                    } else {
                        cqca.o("Bugle", "handlePreferenceChangedCallback.onFailure called for unexpected preference key %s", str);
                        return;
                    }
                }
                PhoneNumberPreference phoneNumberPreferenceC = cutyVar.c(str);
                Optional optionalOf = (cutyVar.s.b & 32) != 0 ? Optional.of(((alrj) cutyVar.ag.b()).u(cutyVar.s.h, cutyVar.n)) : cutyVar.t;
                cvcs cvcsVar = phoneNumberPreferenceC.b;
                if (cvcsVar == null) {
                    phoneNumberPreferenceC.b = cvcs.a(optionalOf);
                } else {
                    cvcsVar.b(optionalOf);
                }
                cutyVar.c(str).G(true);
                return;
            }
            cuuq cuuqVarB = cutyVar.b();
            if (str.equals(cutyVar.x)) {
                zBooleanValue = ((Boolean) cuuqVarB.f().orElse(Boolean.valueOf(cutyVar.o.t()))).booleanValue();
            } else if (str.equals(cutyVar.A)) {
                zBooleanValue = ((Boolean) cuuqVarB.i().orElse(Boolean.valueOf(cutyVar.o.u()))).booleanValue();
            } else if (str.equals(cutyVar.y)) {
                zBooleanValue = ((Boolean) cuuqVarB.c().orElse(Boolean.valueOf(cutyVar.o.n()))).booleanValue();
            } else if (str.equals(cutyVar.z)) {
                zBooleanValue = ((Boolean) cuuqVarB.d().orElse(Boolean.valueOf(cutyVar.o.o()))).booleanValue();
            } else if (str.equals(cutyVar.B)) {
                zBooleanValue = ((Boolean) cuuqVarB.g().orElse(Boolean.valueOf(cutyVar.o.k()))).booleanValue();
            } else {
                if (!str.equals(cutyVar.D)) {
                    throw new IllegalArgumentException("handleBooleanPreferenceChangeOnFailure called for unexpected preference key ".concat(String.valueOf(str)));
                }
                Optional optional = cutyVar.ae;
                if (optional.isEmpty() || optional.get().b()) {
                    zBooleanValue = true;
                }
            }
            SwitchPreferenceCompat switchPreferenceCompatA = cutyVar.a(str);
            switchPreferenceCompatA.k(zBooleanValue);
            switchPreferenceCompatA.G(true);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class d implements egps<Void, efwo> {
        public d() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) throws IOException {
            efwo efwoVar = (efwo) obj2;
            cuty cutyVar = cuty.this;
            Context contextZ = cutyVar.ao.z();
            contextZ.getClass();
            Optional optional = cutyVar.G;
            if (optional.isPresent()) {
                Intent intentD = tlz.d(contextZ);
                efyp.c(intentD, efwoVar);
                eiid.o(contextZ, intentD);
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) throws IOException {
            if (!(th instanceof axlg)) {
                cqbd cqbdVarE = cuty.e.e();
                cqbdVarE.I("Failed to load linked CMS Account");
                cqbdVarE.s(th);
                return;
            }
            cuty cutyVar = cuty.this;
            Optional optional = cutyVar.G;
            if (optional.isPresent()) {
                Context contextZ = cutyVar.ao.z();
                contextZ.getClass();
                efwo efwoVar = cutyVar.ai;
                Intent intentD = tlz.d(contextZ);
                efyp.c(intentD, efwoVar);
                eiid.o(contextZ, intentD);
            }
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class g implements egps<String, Boolean> {
        public g() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            String str = (String) obj;
            cqca.i("Bugle", "Successfully set SMSC address");
            cuty cutyVar = cuty.this;
            cutyVar.I.c(Objects.equals(cutyVar.p, str) ? "Bugle.Preference.Smsc.Editor.Closed.Unmodified" : str == null ? "Bugle.Preference.Smsc.Editor.Closed.Clear" : "Bugle.Preference.Smsc.Editor.Closed.Modified");
            cutyVar.p = str;
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            cqca.p("Bugle", th, "Error setting SMSC address");
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
