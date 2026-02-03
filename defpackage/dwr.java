package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwr implements dwn, kio {
    private final /* synthetic */ kio a;
    private boolean b;
    private boolean c;
    private final feav d = new feaz();

    public dwr(kio kioVar) {
        this.a = kioVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dwo
            if (r0 == 0) goto L13
            r0 = r5
            dwo r0 = (defpackage.dwo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dwo r0 = new dwo
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 == r1) goto L4c
        L3a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L45
            fctx r5 = defpackage.fctx.a
            return r5
        L45:
            dvo r5 = new dvo
            r0 = 0
            r5.<init>(r0)
            throw r5
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwr.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dwq
            if (r0 == 0) goto L13
            r0 = r5
            dwq r0 = (defpackage.dwq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dwq r0 = new dwq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            boolean r5 = r4.b
            if (r5 != 0) goto L4b
            boolean r5 = r4.c
            if (r5 != 0) goto L4b
            feav r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = defpackage.feau.a(r5, r0)
            if (r5 == r1) goto L4a
        L44:
            feav r5 = r4.d
            defpackage.feau.c(r5)
            goto L4b
        L4a:
            return r1
        L4b:
            boolean r5 = r4.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwr.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.a.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.a.ee();
    }

    @Override // defpackage.kiy
    public final float eg(long j) {
        return kix.a(this.a, j);
    }

    @Override // defpackage.kio
    public final float eh(float f) {
        return kin.a(this.a, f);
    }

    @Override // defpackage.kio
    public final float el(int i) {
        return kin.b(this.a, i);
    }

    @Override // defpackage.kio
    public final float em(long j) {
        return kin.c(this.a, j);
    }

    @Override // defpackage.kio
    public final float en(float f) {
        return kin.d(this.a, f);
    }

    @Override // defpackage.kio
    public final int eo(long j) {
        return kin.e(this.a, j);
    }

    @Override // defpackage.kio
    public final int ep(float f) {
        return kin.f(this.a, f);
    }

    @Override // defpackage.kio
    public final long eq(long j) {
        return kin.g(this.a, j);
    }

    @Override // defpackage.kio
    public final long er(long j) {
        return kin.h(this.a, j);
    }

    @Override // defpackage.kiy
    public final long es(float f) {
        return kix.b(this.a, f);
    }

    @Override // defpackage.kio
    public final long et(float f) {
        return kin.i(this.a, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dwp
            if (r0 == 0) goto L13
            r0 = r5
            dwp r0 = (defpackage.dwp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dwp r0 = new dwp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            feav r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = defpackage.feau.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r5 = 0
            r4.b = r5
            r4.c = r5
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwr.p(fcxy):java.lang.Object");
    }

    public final void q() {
        this.c = true;
        feav feavVar = this.d;
        if (feavVar.a()) {
            feavVar.d();
        }
    }

    public final void r() {
        this.b = true;
        feav feavVar = this.d;
        if (feavVar.a()) {
            feavVar.d();
        }
    }
}
