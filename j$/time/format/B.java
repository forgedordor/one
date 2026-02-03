package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class B implements TemporalAccessor {
    public ZoneId b;
    public Chronology c;
    public boolean d;
    public C e;
    public ChronoLocalDate f;
    public LocalTime g;
    public final HashMap a = new HashMap();
    public Period h = Period.d;

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        Objects.a(temporalField, "field");
        Long l = (Long) this.a.get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.c(temporalField)) {
            return this.f.A(temporalField);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.c(temporalField)) {
            return this.g.A(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.k.a) {
            return this.b;
        }
        if (nVar == j$.time.temporal.k.b) {
            return this.c;
        }
        if (nVar == j$.time.temporal.k.f) {
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                return LocalDate.L(chronoLocalDate);
            }
            return null;
        }
        if (nVar == j$.time.temporal.k.g) {
            return this.g;
        }
        if (nVar == j$.time.temporal.k.d) {
            Long l = (Long) this.a.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.ofTotalSeconds(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : nVar.e(this);
        }
        if (nVar == j$.time.temporal.k.e) {
            return nVar.e(this);
        }
        if (nVar == j$.time.temporal.k.c) {
            return null;
        }
        return nVar.e(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        if (this.a.containsKey(temporalField)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.c(temporalField)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.c(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.f(this)) ? false : true;
        }
        return true;
    }

    public final void g(TemporalAccessor temporalAccessor) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.c(temporalField)) {
                try {
                    long jA = temporalAccessor.A(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jA != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + String.valueOf(temporalField) + " " + jA + " differs from " + String.valueOf(temporalField) + " " + jLongValue + " derived from " + String.valueOf(temporalAccessor));
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.k.a(this, temporalField);
    }

    public final void h() {
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        HashMap map = this.a;
        if (map.containsKey(chronoField)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                i(zoneId);
                return;
            }
            Long l = (Long) map.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                i(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    public final void i(ZoneId zoneId) {
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        n(this.c.H(Instant.ofEpochSecond(((Long) this.a.remove(chronoField)).longValue()), zoneId).toLocalDate());
        o(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().W()));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.m j(TemporalField temporalField) {
        return j$.time.temporal.k.d(this, temporalField);
    }

    public final void k(long j, long j2, long j3, long j4) {
        if (this.e == C.LENIENT) {
            long jU = j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.V(j, 3600000000000L), j$.desugar.sun.nio.fs.g.V(j2, 60000000000L)), j$.desugar.sun.nio.fs.g.V(j3, 1000000000L)), j4);
            m(LocalTime.O(j$.desugar.sun.nio.fs.g.T(jU, 86400000000000L)), Period.a(0, 0, (int) j$.desugar.sun.nio.fs.g.L(jU, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int iA = chronoField.d.a(j2, chronoField);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int iA2 = chronoField2.d.a(j4, chronoField2);
        if (this.e == C.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            m(LocalTime.MIDNIGHT, Period.a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int iA3 = chronoField3.d.a(j, chronoField3);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        m(LocalTime.N(iA3, iA, chronoField4.d.a(j3, chronoField4), iA2), Period.d);
    }

    public final void l() {
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        HashMap map = this.a;
        if (map.containsKey(chronoField)) {
            long jLongValue = ((Long) map.remove(chronoField)).longValue();
            C c = this.e;
            if (c == C.STRICT || (c == C.SMART && jLongValue != 0)) {
                chronoField.I(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            o(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(chronoField3)) {
            long jLongValue2 = ((Long) map.remove(chronoField3)).longValue();
            C c2 = this.e;
            if (c2 == C.STRICT || (c2 == C.SMART && jLongValue2 != 0)) {
                chronoField3.I(jLongValue2);
            }
            o(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (map.containsKey(chronoField4)) {
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (map.containsKey(chronoField5)) {
                long jLongValue3 = ((Long) map.remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) map.remove(chronoField5)).longValue();
                if (this.e == C.LENIENT) {
                    o(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(j$.desugar.sun.nio.fs.g.U(j$.desugar.sun.nio.fs.g.V(jLongValue3, 12), jLongValue4)));
                } else {
                    chronoField4.I(jLongValue3);
                    chronoField5.I(jLongValue3);
                    o(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (map.containsKey(chronoField6)) {
            long jLongValue5 = ((Long) map.remove(chronoField6)).longValue();
            if (this.e != C.LENIENT) {
                chronoField6.I(jLongValue5);
            }
            o(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            o(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            o(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            o(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (map.containsKey(chronoField7)) {
            long jLongValue6 = ((Long) map.remove(chronoField7)).longValue();
            if (this.e != C.LENIENT) {
                chronoField7.I(jLongValue6);
            }
            o(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            o(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (map.containsKey(chronoField8)) {
            long jLongValue7 = ((Long) map.remove(chronoField8)).longValue();
            if (this.e != C.LENIENT) {
                chronoField8.I(jLongValue7);
            }
            o(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            o(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (map.containsKey(chronoField9)) {
            long jLongValue8 = ((Long) map.remove(chronoField9)).longValue();
            if (this.e != C.LENIENT) {
                chronoField9.I(jLongValue8);
            }
            o(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            o(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            o(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (map.containsKey(chronoField10)) {
            long jLongValue9 = ((Long) map.remove(chronoField10)).longValue();
            if (this.e != C.LENIENT) {
                chronoField10.I(jLongValue9);
            }
            o(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            o(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (map.containsKey(chronoField11)) {
            long jLongValue10 = ((Long) map.get(chronoField11)).longValue();
            C c3 = this.e;
            C c4 = C.LENIENT;
            if (c3 != c4) {
                chronoField11.I(jLongValue10);
            }
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (map.containsKey(chronoField12)) {
                long jLongValue11 = ((Long) map.remove(chronoField12)).longValue();
                if (this.e != c4) {
                    chronoField12.I(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                o(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (map.containsKey(chronoField13)) {
                long jLongValue12 = ((Long) map.remove(chronoField13)).longValue();
                if (this.e != c4) {
                    chronoField13.I(jLongValue12);
                }
                o(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (map.containsKey(chronoField14)) {
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (map.containsKey(chronoField15)) {
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (map.containsKey(chronoField16) && map.containsKey(chronoField11)) {
                    k(((Long) map.remove(chronoField14)).longValue(), ((Long) map.remove(chronoField15)).longValue(), ((Long) map.remove(chronoField16)).longValue(), ((Long) map.remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final void m(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.g;
        if (localTime2 == null) {
            this.g = localTime;
            this.h = period;
        } else {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException(j$.time.c.d("Conflict found: Fields resolved to different times: ", String.valueOf(this.g), " ", String.valueOf(localTime)));
            }
            Period period2 = this.h;
            period2.getClass();
            Period period3 = Period.d;
            if (period2 != period3 && period != period3 && !this.h.equals(period)) {
                throw new DateTimeException(j$.time.c.d("Conflict found: Fields resolved to different excess periods: ", String.valueOf(this.h), " ", String.valueOf(period)));
            }
            this.h = period;
        }
    }

    public final void n(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate != null && !chronoLocalDate2.equals(chronoLocalDate)) {
                throw new DateTimeException(j$.time.c.d("Conflict found: Fields resolved to two different dates: ", String.valueOf(this.f), " ", String.valueOf(chronoLocalDate)));
            }
        } else if (chronoLocalDate != null) {
            if (!this.c.equals(chronoLocalDate.getChronology())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: ".concat(String.valueOf(this.c)));
            }
            this.f = chronoLocalDate;
        }
    }

    public final void o(TemporalField temporalField, ChronoField chronoField, Long l) {
        Long l2 = (Long) this.a.put(chronoField, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + String.valueOf(chronoField) + " " + l2 + " differs from " + String.valueOf(chronoField) + " " + l + " while resolving  " + String.valueOf(temporalField));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
