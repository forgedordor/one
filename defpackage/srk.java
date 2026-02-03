package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srk implements ehay {
    final /* synthetic */ Preference a;
    final /* synthetic */ Preference b;
    final /* synthetic */ Preference c;
    final /* synthetic */ srn d;
    final /* synthetic */ ozm e;

    public srk(Preference preference, Preference preference2, Preference preference3, srn srnVar, ozm ozmVar) {
        this.a = preference;
        this.b = preference2;
        this.c = preference3;
        this.d = srnVar;
        this.e = ozmVar;
    }

    private final void c(Preference preference) {
        if (preference != null) {
            this.e.e().af(preference);
        }
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        c(this.a);
        c(this.b);
        c(this.c);
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!fdbq.f((Boolean) obj, true)) {
            Preference preference = this.a;
            if (preference != null) {
                preference.n(this.e.Y(R.string.device_logging_consent_settings_summary_on_error));
                preference.N(true);
                return;
            }
            return;
        }
        Preference preference2 = this.a;
        if (preference2 != null) {
            final srn srnVar = this.d;
            preference2.o = new ozb() { // from class: sri
                @Override // defpackage.ozb
                public final boolean a(Preference preference3) {
                    srn srnVar2 = srnVar;
                    auvw.k(srnVar2.g, null, null, new srj(srnVar2, null), 3);
                    return true;
                }
            };
            preference2.J(R.string.device_logging_consent_settings_summary);
            preference2.B = R.layout.logging_consent_preference_icon;
            preference2.N(true);
        }
        Preference preference3 = this.b;
        if (preference3 != null) {
            preference3.N(true);
        }
        Preference preference4 = this.c;
        if (preference4 != null) {
            preference4.N(true);
        }
    }
}
