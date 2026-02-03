package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecu extends icr implements jcd {
    public float a;
    public boolean b;

    public ecu(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    private final long a(long j, boolean z) {
        int iA = kil.a(j);
        if (iA == Integer.MAX_VALUE) {
            return 0L;
        }
        int iRound = Math.round(iA * this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || ecs.b(j, iRound, iA)) {
            return (iRound << 32) | iA;
        }
        return 0L;
    }

    private final long i(long j, boolean z) {
        int iB = kil.b(j);
        if (iB == Integer.MAX_VALUE) {
            return 0L;
        }
        int iRound = Math.round(iB / this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (z && !ecs.b(j, iB, iRound)) {
            return 0L;
        }
        return (iB << 32) | (iRound & 4294967295L);
    }

    private final long j(long j, boolean z) {
        int iC = kil.c(j);
        int iRound = Math.round(iC * this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || ecs.b(j, iRound, iC)) {
            return (iRound << 32) | iC;
        }
        return 0L;
    }

    private final long k(long j, boolean z) {
        int iD = kil.d(j);
        int iRound = Math.round(iD / this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (z && !ecs.b(j, iD, iRound)) {
            return 0L;
        }
        return (iD << 32) | (iRound & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    @Override // defpackage.jcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ixn b(defpackage.ixp r8, defpackage.ixk r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.b
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L59
            long r5 = r7.i(r10, r2)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.a(r10, r2)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.k(r10, r2)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.j(r10, r2)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.i(r10, r1)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.a(r10, r1)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.k(r10, r1)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.j(r10, r1)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            goto La9
        L59:
            long r5 = r7.a(r10, r2)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.i(r10, r2)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.j(r10, r2)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.k(r10, r2)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.a(r10, r1)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.i(r10, r1)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.j(r10, r1)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
            long r5 = r7.k(r10, r1)
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 == 0) goto Laa
        La9:
            r5 = r3
        Laa:
            boolean r0 = defpackage.kjg.e(r5, r3)
            if (r0 != 0) goto Lc0
            r10 = 32
            long r10 = r5 >> r10
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r10 = (int) r10
            int r11 = (int) r0
            long r10 = defpackage.kik.c(r10, r11)
        Lc0:
            iyl r9 = r9.e(r10)
            int r10 = r9.a
            int r11 = r9.b
            ect r0 = new ect
            r0.<init>()
            ixn r8 = defpackage.ixo.b(r8, r10, r11, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecu.b(ixp, ixk, long):ixn");
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return ivtVar.a(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i / this.a);
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return ivtVar.b(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i * this.a);
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return ivtVar.c(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i / this.a);
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return ivtVar.d(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i * this.a);
    }
}
