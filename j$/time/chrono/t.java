package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class t extends AbstractC0019a implements Serializable {
    public static final t d = new t();
    private static final long serialVersionUID = 459996390165777884L;

    private t() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.AbstractC0019a, j$.time.chrono.Chronology
    public final ChronoLocalDate G(Map map, j$.time.format.C c) {
        return (v) super.G(map, c);
    }

    @Override // j$.time.chrono.Chronology
    public final InterfaceC0026h H(Instant instant, ZoneId zoneId) {
        return j.K(this, instant, zoneId);
    }

    @Override // j$.time.chrono.AbstractC0019a
    public final ChronoLocalDate K(Map map, j$.time.format.C c) {
        v vVarQ;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        w wVarI = l != null ? w.i(q(chronoField).a(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int iA = l2 != null ? q(chronoField2).a(l2.longValue(), chronoField2) : 0;
        if (wVarI == null && l2 != null && !map.containsKey(ChronoField.YEAR) && c != j$.time.format.C.STRICT) {
            w[] wVarArr = w.e;
            wVarI = ((w[]) Arrays.copyOf(wVarArr, wVarArr.length))[((w[]) Arrays.copyOf(wVarArr, wVarArr.length)).length - 1];
        }
        if (l2 != null && wVarI != null) {
            LocalDate localDate = wVarI.b;
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (c == j$.time.format.C.LENIENT) {
                        return new v(LocalDate.of((localDate.getYear() + iA) - 1, 1, 1)).O(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).O(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA3 = q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (c != j$.time.format.C.SMART) {
                        LocalDate localDate2 = v.d;
                        LocalDate localDateOf = LocalDate.of((localDate.getYear() + iA) - 1, iA2, iA3);
                        if (localDateOf.P(localDate) || wVarI != w.g(localDateOf)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new v(wVarI, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + iA);
                    }
                    int year = (localDate.getYear() + iA) - 1;
                    try {
                        vVarQ = new v(LocalDate.of(year, iA2, iA3));
                    } catch (DateTimeException unused) {
                        vVarQ = new v(LocalDate.of(year, iA2, 1)).Q(new j$.desugar.sun.nio.fs.n(5));
                    }
                    if (vVarQ.b == wVarI || j$.time.temporal.k.a(vVarQ, ChronoField.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return vVarQ;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + String.valueOf(wVarI) + " " + iA);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (c == j$.time.format.C.LENIENT) {
                    return new v(LocalDate.V((localDate.getYear() + iA) - 1, 1)).O(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = q(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate3 = v.d;
                LocalDate localDateV = iA == 1 ? LocalDate.V(localDate.getYear(), (localDate.N() + iA4) - 1) : LocalDate.V((localDate.getYear() + iA) - 1, iA4);
                if (localDateV.P(localDate) || wVarI != w.g(localDateV)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new v(wVarI, iA, localDateV);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new v(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new v(LocalDate.U(j));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new v(LocalDate.V(i, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final k eraOf(int i) {
        return w.i(i);
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        w[] wVarArr = w.e;
        return j$.desugar.sun.nio.fs.g.N((w[]) Arrays.copyOf(wVarArr, wVarArr.length));
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return q.d.isLeapYear(j);
    }

    @Override // j$.time.chrono.AbstractC0019a
    public final ChronoLocalDate j() {
        return new v(LocalDate.L(LocalDate.S(j$.desugar.sun.nio.fs.g.Z())));
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.m q(ChronoField chronoField) {
        switch (s.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(chronoField)));
            case 5:
                w[] wVarArr = w.e;
                int year = wVarArr[wVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - wVarArr[wVarArr.length - 1].b.getYear();
                int year3 = wVarArr[0].b.getYear();
                for (int i = 1; i < wVarArr.length; i++) {
                    w wVar = wVarArr[i];
                    year2 = Math.min(year2, (wVar.b.getYear() - year3) + 1);
                    year3 = wVar.b.getYear();
                }
                return j$.time.temporal.m.g(1L, year2, 999999999 - year);
            case 6:
                w wVar2 = w.d;
                long j = ChronoField.DAY_OF_YEAR.d.c;
                long jMin = j;
                for (w wVar3 : w.e) {
                    long jMin2 = Math.min(jMin, (wVar3.b.lengthOfYear() - wVar3.b.N()) + 1);
                    jMin = wVar3.h() != null ? Math.min(jMin2, wVar3.h().b.N() - 1) : jMin2;
                }
                return j$.time.temporal.m.g(1L, jMin, ChronoField.DAY_OF_YEAR.d.d);
            case 7:
                return j$.time.temporal.m.f(v.d.getYear(), 999999999L);
            case 8:
                long j2 = w.d.a;
                w[] wVarArr2 = w.e;
                return j$.time.temporal.m.f(j2, wVarArr2[wVarArr2.length - 1].a);
            default:
                return chronoField.d;
        }
    }

    @Override // j$.time.chrono.Chronology
    public final int u(k kVar, int i) {
        if (!(kVar instanceof w)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        w wVar = (w) kVar;
        int year = (wVar.b.getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < wVar.b.getYear() || kVar != w.g(LocalDate.of(year, 1, 1)))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    public Object writeReplace() {
        return new C((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate z(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof v ? (v) temporalAccessor : new v(LocalDate.L(temporalAccessor));
    }
}
