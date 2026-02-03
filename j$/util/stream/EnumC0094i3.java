package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC0094i3 {
    public static final EnumC0094i3 DISTINCT;
    public static final EnumC0094i3 ORDERED;
    public static final EnumC0094i3 SHORT_CIRCUIT;
    public static final EnumC0094i3 SIZED;
    public static final EnumC0094i3 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ EnumC0094i3[] v;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        EnumC0089h3 enumC0089h3 = EnumC0089h3.SPLITERATOR;
        j$.desugar.sun.nio.fs.h hVarA = A(enumC0089h3);
        EnumC0089h3 enumC0089h32 = EnumC0089h3.STREAM;
        hVarA.h(enumC0089h32);
        EnumC0089h3 enumC0089h33 = EnumC0089h3.OP;
        ((EnumMap) hVarA.b).put((EnumMap) enumC0089h33, (EnumC0089h3) 3);
        EnumC0094i3 enumC0094i3 = new EnumC0094i3("DISTINCT", 0, 0, hVarA);
        DISTINCT = enumC0094i3;
        j$.desugar.sun.nio.fs.h hVarA2 = A(enumC0089h3);
        hVarA2.h(enumC0089h32);
        ((EnumMap) hVarA2.b).put((EnumMap) enumC0089h33, (EnumC0089h3) 3);
        EnumC0094i3 enumC0094i32 = new EnumC0094i3("SORTED", 1, 1, hVarA2);
        SORTED = enumC0094i32;
        j$.desugar.sun.nio.fs.h hVarA3 = A(enumC0089h3);
        hVarA3.h(enumC0089h32);
        EnumMap enumMap = (EnumMap) hVarA3.b;
        enumMap.put((EnumMap) enumC0089h33, (EnumC0089h3) 3);
        EnumC0089h3 enumC0089h34 = EnumC0089h3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC0089h34, (EnumC0089h3) 2);
        EnumC0089h3 enumC0089h35 = EnumC0089h3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC0089h35, (EnumC0089h3) 2);
        EnumC0094i3 enumC0094i33 = new EnumC0094i3("ORDERED", 2, 2, hVarA3);
        ORDERED = enumC0094i33;
        j$.desugar.sun.nio.fs.h hVarA4 = A(enumC0089h3);
        hVarA4.h(enumC0089h32);
        ((EnumMap) hVarA4.b).put((EnumMap) enumC0089h33, (EnumC0089h3) 2);
        EnumC0094i3 enumC0094i34 = new EnumC0094i3("SIZED", 3, 3, hVarA4);
        SIZED = enumC0094i34;
        j$.desugar.sun.nio.fs.h hVarA5 = A(enumC0089h33);
        hVarA5.h(enumC0089h34);
        int i2 = 0;
        EnumC0094i3 enumC0094i35 = new EnumC0094i3("SHORT_CIRCUIT", 4, 12, hVarA5);
        SHORT_CIRCUIT = enumC0094i35;
        v = new EnumC0094i3[]{enumC0094i3, enumC0094i32, enumC0094i33, enumC0094i34, enumC0094i35};
        f = j(enumC0089h3);
        g = j(enumC0089h32);
        h = j(enumC0089h33);
        j(enumC0089h34);
        j(enumC0089h35);
        for (EnumC0094i3 enumC0094i36 : values()) {
            i2 |= enumC0094i36.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        EnumC0094i3 enumC0094i37 = DISTINCT;
        m = enumC0094i37.c;
        n = enumC0094i37.d;
        EnumC0094i3 enumC0094i38 = SORTED;
        o = enumC0094i38.c;
        p = enumC0094i38.d;
        EnumC0094i3 enumC0094i39 = ORDERED;
        q = enumC0094i39.c;
        r = enumC0094i39.d;
        EnumC0094i3 enumC0094i310 = SIZED;
        s = enumC0094i310.c;
        t = enumC0094i310.d;
        u = SHORT_CIRCUIT.c;
    }

    public EnumC0094i3(String str, int i2, int i3, j$.desugar.sun.nio.fs.h hVar) {
        EnumMap enumMap = (EnumMap) hVar.b;
        for (EnumC0089h3 enumC0089h3 : EnumC0089h3.values()) {
            Map.EL.putIfAbsent(enumMap, enumC0089h3, 0);
        }
        this.a = enumMap;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static j$.desugar.sun.nio.fs.h A(EnumC0089h3 enumC0089h3) {
        j$.desugar.sun.nio.fs.h hVar = new j$.desugar.sun.nio.fs.h(19, new EnumMap(EnumC0089h3.class));
        hVar.h(enumC0089h3);
        return hVar;
    }

    public static int f(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int j(EnumC0089h3 enumC0089h3) {
        int iIntValue = 0;
        for (EnumC0094i3 enumC0094i3 : values()) {
            iIntValue |= ((Integer) enumC0094i3.a.get(enumC0089h3)).intValue() << enumC0094i3.b;
        }
        return iIntValue;
    }

    public static int o(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static EnumC0094i3 valueOf(String str) {
        return (EnumC0094i3) Enum.valueOf(EnumC0094i3.class, str);
    }

    public static EnumC0094i3[] values() {
        return (EnumC0094i3[]) v.clone();
    }

    public final boolean x(int i2) {
        return (i2 & this.e) == this.c;
    }
}
