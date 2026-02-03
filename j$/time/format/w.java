package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* loaded from: classes9.dex */
public final class w implements TemporalAccessor {
    public final /* synthetic */ ChronoLocalDate a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ Chronology c;
    public final /* synthetic */ ZoneId d;

    public w(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = chronology;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long A(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.A(temporalField) : chronoLocalDate.A(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object I(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.k.b ? this.c : nVar == j$.time.temporal.k.a ? this.d : nVar == j$.time.temporal.k.c ? this.b.I(nVar) : nVar.e(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.c(temporalField) : chronoLocalDate.c(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.k.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.j(temporalField) : chronoLocalDate.j(temporalField);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        Chronology chronology = this.c;
        String strConcat = chronology != null ? " with chronology ".concat(String.valueOf(chronology)) : "";
        ZoneId zoneId = this.d;
        return strValueOf + strConcat + (zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }
}
