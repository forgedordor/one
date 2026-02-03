package defpackage;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DecimalStyle;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhs {
    public static final DateTimeFormatter a(String str, Locale locale, Map map) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = map.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(str2, objWithDecimalStyle);
        }
        objWithDecimalStyle.getClass();
        return (DateTimeFormatter) objWithDecimalStyle;
    }
}
