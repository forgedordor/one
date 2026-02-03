package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eslq {
    static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (i(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || i(b3) || i(b4)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int iH = ((b & 7) << 18) | (h(b2) << 12) | (h(b3) << 6) | h(b4);
        cArr[i] = (char) ((iH >>> 10) + 55232);
        cArr[i + 1] = (char) ((iH & 1023) + 56320);
    }

    static void b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void c(byte r2, byte r3, byte r4, char[] r5, int r6) {
        /*
            boolean r0 = i(r3)
            if (r0 != 0) goto L30
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L30
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L30
            r2 = r1
        L16:
            boolean r0 = i(r4)
            if (r0 != 0) goto L30
            r2 = r2 & 15
            int r3 = h(r3)
            int r4 = h(r4)
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid UTF-8"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eslq.c(byte, byte, byte, char[], int):void");
    }

    static void d(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (i(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i] = (char) (((b & 31) << 6) | h(b2));
    }

    static boolean e(byte b) {
        return b >= 0;
    }

    static boolean f(byte b) {
        return b < -16;
    }

    static boolean g(byte b) {
        return b < -32;
    }

    private static int h(byte b) {
        return b & 63;
    }

    private static boolean i(byte b) {
        return b > -65;
    }
}
