package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egs extends icr implements jcd {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public egs(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long a(defpackage.kio r7) {
        /*
            r6 = this;
            float r0 = r6.c
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.c
            int r0 = r7.ep(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.d
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.d
            int r3 = r7.ep(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.a
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L40
            float r4 = r6.a
            int r4 = r7.ep(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 != r1) goto L41
        L40:
            r4 = r2
        L41:
            float r5 = r6.b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.b
            int r7 = r7.ep(r5)
            if (r7 >= 0) goto L52
            r7 = r2
        L52:
            if (r7 <= r3) goto L55
            r7 = r3
        L55:
            if (r7 != r1) goto L58
            goto L59
        L58:
            r2 = r7
        L59:
            long r0 = defpackage.kim.d(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egs.a(kio):long");
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        int iD;
        int iB;
        int iC;
        int iA;
        long jD;
        long jA = a(ixpVar);
        if (this.e) {
            jD = kim.f(j, jA);
        } else {
            if (Float.isNaN(this.a)) {
                iD = kil.d(j);
                int iB2 = kil.b(jA);
                if (iD > iB2) {
                    iD = iB2;
                }
            } else {
                iD = kil.d(jA);
            }
            if (Float.isNaN(this.c)) {
                iB = kil.b(j);
                int iD2 = kil.d(jA);
                if (iB < iD2) {
                    iB = iD2;
                }
            } else {
                iB = kil.b(jA);
            }
            if (Float.isNaN(this.b)) {
                iC = kil.c(j);
                int iA2 = kil.a(jA);
                if (iC > iA2) {
                    iC = iA2;
                }
            } else {
                iC = kil.c(jA);
            }
            if (Float.isNaN(this.d)) {
                iA = kil.a(j);
                int iC2 = kil.c(jA);
                if (iA < iC2) {
                    iA = iC2;
                }
            } else {
                iA = kil.a(jA);
            }
            jD = kim.d(iD, iB, iC, iA);
        }
        final iyl iylVarE = ixkVar.e(jD);
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: egr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk.A((iyk) obj, iylVarE, 0, 0);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        long jA = a(ivuVar);
        if (kil.j(jA)) {
            return kil.a(jA);
        }
        if (!this.e) {
            i = kim.c(jA, i);
        }
        return kim.b(jA, ivtVar.a(i));
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        long jA = a(ivuVar);
        if (kil.k(jA)) {
            return kil.b(jA);
        }
        if (!this.e) {
            i = kim.b(jA, i);
        }
        return kim.c(jA, ivtVar.b(i));
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        long jA = a(ivuVar);
        if (kil.j(jA)) {
            return kil.a(jA);
        }
        if (!this.e) {
            i = kim.c(jA, i);
        }
        return kim.b(jA, ivtVar.c(i));
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        long jA = a(ivuVar);
        if (kil.k(jA)) {
            return kil.b(jA);
        }
        if (!this.e) {
            i = kim.b(jA, i);
        }
        return kim.c(jA, ivtVar.d(i));
    }
}
