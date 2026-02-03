package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.Chronology;
import j$.time.format.B;
import j$.time.format.C;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes9.dex */
public final class h implements TemporalField {
    public static final h JULIAN_DAY;
    public static final h MODIFIED_JULIAN_DAY;
    public static final h RATA_DIE;
    public static final /* synthetic */ h[] f;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient TemporalUnit b;
    public final transient TemporalUnit c;
    public final transient m d;
    public final transient long e;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        h hVar = new h("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = hVar;
        h hVar2 = new h("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = hVar2;
        h hVar3 = new h("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = hVar3;
        f = new h[]{hVar, hVar2, hVar3};
    }

    public h(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = chronoUnit;
        this.c = chronoUnit2;
        this.d = m.f((-365243219162L) + j, 365241780471L + j);
        this.e = j;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal A(Temporal temporal, long j) {
        if (this.d.e(j)) {
            return temporal.a(j$.desugar.sun.nio.fs.g.W(j, this.e), ChronoField.EPOCH_DAY);
        }
        throw new DateTimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean f(TemporalAccessor temporalAccessor) {
        return temporalAccessor.c(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final m j(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.c(ChronoField.EPOCH_DAY)) {
            return this.d;
        }
        throw new DateTimeException("Unsupported field: ".concat(String.valueOf(this)));
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor o(Map map, B b, C c) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyA = Chronology.CC.a(b);
        C c2 = C.LENIENT;
        long j = this.e;
        if (c == c2) {
            return chronologyA.dateEpochDay(j$.desugar.sun.nio.fs.g.W(jLongValue, j));
        }
        this.d.b(jLongValue, this);
        return chronologyA.dateEpochDay(jLongValue - j);
    }

    @Override // j$.time.temporal.TemporalField
    public final m range() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalField
    public final long x(TemporalAccessor temporalAccessor) {
        return temporalAccessor.A(ChronoField.EPOCH_DAY) + this.e;
    }
}
