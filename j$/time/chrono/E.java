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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class E extends AbstractC0019a implements Serializable {
    public static final E d = new E();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private E() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.AbstractC0019a, j$.time.chrono.Chronology
    public final ChronoLocalDate G(Map map, j$.time.format.C c) {
        return (G) super.G(map, c);
    }

    @Override // j$.time.chrono.Chronology
    public final InterfaceC0026h H(Instant instant, ZoneId zoneId) {
        return j.K(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new G(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new G(LocalDate.U(j));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new G(LocalDate.V(i - 543, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final k eraOf(int i) {
        if (i == 0) {
            return H.BEFORE_BE;
        }
        if (i == 1) {
            return H.BE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.desugar.sun.nio.fs.g.N(H.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return q.d.isLeapYear(j - 543);
    }

    @Override // j$.time.chrono.AbstractC0019a
    public final ChronoLocalDate j() {
        return new G(LocalDate.L(LocalDate.S(j$.desugar.sun.nio.fs.g.Z())));
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.m q(ChronoField chronoField) {
        int i = D.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.m mVar = ChronoField.PROLEPTIC_MONTH.d;
            return j$.time.temporal.m.f(mVar.a + 6516, mVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.m mVar2 = ChronoField.YEAR.d;
            return j$.time.temporal.m.g(1L, (-(mVar2.a + 543)) + 1, mVar2.d + 543);
        }
        if (i != 3) {
            return chronoField.d;
        }
        j$.time.temporal.m mVar3 = ChronoField.YEAR.d;
        return j$.time.temporal.m.f(mVar3.a + 543, mVar3.d + 543);
    }

    @Override // j$.time.chrono.Chronology
    public final int u(k kVar, int i) {
        if (kVar instanceof H) {
            return kVar == H.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    public Object writeReplace() {
        return new C((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate z(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof G ? (G) temporalAccessor : new G(LocalDate.L(temporalAccessor));
    }
}
