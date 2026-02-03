package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgn {
    public final fdae a;
    public final fdap b;
    public final hje c = new hje();
    public final dvi d = new hgm(this);
    public final hsf e;
    public final hox f;
    public final hrg g;
    public final hgj h;
    private final fdap i;
    private final fdae j;
    private final hox k;
    private final hsf l;
    private final hox m;
    private final hrg n;

    public hgn(Object obj, fdap fdapVar, fdae fdaeVar, fdae fdaeVar2, fdap fdapVar2) {
        this.i = fdapVar;
        this.j = fdaeVar;
        this.a = fdaeVar2;
        this.b = fdapVar2;
        hsi hsiVar = hsi.a;
        this.k = new hpl(obj, hsiVar);
        fdae fdaeVar3 = new fdae() { // from class: hfx
            @Override // defpackage.fdae
            public final Object invoke() {
                hgn hgnVar = this.a;
                Object objI = hgnVar.i();
                if (objI != null) {
                    return objI;
                }
                float fB = hgnVar.b();
                return !Float.isNaN(fB) ? hgnVar.g(fB, hgnVar.h(), 0.0f) : hgnVar.h();
            }
        };
        hxn hxnVar = hrp.a;
        this.l = new hnt(fdaeVar3, null);
        this.e = new hnt(new fdae() { // from class: hfy
            @Override // defpackage.fdae
            public final Object invoke() {
                hgn hgnVar = this.a;
                Object objI = hgnVar.i();
                if (objI != null) {
                    return objI;
                }
                float fB = hgnVar.b();
                if (Float.isNaN(fB)) {
                    return hgnVar.h();
                }
                Object objH = hgnVar.h();
                hjj hjjVarP = hgnVar.p();
                float fB2 = hjjVarP.b(objH);
                if (fB2 != fB && !Float.isNaN(fB2)) {
                    if (fB2 < fB) {
                        Object objD = hjjVarP.d(fB, true);
                        if (objD != null) {
                            return objD;
                        }
                    } else {
                        Object objD2 = hjjVarP.d(fB, false);
                        if (objD2 != null) {
                            return objD2;
                        }
                    }
                }
                return objH;
            }
        }, null);
        this.n = new hpf(Float.NaN);
        new hnt(new fdae() { // from class: hfz
            @Override // defpackage.fdae
            public final Object invoke() {
                hgn hgnVar = this.a;
                float fB = hgnVar.p().b(hgnVar.h());
                float fB2 = hgnVar.p().b(hgnVar.e.a()) - fB;
                float fAbs = Math.abs(fB2);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fD = (hgnVar.d() - fB) / fB2;
                    if (fD < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fD <= 0.999999f) {
                        f = fD;
                    }
                }
                return Float.valueOf(f);
            }
        }, hsiVar);
        this.g = new hpf(0.0f);
        this.m = new hpl(null, hsiVar);
        this.f = new hpl(new hjj(fcvp.a), hsiVar);
        this.h = new hgj(this);
    }

    public final float a(float f) {
        float fC = c(f);
        float fB = Float.isNaN(b()) ? 0.0f : b();
        n(fC);
        return fC - fB;
    }

    public final float b() {
        return this.n.c();
    }

    public final float c(float f) {
        float fB = (Float.isNaN(b()) ? 0.0f : b()) + f;
        float fA = p().a();
        Float fK = fcva.K(p().a.values());
        return fddu.e(fB, fA, fK != null ? fK.floatValue() : Float.NaN);
    }

    public final float d() {
        if (Float.isNaN(b())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dod r7, defpackage.fdau r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.hgb
            if (r0 == 0) goto L13
            r0 = r9
            hgb r0 = (defpackage.hgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hgb r0 = new hgb
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r7 = move-exception
            goto L7e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r9)
            hje r9 = r6.c     // Catch: java.lang.Throwable -> L29
            hge r2 = new hge     // Catch: java.lang.Throwable -> L29
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L29
            r0.c = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r9.a(r7, r2, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 == r1) goto L7d
        L46:
            hjj r7 = r6.p()
            float r8 = r6.b()
            java.lang.Object r7 = r7.c(r8)
            if (r7 == 0) goto L7a
            float r8 = r6.b()
            hjj r9 = r6.p()
            float r9 = r9.b(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L7a
            fdap r8 = r6.b
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7a
            r6.l(r7)
        L7a:
            fctx r7 = defpackage.fctx.a
            return r7
        L7d:
            return r1
        L7e:
            hjj r8 = r6.p()
            float r9 = r6.b()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto Lb3
            float r9 = r6.b()
            hjj r0 = r6.p()
            float r0 = r0.b(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lb3
            fdap r9 = r6.b
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Lb0
            goto Lb3
        Lb0:
            r6.l(r8)
        Lb3:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgn.e(dod, fdau, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r7, defpackage.dod r8, defpackage.fdav r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.hgf
            if (r0 == 0) goto L13
            r0 = r10
            hgf r0 = (defpackage.hgf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hgf r0 = new hgf
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L50
        L2a:
            r7 = move-exception
            goto L89
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r10)
            hjj r10 = r6.p()
            boolean r10 = r10.e(r7)
            if (r10 == 0) goto Lc2
            hje r10 = r6.c     // Catch: java.lang.Throwable -> L2a
            hgi r2 = new hgi     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L2a
            r0.c = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r10.a(r8, r2, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 == r1) goto L88
        L50:
            r6.m(r5)
            hjj r7 = r6.p()
            float r8 = r6.b()
            java.lang.Object r7 = r7.c(r8)
            if (r7 == 0) goto Lc5
            float r8 = r6.b()
            hjj r9 = r6.p()
            float r9 = r9.b(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto Lc5
            fdap r8 = r6.b
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc5
            r6.l(r7)
            goto Lc5
        L88:
            return r1
        L89:
            r6.m(r5)
            hjj r8 = r6.p()
            float r9 = r6.b()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto Lc1
            float r9 = r6.b()
            hjj r10 = r6.p()
            float r10 = r10.b(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lc1
            fdap r9 = r6.b
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Lbe
            goto Lc1
        Lbe:
            r6.l(r8)
        Lc1:
            throw r7
        Lc2:
            r6.l(r7)
        Lc5:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgn.f(java.lang.Object, dod, fdav, fcxy):java.lang.Object");
    }

    public final Object g(float f, Object obj, float f2) {
        hjj hjjVarP = p();
        float fB = hjjVarP.b(obj);
        float fFloatValue = ((Number) this.j.invoke()).floatValue();
        if (fB != f && !Float.isNaN(fB)) {
            if (fB < f) {
                if (f2 >= fFloatValue) {
                    Object objD = hjjVarP.d(f, true);
                    objD.getClass();
                    return objD;
                }
                Object objD2 = hjjVarP.d(f, true);
                objD2.getClass();
                if (f >= Math.abs(fB + Math.abs(((Number) this.i.invoke(Float.valueOf(Math.abs(hjjVarP.b(objD2) - fB)))).floatValue()))) {
                    return objD2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objD3 = hjjVarP.d(f, false);
                    objD3.getClass();
                    return objD3;
                }
                Object objD4 = hjjVarP.d(f, false);
                objD4.getClass();
                float fAbs = Math.abs(fB - Math.abs(((Number) this.i.invoke(Float.valueOf(Math.abs(fB - hjjVarP.b(objD4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objD4;
                }
            }
        }
        return obj;
    }

    public final Object h() {
        return this.k.a();
    }

    public final Object i() {
        return this.m.a();
    }

    public final Object j() {
        return this.l.a();
    }

    public final Object k(float f, fcxy fcxyVar) {
        Object objH = h();
        Object objG = g(d(), objH, f);
        if (((Boolean) this.b.invoke(objG)).booleanValue()) {
            Object objB = hfw.b(this, objG, f, fcxyVar);
            if (objB == fcyl.a) {
                return objB;
            }
        } else {
            Object objB2 = hfw.b(this, objH, f, fcxyVar);
            if (objB2 == fcyl.a) {
                return objB2;
            }
        }
        return fctx.a;
    }

    public final void l(Object obj) {
        this.k.b(obj);
    }

    public final void m(Object obj) {
        this.m.b(obj);
    }

    public final void n(float f) {
        this.n.h(f);
    }

    public final boolean o() {
        return i() != null;
    }

    public final hjj p() {
        return (hjj) this.f.a();
    }
}
