package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avbh {
    private final cogw a;
    private final long b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final feav g;
    private double h;
    private long i;

    public avbh(cogw cogwVar, int i, Duration duration) {
        this.a = cogwVar;
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (duration.compareTo(Duration.ZERO) < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long jA = eont.a(duration);
        this.b = jA;
        double dA = eont.a(eoob.g(1)) / i;
        this.c = dA;
        double d = jA;
        double d2 = (0.5d * d) / dA;
        this.d = d2;
        double d3 = 3.0d * dA;
        double d4 = ((d + d) / (dA + d3)) + d2;
        this.e = d4;
        this.f = (d3 - dA) / (d4 - d2);
        this.g = new feaz();
        this.h = d4;
        Instant instantF = cogwVar.f();
        instantF.getClass();
        d(eonu.a(instantF));
    }

    private final double c(double d) {
        return this.c + (d * this.f);
    }

    private final void d(long j) {
        if (j > this.i) {
            long j2 = this.b;
            double d = this.e;
            this.h = Math.min(d, this.h + ((j - r0) / (j2 / d)));
            this.i = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avbf
            if (r0 == 0) goto L13
            r0 = r7
            avbf r0 = (defpackage.avbf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avbf r0 = new avbf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.fctl.b(r7)
            goto L43
        L38:
            defpackage.fctl.b(r7)
            r0.d = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 == r1) goto L52
        L43:
            r6 = r7
            j$.time.Duration r6 = (j$.time.Duration) r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = defpackage.eooa.a(r6, r0)
            if (r6 != r1) goto L51
            goto L52
        L51:
            return r7
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avbh.a(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            boolean r2 = r0 instanceof defpackage.avbg
            if (r2 == 0) goto L17
            r2 = r0
            avbg r2 = (defpackage.avbg) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            avbg r2 = new avbg
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.b
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.d
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            int r3 = r2.a
            feaz r2 = r2.e
            defpackage.fctl.b(r0)
            goto L4f
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            defpackage.fctl.b(r0)
            feav r0 = r1.g
            r4 = r0
            feaz r4 = (defpackage.feaz) r4
            r2.e = r4
            r4 = r21
            r2.a = r4
            r2.d = r5
            java.lang.Object r2 = r0.b(r2)
            if (r2 == r3) goto Lc2
            r2 = r0
            r3 = r4
        L4f:
            cogw r0 = r1.a     // Catch: java.lang.Throwable -> Lbb
            j$.time.Instant r0 = r0.f()     // Catch: java.lang.Throwable -> Lbb
            r0.getClass()     // Catch: java.lang.Throwable -> Lbb
            long r4 = defpackage.eonu.a(r0)     // Catch: java.lang.Throwable -> Lbb
            r1.d(r4)     // Catch: java.lang.Throwable -> Lbb
            long r6 = r1.i     // Catch: java.lang.Throwable -> Lbb
            double r8 = (double) r3     // Catch: java.lang.Throwable -> Lbb
            double r10 = r1.h     // Catch: java.lang.Throwable -> Lbb
            double r10 = java.lang.Math.min(r8, r10)     // Catch: java.lang.Throwable -> Lbb
            double r8 = r8 - r10
            double r12 = r1.h     // Catch: java.lang.Throwable -> Lbb
            double r14 = r1.d     // Catch: java.lang.Throwable -> Lbb
            double r12 = r12 - r14
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L8e
            double r16 = java.lang.Math.min(r12, r10)     // Catch: java.lang.Throwable -> Lbb
            double r18 = r1.c(r12)     // Catch: java.lang.Throwable -> Lbb
            double r12 = r12 - r16
            double r12 = r1.c(r12)     // Catch: java.lang.Throwable -> Lbb
            double r18 = r18 + r12
            double r18 = r18 * r16
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r18 / r12
            long r12 = (long) r12     // Catch: java.lang.Throwable -> Lbb
            double r16 = r10 - r16
            goto L92
        L8e:
            r16 = r10
            r12 = 0
        L92:
            double r14 = r1.c     // Catch: java.lang.Throwable -> Lbb
            r18 = r2
            double r2 = r14 * r16
            long r2 = (long) r2
            long r12 = r12 + r2
            double r8 = r8 * r14
            long r2 = (long) r8
            long r12 = r12 + r2
            long r2 = r1.i     // Catch: java.lang.Throwable -> Lb9
            long r2 = defpackage.eolp.g(r2, r12)     // Catch: java.lang.Throwable -> Lb9
            r1.i = r2     // Catch: java.lang.Throwable -> Lb9
            double r2 = r1.h     // Catch: java.lang.Throwable -> Lb9
            double r2 = r2 - r10
            r1.h = r2     // Catch: java.lang.Throwable -> Lb9
            long r6 = r6 - r4
            r2 = 0
            long r2 = java.lang.Math.max(r6, r2)     // Catch: java.lang.Throwable -> Lb9
            j$.time.Duration r0 = defpackage.eoob.c(r2)     // Catch: java.lang.Throwable -> Lb9
            r18.d()
            return r0
        Lb9:
            r0 = move-exception
            goto Lbe
        Lbb:
            r0 = move-exception
            r18 = r2
        Lbe:
            r18.d()
            throw r0
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avbh.b(int, fcxy):java.lang.Object");
    }
}
