package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqtj {
    public static final cczi a = cdag.g(cdag.b, "google_global_privacy_policy", "https://www.google.com/policies/privacy/");
    public static final cczi b = cdag.g(cdag.b, "google_regional_privacy_policy_pattern", "https://www.google.com/intl/%1$s_%2$s/policies/privacy/");
    public final Context c;

    public cqtj(Context context) {
        this.c = context;
    }

    public final String a() {
        Locale localeC = craf.c(this.c);
        String country = localeC.getCountry();
        return Locale.US.getCountry().equals(country) ? (String) a.e() : String.format(Locale.US, (String) b.e(), localeC.getLanguage(), country);
    }

    public final String b() {
        Locale localeC = craf.c(this.c);
        String country = localeC.getCountry();
        return Locale.US.getCountry().equals(country) ? "https://www.google.com/policies/terms/" : String.format(Locale.US, "https://www.google.com/intl/%1$s_%2$s/policies/terms/regional.html", localeC.getLanguage(), country);
    }
}
