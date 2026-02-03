package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class p implements k {
    public static final p AH;
    public static final /* synthetic */ p[] a;

    static {
        p pVar = new p("AH", 0);
        AH = pVar;
        a = new p[]{pVar};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) a.clone();
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
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.m j(TemporalField temporalField) {
        return temporalField == ChronoField.ERA ? j$.time.temporal.m.f(1L, 1L) : j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal o(Temporal temporal) {
        return temporal.a(1, ChronoField.ERA);
    }
}
