package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drv<T> extends duu {
    public dsd a;
    public dwm b;
    public dvj c;
    public dvj d;
    private kio l;

    public drv(dsd dsdVar, dwm dwmVar, dvj dvjVar) {
        super(dro.a, true, null, dwmVar);
        this.a = dsdVar;
        this.b = dwmVar;
        this.c = dvjVar;
    }

    @Override // defpackage.duu, defpackage.icr
    public final void dM() {
        dV();
        if (this.C) {
            kio kioVarG = jbg.g(this);
            kio kioVar = this.l;
            if (kioVar == null || !fdbq.f(kioVar, kioVarG)) {
                this.l = kioVarG;
                j(this.c);
            }
        }
    }

    @Override // defpackage.icr
    public final void dU() {
        j(this.c);
    }

    @Override // defpackage.duu
    public final Object e(fdat fdatVar, fcxy fcxyVar) {
        Object objL = dsd.l(this.a, new drq(fdatVar, this, null), fcxyVar);
        return objL == fcyl.a ? objL : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(float r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.drr
            if (r0 == 0) goto L13
            r0 = r8
            drr r0 = (defpackage.drr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            drr r0 = new drr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            if (r2 == 0) goto L38
            r7 = 1
            if (r2 == r7) goto L34
            if (r2 != r3) goto L2c
            fdcf r7 = r0.d
            defpackage.fctl.b(r8)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r8)
            return r8
        L38:
            defpackage.fctl.b(r8)
            fdcf r8 = new fdcf
            r8.<init>()
            r8.a = r7
            dsd r2 = r6.a
            drt r4 = new drt
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = defpackage.dsd.l(r2, r4, r0)
            if (r7 == r1) goto L5d
            r7 = r8
        L55:
            float r7 = r7.a
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drv.g(float, fcxy):java.lang.Object");
    }

    @Override // defpackage.duu
    public final void i(long j) {
        if (this.C) {
            fdil.d(E(), null, null, new dru(this, j, null), 3);
        }
    }

    public final void j(dvj dvjVar) {
        if (dvjVar == null) {
            ddz ddzVar = drd.a;
            ddz ddzVar2 = drd.a;
            fdap fdapVar = drd.b;
            kio kioVarG = jbg.g(this);
            this.l = kioVarG;
            dvjVar = dro.a(this.a, kioVarG, fdapVar, ddzVar2);
        }
        this.d = dvjVar;
    }

    public final boolean k() {
        return jbg.h(this) == kji.b && this.b == dwm.b;
    }

    @Override // defpackage.duu
    public final boolean n() {
        return this.a.e() != null;
    }

    @Override // defpackage.duu
    public final void h(long j) {
    }
}
