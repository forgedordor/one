package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes9.dex */
public final class G extends AbstractC0021c {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    public G(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = F.a[((ChronoField) temporalField).ordinal()];
        if (i == 4) {
            int iO = O();
            if (iO < 1) {
                iO = 1 - iO;
            }
            return iO;
        }
        LocalDate localDate = this.a;
        if (i == 5) {
            return ((O() * 12) + localDate.getMonthValue()) - 1;
        }
        if (i == 6) {
            return O();
        }
        if (i != 7) {
            return localDate.A(temporalField);
        }
        return O() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return new C0023e(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate F(TemporalAmount temporalAmount) {
        return (G) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0021c
    public final ChronoLocalDate L(long j) {
        return Q(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC0021c
    public final ChronoLocalDate M(long j) {
        return Q(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.AbstractC0021c
    public final ChronoLocalDate N(long j) {
        return Q(this.a.Y(j));
    }

    public final int O() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.G a(long r9, j$.time.temporal.TemporalField r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r8.A(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.F.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            j$.time.LocalDate r6 = r8.a
            if (r2 == r5) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r4) goto L4c
            if (r2 == r3) goto L4c
            goto L62
        L27:
            j$.time.chrono.E r11 = j$.time.chrono.E.d
            j$.time.temporal.m r11 = r11.q(r0)
            r11.b(r9, r0)
            int r11 = r8.O()
            long r0 = (long) r11
            r2 = 12
            long r0 = r0 * r2
            int r11 = r6.getMonthValue()
            long r2 = (long) r11
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r6.plusMonths(r9)
            j$.time.chrono.G r9 = r8.Q(r9)
            return r9
        L4c:
            j$.time.chrono.E r2 = j$.time.chrono.E.d
            j$.time.temporal.m r2 = r2.q(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L85
            if (r0 == r4) goto L7a
            if (r0 == r3) goto L6b
        L62:
            j$.time.LocalDate r9 = r6.a(r9, r11)
            j$.time.chrono.G r9 = r8.Q(r9)
            return r9
        L6b:
            int r9 = r8.O()
            int r9 = (-542) - r9
            j$.time.LocalDate r9 = r6.c0(r9)
            j$.time.chrono.G r9 = r8.Q(r9)
            return r9
        L7a:
            int r2 = r2 + (-543)
            j$.time.LocalDate r9 = r6.c0(r2)
            j$.time.chrono.G r9 = r8.Q(r9)
            return r9
        L85:
            int r9 = r8.O()
            r10 = 1
            if (r9 < r10) goto L8d
            goto L8f
        L8d:
            int r2 = 1 - r2
        L8f:
            int r2 = r2 + (-543)
            j$.time.LocalDate r9 = r6.c0(r2)
            j$.time.chrono.G r9 = r8.Q(r9)
            return r9
        L9a:
            j$.time.chrono.ChronoLocalDate r9 = super.a(r9, r11)
            j$.time.chrono.G r9 = (j$.time.chrono.G) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.G.a(long, j$.time.temporal.TemporalField):j$.time.chrono.G");
    }

    public final G Q(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new G(localDate);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (G) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return this.a.equals(((G) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        return (G) super.w(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return E.d;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final k getEra() {
        return O() >= 1 ? H.BE : H.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        E.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (!j$.desugar.sun.nio.fs.g.l(this, temporalField)) {
            throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = F.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.j(temporalField);
        }
        if (i != 4) {
            return E.d.q(chronoField);
        }
        j$.time.temporal.m mVar = ChronoField.YEAR.d;
        return j$.time.temporal.m.f(1L, O() <= 0 ? (-(mVar.a + 543)) + 1 : 543 + mVar.d);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    /* renamed from: r */
    public final ChronoLocalDate x(long j, TemporalUnit temporalUnit) {
        return (G) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate w(TemporalAdjuster temporalAdjuster) {
        return (G) super.w(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return (G) super.x(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0021c, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (G) super.b(j, temporalUnit);
    }
}
