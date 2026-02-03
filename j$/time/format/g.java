package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class g implements InterfaceC0031e {
    @Override // j$.time.format.InterfaceC0031e
    public final boolean f(x xVar, StringBuilder sb) {
        Long lA = xVar.a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = xVar.a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.c(chronoField) ? Long.valueOf(temporalAccessor.A(chronoField)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = chronoField.d.a(lValueOf != null ? lValueOf.longValue() : 0L, chronoField);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jL = 1 + j$.desugar.sun.nio.fs.g.L(j, 315569520000L);
            LocalDateTime localDateTimeM = LocalDateTime.M(j$.desugar.sun.nio.fs.g.T(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jL > 0) {
                sb.append('+');
                sb.append(jL);
            }
            sb.append(localDateTimeM);
            if (localDateTimeM.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeM2 = LocalDateTime.M(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeM2);
            if (localDateTimeM2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeM2.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.InterfaceC0031e
    public final int j(v vVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.d('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder.m(chronoField, 2);
        dateTimeFormatterBuilder.d(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.m(chronoField2, 2);
        dateTimeFormatterBuilder.d(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.m(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i4 = 0;
        dateTimeFormatterBuilder.b(chronoField4, 0, 9, true);
        dateTimeFormatterBuilder.d('Z');
        C0030d c0030dC = dateTimeFormatterBuilder.r(Locale.getDefault(), C.SMART, null).c();
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int iJ = c0030dC.j(vVar2, charSequence, i);
        if (iJ < 0) {
            return iJ;
        }
        long jLongValue = vVar2.e(ChronoField.YEAR).longValue();
        int iIntValue = vVar2.e(ChronoField.MONTH_OF_YEAR).intValue();
        int iIntValue2 = vVar2.e(ChronoField.DAY_OF_MONTH).intValue();
        int iIntValue3 = vVar2.e(chronoField).intValue();
        int iIntValue4 = vVar2.e(chronoField2).intValue();
        Long lE = vVar2.e(chronoField3);
        Long lE2 = vVar2.e(chronoField4);
        int iIntValue5 = lE != null ? lE.intValue() : 0;
        int iIntValue6 = lE2 != null ? lE2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i3 = iIntValue5;
            i4 = 1;
            i2 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            vVar.c().d = true;
            i2 = iIntValue3;
            i3 = 59;
        } else {
            i2 = iIntValue3;
            i3 = iIntValue5;
        }
        try {
            return vVar.g(chronoField4, iIntValue6, i, vVar.g(ChronoField.INSTANT_SECONDS, LocalDateTime.of(((int) jLongValue) % 10000, iIntValue, iIntValue2, i2, iIntValue4, i3, 0).plusDays(i4).toEpochSecond(ZoneOffset.UTC) + j$.desugar.sun.nio.fs.g.V(jLongValue / 10000, 315569520000L), i, iJ));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
