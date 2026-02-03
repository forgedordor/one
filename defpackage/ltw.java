package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ltw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public long h;
    private final lsz i;
    private final float j;
    private final float k;

    public ltw(long j, long j2, long j3, lsz lszVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.i = lszVar;
        long jG = ltt.g(j, j2);
        long jG2 = ltt.g(j3, j2);
        float fB = ltt.b(jG);
        float fB2 = ltt.b(jG2);
        if (fB <= 0.0f || fB2 <= 0.0f) {
            this.d = csy.a(0.0f, 0.0f);
            this.e = csy.a(0.0f, 0.0f);
            this.f = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.g = 0.0f;
        } else {
            long jE = ltt.e(jG, fB);
            this.d = jE;
            long jE2 = ltt.e(jG2, fB2);
            this.e = jE2;
            float f = lszVar != null ? lszVar.b : 0.0f;
            this.f = f;
            this.j = lszVar != null ? lszVar.c : 0.0f;
            float fA = ltt.a(jE, jE2);
            this.k = fA;
            float f2 = lub.a;
            float fSqrt = (float) Math.sqrt(1.0f - (fA * fA));
            this.g = ((double) fSqrt) > 0.001d ? (f * (fA + 1.0f)) / fSqrt : 0.0f;
        }
        this.h = csy.a(0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ltb c(float r15, float r16, long r17, long r19, long r21, long r23, long r25, float r27) {
        /*
            r0 = r16
            r1 = r17
            r3 = r19
            r5 = r25
            long r7 = defpackage.ltt.g(r3, r1)
            long r7 = defpackage.ltt.f(r7)
            long r9 = defpackage.ltt.i(r7, r15)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 + r0
            long r9 = defpackage.ltt.i(r9, r11)
            long r1 = defpackage.ltt.h(r1, r9)
            long r9 = defpackage.ltt.h(r21, r23)
            r11 = 1073741824(0x40000000, float:2.0)
            long r9 = defpackage.ltt.e(r9, r11)
            float r12 = defpackage.ltt.c(r21)
            float r13 = defpackage.ltt.c(r9)
            float r12 = defpackage.lub.b(r12, r13, r0)
            float r13 = defpackage.ltt.d(r21)
            float r9 = defpackage.ltt.d(r9)
            float r0 = defpackage.lub.b(r13, r9, r0)
            long r9 = defpackage.csy.a(r12, r0)
            float r0 = defpackage.ltt.c(r9)
            float r12 = defpackage.ltt.c(r5)
            float r0 = r0 - r12
            float r9 = defpackage.ltt.d(r9)
            float r10 = defpackage.ltt.d(r5)
            float r9 = r9 - r10
            long r9 = defpackage.lub.c(r0, r9)
            r0 = r27
            long r9 = defpackage.ltt.i(r9, r0)
            long r9 = defpackage.ltt.h(r5, r9)
            long r5 = defpackage.ltt.g(r9, r5)
            long r5 = defpackage.lub.d(r5)
            long r5 = defpackage.lub.d(r5)
            float r0 = defpackage.ltt.a(r7, r5)
            float r12 = java.lang.Math.abs(r0)
            r13 = 953267991(0x38d1b717, float:1.0E-4)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L82
        L80:
            r14 = 0
            goto La7
        L82:
            r15 = r13
            long r13 = defpackage.ltt.g(r9, r3)
            float r5 = defpackage.ltt.a(r13, r5)
            float r6 = java.lang.Math.abs(r0)
            float r12 = java.lang.Math.abs(r5)
            float r12 = r12 * r15
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 >= 0) goto L99
            goto L80
        L99:
            float r5 = r5 / r0
            long r5 = defpackage.ltt.i(r7, r5)
            long r3 = defpackage.ltt.h(r3, r5)
            csy r14 = new csy
            r14.<init>(r3)
        La7:
            if (r14 == 0) goto Lac
            long r3 = r14.a
            goto Lae
        Lac:
            r3 = r21
        Lae:
            long r5 = defpackage.ltt.i(r3, r11)
            long r5 = defpackage.ltt.h(r1, r5)
            r0 = 1077936128(0x40400000, float:3.0)
            long r5 = defpackage.ltt.e(r5, r0)
            ltb r0 = new ltb
            float r7 = defpackage.ltt.c(r1)
            float r1 = defpackage.ltt.d(r1)
            float r2 = defpackage.ltt.c(r5)
            float r5 = defpackage.ltt.d(r5)
            float r6 = defpackage.ltt.c(r3)
            float r3 = defpackage.ltt.d(r3)
            float r4 = defpackage.ltt.c(r9)
            float r8 = defpackage.ltt.d(r9)
            r9 = 8
            float[] r9 = new float[r9]
            r10 = 0
            r9[r10] = r7
            r7 = 1
            r9[r7] = r1
            r1 = 2
            r9[r1] = r2
            r1 = 3
            r9[r1] = r5
            r1 = 4
            r9[r1] = r6
            r1 = 5
            r9[r1] = r3
            r1 = 6
            r9[r1] = r4
            r1 = 7
            r9[r1] = r8
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ltw.c(float, float, long, long, long, long, long, float):ltb");
    }

    public final float a(float f) {
        if (f > b()) {
            return this.j;
        }
        float f2 = this.g;
        if (f <= f2) {
            return 0.0f;
        }
        return (this.j * (f - f2)) / (b() - f2);
    }

    public final float b() {
        return (this.j + 1.0f) * this.g;
    }
}
