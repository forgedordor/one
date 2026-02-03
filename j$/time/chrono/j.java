package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class j implements InterfaceC0026h, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient C0023e a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public j(ZoneId zoneId, ZoneOffset zoneOffset, C0023e c0023e) {
        Objects.a(c0023e, "dateTime");
        this.a = c0023e;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    public static j J(ZoneId zoneId, ZoneOffset zoneOffset, C0023e c0023e) {
        Objects.a(c0023e, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new j(zoneId, (ZoneOffset) zoneId, c0023e);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeK = LocalDateTime.K(c0023e);
        List listF = rules.f(localDateTimeK);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = rules.e(localDateTimeK);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c0023e = c0023e.L(c0023e.a, 0L, 0L, Duration.ofSeconds(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()).getSeconds(), 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            c0023e = c0023e;
        }
        Objects.a(zoneOffset, "offset");
        return new j(zoneId, zoneOffset, c0023e);
    }

    public static j K(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        Objects.a(zoneOffsetD, "offset");
        return new j(zoneId, zoneOffsetD, (C0023e) chronology.C(LocalDateTime.M(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    public static j o(Chronology chronology, Temporal temporal) {
        j jVar = (j) temporal;
        if (chronology.equals(jVar.getChronology())) {
            return jVar;
        }
        throw new ClassCastException(j$.time.c.d("Chronology mismatch, required: ", chronology.getId(), ", actual: ", jVar.getChronology().getId()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = AbstractC0025g.a[((ChronoField) temporalField).ordinal()];
        return i != 1 ? i != 2 ? ((C0023e) toLocalDateTime()).A(temporalField) : getOffset().getTotalSeconds() : toEpochSecond();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object I(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.p(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final j b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return o(getChronology(), temporalUnit.f(this, j));
        }
        return o(getChronology(), this.a.b(j, temporalUnit).o(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return o(getChronology(), temporalField.A(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = i.a[chronoField.ordinal()];
        if (i == 1) {
            return b(j - j$.desugar.sun.nio.fs.g.s(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C0023e c0023e = this.a;
        if (i != 2) {
            return J(zoneId, this.b, c0023e.a(j, temporalField));
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.d.a(j, chronoField));
        c0023e.getClass();
        return K(getChronology(), j$.desugar.sun.nio.fs.g.t(c0023e, zoneOffsetOfTotalSeconds), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.f(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.e(this, (InterfaceC0026h) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0026h interfaceC0026hK = getChronology().k(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.d(interfaceC0026hK.e(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.between(this, interfaceC0026hK);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final InterfaceC0026h e(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        C0023e c0023e = this.a;
        c0023e.getClass();
        return K(getChronology(), j$.desugar.sun.nio.fs.g.t(c0023e, this.b), zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0026h) && j$.desugar.sun.nio.fs.g.e(this, (InterfaceC0026h) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f */
    public final Temporal w(LocalDate localDate) {
        return o(getChronology(), localDate.o(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.desugar.sun.nio.fs.g.i(this, temporalField);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).d : ((C0023e) toLocalDateTime()).j(temporalField) : temporalField.j(this);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.s(this);
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final ChronoLocalDate toLocalDate() {
        return ((C0023e) toLocalDateTime()).toLocalDate();
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final ChronoLocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final LocalTime toLocalTime() {
        return ((C0023e) toLocalDateTime()).toLocalTime();
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.InterfaceC0026h
    public final InterfaceC0026h v(ZoneId zoneId) {
        return J(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return o(getChronology(), j$.time.temporal.k.b(this, j, chronoUnit));
    }
}
