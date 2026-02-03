package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.q;
import j$.time.format.B;
import j$.time.format.C;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public abstract class e implements TemporalField {
    public static final e DAY_OF_QUARTER;
    public static final e QUARTER_OF_YEAR;
    public static final e WEEK_BASED_YEAR;
    public static final e WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ e[] b;

    static {
        e eVar = new e() { // from class: j$.time.temporal.a
            @Override // j$.time.temporal.TemporalField
            public final Temporal A(Temporal temporal, long j) {
                long jX = x(temporal);
                range().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.a((j - jX) + temporal.A(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean f(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(ChronoField.DAY_OF_YEAR) || !temporalAccessor.c(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.c(ChronoField.YEAR)) {
                    return false;
                }
                e eVar2 = g.a;
                return Chronology.CC.a(temporalAccessor).equals(q.d);
            }

            @Override // j$.time.temporal.TemporalField
            public final m j(TemporalAccessor temporalAccessor) {
                if (!f(temporalAccessor)) {
                    throw new l("Unsupported field: DayOfQuarter");
                }
                long jA = temporalAccessor.A(e.QUARTER_OF_YEAR);
                if (jA == 1) {
                    return q.d.isLeapYear(temporalAccessor.A(ChronoField.YEAR)) ? m.f(1L, 91L) : m.f(1L, 90L);
                }
                return jA == 2 ? m.f(1L, 91L) : (jA == 3 || jA == 4) ? m.f(1L, 92L) : range();
            }

            @Override // j$.time.temporal.e, j$.time.temporal.TemporalField
            public final TemporalAccessor o(Map map, B b2, C c) {
                LocalDate localDatePlusMonths;
                long jW;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) map.get(chronoField);
                TemporalField temporalField = e.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(temporalField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = chronoField.d.a(l.longValue(), chronoField);
                long jLongValue = ((Long) map.get(e.DAY_OF_QUARTER)).longValue();
                e eVar2 = g.a;
                if (!Chronology.CC.a(b2).equals(q.d)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (c == C.LENIENT) {
                    localDatePlusMonths = LocalDate.of(iA, 1, 1).plusMonths(j$.desugar.sun.nio.fs.g.V(j$.desugar.sun.nio.fs.g.W(l2.longValue(), 1L), 3));
                    jW = j$.desugar.sun.nio.fs.g.W(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iA, ((temporalField.range().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (c == C.STRICT) {
                            j(localDateOf).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    localDatePlusMonths = localDateOf;
                    jW = jLongValue - 1;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDatePlusMonths.plusDays(jW);
            }

            @Override // j$.time.temporal.TemporalField
            public final m range() {
                return m.g(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.TemporalField
            public final long x(TemporalAccessor temporalAccessor) {
                if (!f(temporalAccessor)) {
                    throw new l("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.get(ChronoField.DAY_OF_YEAR) - e.a[((temporalAccessor.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (q.d.isLeapYear(temporalAccessor.A(ChronoField.YEAR)) ? 4 : 0)];
            }
        };
        DAY_OF_QUARTER = eVar;
        e eVar2 = new e() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final Temporal A(Temporal temporal, long j) {
                long jX = x(temporal);
                range().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.a(((j - jX) * 3) + temporal.A(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean f(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                e eVar3 = g.a;
                return Chronology.CC.a(temporalAccessor).equals(q.d);
            }

            @Override // j$.time.temporal.TemporalField
            public final m j(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return range();
                }
                throw new l("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final m range() {
                return m.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long x(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return (temporalAccessor.A(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new l("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = eVar2;
        e eVar3 = new e() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final Temporal A(Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(j$.desugar.sun.nio.fs.g.W(j, x(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean f(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                e eVar4 = g.a;
                return Chronology.CC.a(temporalAccessor).equals(q.d);
            }

            @Override // j$.time.temporal.TemporalField
            public final m j(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return e.L(LocalDate.L(temporalAccessor));
                }
                throw new l("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.e, j$.time.temporal.TemporalField
            public final TemporalAccessor o(Map map, B b2, C c) {
                LocalDate localDateA;
                long j;
                long j2;
                TemporalField temporalField = e.WEEK_BASED_YEAR;
                Long l = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = temporalField.range().a(l.longValue(), temporalField);
                long jLongValue = ((Long) map.get(e.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                e eVar4 = g.a;
                if (!Chronology.CC.a(b2).equals(q.d)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (c == C.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        j = 1;
                        localDateOf = localDateOf.X(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.X(j$.desugar.sun.nio.fs.g.W(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        localDateA = localDateOf.X(j$.desugar.sun.nio.fs.g.W(jLongValue, j)).a(jLongValue2, chronoField);
                    }
                    jLongValue2 = j2 + j;
                    localDateA = localDateOf.X(j$.desugar.sun.nio.fs.g.W(jLongValue, j)).a(jLongValue2, chronoField);
                } else {
                    int iA2 = chronoField.d.a(l2.longValue(), chronoField);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (c == C.STRICT) {
                            e.L(localDateOf).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    localDateA = localDateOf.X(jLongValue - 1).a(iA2, chronoField);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDateA;
            }

            @Override // j$.time.temporal.TemporalField
            public final m range() {
                return m.g(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long x(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return e.I(LocalDate.L(temporalAccessor));
                }
                throw new l("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = eVar3;
        e eVar4 = new e() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final Temporal A(Temporal temporal, long j) {
                if (!f(temporal)) {
                    throw new l("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.d.a(j, e.WEEK_BASED_YEAR);
                LocalDate localDateL = LocalDate.L(temporal);
                int i = localDateL.get(ChronoField.DAY_OF_WEEK);
                int I = e.I(localDateL);
                if (I == 53 && e.K(iA) == 52) {
                    I = 52;
                }
                return temporal.w(LocalDate.of(iA, 1, 4).plusDays(((I - 1) * 7) + (i - r6.get(r0))));
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean f(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                e eVar5 = g.a;
                return Chronology.CC.a(temporalAccessor).equals(q.d);
            }

            @Override // j$.time.temporal.TemporalField
            public final m j(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return range();
                }
                throw new l("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final m range() {
                return ChronoField.YEAR.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long x(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return e.J(LocalDate.L(temporalAccessor));
                }
                throw new l("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = eVar4;
        b = new e[]{eVar, eVar2, eVar3, eVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int I(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iN = localDate.N() - 1;
        int i = (3 - iOrdinal) + iN;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iN < i3) {
            if (localDate.N() != 180) {
                localDate = LocalDate.V(localDate.a, 180);
            }
            return (int) L(localDate.Y(-1L)).d;
        }
        int i4 = ((iN - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
            return i4;
        }
        return 1;
    }

    public static int J(LocalDate localDate) {
        int year = localDate.getYear();
        int iN = localDate.N();
        if (iN <= 3) {
            return iN - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iN >= 363) {
            return ((iN - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int K(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.isLeapYear()) ? 53 : 52;
        }
        return 53;
    }

    public static m L(LocalDate localDate) {
        return m.f(1L, K(J(localDate)));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public /* synthetic */ TemporalAccessor o(Map map, B b2, C c) {
        return null;
    }
}
