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
public final class k implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new k(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new k(localTime2, zoneOffset2);
    }

    public k(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.A(temporalField) : temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.k.d || nVar == j$.time.temporal.k.e) {
            return this.b;
        }
        if (((nVar == j$.time.temporal.k.a) || (nVar == j$.time.temporal.k.b)) || nVar == j$.time.temporal.k.f) {
            return null;
        }
        return nVar == j$.time.temporal.k.g ? this.a : nVar == j$.time.temporal.k.c ? ChronoUnit.NANOS : nVar.e(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final k b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? L(this.a.b(j, temporalUnit), this.b) : (k) temporalUnit.f(this, j);
    }

    public final long K() {
        return this.a.V() - (this.b.getTotalSeconds() * 1000000000);
    }

    public final k L(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new k(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (k) temporalField.A(this, j);
        }
        ChronoField chronoField = ChronoField.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        if (temporalField != chronoField) {
            return L(localTime.a(j, temporalField), this.b);
        }
        ChronoField chronoField2 = (ChronoField) temporalField;
        return L(localTime, ZoneOffset.ofTotalSeconds(chronoField2.d.a(j, chronoField2)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).J() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        ZoneOffset zoneOffset = kVar.b;
        LocalTime localTime = kVar.a;
        boolean zEquals = this.b.equals(zoneOffset);
        LocalTime localTime2 = this.a;
        if (zEquals) {
            return localTime2.compareTo(localTime);
        }
        int iCompare = Long.compare(K(), kVar.K());
        return iCompare == 0 ? localTime2.compareTo(localTime) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        k kVar;
        if (temporal instanceof k) {
            kVar = (k) temporal;
        } else {
            try {
                kVar = new k(LocalTime.L(temporal), ZoneOffset.N(temporal));
            } catch (DateTimeException e) {
                throw new DateTimeException(c.d("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, kVar);
        }
        long jK = kVar.K() - K();
        switch (j.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jK;
            case 2:
                return jK / 1000;
            case 3:
                return jK / 1000000;
            case 4:
                return jK / 1000000000;
            case 5:
                return jK / 60000000000L;
            case 6:
                return jK / 3600000000000L;
            case 7:
                return jK / 43200000000000L;
            default:
                throw new j$.time.temporal.l("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.a.equals(kVar.a) && this.b.equals(kVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        localDate.getClass();
        return (k) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return j$.time.temporal.k.a(this, temporalField);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return ((ChronoField) temporalField).d;
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.k.d(localTime, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        return temporal.a(this.a.V(), ChronoField.NANO_OF_DAY).a(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }
}
