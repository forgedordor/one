package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmx extends icr implements jfv {
    public ebk a;
    private ebh b;

    public dmx(ebk ebkVar) {
        this.a = ebkVar;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ long a() {
        return jge.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dmt
            if (r0 == 0) goto L13
            r0 = r5
            dmt r0 = (defpackage.dmt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmt r0 = new dmt
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ebh r0 = r0.d
            defpackage.fctl.b(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            ebh r5 = r4.b
            if (r5 != 0) goto L4e
            ebh r5 = new ebh
            r5.<init>()
            ebk r2 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 == r1) goto L4d
            r0 = r5
        L4a:
            r4.b = r0
            goto L4e
        L4d:
            return r1
        L4e:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmx.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.icr
    public final /* synthetic */ void dM() {
        jfu.a(this);
    }

    @Override // defpackage.jfv
    public final void dV() {
        f();
    }

    @Override // defpackage.jfv
    public final void dW(irs irsVar, iru iruVar, long j) {
        if (iruVar == iru.b) {
            int i = irsVar.e;
            if (irw.a(i, 4)) {
                fdil.d(E(), null, null, new dmv(this, null), 3);
            } else if (irw.a(i, 5)) {
                fdil.d(E(), null, null, new dmw(this, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dmu
            if (r0 == 0) goto L13
            r0 = r5
            dmu r0 = (defpackage.dmu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmu r0 = new dmu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ebh r5 = r4.b
            if (r5 == 0) goto L4a
            ebi r2 = new ebi
            r2.<init>(r5)
            ebk r5 = r4.a
            r0.c = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 == r1) goto L49
        L45:
            r5 = 0
            r4.b = r5
            goto L4a
        L49:
            return r1
        L4a:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmx.e(fcxy):java.lang.Object");
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void eb() {
        jfu.b(this);
    }

    public final void f() {
        ebh ebhVar = this.b;
        if (ebhVar != null) {
            this.a.b(new ebi(ebhVar));
            this.b = null;
        }
    }

    @Override // defpackage.icr
    public final void s() {
        f();
    }

    @Override // defpackage.jfv
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void A() {
    }
}
