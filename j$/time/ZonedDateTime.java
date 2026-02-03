package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.InterfaceC0026h;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class ZonedDateTime implements Temporal, InterfaceC0026h, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime J(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdJ = ZoneId.J(temporalAccessor);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            return temporalAccessor.c(chronoField) ? o(temporalAccessor.A(chronoField), temporalAccessor.get(ChronoField.NANO_OF_SECOND), zoneIdJ) : K(LocalDateTime.L(LocalDate.L(temporalAccessor), LocalTime.L(temporalAccessor)), zoneIdJ, null);
        } catch (DateTimeException e) {
            throw new DateTimeException(c.d("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static ZonedDateTime K(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listF = rules.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = rules.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.O(Duration.ofSeconds(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()).getSeconds());
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listF.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime o(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.M(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ZoneId zoneId) {
        return K(LocalDateTime.of(i, i2, i3, i4, i5, i6, i7), zoneId, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = r.a[((ChronoField) temporalField).ordinal()];
        return i != 1 ? i != 2 ? this.a.A(temporalField) : this.b.getTotalSeconds() : j$.desugar.sun.nio.fs.g.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.k.f ? toLocalDate() : j$.desugar.sun.nio.fs.g.p(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.f(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalDateTime localDateTime = this.a;
        return (iCompareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? M(localDateTime.b(j, temporalUnit)) : N(localDateTime.b(j, temporalUnit));
    }

    public final ZonedDateTime M(LocalDateTime localDateTime) {
        Objects.a(localDateTime, "localDateTime");
        ZoneOffset zoneOffset = this.b;
        Objects.a(zoneOffset, "offset");
        ZoneId zoneId = this.c;
        Objects.a(zoneId, "zone");
        return zoneId.getRules().f(localDateTime).contains(zoneOffset) ? new ZonedDateTime(localDateTime, zoneId, zoneOffset) : o(localDateTime.toEpochSecond(zoneOffset), localDateTime.b.d, zoneId);
    }

    public final ZonedDateTime N(LocalDateTime localDateTime) {
        return K(localDateTime, this.c, this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (ZonedDateTime) temporalField.A(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = r.a[chronoField.ordinal()];
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (i == 1) {
            return o(j, localDateTime.b.d, zoneId);
        }
        if (i != 2) {
            return N(localDateTime.a(j, temporalField));
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.d.a(j, chronoField));
        return (zoneOffsetOfTotalSeconds.equals(this.b) || !zoneId.getRules().f(localDateTime).contains(zoneOffsetOfTotalSeconds)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetOfTotalSeconds);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.f(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.e(this, (InterfaceC0026h) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeJ = J(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTimeJ);
        }
        LocalDateTime localDateTime = zonedDateTimeJ.a;
        ZoneId zoneId = this.c;
        Objects.a(zoneId, "zone");
        if (!zonedDateTimeJ.c.equals(zoneId)) {
            zonedDateTimeJ = o(localDateTime.toEpochSecond(zonedDateTimeJ.b), localDateTime.b.d, zoneId);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        return (chronoUnit.compareTo(ChronoUnit.DAYS) < 0 || chronoUnit == ChronoUnit.FOREVER) ? toOffsetDateTime().d(zonedDateTimeJ.toOffsetDateTime(), temporalUnit) : this.a.d(zonedDateTimeJ.a, temporalUnit);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final InterfaceC0026h e(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return o(localDateTime.toEpochSecond(zoneOffset), localDateTime.b.d, zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        return c.e(localDate) ? K(LocalDateTime.L(localDate, this.a.toLocalTime()), this.c, this.b) : (ZonedDateTime) localDate.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.desugar.sun.nio.fs.g.i(this, temporalField);
        }
        int i = r.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.get(temporalField) : this.b.getTotalSeconds();
        }
        throw new j$.time.temporal.l("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final Chronology getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    public int getDayOfMonth() {
        return this.a.getDayOfMonth();
    }

    public int getHour() {
        return this.a.getHour();
    }

    public int getMinute() {
        return this.a.getMinute();
    }

    public int getMonthValue() {
        return this.a.getMonthValue();
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final ZoneOffset getOffset() {
        return this.b;
    }

    public int getYear() {
        return this.a.getYear();
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).d : this.a.j(temporalField) : temporalField.j(this);
    }

    public ZonedDateTime plusDays(long j) {
        return N(this.a.plusDays(j));
    }

    public ZonedDateTime plusHours(long j) {
        LocalDateTime localDateTime = this.a;
        return M(localDateTime.P(localDateTime.a, j, 0L, 0L, 0L));
    }

    public ZonedDateTime plusYears(long j) {
        LocalDateTime localDateTime = this.a;
        return K(localDateTime.R(localDateTime.a.Y(j), localDateTime.b), this.c, this.b);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.s(this);
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().d);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    public OffsetDateTime toOffsetDateTime() {
        return new OffsetDateTime(this.a, this.b);
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    public ZonedDateTime truncatedTo(TemporalUnit temporalUnit) {
        LocalDateTime localDateTime = this.a;
        LocalDate localDate = localDateTime.a;
        LocalTime localTimeO = localDateTime.b;
        localTimeO.getClass();
        if (temporalUnit != ChronoUnit.NANOS) {
            Duration duration = temporalUnit.getDuration();
            if (duration.getSeconds() > 86400) {
                throw new j$.time.temporal.l("Unit is too large to be used for truncation");
            }
            long nanos = duration.toNanos();
            if (86400000000000L % nanos != 0) {
                throw new j$.time.temporal.l("Unit must divide into a standard day without remainder");
            }
            localTimeO = LocalTime.O((localTimeO.V() / nanos) * nanos);
        }
        return K(localDateTime.R(localDate, localTimeO), this.c, this.b);
    }

    public ZonedDateTime withDayOfMonth(int i) {
        LocalDateTime localDateTime = this.a;
        LocalDate localDateOf = localDateTime.a;
        if (localDateOf.c != i) {
            localDateOf = LocalDate.of(localDateOf.a, localDateOf.b, i);
        }
        return K(localDateTime.R(localDateOf, localDateTime.b), this.c, this.b);
    }

    public ZonedDateTime withHour(int i) {
        return N(this.a.withHour(i));
    }

    public ZonedDateTime withMinute(int i) {
        return N(this.a.withMinute(i));
    }

    public ZonedDateTime withSecond(int i) {
        LocalDateTime localDateTime = this.a;
        LocalTime localTimeK = localDateTime.b;
        if (localTimeK.c != i) {
            ChronoField.SECOND_OF_MINUTE.I(i);
            localTimeK = LocalTime.K(localTimeK.a, localTimeK.b, i, localTimeK.d);
        }
        return K(localDateTime.R(localDateTime.a, localTimeK), this.c, this.b);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    /* renamed from: withZoneSameLocal, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime v(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return this.c.equals(zoneId) ? this : K(this.a, zoneId, this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public LocalDate toLocalDate() {
        return this.a.toLocalDate();
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public LocalDateTime toLocalDateTime() {
        return this.a;
    }
}
