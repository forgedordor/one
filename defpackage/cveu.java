package defpackage;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.AapmSwitchPreference;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cveu implements cvdx {
    public static final cczi a = cdag.g(cdag.b, "spam_settings_learn_more_url", "https://support.google.com/messages?p=spamdetection");
    public static final cczi b = cdag.g(cdag.b, "spam_settings_learn_more_help_and_feedback_topic", "spamdetection");
    public static final egyj c = new egyb("SPAM_PROTECTION_SETTING_STATE_DATA_SOURCE_KEY");
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fdjx i;
    public final ozm j;
    private final ehbb k;
    private final cves l;
    private final ehay m;
    private final cveq n;
    private final ehay o;

    public cveu(ea eaVar, ehbb ehbbVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fdjx fdjxVar) {
        ehbbVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.k = ehbbVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fdjxVar;
        this.j = (ozm) eaVar;
        this.l = new cves(this);
        this.m = new ehay() { // from class: cvef
            @Override // defpackage.ehay
            public final /* synthetic */ void a(Throwable th) {
                ehax.a(th);
            }

            @Override // defpackage.ehay
            public final void b(Object obj) {
                Boolean bool = (Boolean) obj;
                AapmSwitchPreference aapmSwitchPreferenceD = this.a.d();
                if (aapmSwitchPreferenceD != null) {
                    aapmSwitchPreferenceD.k(bool.booleanValue());
                }
            }
        };
        this.n = new cveq(this);
        this.o = new ehay() { // from class: cveg
            @Override // defpackage.ehay
            public final /* synthetic */ void a(Throwable th) {
                ehax.a(th);
            }

            @Override // defpackage.ehay
            public final void b(Object obj) {
                cveu cveuVar = this.a;
                cveo cveoVar = (cveo) obj;
                AapmSwitchPreference aapmSwitchPreferenceD = cveuVar.d();
                if (aapmSwitchPreferenceD != null) {
                    if (cveoVar.a) {
                        aapmSwitchPreferenceD.k(true);
                        aapmSwitchPreferenceD.G(false);
                    } else {
                        aapmSwitchPreferenceD.G(true);
                        aapmSwitchPreferenceD.k(cveoVar.b);
                    }
                }
                Preference preferenceA = cveuVar.a();
                if (preferenceA != null) {
                    preferenceA.N(cveoVar.a);
                }
                Preference preferenceC = cveuVar.c();
                if (preferenceC != null) {
                    cveuVar.e(preferenceC, cveoVar.a);
                }
            }
        };
    }

    public final Preference a() {
        ozm ozmVar = this.j;
        return ozmVar.a(ozmVar.Y(R.string.spam_protection_aapm_text_pref_key_2025_03_18));
    }

    @Override // defpackage.cvdx
    public final void b() {
        AapmSwitchPreference aapmSwitchPreferenceD = d();
        Preference preferenceA = a();
        Preference preferenceC = c();
        if (aapmSwitchPreferenceD == null || preferenceA == null || preferenceC == null) {
            return;
        }
        preferenceA.N(false);
        ehbb ehbbVar = this.k;
        ehbbVar.g(R.id.spam_protection_setting_state_registration_id, this.l, this.m);
        aapmSwitchPreferenceD.Z();
        aapmSwitchPreferenceD.n = new oza() { // from class: cvee
            @Override // defpackage.oza
            public final boolean a(Preference preference, Object obj) {
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                cveu cveuVar = this.a;
                auvw.m(cveuVar.i, null, new cvet(cveuVar, obj, null), 3);
                return true;
            }
        };
        aapmSwitchPreferenceD.d = new fdae() { // from class: cveh
            @Override // defpackage.fdae
            public final Object invoke() {
                final cveu cveuVar = this.a;
                ozm ozmVar = cveuVar.j;
                String strB = cpef.b(ozmVar.Y(R.string.spam_protection_pref_disabled_dialog_body_link));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ozmVar.Z(R.string.spam_protection_pref_disabled_dialog_body, strB));
                cpef.d(ozmVar.A(), spannableStringBuilder, strB, true, new View.OnClickListener() { // from class: cvei
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws IOException {
                        ((crxn) cveuVar.e.b()).a();
                    }
                });
                eeji eejiVar = new eeji(ozmVar.A(), R.style.ThemeOverlay_Material3_MaterialAlertDialog);
                eejiVar.u(R.string.spam_protection_pref_disabled_dialog_title);
                eejiVar.l(spannableStringBuilder);
                eejiVar.r(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: cvej
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        cczi ccziVar = cveu.a;
                    }
                });
                final iv ivVarCreate = eejiVar.create();
                ivVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cvek
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        cczi ccziVar = cveu.a;
                        TextView textView = (TextView) ivVarCreate.findViewById(android.R.id.message);
                        if (textView == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        eebt.b(textView);
                        eebt.c(textView);
                    }
                });
                ivVarCreate.show();
                return fctx.a;
            }
        };
        ozm ozmVar = this.j;
        String strB = cpef.b(ozmVar.Y(R.string.spam_protection_aapm_summary_pref_link));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ozmVar.Z(R.string.spam_protection_aapm_summary_pref, strB));
        cpef.d(ozmVar.A(), spannableStringBuilder, strB, true, null);
        preferenceA.M(spannableStringBuilder);
        preferenceA.o = new ozb() { // from class: cvel
            @Override // defpackage.ozb
            public final boolean a(Preference preference) throws IOException {
                ((crxn) this.a.e.b()).a();
                return true;
            }
        };
        e(preferenceC, ((crxn) this.e.b()).b());
        preferenceC.o = new ozb() { // from class: cvem
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                String str = (String) cveu.b.e();
                String str2 = (String) cveu.a.e();
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    return false;
                }
                cveu cveuVar = this.a;
                if (crtr.d()) {
                    ((aise) cveuVar.h.b()).c(2, 3);
                }
                if (TextUtils.isEmpty(str)) {
                    ((aijh) cveuVar.f.b()).t(cveuVar.j.G(), str2);
                    return true;
                }
                ((achu) cveuVar.g.b()).d(cveuVar.j.G(), str);
                return true;
            }
        };
        ehbbVar.g(R.id.spam_protection_setting_aapm_registration_id, this.n, this.o);
    }

    public final Preference c() {
        ozm ozmVar = this.j;
        return ozmVar.a(ozmVar.Y(R.string.spam_protection_body_text_pref_key_2025_03_18));
    }

    public final AapmSwitchPreference d() {
        ozm ozmVar = this.j;
        return (AapmSwitchPreference) ozmVar.a(ozmVar.Y(R.string.spam_protection_pref_key_2025_03_18));
    }

    public final void e(Preference preference, boolean z) {
        preference.M(dajs.i(this.j.z(), true != z ? R.string.spam_protection_consent_string : R.string.spam_protection_consent_string_aapm_on));
    }
}
