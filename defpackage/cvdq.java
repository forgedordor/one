package defpackage;

import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdq implements cvdx {
    public static final cczi a = cdag.g(cdag.b, "cross_cuntry_learn_more_url", "https://support.google.com/messages?p=hide_unknown_overseas_messages");
    public static final egyj b = new egyb("CROSS_COUNTRY_SETTING_STATE_DATA_SOURCE_KEY");
    public final fcsu c;
    public final fcsu d;
    public final fdjx e;
    public final ozm f;
    private final ehbb g;
    private final cvdo h;
    private final ehay i;

    public cvdq(ea eaVar, ehbb ehbbVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        ehbbVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.g = ehbbVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fdjxVar;
        this.f = (ozm) eaVar;
        this.h = new cvdo(this);
        this.i = new ehay() { // from class: cvdk
            @Override // defpackage.ehay
            public final /* synthetic */ void a(Throwable th) {
                ehax.a(th);
            }

            @Override // defpackage.ehay
            public final void b(Object obj) {
                Boolean bool = (Boolean) obj;
                SwitchPreferenceCompat switchPreferenceCompatA = this.a.a();
                if (switchPreferenceCompatA != null) {
                    switchPreferenceCompatA.k(bool.booleanValue());
                }
            }
        };
    }

    public final SwitchPreferenceCompat a() {
        ozm ozmVar = this.f;
        return (SwitchPreferenceCompat) ozmVar.a(ozmVar.Y(R.string.cross_country_hide_pref_key_2025_03_18));
    }

    @Override // defpackage.cvdx
    public final void b() {
        ozm ozmVar = this.f;
        SwitchPreferenceCompat switchPreferenceCompatA = a();
        Preference preferenceA = ozmVar.a(ozmVar.Y(R.string.cross_country_hide_body_text_pref_key_2025_03_18));
        if (switchPreferenceCompatA == null || preferenceA == null) {
            return;
        }
        if (csje.a()) {
            switchPreferenceCompatA.N(true);
            preferenceA.N(true);
        } else {
            switchPreferenceCompatA.N(false);
            preferenceA.N(false);
        }
        this.g.g(R.id.cross_country_setting_initial_state_registration_id, this.h, this.i);
        switchPreferenceCompatA.Z();
        switchPreferenceCompatA.n = new oza() { // from class: cvdl
            @Override // defpackage.oza
            public final boolean a(Preference preference, Object obj) {
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                cvdq cvdqVar = this.a;
                auvw.m(cvdqVar.e, null, new cvdp(cvdqVar, obj, null), 3);
                return true;
            }
        };
        preferenceA.M(dajs.i(ozmVar.z(), R.string.cross_country_hide_body));
        preferenceA.o = new ozb() { // from class: cvdm
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                cvdq cvdqVar = this.a;
                ((aijh) cvdqVar.d.b()).t(cvdqVar.f.G(), (String) cvdq.a.e());
                return true;
            }
        };
    }
}
