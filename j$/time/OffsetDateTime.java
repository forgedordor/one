package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.c;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime J(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        return new OffsetDateTime(LocalDateTime.M(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    public static OffsetDateTime of(LocalDate localDate, LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.L(localDate, localTime), zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = i.a[((ChronoField) temporalField).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? localDateTime.A(temporalField) : zoneOffset.getTotalSeconds() : localDateTime.toEpochSecond(zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.k.d || nVar == j$.time.temporal.k.e) {
            return this.b;
        }
        if (nVar == j$.time.temporal.k.a) {
            return null;
        }
        j$.desugar.sun.nio.fs.n nVar2 = j$.time.temporal.k.f;
        LocalDateTime localDateTime = this.a;
        return nVar == nVar2 ? localDateTime.toLocalDate() : nVar == j$.time.temporal.k.g ? localDateTime.toLocalTime() : nVar == j$.time.temporal.k.b ? j$.time.chrono.q.d : nVar == j$.time.temporal.k.c ? ChronoUnit.NANOS : nVar.e(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? L(this.a.b(j, temporalUnit), this.b) : (OffsetDateTime) temporalUnit.f(this, j);
    }

    public final OffsetDateTime L(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (OffsetDateTime) temporalField.A(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = i.a[chronoField.ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? L(localDateTime.a(j, temporalField), zoneOffset) : L(localDateTime, ZoneOffset.ofTotalSeconds(chronoField.d.a(j, chronoField))) : J(Instant.ofEpochSecond(j, localDateTime.b.d), zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompareTo;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        LocalDateTime localDateTime = offsetDateTime2.a;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            iCompareTo = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime2 = this.a;
            int iCompare = Long.compare(localDateTime2.toEpochSecond(zoneOffset2), localDateTime.toEpochSecond(offsetDateTime2.b));
            iCompareTo = iCompare == 0 ? localDateTime2.toLocalTime().d - localDateTime.toLocalTime().d : iCompare;
        }
        return iCompareTo == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompareTo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetN = ZoneOffset.N(temporal);
                LocalDate localDate = (LocalDate) temporal.I(j$.time.temporal.k.f);
                LocalTime localTime = (LocalTime) temporal.I(j$.time.temporal.k.g);
                temporal = (localDate == null || localTime == null) ? J(Instant.K(temporal), zoneOffsetN) : of(localDate, localTime, zoneOffsetN);
            } catch (DateTimeException e) {
                throw new DateTimeException(c.d("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, temporal);
        }
        ZoneOffset zoneOffset = temporal.b;
        ZoneOffset zoneOffset2 = this.b;
        OffsetDateTime offsetDateTime = temporal;
        if (!zoneOffset2.equals(zoneOffset)) {
            offsetDateTime = new OffsetDateTime(temporal.a.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()), zoneOffset2);
        }
        return this.a.d(offsetDateTime.a, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        boolean zE = c.e(localDate);
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        if (zE) {
            return L(localDateTime.f(localDate), zoneOffset);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.k.a(this, temporalField);
        }
        int i = i.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.get(temporalField) : this.b.getTotalSeconds();
        }
        throw new j$.time.temporal.l("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.getDayOfWeek();
    }

    public int getHour() {
        return this.a.getHour();
    }

    public int getMinute() {
        return this.a.getMinute();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).d : this.a.j(temporalField) : temporalField.j(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.a(localDateTime.toLocalDate().toEpochDay(), chronoField).a(localDateTime.toLocalTime().V(), ChronoField.NANO_OF_DAY).a(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return j$.desugar.sun.nio.fs.g.t(localDateTime, this.b);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public String toString() {
        return this.a.toString() + this.b.c;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }
}
