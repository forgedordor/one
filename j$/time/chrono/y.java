package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class y extends AbstractC0019a implements Serializable {
    public static final y d = new y();
    private static final long serialVersionUID = 1039765215346859963L;

    private y() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.AbstractC0019a, j$.time.chrono.Chronology
    public final ChronoLocalDate G(Map map, j$.time.format.C c) {
        return (A) super.G(map, c);
    }

    @Override // j$.time.chrono.Chronology
    public final InterfaceC0026h H(Instant instant, ZoneId zoneId) {
        return j.K(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new A(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new A(LocalDate.U(j));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new A(LocalDate.V(i + 1911, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final k eraOf(int i) {
        if (i == 0) {
            return B.BEFORE_ROC;
        }
        if (i == 1) {
            return B.ROC;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.desugar.sun.nio.fs.g.N(B.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return q.d.isLeapYear(j + 1911);
    }

    @Override // j$.time.chrono.AbstractC0019a
    public final ChronoLocalDate j() {
        return new A(LocalDate.L(LocalDate.S(j$.desugar.sun.nio.fs.g.Z())));
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.m q(ChronoField chronoField) {
        int i = x.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.m mVar = ChronoField.PROLEPTIC_MONTH.d;
            return j$.time.temporal.m.f(mVar.a - 22932, mVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.m mVar2 = ChronoField.YEAR.d;
            return j$.time.temporal.m.g(1L, mVar2.d - 1911, (-mVar2.a) + 1912);
        }
        if (i != 3) {
            return chronoField.d;
        }
        j$.time.temporal.m mVar3 = ChronoField.YEAR.d;
        return j$.time.temporal.m.f(mVar3.a - 1911, mVar3.d - 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final int u(k kVar, int i) {
        if (kVar instanceof B) {
            return kVar == B.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    public Object writeReplace() {
        return new C((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate z(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof A ? (A) temporalAccessor : new A(LocalDate.L(temporalAccessor));
    }
}
