package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlu extends dkd implements jbd {
    public fdae j;
    public boolean k;
    private final cun l;
    private final cun m;

    public dlu(fdae fdaeVar, fdae fdaeVar2, ebk ebkVar, dnk dnkVar, boolean z, boolean z2, jrw jrwVar) {
        super(ebkVar, dnkVar, z, z2, null, jrwVar, fdaeVar);
        this.j = fdaeVar2;
        this.k = true;
        int i = ctv.a;
        this.l = new cun((byte[]) null);
        this.m = new cun((byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C() {
        /*
            r23 = this;
            r0 = r23
            cun r1 = r0.l
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 0
            r13 = 8
            if (r4 < 0) goto L4b
            r14 = r12
            r15 = 128(0x80, double:6.32E-322)
        L19:
            r5 = r3[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = r14 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r12
        L2d:
            if (r8 >= r7) goto L44
            long r19 = r5 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto L40
            int r19 = r14 << 3
            int r19 = r19 + r8
            r19 = r2[r19]
            fdlr r19 = (defpackage.fdlr) r19
            defpackage.fdlp.a(r19)
        L40:
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L2d
        L44:
            if (r7 != r13) goto L4f
        L46:
            if (r14 == r4) goto L4f
            int r14 = r14 + 1
            goto L19
        L4b:
            r15 = 128(0x80, double:6.32E-322)
            r17 = 255(0xff, double:1.26E-321)
        L4f:
            r1.e()
            cun r1 = r0.m
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r12
        L5e:
            r6 = r3[r5]
            r8 = r9
            r19 = r10
            long r9 = ~r6
            long r9 = r9 << r8
            long r9 = r9 & r6
            long r9 = r9 & r19
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 == 0) goto L8b
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r12
        L74:
            if (r10 >= r9) goto L89
            long r21 = r6 & r17
            int r11 = (r21 > r15 ? 1 : (r21 == r15 ? 0 : -1))
            if (r11 < 0) goto L80
            long r6 = r6 >> r13
            int r10 = r10 + 1
            goto L74
        L80:
            int r1 = r5 << 3
            int r1 = r1 + r10
            r1 = r2[r1]
            dlr r1 = (defpackage.dlr) r1
            r1 = 0
            throw r1
        L89:
            if (r9 != r13) goto L93
        L8b:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            r9 = r8
            r10 = r19
            goto L5e
        L93:
            r1.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlu.C():void");
    }

    @Override // defpackage.dkd
    protected final void B(KeyEvent keyEvent) {
        cun cunVar = this.l;
        long jB = iqj.b(keyEvent);
        if (cunVar.a(jB) != null) {
            fdlr fdlrVar = (fdlr) cunVar.a(jB);
            boolean z = false;
            if (fdlrVar != null) {
                if (fdlrVar.v()) {
                    fdlrVar.t(null);
                } else {
                    z = true;
                }
            }
            cunVar.d(jB);
            if (z) {
                return;
            }
        }
        ((dkd) this).c.invoke();
    }

    @Override // defpackage.dkd
    public final Object b(isn isnVar, fcxy fcxyVar) {
        Object objD = dzm.d(isnVar, null, (!((dkd) this).b || this.j == null) ? null : new fdap() { // from class: dlo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dlu dluVar = this.a;
                fdae fdaeVar = dluVar.j;
                if (fdaeVar != null) {
                    fdaeVar.invoke();
                }
                if (dluVar.k) {
                    ((iqa) jbe.a(dluVar, jmh.h)).a(0);
                }
                return fctx.a;
            }
        }, new dls(this, null), new fdap() { // from class: dlp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dlu dluVar = this.a;
                if (((dkd) dluVar).b) {
                    ((dkd) dluVar).c.invoke();
                }
                return fctx.a;
            }
        }, fcxyVar);
        return objD == fcyl.a ? objD : fctx.a;
    }

    @Override // defpackage.icr
    public final void dT() {
        C();
    }

    @Override // defpackage.dkd
    public final void g(jto jtoVar) {
        if (this.j != null) {
            jtk.i(jtoVar, null, new fdae() { // from class: dlq
                @Override // defpackage.fdae
                public final Object invoke() {
                    fdae fdaeVar = this.a.j;
                    if (fdaeVar != null) {
                        fdaeVar.invoke();
                    }
                    return true;
                }
            });
        }
    }

    @Override // defpackage.dkd
    protected final void k() {
        C();
    }

    @Override // defpackage.dkd
    protected final boolean v(KeyEvent keyEvent) {
        long jB = iqj.b(keyEvent);
        boolean z = false;
        if (this.j != null) {
            cun cunVar = this.l;
            if (cunVar.a(jB) == null) {
                cunVar.f(jB, fdil.d(E(), null, null, new dlt(this, null), 3));
                z = true;
            }
        }
        if (((dlr) this.m.a(jB)) == null) {
            return z;
        }
        throw null;
    }
}
