package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.AapmSwitchPreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfm {
    public static final cczi a = cdag.g(cdag.b, "spam_settings_learn_more_url", "https://support.google.com/messages?p=spamdetection");
    public static final cczi b = cdag.g(cdag.b, "spam_settings_learn_more_help_and_feedback_topic", "spamdetection");
    public static final egyj c = new egyb("SPAM_PROTECTION_SETTING_STATE_DATA_SOURCE_KEY");
    public final cvev d;
    public final ehbb e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fdjx k;
    public final cvfk l;
    public final ehay m;
    public final cvfi n;
    public final ehay o;

    public cvfm(cvev cvevVar, ehbb ehbbVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fdjx fdjxVar) {
        ehbbVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.d = cvevVar;
        this.e = ehbbVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = fdjxVar;
        this.l = new cvfk(this);
        this.m = new ehay() { // from class: cvey
            @Override // defpackage.ehay
            public final /* synthetic */ void a(Throwable th) {
                ehax.a(th);
            }

            @Override // defpackage.ehay
            public final void b(Object obj) {
                Boolean bool = (Boolean) obj;
                AapmSwitchPreference aapmSwitchPreferenceC = this.a.c();
                if (aapmSwitchPreferenceC != null) {
                    aapmSwitchPreferenceC.k(bool.booleanValue());
                }
            }
        };
        this.n = new cvfi(this);
        this.o = new ehay() { // from class: cvez
            @Override // defpackage.ehay
            public final /* synthetic */ void a(Throwable th) {
                ehax.a(th);
            }

            @Override // defpackage.ehay
            public final void b(Object obj) {
                cvfm cvfmVar = this.a;
                cvfg cvfgVar = (cvfg) obj;
                AapmSwitchPreference aapmSwitchPreferenceC = cvfmVar.c();
                if (aapmSwitchPreferenceC != null) {
                    if (cvfgVar.a) {
                        aapmSwitchPreferenceC.k(true);
                        aapmSwitchPreferenceC.G(false);
                    } else {
                        aapmSwitchPreferenceC.G(true);
                        aapmSwitchPreferenceC.k(cvfgVar.b);
                    }
                }
                Preference preferenceA = cvfmVar.a();
                if (preferenceA != null) {
                    preferenceA.N(cvfgVar.a);
                }
                Preference preferenceB = cvfmVar.b();
                if (preferenceB != null) {
                    cvfmVar.d(preferenceB, cvfgVar.a);
                }
            }
        };
    }

    public final Preference a() {
        cvev cvevVar = this.d;
        return cvevVar.a(cvevVar.Y(R.string.spam_protection_aapm_text_pref_key));
    }

    public final Preference b() {
        cvev cvevVar = this.d;
        return cvevVar.a(cvevVar.Y(R.string.spam_protection_body_text_pref_key));
    }

    public final AapmSwitchPreference c() {
        cvev cvevVar = this.d;
        return (AapmSwitchPreference) cvevVar.a(cvevVar.Y(R.string.spam_protection_pref_key));
    }

    public final void d(Preference preference, boolean z) {
        preference.M(dajs.d(this.d.z(), true != z ? R.string.spam_protection_consent_string : R.string.spam_protection_consent_string_aapm_on));
    }
}
