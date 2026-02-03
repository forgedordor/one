package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngl {
    public static final String a(Locale locale) {
        String language;
        locale.getClass();
        String country = locale.getCountry();
        country.getClass();
        if (fdgn.H(country)) {
            language = locale.getLanguage();
            language.getClass();
        } else {
            language = locale.getLanguage() + "_" + locale.getCountry();
        }
        String lowerCase = language.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
