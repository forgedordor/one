package com.sun.jna;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class IntegerType extends Number implements NativeMapped {
    private static final long serialVersionUID = 1;
    private Number number;
    private int size;
    private boolean unsigned;
    private long value;

    public IntegerType(int i) {
        this(i, 0L, false);
    }

    public static final int compare(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.number.doubleValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof IntegerType) && this.number.equals(((IntegerType) obj).number);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.number.floatValue();
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        long jLongValue = obj == null ? 0L : ((Number) obj).longValue();
        IntegerType integerType = (IntegerType) Klass.newInstance(getClass());
        integerType.setValue(jLongValue);
        return integerType;
    }

    public int hashCode() {
        return this.number.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return this.number.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setValue(long r11) {
        /*
            r10 = this;
            r10.value = r11
            int r0 = r10.size
            r1 = 1
            r2 = 8
            if (r0 == r1) goto L4c
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 == r1) goto L25
            if (r0 != r2) goto L19
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r10.number = r0
            r0 = r11
            goto L5e
        L19:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Unsupported size: "
            java.lang.String r12 = defpackage.a.g(r0, r12)
            r11.<init>(r12)
            throw r11
        L25:
            int r0 = (int) r11
            boolean r1 = r10.unsigned
            if (r1 == 0) goto L32
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r11
            r10.value = r3
        L32:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r10.number = r1
            goto L5d
        L39:
            int r0 = (int) r11
            boolean r1 = r10.unsigned
            if (r1 == 0) goto L44
            r3 = 65535(0xffff, double:3.23786E-319)
            long r3 = r3 & r11
            r10.value = r3
        L44:
            short r0 = (short) r0
            java.lang.Short r1 = java.lang.Short.valueOf(r0)
            r10.number = r1
            goto L5d
        L4c:
            int r0 = (int) r11
            boolean r1 = r10.unsigned
            if (r1 == 0) goto L56
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r11
            r10.value = r3
        L56:
            byte r0 = (byte) r0
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)
            r10.number = r1
        L5d:
            long r0 = (long) r0
        L5e:
            int r3 = r10.size
            if (r3 >= r2) goto Lab
            int r3 = r3 * r2
            r4 = 0
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r6 = 1
            long r6 = r6 << r3
            r8 = -1
            long r6 = r6 + r8
            long r6 = ~r6
            if (r2 >= 0) goto L74
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L7d
        L74:
            if (r2 < 0) goto Lab
            long r0 = r6 & r11
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L7d
            goto Lab
        L7d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = java.lang.Long.toHexString(r11)
            int r12 = r10.size
            java.lang.String r1 = java.lang.Long.toHexString(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Argument value 0x"
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r11 = " exceeds native capacity ("
            r2.append(r11)
            r2.append(r12)
            java.lang.String r11 = " bytes) mask=0x"
            r2.append(r11)
            r2.append(r1)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            throw r0
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.IntegerType.setValue(long):void");
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return this.number;
    }

    public String toString() {
        return this.number.toString();
    }

    public IntegerType(int i, long j) {
        this(i, j, false);
    }

    public static int compare(IntegerType integerType, long j) {
        if (integerType == null) {
            return 1;
        }
        return compare(integerType.longValue(), j);
    }

    public IntegerType(int i, long j, boolean z) {
        this.size = i;
        this.unsigned = z;
        setValue(j);
    }

    public static <T extends IntegerType> int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return compare(t.longValue(), t2.longValue());
    }

    public IntegerType(int i, boolean z) {
        this(i, 0L, z);
    }
}
