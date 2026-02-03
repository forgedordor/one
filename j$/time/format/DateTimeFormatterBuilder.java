package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class DateTimeFormatterBuilder {
    public static final j$.desugar.sun.nio.fs.n h = new j$.desugar.sun.nio.fs.n(4);
    public static final HashMap i;
    public DateTimeFormatterBuilder a;
    public final DateTimeFormatterBuilder b;
    public final ArrayList c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        j$.time.temporal.e eVar = j$.time.temporal.g.a;
        map.put('Q', eVar);
        map.put('q', eVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', j$.time.temporal.i.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        Objects.a(locale, "locale");
        Objects.a(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), locale) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        if (!(dateInstance instanceof SimpleDateFormat)) {
            throw new UnsupportedOperationException("Can't determine pattern from ".concat(String.valueOf(dateInstance)));
        }
        String pattern = ((SimpleDateFormat) dateInstance).toPattern();
        if (pattern == null) {
            return null;
        }
        int i2 = 0;
        boolean z = pattern.indexOf(66) != -1;
        boolean z2 = pattern.indexOf(98) != -1;
        if (!z && !z2) {
            return pattern;
        }
        StringBuilder sb = new StringBuilder(pattern.length());
        char c = ' ';
        while (i2 < pattern.length()) {
            char cCharAt = pattern.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != 'B' && cCharAt != 'b') {
                    sb.append(cCharAt);
                }
            } else if (i2 == 0 || (c != 'B' && c != 'b')) {
                sb.append(cCharAt);
            }
            i2++;
            c = cCharAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        c(dateTimeFormatter.c());
    }

    public final void b(ChronoField chronoField, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new f(chronoField, i2, i3, z));
        } else {
            k(new f(chronoField, i2, i3, z));
        }
    }

    public final int c(InterfaceC0031e interfaceC0031e) {
        Objects.a(interfaceC0031e, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            l lVar = new l(interfaceC0031e, i2, dateTimeFormatterBuilder.f);
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = (char) 0;
            interfaceC0031e = lVar;
        }
        dateTimeFormatterBuilder.c.add(interfaceC0031e);
        this.a.g = -1;
        return r5.c.size() - 1;
    }

    public final void d(char c) {
        c(new C0029c(c));
    }

    public final void e(String str) {
        Objects.a(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new C0029c(str.charAt(0)));
        } else {
            c(new h(1, str));
        }
    }

    public final void f(TextStyle textStyle) {
        Objects.a(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(0, textStyle));
    }

    public final void g(String str, String str2) {
        c(new k(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x046f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.h(java.lang.String):void");
    }

    public final void i(ChronoField chronoField, HashMap map) {
        Objects.a(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new r(chronoField, textStyle, new C0027a(new z(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void j(TemporalField temporalField, TextStyle textStyle) {
        Objects.a(temporalField, "field");
        Objects.a(textStyle, "textStyle");
        c(new r(temporalField, textStyle, A.c));
    }

    public final void k(j jVar) {
        j jVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0) {
            dateTimeFormatterBuilder.g = c(jVar);
            return;
        }
        j jVar2 = (j) dateTimeFormatterBuilder.c.get(i2);
        int i3 = jVar.b;
        int i4 = jVar.c;
        if (i3 == i4 && jVar.d == D.NOT_NEGATIVE) {
            jVarD = jVar2.e(i4);
            c(jVar.d());
            this.a.g = i2;
        } else {
            jVarD = jVar2.d();
            this.a.g = c(jVar);
        }
        this.a.c.set(i2, jVarD);
    }

    public final void l(TemporalField temporalField) {
        k(new j(temporalField, 1, 19, D.NORMAL));
    }

    public final void m(TemporalField temporalField, int i2) {
        Objects.a(temporalField, "field");
        if (i2 >= 1 && i2 <= 19) {
            k(new j(temporalField, i2, i2, D.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
    }

    public final void n(TemporalField temporalField, int i2, int i3, D d) {
        if (i2 == i3 && d == D.NOT_NEGATIVE) {
            m(temporalField, i3);
            return;
        }
        Objects.a(temporalField, "field");
        Objects.a(d, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            k(new j(temporalField, i2, i3, d));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void o() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        C0030d c0030d = new C0030d(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
        this.a = this.a.b;
        c(c0030d);
    }

    public final void p() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final DateTimeFormatter q(C c, Chronology chronology) {
        return r(Locale.getDefault(), c, chronology);
    }

    public final DateTimeFormatter r(Locale locale, C c, Chronology chronology) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            o();
        }
        return new DateTimeFormatter(new C0030d(this.c, false), locale, DecimalStyle.d, c, chronology, null);
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }
}
