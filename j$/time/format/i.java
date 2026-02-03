package j$.time.format;

import j$.time.chrono.Chronology;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class i implements InterfaceC0031e {
    public static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 2);
    public final FormatStyle a;
    public final FormatStyle b;

    public i(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DateTimeFormatter a(Locale locale, Chronology chronology) {
        String id = chronology.getId();
        String string = locale.toString();
        FormatStyle formatStyle = this.a;
        String strValueOf = String.valueOf(formatStyle);
        FormatStyle formatStyle2 = this.b;
        String str = id + "|" + string + "|" + strValueOf + String.valueOf(formatStyle2);
        ConcurrentHashMap concurrentHashMap = c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(str);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, formatStyle2, chronology, locale);
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(localizedDateTimePattern);
        DateTimeFormatter dateTimeFormatterR = dateTimeFormatterBuilder.r(locale, C.SMART, null);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(str, dateTimeFormatterR);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : dateTimeFormatterR;
    }

    @Override // j$.time.format.InterfaceC0031e
    public final boolean f(x xVar, StringBuilder sb) {
        a(xVar.b.b, Chronology.CC.a(xVar.a)).c().f(xVar, sb);
        return true;
    }

    @Override // j$.time.format.InterfaceC0031e
    public final int j(v vVar, CharSequence charSequence, int i) {
        return a(vVar.a.b, vVar.d()).c().j(vVar, charSequence, i);
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            obj = "";
        }
        String strValueOf = String.valueOf(obj);
        Object obj2 = this.b;
        return "Localized(" + strValueOf + "," + String.valueOf(obj2 != null ? obj2 : "") + ")";
    }
}
