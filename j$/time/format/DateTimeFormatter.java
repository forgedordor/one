package j$.time.format;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter g;
    public final C0030d a;
    public final Locale b;
    public final DecimalStyle c;
    public final C d;
    public final Chronology e;
    public final ZoneId f;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        D d = D.EXCEEDS_PAD;
        dateTimeFormatterBuilder.n(chronoField, 4, 10, d);
        dateTimeFormatterBuilder.d('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.m(chronoField2, 2);
        dateTimeFormatterBuilder.d('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        dateTimeFormatterBuilder.m(chronoField3, 2);
        C c = C.STRICT;
        j$.time.chrono.q qVar = j$.time.chrono.q.d;
        DateTimeFormatter dateTimeFormatterQ = dateTimeFormatterBuilder.q(c, qVar);
        ISO_LOCAL_DATE = dateTimeFormatterQ;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        q qVar2 = q.INSENSITIVE;
        dateTimeFormatterBuilder2.c(qVar2);
        dateTimeFormatterBuilder2.a(dateTimeFormatterQ);
        k kVar = k.e;
        dateTimeFormatterBuilder2.c(kVar);
        dateTimeFormatterBuilder2.q(c, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.c(qVar2);
        dateTimeFormatterBuilder3.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder3.p();
        dateTimeFormatterBuilder3.c(kVar);
        dateTimeFormatterBuilder3.q(c, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.m(chronoField4, 2);
        dateTimeFormatterBuilder4.d(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.m(chronoField5, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.d(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.m(chronoField6, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterQ2 = dateTimeFormatterBuilder4.q(c, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.c(qVar2);
        dateTimeFormatterBuilder5.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder5.c(kVar);
        dateTimeFormatterBuilder5.q(c, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.c(qVar2);
        dateTimeFormatterBuilder6.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder6.p();
        dateTimeFormatterBuilder6.c(kVar);
        dateTimeFormatterBuilder6.q(c, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.c(qVar2);
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder7.d('T');
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ2);
        DateTimeFormatter dateTimeFormatterQ3 = dateTimeFormatterBuilder7.q(c, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.c(qVar2);
        dateTimeFormatterBuilder8.a(dateTimeFormatterQ3);
        q qVar3 = q.LENIENT;
        dateTimeFormatterBuilder8.c(qVar3);
        dateTimeFormatterBuilder8.c(kVar);
        q qVar4 = q.STRICT;
        dateTimeFormatterBuilder8.c(qVar4);
        DateTimeFormatter dateTimeFormatterQ4 = dateTimeFormatterBuilder8.q(c, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(dateTimeFormatterQ4);
        dateTimeFormatterBuilder9.p();
        dateTimeFormatterBuilder9.d('[');
        q qVar5 = q.SENSITIVE;
        dateTimeFormatterBuilder9.c(qVar5);
        j$.desugar.sun.nio.fs.n nVar = DateTimeFormatterBuilder.h;
        dateTimeFormatterBuilder9.c(new t(nVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder9.d(']');
        dateTimeFormatterBuilder9.q(c, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(dateTimeFormatterQ3);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.c(kVar);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.d('[');
        dateTimeFormatterBuilder10.c(qVar5);
        dateTimeFormatterBuilder10.c(new t(nVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder10.d(']');
        dateTimeFormatterBuilder10.q(c, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.c(qVar2);
        dateTimeFormatterBuilder11.n(chronoField, 4, 10, d);
        dateTimeFormatterBuilder11.d('-');
        dateTimeFormatterBuilder11.m(ChronoField.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilder11.p();
        dateTimeFormatterBuilder11.c(kVar);
        dateTimeFormatterBuilder11.q(c, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.c(qVar2);
        dateTimeFormatterBuilder12.n(j$.time.temporal.g.c, 4, 10, d);
        dateTimeFormatterBuilder12.e("-W");
        dateTimeFormatterBuilder12.m(j$.time.temporal.g.b, 2);
        dateTimeFormatterBuilder12.d('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.m(chronoField7, 1);
        dateTimeFormatterBuilder12.p();
        dateTimeFormatterBuilder12.c(kVar);
        dateTimeFormatterBuilder12.q(c, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.c(qVar2);
        dateTimeFormatterBuilder13.c(new g());
        g = dateTimeFormatterBuilder13.q(c, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.c(qVar2);
        dateTimeFormatterBuilder14.m(chronoField, 4);
        dateTimeFormatterBuilder14.m(chronoField2, 2);
        dateTimeFormatterBuilder14.m(chronoField3, 2);
        dateTimeFormatterBuilder14.p();
        dateTimeFormatterBuilder14.c(qVar3);
        dateTimeFormatterBuilder14.g("+HHMMss", "Z");
        dateTimeFormatterBuilder14.c(qVar4);
        dateTimeFormatterBuilder14.q(c, qVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.c(qVar2);
        dateTimeFormatterBuilder15.c(qVar3);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.i(chronoField7, map);
        dateTimeFormatterBuilder15.e(", ");
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.n(chronoField3, 1, 2, D.NOT_NEGATIVE);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.i(chronoField2, map2);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(chronoField, 4);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(chronoField4, 2);
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(chronoField5, 2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(chronoField6, 2);
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.g("+HHMM", "GMT");
        dateTimeFormatterBuilder15.q(C.SMART, qVar);
    }

    public DateTimeFormatter(C0030d c0030d, Locale locale, DecimalStyle decimalStyle, C c, Chronology chronology, ZoneId zoneId) {
        Objects.a(c0030d, "printerParser");
        this.a = c0030d;
        Objects.a(locale, "locale");
        this.b = locale;
        Objects.a(decimalStyle, "decimalStyle");
        this.c = decimalStyle;
        Objects.a(c, "resolverStyle");
        this.d = c;
        this.e = chronology;
        this.f = zoneId;
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        Objects.a(formatStyle, "dateTimeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new i(formatStyle, formatStyle));
        return dateTimeFormatterBuilder.q(C.SMART, j$.time.chrono.q.d);
    }

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(Locale.getDefault(), C.SMART, null);
    }

    public final Object a(CharSequence charSequence, j$.desugar.sun.nio.fs.n nVar) {
        String string;
        Objects.a(charSequence, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        try {
            return b(charSequence).I(nVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException(j$.time.c.d("Text '", string, "' could not be parsed: ", e2.getMessage()), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.format.B b(java.lang.CharSequence r27) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.b(java.lang.CharSequence):j$.time.format.B");
    }

    public final C0030d c() {
        C0030d c0030d = this.a;
        return !c0030d.b ? c0030d : new C0030d(c0030d.a, false);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        C0030d c0030d = this.a;
        Objects.a(temporalAccessor, "temporal");
        try {
            c0030d.f(new x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, decimalStyle, this.d, this.e, this.f);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, zoneId);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(locale, C.SMART, null);
    }
}
