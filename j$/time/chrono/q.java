package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class q extends AbstractC0019a implements Serializable {
    public static final q d = new q();
    private static final long serialVersionUID = -1440403870442975015L;

    private q() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.AbstractC0019a, j$.time.chrono.Chronology
    public final ChronoLocalDateTime C(TemporalAccessor temporalAccessor) {
        return LocalDateTime.K(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC0019a, j$.time.chrono.Chronology
    public final ChronoLocalDate G(Map map, j$.time.format.C c) {
        return (LocalDate) super.G(map, c);
    }

    @Override // j$.time.chrono.Chronology
    public final InterfaceC0026h H(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return ZonedDateTime.o(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    @Override // j$.time.chrono.AbstractC0019a
    public final void I(Map map, j$.time.format.C c) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (c != j$.time.format.C.LENIENT) {
                chronoField.I(l.longValue());
            }
            AbstractC0019a.f(map, ChronoField.MONTH_OF_YEAR, ((int) j$.desugar.sun.nio.fs.g.T(l.longValue(), r4)) + 1);
            AbstractC0019a.f(map, ChronoField.YEAR, j$.desugar.sun.nio.fs.g.L(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC0019a
    public final ChronoLocalDate J(Map map, j$.time.format.C c) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = chronoField.d.a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z = true;
        if (c == j$.time.format.C.LENIENT) {
            return LocalDate.of(iA, 1, 1).plusMonths(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(j$.desugar.sun.nio.fs.g.W(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = chronoField2.d.a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = chronoField3.d.a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (c == j$.time.format.C.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j = iA;
                int i = j$.time.n.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, month.K(z));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.AbstractC0019a
    public final ChronoLocalDate K(Map map, j$.time.format.C c) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            chronoField2.I(((Long) map.get(chronoField2)).longValue());
            return null;
        }
        if (c != j$.time.format.C.LENIENT) {
            chronoField.I(l.longValue());
        }
        Long l2 = (Long) map.remove(ChronoField.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                AbstractC0019a.f(map, ChronoField.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                AbstractC0019a.f(map, ChronoField.YEAR, j$.desugar.sun.nio.fs.g.W(1L, l.longValue()));
                return null;
            }
            throw new DateTimeException("Invalid value for era: " + l2);
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        Long l3 = (Long) map.get(chronoField3);
        if (c != j$.time.format.C.STRICT) {
            AbstractC0019a.f(map, chronoField3, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.desugar.sun.nio.fs.g.W(1L, l.longValue()));
            return null;
        }
        if (l3 == null) {
            map.put(chronoField, l);
            return null;
        }
        long jLongValue = l3.longValue();
        long jLongValue2 = l.longValue();
        if (jLongValue <= 0) {
            jLongValue2 = j$.desugar.sun.nio.fs.g.W(1L, jLongValue2);
        }
        AbstractC0019a.f(map, chronoField3, jLongValue2);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return LocalDate.U(j);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return LocalDate.V(i, i2);
    }

    @Override // j$.time.chrono.Chronology
    public final k eraOf(int i) {
        if (i == 0) {
            return r.BCE;
        }
        if (i == 1) {
            return r.CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.desugar.sun.nio.fs.g.N(r.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0019a
    public final ChronoLocalDate j() {
        return LocalDate.L(LocalDate.S(j$.desugar.sun.nio.fs.g.Z()));
    }

    @Override // j$.time.chrono.AbstractC0019a, j$.time.chrono.Chronology
    public final InterfaceC0026h k(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.J(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.m q(ChronoField chronoField) {
        return chronoField.d;
    }

    @Override // j$.time.chrono.Chronology
    public final int u(k kVar, int i) {
        if (kVar instanceof r) {
            return kVar == r.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public Object writeReplace() {
        return new C((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate z(TemporalAccessor temporalAccessor) {
        return LocalDate.L(temporalAccessor);
    }
}
