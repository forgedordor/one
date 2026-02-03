package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.B;
import j$.time.format.C;
import java.util.Map;

/* loaded from: classes9.dex */
public final class n implements TemporalField {
    public static final m f = m.f(1, 7);
    public static final m g = m.g(0, 4, 6);
    public static final m h = m.g(0, 52, 54);
    public static final m i = m.g(1, 52, 53);
    public final String a;
    public final WeekFields b;
    public final TemporalUnit c;
    public final TemporalUnit d;
    public final m e;

    public n(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, m mVar) {
        this.a = str;
        this.b = weekFields;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = mVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal A(Temporal temporal, long j) {
        if (this.e.a(j, this) == temporal.get(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.b(r0 - r1, this.c);
        }
        WeekFields weekFields = this.b;
        return e(Chronology.CC.a(temporal), (int) j, temporal.get(weekFields.e), temporal.get(weekFields.c));
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return k.e(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue()) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int i2 = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i3 = temporalAccessor.get(chronoField);
        int i4 = i(i3, iB);
        int iA = a(i4, i3);
        return iA == 0 ? i2 - 1 : iA >= a(i4, ((int) temporalAccessor.j(chronoField).d) + this.b.b) ? i2 + 1 : i2;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i2 = temporalAccessor.get(chronoField);
        int i3 = i(i2, iB);
        int iA2 = a(i3, i2);
        return iA2 == 0 ? d(Chronology.CC.a(temporalAccessor).z(temporalAccessor).x(i2, ChronoUnit.DAYS)) : (iA2 <= 50 || iA2 < (iA = a(i3, ((int) temporalAccessor.j(chronoField).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final ChronoLocalDate e(Chronology chronology, int i2, int i3, int i4) {
        ChronoLocalDate chronoLocalDateDate = chronology.date(i2, 1, 1);
        int i5 = i(1, b(chronoLocalDateDate));
        int i6 = i4 - 1;
        return chronoLocalDateDate.b(((Math.min(i3, a(i5, chronoLocalDateDate.lengthOfYear() + this.b.b) - 1) - 1) * 7) + i6 + (-i5), (TemporalUnit) ChronoUnit.DAYS);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean f(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.c(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.c(ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.c(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.h) {
            return temporalAccessor.c(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.c(ChronoField.YEAR);
        }
        return false;
    }

    public final m g(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int i2 = i(temporalAccessor.get(chronoField), b(temporalAccessor));
        m mVarJ = temporalAccessor.j(chronoField);
        return m.f(a(i2, (int) mVarJ.a), a(i2, (int) mVarJ.d));
    }

    public final m h(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.c(chronoField)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int i2 = temporalAccessor.get(chronoField);
        int i3 = i(i2, iB);
        int iA = a(i3, i2);
        if (iA == 0) {
            return h(Chronology.CC.a(temporalAccessor).z(temporalAccessor).x(i2 + 7, ChronoUnit.DAYS));
        }
        return iA >= a(i3, this.b.b + ((int) temporalAccessor.j(chronoField).d)) ? h(Chronology.CC.a(temporalAccessor).z(temporalAccessor).b((r0 - i2) + 8, (TemporalUnit) ChronoUnit.DAYS)) : m.f(1L, r1 - 1);
    }

    public final int i(int i2, int i3) {
        int iE = k.e(i2 - i3);
        return iE + 1 > this.b.b ? 7 - iE : -iE;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final m j(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return g(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return g(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.h) {
            return h(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.d;
        }
        throw new IllegalStateException(j$.time.c.d("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor o(Map map, B b, C c) {
        ChronoLocalDate chronoLocalDateB;
        ChronoLocalDate chronoLocalDateB2;
        ChronoLocalDate chronoLocalDateB3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iK = j$.desugar.sun.nio.fs.g.K(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        m mVar = this.e;
        WeekFields weekFields = this.b;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            long jE = k.e((mVar.a(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1)) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField)) {
            return null;
        }
        int iA = chronoField.d.a(((Long) map.get(chronoField)).longValue(), chronoField);
        DayOfWeek firstDayOfWeek = weekFields.getFirstDayOfWeek();
        n nVar = weekFields.e;
        n nVar2 = weekFields.f;
        int iE = k.e(iA - firstDayOfWeek.getValue()) + 1;
        Chronology chronologyA = Chronology.CC.a(b);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            if ((temporalUnit != WeekFields.h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(nVar2) || !map.containsKey(nVar)) {
                return null;
            }
            int iA2 = nVar2.e.a(((Long) map.get(nVar2)).longValue(), nVar2);
            if (c == C.LENIENT) {
                chronoLocalDateB = e(chronologyA, iA2, 1, iE).b(j$.desugar.sun.nio.fs.g.W(((Long) map.get(nVar)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                ChronoLocalDate chronoLocalDateE = e(chronologyA, iA2, nVar.e.a(((Long) map.get(nVar)).longValue(), nVar), iE);
                if (c == C.STRICT && c(chronoLocalDateE) != iA2) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateB = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(nVar2);
            map.remove(nVar);
            map.remove(chronoField);
            return chronoLocalDateB;
        }
        int iA3 = chronoField2.d.a(((Long) map.get(chronoField2)).longValue(), chronoField2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                long jLongValue2 = ((Long) map.get(chronoField3)).longValue();
                long j = iK;
                if (c == C.LENIENT) {
                    ChronoLocalDate chronoLocalDateB4 = chronologyA.date(iA3, 1, 1).b(j$.desugar.sun.nio.fs.g.W(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(chronoLocalDateB4);
                    int i2 = chronoLocalDateB4.get(ChronoField.DAY_OF_MONTH);
                    chronoLocalDateB3 = chronoLocalDateB4.b(j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.V(j$.desugar.sun.nio.fs.g.W(j, a(i(i2, iB), i2)), 7), iE - b(chronoLocalDateB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateDate = chronologyA.date(iA3, chronoField3.d.a(jLongValue2, chronoField3), 1);
                    long jA = mVar.a(j, this);
                    int iB2 = b(chronoLocalDateDate);
                    int i3 = chronoLocalDateDate.get(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateB5 = chronoLocalDateDate.b((((int) (jA - a(i(i3, iB2), i3))) * 7) + (iE - b(chronoLocalDateDate)), (TemporalUnit) ChronoUnit.DAYS);
                    if (c == C.STRICT && chronoLocalDateB5.A(chronoField3) != jLongValue2) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDateB3 = chronoLocalDateB5;
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField3);
                map.remove(chronoField);
                return chronoLocalDateB3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j2 = iK;
        ChronoLocalDate chronoLocalDateDate2 = chronologyA.date(iA3, 1, 1);
        if (c == C.LENIENT) {
            int iB3 = b(chronoLocalDateDate2);
            int i4 = chronoLocalDateDate2.get(ChronoField.DAY_OF_YEAR);
            chronoLocalDateB2 = chronoLocalDateDate2.b(j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.V(j$.desugar.sun.nio.fs.g.W(j2, a(i(i4, iB3), i4)), 7), iE - b(chronoLocalDateDate2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = mVar.a(j2, this);
            int iB4 = b(chronoLocalDateDate2);
            int i5 = chronoLocalDateDate2.get(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateB6 = chronoLocalDateDate2.b((((int) (jA2 - a(i(i5, iB4), i5))) * 7) + (iE - b(chronoLocalDateDate2)), (TemporalUnit) ChronoUnit.DAYS);
            if (c == C.STRICT && chronoLocalDateB6.A(chronoField2) != iA3) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDateB2 = chronoLocalDateB6;
        }
        map.remove(this);
        map.remove(chronoField2);
        map.remove(chronoField);
        return chronoLocalDateB2;
    }

    @Override // j$.time.temporal.TemporalField
    public final m range() {
        return this.e;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalField
    public final long x(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            int iB = b(temporalAccessor);
            int i2 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            iC = a(i(i2, iB), i2);
        } else if (temporalUnit == ChronoUnit.YEARS) {
            int iB2 = b(temporalAccessor);
            int i3 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
            iC = a(i(i3, iB2), i3);
        } else if (temporalUnit == WeekFields.h) {
            iC = d(temporalAccessor);
        } else {
            if (temporalUnit != ChronoUnit.FOREVER) {
                throw new IllegalStateException(j$.time.c.d("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }
}
