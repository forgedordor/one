package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfu {
    public static final cczi a = cvdq.a;
    public static final egyj b = new egyb("CROSS_COUNTRY_SETTING_STATE_DATA_SOURCE_KEY");
    public final cvfn c;
    public final ehbb d;
    public final fcsu e;
    public final fcsu f;
    public final fdjx g;
    public final cvfs h;
    public final ehay i;

    public cvfu(cvfn cvfnVar, ehbb ehbbVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        ehbbVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.c = cvfnVar;
        this.d = ehbbVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fdjxVar;
        this.h = new cvfs(this);
        this.i = new ehay() { // from class: cvfo
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
        cvfn cvfnVar = this.c;
        return (SwitchPreferenceCompat) cvfnVar.a(cvfnVar.Y(R.string.cross_country_hide_pref_key));
    }
}
