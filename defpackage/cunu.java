package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cunu extends cuog implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final cqce a = cqce.g("Bugle", "ApplicationSettingsFragmentPeer");
    public static final cqce b = cqce.g("BugleCms", "ApplicationSettingsFragmentPeer");
    public static final eksp c = eksp.c("BugleSettings");
    public final fcsu A;
    public final Optional C;
    public final Optional D;
    public final fcsu E;
    public final fhfu F;
    public final fcsu G;
    public final fcsu H;
    public final fcsu I;
    public final fcsu J;
    public final Optional K;
    public final Optional L;
    public final aqhv M;
    public egps N;
    public egps O;
    public String P;
    public Optional Q;
    public String R;
    public Optional S;
    public Optional T;
    public Optional U;
    public Optional V;
    public Optional W;
    public Optional X;
    public Optional Y;
    public Optional Z;
    public Optional aa;
    public Optional ab;
    public Optional ac;
    public Optional ad;
    public Optional ae;
    public Optional af;
    public Optional ag;
    public Optional ah;
    private final crnf aj;
    private final crmx ak;
    public final efwo d;
    public final cumg f;
    public final fcsu g;
    public final crqv h;
    public final cqzr i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final Optional m;
    public final cqjy n;
    public final fcsu o;
    public final ehac p;
    public final ehbb q;
    public final egpr r;
    public final Optional s;
    public final Optional t;
    public final eils u;
    public final crpp v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public final eygg z;
    public final cpdt e = new cpdt("enableConversationScaleSetting", new fdae() { // from class: cund
        @Override // defpackage.fdae
        public final Object invoke() {
            cqce cqceVar = cunu.a;
            return (Boolean) ((cczi) cvuh.a.get()).e();
        }
    });
    public final b B = new b();

    /* compiled from: PG */
    final class b implements egzv<cvua> {
        public b() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cunu.this.ab.ifPresent(new Consumer() { // from class: cunx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                    switchPreferenceCompat.G(true);
                    switchPreferenceCompat.N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((eksl) ((eksl) cunu.c.j()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$LoadPinchZoomCallback", "onError", 1257, "ApplicationSettingsFragmentPeer.java")).q("Failed to load pinch to zoom");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final cvua cvuaVar = (cvua) obj;
            cunu.this.ab.ifPresent(new Consumer() { // from class: cunv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(cvuaVar.d);
                    switchPreferenceCompat.G(true);
                    switchPreferenceCompat.N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egzv
        public final void hn() {
            cunu.this.ab.ifPresent(new Consumer() { // from class: cunw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* compiled from: PG */
    final class c implements egzv<Boolean> {
        public c() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cunu.this.Z.ifPresent(new Consumer() { // from class: cuob
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cunu.a.n("Failed to load reminder setting data");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            cunu cunuVar = cunu.this;
            cunuVar.Z.ifPresent(new Consumer() { // from class: cunz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.G(true);
                    twoStatePreference.k(bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cunuVar.Q.ifPresent(new Consumer() { // from class: cuoa
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    Preference preference = (Preference) obj2;
                    if (bool.booleanValue() && cunu.f()) {
                        preference.J(R.string.notifications_pref_summary);
                    } else {
                        preference.n("");
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egzv
        public final void hn() {
            cunu.this.Z.ifPresent(new Consumer() { // from class: cuny
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((TwoStatePreference) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* compiled from: PG */
    final class d implements egps<Boolean, Void> {
        public d() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cunu.this.Z.ifPresent(new Consumer() { // from class: cuoc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cunu.this.Z.ifPresent(new Consumer() { // from class: cuod
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj3) {
                    ((TwoStatePreference) obj3).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            final Boolean bool = (Boolean) obj;
            cunu cunuVar = cunu.this;
            cunuVar.Z.ifPresent(new Consumer() { // from class: cuoe
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).k(!bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cunuVar.Z.ifPresent(new Consumer() { // from class: cuof
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((TwoStatePreference) obj2).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cunu.a.n("Failed to save reminder action setting");
        }
    }

    public cunu(efwo efwoVar, cumg cumgVar, fcsu fcsuVar, crqv crqvVar, cqzr cqzrVar, fcsu fcsuVar2, crnf crnfVar, crmx crmxVar, fcsu fcsuVar3, fcsu fcsuVar4, Optional optional, cqjy cqjyVar, fcsu fcsuVar5, ehac ehacVar, ehbb ehbbVar, egpr egprVar, Optional optional2, Optional optional3, eils eilsVar, crpp crppVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, eygg eyggVar, fcsu fcsuVar9, Optional optional4, Optional optional5, fhfu fhfuVar, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, Optional optional6, Optional optional7, aqhv aqhvVar) {
        this.d = efwoVar;
        this.f = cumgVar;
        this.g = fcsuVar;
        this.h = crqvVar;
        this.i = cqzrVar;
        this.j = fcsuVar2;
        this.aj = crnfVar;
        this.ak = crmxVar;
        this.k = fcsuVar3;
        this.l = fcsuVar4;
        this.m = optional;
        this.n = cqjyVar;
        this.o = fcsuVar5;
        this.p = ehacVar;
        this.q = ehbbVar;
        this.r = egprVar;
        this.s = optional2;
        this.t = optional3;
        this.u = eilsVar;
        this.v = crppVar;
        this.w = fcsuVar6;
        this.x = fcsuVar7;
        this.y = fcsuVar8;
        this.z = eyggVar;
        this.A = fcsuVar9;
        this.C = optional4;
        this.D = optional5;
        this.E = fcsuVar10;
        this.F = fhfuVar;
        this.G = fcsuVar11;
        this.H = fcsuVar12;
        this.I = fcsuVar13;
        this.J = fcsuVar14;
        this.K = optional6;
        this.L = optional7;
        this.M = aqhvVar;
    }

    static boolean f() {
        return ((Boolean) cgfc.a.e()).booleanValue();
    }

    final Optional a(int i) {
        cumg cumgVar = this.f;
        return Optional.ofNullable(cumgVar.a(cumgVar.Y(i)));
    }

    final Optional b(String str) {
        return Optional.ofNullable(this.f.a(str));
    }

    final void c() {
        String displayCountry;
        String strA = this.v.a();
        cumg cumgVar = this.f;
        eg egVarG = cumgVar.G();
        if (crpq.a(strA)) {
            String strC = this.aj.c();
            displayCountry = !TextUtils.isEmpty(strC) ? cumgVar.Z(R.string.auto_selected_country_summary, new Locale("", strC).getDisplayCountry(lad.a(egVarG.getResources().getConfiguration()).f(0))) : null;
        } else {
            displayCountry = new Locale("", strA).getDisplayCountry(lad.a(egVarG.getResources().getConfiguration()).f(0));
        }
        if (this.T.isPresent()) {
            ((Preference) this.T.get()).n(ejwk.b(displayCountry));
        } else {
            a.p("currentCountryPreference was not found");
        }
    }

    final void d() {
        Optional optional = this.Q;
        if (optional == null || optional.isEmpty()) {
            a.p("notificationsPreference was not found");
        } else {
            ((Preference) this.Q.get()).G(this.ak.G());
        }
    }

    final void e(SharedPreferences sharedPreferences) {
        Optional optional = this.S;
        if (optional == null || optional.isEmpty()) {
            a.p("ringtonePreference was not found");
            return;
        }
        String string = ((Preference) this.S.get()).j.getString(R.string.silent_ringtone);
        String string2 = sharedPreferences.getString(this.R, null);
        if (string2 == null) {
            string2 = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(this.R, string2);
            editorEdit.apply();
        }
        if (!TextUtils.isEmpty(string2)) {
            try {
                Ringtone ringtone = RingtoneManager.getRingtone(((Preference) this.S.get()).j, Uri.parse(string2));
                if (ringtone != null) {
                    string = ringtone.getTitle(((Preference) this.S.get()).j);
                }
            } catch (SecurityException unused) {
                string = this.f.Y(R.string.unknown_ringtone_pref_display_value);
            }
        }
        ((Preference) this.S.get()).n(string);
    }

    final void g() {
        if (abxb.a() && cpyl.a()) {
            this.C.isPresent();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(this.P)) {
            d();
        } else if (str.equals(this.R)) {
            e(sharedPreferences);
        } else if (str.equals(this.v.b())) {
            c();
        }
    }

    /* compiled from: PG */
    final class a implements egps<Intent, efwo> {
        public a() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Intent intent = (Intent) obj;
            efwo efwoVar = (efwo) obj2;
            efwoVar.getClass();
            efyp.c(intent, efwoVar);
            cunu cunuVar = cunu.this;
            eilp.a(cunuVar.f, intent);
            cunuVar.ae.ifPresent(new Consumer() { // from class: cunt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj3) {
                    ((Preference) ((AtomicReference) obj3).get()).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            Intent intent = (Intent) obj;
            if (th instanceof axlg) {
                cunu cunuVar = cunu.this;
                efwo efwoVar = cunuVar.d;
                efwoVar.getClass();
                efyp.c(intent, efwoVar);
                eilp.a(cunuVar.f, intent);
            } else {
                cqbd cqbdVarE = cunu.b.e();
                cqbdVarE.I("Failed to load linked CMS Account");
                cqbdVarE.s(th);
            }
            cunu.this.ae.ifPresent(new Consumer() { // from class: cuns
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    ((Preference) ((AtomicReference) obj2).get()).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
