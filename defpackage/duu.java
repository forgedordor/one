package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class duu extends jbi implements jfv, jbr {
    private eba a;
    private ith b;
    private ebk c;
    public dwm e;
    public fdap f;
    public boolean g;
    public fdoa h;
    public boolean i;
    public long j = 0;
    public ivy k;

    public duu(fdap fdapVar, boolean z, ebk ebkVar, dwm dwmVar) {
        this.e = dwmVar;
        this.f = fdapVar;
        this.g = z;
        this.c = ebkVar;
    }

    public final void B() {
        eba ebaVar = this.a;
        if (ebaVar != null) {
            ebk ebkVar = this.c;
            if (ebkVar != null) {
                ebkVar.b(new eaz(ebaVar));
            }
            this.a = null;
        }
    }

    public final void C(fdap fdapVar, boolean z, ebk ebkVar, dwm dwmVar, boolean z2) {
        this.f = fdapVar;
        if (this.g != z) {
            this.g = z;
            z2 = true;
            if (!z) {
                B();
                ith ithVar = this.b;
                if (ithVar != null) {
                    M(ithVar);
                }
                this.b = null;
            }
        }
        if (!fdbq.f(this.c, ebkVar)) {
            B();
            this.c = ebkVar;
        }
        if (this.e != dwmVar) {
            this.e = dwmVar;
        } else if (!z2) {
            return;
        }
        ith ithVar2 = this.b;
        if (ithVar2 != null) {
            ithVar2.r();
        }
    }

    @Override // defpackage.jfv
    public final /* synthetic */ long a() {
        return jge.a;
    }

    @Override // defpackage.icr
    public /* synthetic */ void dM() {
        jfu.a(this);
    }

    @Override // defpackage.jbr
    public final void dR(ivy ivyVar) {
        this.k = ivyVar;
    }

    @Override // defpackage.jfv
    public final void dV() {
        ith ithVar = this.b;
        if (ithVar != null) {
            ithVar.dV();
        }
    }

    @Override // defpackage.jfv
    public void dW(irs irsVar, iru iruVar, long j) {
        if (this.g && this.b == null) {
            duo duoVar = new duo(this);
            irs irsVar2 = itf.a;
            ito itoVar = new ito(null, null, null, duoVar);
            N(itoVar);
            this.b = itoVar;
        }
        ith ithVar = this.b;
        if (ithVar != null) {
            ithVar.dW(irsVar, iruVar, j);
        }
    }

    public abstract Object e(fdat fdatVar, fcxy fcxyVar);

    @Override // defpackage.jfv
    public final /* synthetic */ void eb() {
        jfu.b(this);
    }

    public abstract void h(long j);

    public abstract void i(long j);

    public abstract boolean n();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dup
            if (r0 == 0) goto L13
            r0 = r6
            dup r0 = (defpackage.dup) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dup r0 = new dup
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            eba r6 = r5.a
            if (r6 == 0) goto L4c
            ebk r2 = r5.c
            if (r2 == 0) goto L49
            eaz r4 = new eaz
            r4.<init>(r6)
            r0.c = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 == r1) goto L48
            goto L49
        L48:
            return r1
        L49:
            r6 = 0
            r5.a = r6
        L4c:
            r0 = 0
            r5.i(r0)
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duu.q(fcxy):java.lang.Object");
    }

    @Override // defpackage.icr
    public final void s() {
        this.i = false;
        B();
        this.k = null;
        this.j = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r2.a(r8, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.dtg r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.duq
            if (r0 == 0) goto L13
            r0 = r8
            duq r0 = (defpackage.duq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            duq r0 = new duq
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            eba r7 = r0.e
            dtg r0 = r0.d
            defpackage.fctl.b(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            dtg r7 = r0.d
            defpackage.fctl.b(r8)
            goto L56
        L3c:
            defpackage.fctl.b(r8)
            eba r8 = r6.a
            if (r8 == 0) goto L56
            ebk r2 = r6.c
            if (r2 == 0) goto L56
            eaz r5 = new eaz
            r5.<init>(r8)
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 == r1) goto L6c
        L56:
            eba r8 = new eba
            r8.<init>()
            ebk r2 = r6.c
            if (r2 == 0) goto L6d
            r0.d = r7
            r0.e = r8
            r0.c = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 == r1) goto L6c
            goto L6d
        L6c:
            return r1
        L6d:
            r0 = r7
            r7 = r8
        L6f:
            r6.a = r7
            long r7 = r0.a
            r6.h(r7)
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duu.v(dtg, fcxy):java.lang.Object");
    }

    @Override // defpackage.jfv
    public final /* synthetic */ boolean y() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.dth r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dur
            if (r0 == 0) goto L13
            r0 = r7
            dur r0 = (defpackage.dur) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dur r0 = new dur
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dth r6 = r0.d
            defpackage.fctl.b(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            eba r7 = r5.a
            if (r7 == 0) goto L50
            ebk r2 = r5.c
            if (r2 == 0) goto L4d
            ebb r4 = new ebb
            r4.<init>(r7)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 == r1) goto L4c
            goto L4d
        L4c:
            return r1
        L4d:
            r7 = 0
            r5.a = r7
        L50:
            long r6 = r6.a
            r5.i(r6)
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duu.z(dth, fcxy):java.lang.Object");
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void A() {
    }
}
