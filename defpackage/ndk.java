package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ndk extends nec {
    private final long c;
    private final long d;
    private final long e;
    private final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ndk(defpackage.mcl r10, long r11, long r13) throws defpackage.ndl {
        /*
            r9 = this;
            r9.<init>(r10)
            r0 = -9223372036854775808
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L17
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 < 0) goto Le
            goto L17
        Le:
            ndl r2 = new ndl
            r3 = 2
            r4 = r11
            r6 = r13
            r2.<init>(r3, r4, r6)
            throw r2
        L17:
            r4 = r11
            r6 = r13
            int r11 = r10.b()
            r12 = 1
            r13 = 0
            if (r11 != r12) goto L85
            mck r11 = new mck
            r11.<init>()
            mck r10 = r10.p(r13, r11)
            r1 = 0
            long r3 = java.lang.Math.max(r1, r4)
            boolean r11 = r10.k
            if (r11 != 0) goto L43
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 == 0) goto L43
            boolean r11 = r10.h
            if (r11 == 0) goto L3d
            goto L43
        L3d:
            ndl r10 = new ndl
            r10.<init>(r12)
            throw r10
        L43:
            if (r0 != 0) goto L48
            long r0 = r10.m
            goto L4c
        L48:
            long r0 = java.lang.Math.max(r1, r6)
        L4c:
            long r5 = r10.m
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L62
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 > 0) goto L5c
            goto L5d
        L5c:
            r0 = r5
        L5d:
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 <= 0) goto L62
            r3 = r0
        L62:
            r9.c = r3
            r9.d = r0
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r11 != 0) goto L6c
            r3 = r7
            goto L6e
        L6c:
            long r3 = r0 - r3
        L6e:
            r9.e = r3
            boolean r14 = r10.i
            if (r14 == 0) goto L81
            if (r11 == 0) goto L82
            long r10 = r10.m
            int r14 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r14 == 0) goto L81
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 != 0) goto L81
            goto L82
        L81:
            r12 = r13
        L82:
            r9.f = r12
            return
        L85:
            ndl r10 = new ndl
            r10.<init>(r13)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndk.<init>(mcl, long, long):void");
    }

    @Override // defpackage.nec, defpackage.mcl
    public final mcj d(int i, mcj mcjVar, boolean z) {
        this.b.d(0, mcjVar, z);
        long j = mcjVar.e - this.c;
        long j2 = this.e;
        mcjVar.n(mcjVar.a, mcjVar.b, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j);
        return mcjVar;
    }

    @Override // defpackage.nec, defpackage.mcl
    public final mck e(int i, mck mckVar, long j) {
        this.b.e(0, mckVar, 0L);
        long j2 = mckVar.p;
        long j3 = this.c;
        mckVar.p = j2 + j3;
        mckVar.m = this.e;
        mckVar.i = this.f;
        long j4 = mckVar.l;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            mckVar.l = jMax;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            mckVar.l = jMax;
            mckVar.l = jMax - j3;
        }
        String str = mgb.a;
        long j6 = mckVar.e;
        long jB = mgb.B(j3);
        if (j6 != -9223372036854775807L) {
            mckVar.e = j6 + jB;
        }
        long j7 = mckVar.f;
        if (j7 != -9223372036854775807L) {
            mckVar.f = j7 + jB;
        }
        return mckVar;
    }
}
