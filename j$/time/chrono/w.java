package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class w implements k, Serializable {
    public static final w d;
    public static final w[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        w wVar = new w(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = wVar;
        e = new w[]{wVar, new w(0, LocalDate.of(1912, 7, 30), "Taisho"), new w(1, LocalDate.of(1926, 12, 25), "Showa"), new w(2, LocalDate.of(1989, 1, 8), "Heisei"), new w(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public w(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static w g(LocalDate localDate) {
        if (localDate.P(v.d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        w[] wVarArr = e;
        for (int length = wVarArr.length - 1; length >= 0; length--) {
            w wVar = wVarArr[length];
            if (localDate.compareTo((ChronoLocalDate) wVar.b) >= 0) {
                return wVar;
            }
        }
        return null;
    }

    public static w i(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            w[] wVarArr = e;
            if (i2 < wVarArr.length) {
                return wVarArr[i2];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long A(TemporalField temporalField) {
        return j$.desugar.sun.nio.fs.g.k(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object I(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.q(this, nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean c(TemporalField temporalField) {
        return j$.desugar.sun.nio.fs.g.m(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.desugar.sun.nio.fs.g.j(this, temporalField);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return this.a;
    }

    public final w h() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return i(this.a + 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        return temporalField == chronoField ? t.d.q(chronoField) : j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        return temporal.a(getValue(), ChronoField.ERA);
    }

    public final String toString() {
        return this.c;
    }
}
