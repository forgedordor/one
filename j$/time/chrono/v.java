package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes9.dex */
public final class v extends AbstractC0021c {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient w b;
    public final transient int c;

    public v(LocalDate localDate) {
        if (localDate.P(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        w wVarG = w.g(localDate);
        this.b = wVarG;
        this.c = (localDate.getYear() - wVarG.b.getYear()) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = u.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.c;
        w wVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.N() - wVar.b.N()) + 1 : localDate.N();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
            case 8:
                return wVar.a;
            default:
                return localDate.A(temporalField);
        }
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return new C0023e(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate F(TemporalAmount temporalAmount) {
        return (v) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0021c
    public final ChronoLocalDate L(long j) {
        return R(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC0021c
    public final ChronoLocalDate M(long j) {
        return R(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.AbstractC0021c
    public final ChronoLocalDate N(long j) {
        return R(this.a.Y(j));
    }

    public final v O(long j, ChronoUnit chronoUnit) {
        return (v) super.b(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final v a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (v) super.a(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (A(chronoField) == j) {
            return this;
        }
        int[] iArr = u.a;
        int i = iArr[chronoField.ordinal()];
        LocalDate localDate = this.a;
        if (i == 3 || i == 8 || i == 9) {
            t tVar = t.d;
            int iA = tVar.q(chronoField).a(j, chronoField);
            int i2 = iArr[chronoField.ordinal()];
            if (i2 == 3) {
                return R(localDate.c0(tVar.u(this.b, iA)));
            }
            if (i2 == 8) {
                return R(localDate.c0(tVar.u(w.i(iA), this.c)));
            }
            if (i2 == 9) {
                return R(localDate.c0(iA));
            }
        }
        return R(localDate.a(j, temporalField));
    }

    public final v Q(j$.desugar.sun.nio.fs.n nVar) {
        return (v) super.w(nVar);
    }

    public final v R(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new v(localDate);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (v) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isDateBased() : temporalField != null && temporalField.f(this);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.a.equals(((v) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        return (v) super.w(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return t.d;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final k getEra() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        t.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (!c(temporalField)) {
            throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = u.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.m.f(1L, this.a.lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.m.f(1L, lengthOfYear());
        }
        if (i != 3) {
            return t.d.q(chronoField);
        }
        w wVar = this.b;
        int year = wVar.b.getYear();
        return wVar.h() != null ? j$.time.temporal.m.f(1L, (r6.b.getYear() - year) + 1) : j$.time.temporal.m.f(1L, 999999999 - year);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lengthOfYear() {
        /*
            r6 = this;
            j$.time.chrono.w r0 = r6.b
            j$.time.chrono.w r1 = r0.h()
            j$.time.LocalDate r2 = r6.a
            r3 = 1
            if (r1 == 0) goto L1d
            j$.time.LocalDate r1 = r1.b
            int r4 = r1.getYear()
            int r5 = r2.getYear()
            if (r4 != r5) goto L1d
            int r1 = r1.N()
            int r1 = r1 - r3
            goto L21
        L1d:
            int r1 = r2.lengthOfYear()
        L21:
            int r2 = r6.c
            if (r2 != r3) goto L2d
            j$.time.LocalDate r0 = r0.b
            int r0 = r0.N()
            int r0 = r0 - r3
            int r1 = r1 - r0
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.v.lengthOfYear():int");
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    /* renamed from: r */
    public final ChronoLocalDate x(long j, TemporalUnit temporalUnit) {
        return (v) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate w(TemporalAdjuster temporalAdjuster) {
        return (v) super.w(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return (v) super.x(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (v) super.b(j, temporalUnit);
    }

    public v(w wVar, int i, LocalDate localDate) {
        if (!localDate.P(d)) {
            this.b = wVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
    }
}
