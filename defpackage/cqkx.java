package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqkx {
    private final fcsu a;
    private final fdjx b;
    private final eizx c;
    private final fctc d;

    public cqkx(final fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar2;
        this.b = fdjxVar;
        this.c = new eizx();
        this.d = fctd.a(new fdae() { // from class: cqkj
            @Override // defpackage.fdae
            public final Object invoke() {
                cmgk cmgkVar = (cmgk) fcsuVar.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.DEBUG_SETTINGS);
                cmggVarC.f(cbpt.a);
                cmggVarC.c(new Supplier() { // from class: cqkd
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new evtj("Invalid proto data");
                    }
                });
                return cmgkVar.a(cmggVarC.a());
            }
        });
    }

    private final cmfo k() {
        return (cmfo) this.d.a();
    }

    private final void l(cbpt cbptVar) {
        ejaa.a(this.b, this.c, new cqkn(this, cbptVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqkm
            if (r0 == 0) goto L13
            r0 = r5
            cqkm r0 = (defpackage.cqkm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqkm r0 = new cqkm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            cmfo r5 = r4.k()
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqko
            if (r0 == 0) goto L13
            r0 = r6
            cqko r0 = (defpackage.cqko) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqko r0 = new cqko
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqkf r2 = new cqkf
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.b(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqkp
            if (r0 == 0) goto L13
            r0 = r6
            cqkp r0 = (defpackage.cqkp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqkp r0 = new cqkp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqkk r2 = new cqkk
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.c(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqkq
            if (r0 == 0) goto L13
            r0 = r6
            cqkq r0 = (defpackage.cqkq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqkq r0 = new cqkq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqkg r2 = new cqkg
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.d(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqkr
            if (r0 == 0) goto L13
            r0 = r6
            cqkr r0 = (defpackage.cqkr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqkr r0 = new cqkr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqkc r2 = new cqkc
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.e(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(final boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqks
            if (r0 == 0) goto L13
            r0 = r6
            cqks r0 = (defpackage.cqks) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqks r0 = new cqks
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqkh r2 = new cqkh
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.f(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(final boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqkt
            if (r0 == 0) goto L13
            r0 = r6
            cqkt r0 = (defpackage.cqkt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqkt r0 = new cqkt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqkb r2 = new cqkb
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.g(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(final boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqku
            if (r0 == 0) goto L13
            r0 = r6
            cqku r0 = (defpackage.cqku) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqku r0 = new cqku
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqke r2 = new cqke
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.h(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(final boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqkv
            if (r0 == 0) goto L13
            r0 = r6
            cqkv r0 = (defpackage.cqkv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqkv r0 = new cqkv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqki r2 = new cqki
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.i(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(final boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cqkw
            if (r0 == 0) goto L13
            r0 = r6
            cqkw r0 = (defpackage.cqkw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqkw r0 = new cqkw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.k()
            cqkl r2 = new cqkl
            r2.<init>()
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            cbpt r6 = (defpackage.cbpt) r6
            r6.getClass()
            r4.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqkx.j(boolean, fcxy):java.lang.Object");
    }
}
