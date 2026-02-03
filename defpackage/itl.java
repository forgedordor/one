package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itl implements ire, kio, fcxy {
    public fdis a;
    final /* synthetic */ ito b;
    private final /* synthetic */ ito c;
    private final fcxy d;
    private iru e = iru.b;
    private final fcyh f = fcyi.a;

    public itl(ito itoVar, fcxy fcxyVar) {
        this.b = itoVar;
        this.c = itoVar;
        this.d = fcxyVar;
    }

    @Override // defpackage.ire
    public final long a() {
        ito itoVar = this.b;
        long jH = kin.h(itoVar, itoVar.b().g());
        long j = itoVar.h;
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jH >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jH & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    @Override // defpackage.ire
    public final long b() {
        return this.b.h;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.c.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.c.ee();
    }

    @Override // defpackage.kiy
    public final float eg(long j) {
        return kix.a(this.c, j);
    }

    @Override // defpackage.kio
    public final float eh(float f) {
        return kin.a(this.c, f);
    }

    @Override // defpackage.kio
    public final float el(int i) {
        return kin.b(this.c, i);
    }

    @Override // defpackage.kio
    public final float em(long j) {
        return kin.c(this.c, j);
    }

    @Override // defpackage.kio
    public final float en(float f) {
        return kin.d(this.c, f);
    }

    @Override // defpackage.kio
    public final int eo(long j) {
        return kin.e(this.c, j);
    }

    @Override // defpackage.kio
    public final int ep(float f) {
        return kin.f(this.c, f);
    }

    @Override // defpackage.kio
    public final long eq(long j) {
        return kin.g(this.c, j);
    }

    @Override // defpackage.kio
    public final long er(long j) {
        return kin.h(this.c, j);
    }

    @Override // defpackage.kiy
    public final long es(float f) {
        return kix.b(this.c, f);
    }

    @Override // defpackage.kio
    public final long et(float f) {
        return kin.i(this.c, f);
    }

    @Override // defpackage.ire
    public final irs p() {
        return this.b.e;
    }

    @Override // defpackage.ire
    public final jou q() {
        return this.b.b();
    }

    @Override // defpackage.ire
    public final Object r(iru iruVar, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        this.e = iruVar;
        this.a = fdiuVar;
        return fdiuVar.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fdlr] */
    /* JADX WARN: Type inference failed for: r7v4, types: [fdlr] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [fdat] */
    @Override // defpackage.ire
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(long r7, defpackage.fdat r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.iti
            if (r0 == 0) goto L13
            r0 = r10
            iti r0 = (defpackage.iti) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            iti r0 = new iti
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L29
            goto L67
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            fdis r10 = r6.a
            if (r10 == 0) goto L4c
            irv r2 = new irv
            r2.<init>(r7)
            java.lang.Object r2 = defpackage.fctl.a(r2)
            r10.w(r2)
        L4c:
            ito r10 = r6.b
            fdjx r10 = r10.E()
            itj r2 = new itj
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            fdlr r7 = defpackage.fdil.d(r10, r4, r4, r2, r7)
            r0.a = r7     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.a(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 == r1) goto L6d
        L67:
            irf r8 = defpackage.irf.a
            r7.t(r8)
            return r10
        L6d:
            return r1
        L6e:
            irf r9 = defpackage.irf.a
            r7.t(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itl.s(long, fdat, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ire
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(long r5, defpackage.fdat r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.itk
            if (r0 == 0) goto L13
            r0 = r8
            itk r0 = (defpackage.itk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            itk r0 = new itk
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)     // Catch: defpackage.irv -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r8)
            r0.c = r3     // Catch: defpackage.irv -> L3c
            java.lang.Object r5 = r4.s(r5, r7, r0)     // Catch: defpackage.irv -> L3c
            if (r5 != r1) goto L3b
            return r1
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itl.t(long, fdat, fcxy):java.lang.Object");
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return this.f;
    }

    public final void v(irs irsVar, iru iruVar) {
        fdis fdisVar;
        if (iruVar != this.e || (fdisVar = this.a) == null) {
            return;
        }
        this.a = null;
        fdisVar.w(irsVar);
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) {
        ito itoVar = this.b;
        synchronized (itoVar.g) {
            itoVar.f.m(this);
        }
        this.d.w(obj);
    }
}
