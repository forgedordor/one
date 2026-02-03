package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0019a implements Chronology {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final Locale c = new Locale("ja", "JP", "JP");

    public static ChronoLocalDate A(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(j$.desugar.sun.nio.fs.g.W(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateB2.w(new j$.time.temporal.j(DayOfWeek.of((int) j3).getValue(), 1));
        }
        long j5 = j3 - 1;
        chronoLocalDateB2 = chronoLocalDateB2.b(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return chronoLocalDateB2.w(new j$.time.temporal.j(DayOfWeek.of((int) j3).getValue(), 1));
    }

    public static void f(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + String.valueOf(chronoField) + " " + l + " differs from " + String.valueOf(chronoField) + " " + j);
    }

    public static boolean o() {
        if (a.get("ISO") != null) {
            return false;
        }
        m mVar = m.m;
        mVar.getClass();
        x(mVar, "Hijrah-umalqura");
        t tVar = t.d;
        tVar.getClass();
        x(tVar, "Japanese");
        y yVar = y.d;
        yVar.getClass();
        x(yVar, "Minguo");
        E e = E.d;
        e.getClass();
        x(e, "ThaiBuddhist");
        try {
            for (AbstractC0019a abstractC0019a : Arrays.asList(new AbstractC0019a[0])) {
                if (!abstractC0019a.getId().equals("ISO")) {
                    x(abstractC0019a, abstractC0019a.getId());
                }
            }
            q qVar = q.d;
            qVar.getClass();
            x(qVar, "ISO");
            return true;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Chronology x(Chronology chronology, String str) {
        String calendarType;
        Chronology chronology2 = (Chronology) a.putIfAbsent(str, chronology);
        if (chronology2 == null && (calendarType = chronology.getCalendarType()) != null) {
            b.putIfAbsent(calendarType, chronology);
        }
        return chronology2;
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDateTime C(TemporalAccessor temporalAccessor) {
        try {
            return z(temporalAccessor).B(LocalTime.L(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporalAccessor.getClass())), e);
        }
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate G(Map map, j$.time.format.C c2) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return dateEpochDay(((Long) map.remove(chronoField)).longValue());
        }
        I(map, c2);
        ChronoLocalDate chronoLocalDateK = K(map, c2);
        if (chronoLocalDateK != null) {
            return chronoLocalDateK;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return J(map, c2);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int iA = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (c2 == j$.time.format.C.LENIENT) {
                        long jW = j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return date(iA, 1, 1).b(jW, (TemporalUnit) ChronoUnit.MONTHS).b(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA3 = q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    ChronoLocalDate chronoLocalDateB = date(iA, iA2, 1).b((q(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((iA3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (c2 != j$.time.format.C.STRICT || chronoLocalDateB.get(chronoField3) == iA2) {
                        return chronoLocalDateB;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int iA4 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (c2 == j$.time.format.C.LENIENT) {
                        return A(date(iA4, 1, 1), j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField3)).longValue(), 1L), j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField4)).longValue(), 1L), j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int iA5 = q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    ChronoLocalDate chronoLocalDateW = date(iA4, iA5, 1).b((q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).w(new j$.time.temporal.j(DayOfWeek.of(q(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 1));
                    if (c2 != j$.time.format.C.STRICT || chronoLocalDateW.get(chronoField3) == iA5) {
                        return chronoLocalDateW;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int iA6 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (c2 != j$.time.format.C.LENIENT) {
                return dateYearDay(iA6, q(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
            }
            return dateYearDay(iA6, 1).b(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int iA7 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (c2 == j$.time.format.C.LENIENT) {
                return dateYearDay(iA7, 1).b(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iA8 = q(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
            ChronoLocalDate chronoLocalDateB2 = dateYearDay(iA7, 1).b((q(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (c2 != j$.time.format.C.STRICT || chronoLocalDateB2.get(chronoField2) == iA7) {
                return chronoLocalDateB2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int iA9 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (c2 == j$.time.format.C.LENIENT) {
            return A(dateYearDay(iA9, 1), 0L, j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField8)).longValue(), 1L), j$.desugar.sun.nio.fs.g.W(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        ChronoLocalDate chronoLocalDateW2 = dateYearDay(iA9, 1).b((q(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).w(new j$.time.temporal.j(DayOfWeek.of(q(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 1));
        if (c2 != j$.time.format.C.STRICT || chronoLocalDateW2.get(chronoField2) == iA9) {
            return chronoLocalDateW2;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    public void I(Map map, j$.time.format.C c2) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (c2 != j$.time.format.C.LENIENT) {
                chronoField.I(l.longValue());
            }
            ChronoLocalDate chronoLocalDateA = j().a(1L, (TemporalField) ChronoField.DAY_OF_MONTH).a(l.longValue(), (TemporalField) chronoField);
            f(map, ChronoField.MONTH_OF_YEAR, chronoLocalDateA.get(r0));
            f(map, ChronoField.YEAR, chronoLocalDateA.get(r0));
        }
    }

    public ChronoLocalDate J(Map map, j$.time.format.C c2) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = q(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (c2 == j$.time.format.C.LENIENT) {
            long jW = j$.desugar.sun.nio.fs.g.W(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return date(iA, 1, 1).b(jW, (TemporalUnit) ChronoUnit.MONTHS).b(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (c2 != j$.time.format.C.SMART) {
            return date(iA, iA2, iA3);
        }
        try {
            return date(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return date(iA, iA2, 1).w(new j$.desugar.sun.nio.fs.n(5));
        }
    }

    public ChronoLocalDate K(Map map, j$.time.format.C c2) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            q(chronoField2).b(((Long) map.get(chronoField2)).longValue(), chronoField2);
            return null;
        }
        Long l2 = (Long) map.remove(ChronoField.ERA);
        int iA = c2 != j$.time.format.C.LENIENT ? q(chronoField).a(l.longValue(), chronoField) : j$.desugar.sun.nio.fs.g.K(l.longValue());
        if (l2 != null) {
            f(map, ChronoField.YEAR, u(eraOf(q(r2).a(l2.longValue(), r2)), iA));
            return null;
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        if (map.containsKey(chronoField3)) {
            f(map, chronoField3, u(dateYearDay(q(chronoField3).a(((Long) map.get(chronoField3)).longValue(), chronoField3), 1).getEra(), iA));
            return null;
        }
        if (c2 == j$.time.format.C.STRICT) {
            map.put(chronoField, l);
            return null;
        }
        if (eras().isEmpty()) {
            f(map, chronoField3, iA);
            return null;
        }
        f(map, chronoField3, u((k) r9.get(r9.size() - 1), iA));
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0019a) && compareTo((AbstractC0019a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public abstract /* synthetic */ ChronoLocalDate j();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.chrono.h] */
    @Override // j$.time.chrono.Chronology
    public InterfaceC0026h k(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdJ = ZoneId.J(temporalAccessor);
            try {
                temporalAccessor = H(Instant.K(temporalAccessor), zoneIdJ);
                return temporalAccessor;
            } catch (DateTimeException unused) {
                return j.J(zoneIdJ, null, C0023e.J(this, C(temporalAccessor)));
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporalAccessor.getClass())), e);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return getId();
    }
}
