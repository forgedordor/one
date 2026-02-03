package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ekst {
    STRING('s', eksv.GENERAL, "-#", true),
    BOOLEAN('b', eksv.BOOLEAN, "-", true),
    CHAR('c', eksv.CHARACTER, "-", true),
    DECIMAL('d', eksv.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', eksv.INTEGRAL, "-#0(", false),
    HEX('x', eksv.INTEGRAL, "-#0(", true),
    FLOAT('f', eksv.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', eksv.FLOAT, "-#0+ (", true),
    GENERAL('g', eksv.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', eksv.FLOAT, "-#0+ ", true);

    public static final ekst[] k = new ekst[26];
    public final char l;
    public final eksv m;
    public final int n;
    public final String o;

    static {
        for (ekst ekstVar : values()) {
            k[a(ekstVar.l)] = ekstVar;
        }
    }

    ekst(char c, eksv eksvVar, String str, boolean z) {
        this.l = c;
        this.m = eksvVar;
        eksu eksuVar = eksu.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = eksu.a(str.charAt(i2));
            if (iA < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << iA;
        }
        this.n = i;
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
