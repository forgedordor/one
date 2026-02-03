package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fda {
    public final jyi a;
    public ivy b = null;
    public ivy c;

    public fda(jyi jyiVar, ivy ivyVar) {
        this.a = jyiVar;
        this.c = ivyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long f(long r7) {
        /*
            r6 = this;
            ivy r0 = r6.b
            if (r0 == 0) goto L19
            boolean r1 = r0.u()
            if (r1 == 0) goto L15
            ivy r1 = r6.c
            if (r1 == 0) goto L13
            ihu r0 = defpackage.ivx.a(r1, r0)
            goto L17
        L13:
            r0 = 0
            goto L17
        L15:
            ihu r0 = defpackage.ihu.a
        L17:
            if (r0 != 0) goto L1b
        L19:
            ihu r0 = defpackage.ihu.a
        L1b:
            r1 = 32
            long r2 = r7 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r4 = r0.b
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L2b
            goto L3a
        L2b:
            float r4 = r0.d
            float r3 = java.lang.Float.intBitsToFloat(r2)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L36
            goto L3a
        L36:
            float r4 = java.lang.Float.intBitsToFloat(r2)
        L3a:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            float r5 = r0.c
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L4c
            goto L5a
        L4c:
            float r5 = r0.e
            float r8 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L5a
            float r5 = java.lang.Float.intBitsToFloat(r7)
        L5a:
            int r7 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r7
            int r0 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r0
            long r7 = r7 << r1
            long r0 = r4 & r2
            long r7 = r7 | r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fda.f(long):long");
    }

    public final int a(long j, boolean z) {
        if (z) {
            j = f(j);
        }
        return this.a.k(b(j));
    }

    public final long b(long j) {
        ivy ivyVar;
        ivy ivyVar2 = this.b;
        if (ivyVar2 == null) {
            return j;
        }
        if (true != ivyVar2.u()) {
            ivyVar2 = null;
        }
        if (ivyVar2 == null || (ivyVar = this.c) == null) {
            return j;
        }
        ivy ivyVar3 = true == ivyVar.u() ? ivyVar : null;
        return ivyVar3 != null ? ivyVar2.h(ivyVar3, j) : j;
    }

    public final long c(long j) {
        ivy ivyVar;
        ivy ivyVar2 = this.b;
        if (ivyVar2 == null) {
            return j;
        }
        if (true != ivyVar2.u()) {
            ivyVar2 = null;
        }
        if (ivyVar2 == null || (ivyVar = this.c) == null) {
            return j;
        }
        ivy ivyVar3 = true == ivyVar.u() ? ivyVar : null;
        return ivyVar3 != null ? ivyVar3.h(ivyVar2, j) : j;
    }

    public final boolean d(long j) {
        long jB = b(f(j));
        jyi jyiVar = this.a;
        int i = jyiVar.i(Float.intBitsToFloat((int) (4294967295L & jB)));
        int i2 = (int) (jB >> 32);
        return Float.intBitsToFloat(i2) >= jyiVar.c(i) && Float.intBitsToFloat(i2) <= jyiVar.d(i);
    }
}
