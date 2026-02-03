package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime MIN = L(LocalDate.d, LocalTime.e);
    public static final LocalDateTime c = L(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime K(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).toLocalDateTime();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.L(temporalAccessor), LocalTime.L(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException(c.d("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static LocalDateTime L(LocalDate localDate, LocalTime localTime) {
        Objects.a(localDate, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime M(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.I(j2);
        return new LocalDateTime(LocalDate.U(j$.desugar.sun.nio.fs.g.L(j + zoneOffset.getTotalSeconds(), 86400)), LocalTime.O((((int) j$.desugar.sun.nio.fs.g.T(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime of(int i, Month month, int i2, int i3, int i4, int i5) {
        LocalTime localTime;
        LocalDate localDateT = LocalDate.T(i, month, i2);
        LocalTime localTime2 = LocalTime.e;
        ChronoField.HOUR_OF_DAY.I(i3);
        if ((i4 | i5) == 0) {
            localTime = LocalTime.g[i3];
        } else {
            ChronoField.MINUTE_OF_HOUR.I(i4);
            ChronoField.SECOND_OF_MINUTE.I(i5);
            localTime = new LocalTime(i3, i4, i5, 0);
        }
        return new LocalDateTime(localDateT, localTime);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return M(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).J() ? this.b.A(temporalField) : this.a.A(temporalField) : temporalField.x(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? J((LocalDateTime) chronoLocalDateTime) : j$.desugar.sun.nio.fs.g.d(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.k.f ? this.a : j$.desugar.sun.nio.fs.g.o(this, nVar);
    }

    public final int J(LocalDateTime localDateTime) {
        int iJ = this.a.J(localDateTime.toLocalDate());
        return iJ == 0 ? this.b.compareTo(localDateTime.toLocalTime()) : iJ;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.f(this, j);
        }
        switch (f.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return P(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j / 86400000000L);
                return localDateTimePlusDays.P(localDateTimePlusDays.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j / 86400000);
                return localDateTimePlusDays2.P(localDateTimePlusDays2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return O(j);
            case 5:
                return P(this.a, 0L, j, 0L, 0L);
            case 6:
                return P(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimePlusDays3 = plusDays(j / 256);
                return localDateTimePlusDays3.P(localDateTimePlusDays3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return R(this.a.b(j, temporalUnit), this.b);
        }
    }

    public final LocalDateTime O(long j) {
        return P(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime P(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeO = this.b;
        if (j5 == 0) {
            return R(localDate, localTimeO);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jV = localTimeO.V();
        long j10 = (j9 * j8) + jV;
        long jL = j$.desugar.sun.nio.fs.g.L(j10, 86400000000000L) + (j7 * j8);
        long jT = j$.desugar.sun.nio.fs.g.T(j10, 86400000000000L);
        if (jT != jV) {
            localTimeO = LocalTime.O(jT);
        }
        return R(localDate.plusDays(jL), localTimeO);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDateTime) temporalField.A(this, j);
        }
        boolean zJ = ((ChronoField) temporalField).J();
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        return zJ ? R(localDate, localTime.a(j, temporalField)) : R(localDate.a(j, temporalField), localTime);
    }

    public final LocalDateTime R(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime y(ZoneId zoneId) {
        return ZonedDateTime.K(this, zoneId, null);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.f(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.J();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(j$.time.temporal.Temporal r11, j$.time.temporal.TemporalUnit r12) {
        /*
            r10 = this;
            j$.time.LocalDateTime r11 = K(r11)
            boolean r0 = r12 instanceof j$.time.temporal.ChronoUnit
            if (r0 == 0) goto Led
            r0 = r12
            j$.time.temporal.ChronoUnit r0 = (j$.time.temporal.ChronoUnit) r0
            j$.time.temporal.ChronoUnit r1 = j$.time.temporal.ChronoUnit.DAYS
            int r0 = r0.compareTo(r1)
            r1 = 1
            j$.time.LocalTime r3 = r10.b
            j$.time.LocalDate r4 = r10.a
            if (r0 >= 0) goto Laf
            j$.time.LocalDate r0 = r11.a
            j$.time.LocalTime r11 = r11.b
            r4.getClass()
            long r5 = r0.toEpochDay()
            long r7 = r4.toEpochDay()
            long r5 = r5 - r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L34
            long r11 = r3.d(r11, r12)
            return r11
        L34:
            long r7 = r11.V()
            long r3 = r3.V()
            long r7 = r7 - r3
            r3 = 86400000000000(0x4e94914f0000, double:4.26872718006837E-310)
            if (r0 <= 0) goto L47
            long r5 = r5 - r1
            long r7 = r7 + r3
            goto L49
        L47:
            long r5 = r5 + r1
            long r7 = r7 - r3
        L49:
            int[] r11 = j$.time.f.a
            j$.time.temporal.ChronoUnit r12 = (j$.time.temporal.ChronoUnit) r12
            int r12 = r12.ordinal()
            r11 = r11[r12]
            switch(r11) {
                case 1: goto La6;
                case 2: goto L99;
                case 3: goto L8d;
                case 4: goto L80;
                case 5: goto L72;
                case 6: goto L64;
                case 7: goto L57;
                default: goto L56;
            }
        L56:
            goto Laa
        L57:
            r11 = 2
            long r11 = (long) r11
            long r5 = j$.desugar.sun.nio.fs.g.V(r5, r11)
            r11 = 43200000000000(0x274a48a78000, double:2.1343635900342E-310)
            long r7 = r7 / r11
            goto Laa
        L64:
            r11 = 24
            long r11 = (long) r11
            long r5 = j$.desugar.sun.nio.fs.g.V(r5, r11)
            r11 = 3600000000000(0x34630b8a000, double:1.7786363250285E-311)
            long r7 = r7 / r11
            goto Laa
        L72:
            r11 = 1440(0x5a0, float:2.018E-42)
            long r11 = (long) r11
            long r5 = j$.desugar.sun.nio.fs.g.V(r5, r11)
            r11 = 60000000000(0xdf8475800, double:2.96439387505E-313)
            long r7 = r7 / r11
            goto Laa
        L80:
            r11 = 86400(0x15180, float:1.21072E-40)
            long r11 = (long) r11
            long r5 = j$.desugar.sun.nio.fs.g.V(r5, r11)
            r11 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r7 = r7 / r11
            goto Laa
        L8d:
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = j$.desugar.sun.nio.fs.g.V(r5, r11)
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r11
            goto Laa
        L99:
            r11 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r5 = j$.desugar.sun.nio.fs.g.V(r5, r11)
            r11 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r11
            goto Laa
        La6:
            long r5 = j$.desugar.sun.nio.fs.g.V(r5, r3)
        Laa:
            long r11 = j$.desugar.sun.nio.fs.g.U(r5, r7)
            return r11
        Laf:
            j$.time.LocalDate r0 = r11.a
            j$.time.LocalTime r11 = r11.b
            if (r4 == 0) goto Lbf
            r0.getClass()
            int r5 = r0.J(r4)
            if (r5 <= 0) goto Ld8
            goto Lcb
        Lbf:
            long r5 = r0.toEpochDay()
            long r7 = r4.toEpochDay()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto Ld8
        Lcb:
            boolean r5 = r11.isBefore(r3)
            if (r5 == 0) goto Ld8
            r1 = -1
            j$.time.LocalDate r0 = r0.plusDays(r1)
            goto Le8
        Ld8:
            boolean r5 = r0.P(r4)
            if (r5 == 0) goto Le8
            boolean r11 = r11.isAfter(r3)
            if (r11 == 0) goto Le8
            j$.time.LocalDate r0 = r0.plusDays(r1)
        Le8:
            long r11 = r4.d(r0, r12)
            return r11
        Led:
            long r11 = r12.between(r10, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.LocalDateTime.d(j$.time.temporal.Temporal, j$.time.temporal.TemporalUnit):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).J() ? this.b.get(temporalField) : this.a.get(temporalField) : j$.time.temporal.k.a(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final Chronology getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    public int getDayOfMonth() {
        return this.a.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.getDayOfWeek();
    }

    public int getHour() {
        return this.b.a;
    }

    public int getMinute() {
        return this.b.b;
    }

    public int getMonthValue() {
        return this.a.getMonthValue();
    }

    public int getYear() {
        return this.a.getYear();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return J((LocalDateTime) chronoLocalDateTime) > 0;
        }
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && toLocalTime().V() > chronoLocalDateTime.toLocalTime().V());
    }

    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return J((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && toLocalTime().V() < chronoLocalDateTime.toLocalTime().V());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (!((ChronoField) temporalField).J()) {
            return this.a.j(temporalField);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.k.d(localTime, temporalField);
    }

    public LocalDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        return temporal.a(toLocalDate().toEpochDay(), ChronoField.EPOCH_DAY).a(toLocalTime().V(), ChronoField.NANO_OF_DAY);
    }

    public LocalDateTime plusDays(long j) {
        return R(this.a.plusDays(j), this.b);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.desugar.sun.nio.fs.g.r(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.b;
    }

    public String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: with, reason: merged with bridge method [inline-methods] */
    public LocalDateTime w(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? R((LocalDate) temporalAdjuster, this.b) : temporalAdjuster instanceof LocalTime ? R(this.a, (LocalTime) temporalAdjuster) : temporalAdjuster instanceof LocalDateTime ? (LocalDateTime) temporalAdjuster : (LocalDateTime) temporalAdjuster.o(this);
    }

    public LocalDateTime withHour(int i) {
        return R(this.a, this.b.Y(i));
    }

    public LocalDateTime withMinute(int i) {
        LocalTime localTimeK = this.b;
        if (localTimeK.b != i) {
            ChronoField.MINUTE_OF_HOUR.I(i);
            localTimeK = LocalTime.K(localTimeK.a, i, localTimeK.c, localTimeK.d);
        }
        return R(this.a, localTimeK);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalDate toLocalDate() {
        return this.a;
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5));
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.N(i4, i5, i6, i7));
    }
}
