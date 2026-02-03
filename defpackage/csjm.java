package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csjm {
    public final cmfo a;
    private final fcsu b;
    private final fcyh c;

    public csjm(fcsu fcsuVar, fcsu fcsuVar2, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcyhVar.getClass();
        this.b = fcsuVar2;
        this.c = fcyhVar;
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.CROSS_COUNTRY_HIDING_SETTINGS);
        cmggVarC.f(csjo.a);
        this.a = cmgkVar.a(cmggVarC.a());
    }

    public final Object a(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c), new csji(null, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r6, boolean r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.csjk
            if (r0 == 0) goto L13
            r0 = r8
            csjk r0 = (defpackage.csjk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            csjk r0 = new csjk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            boolean r7 = r0.b
            boolean r6 = r0.a
            defpackage.fctl.b(r8)
            goto L4e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.fctl.b(r8)
            fcyh r8 = r5.c
            fcyh r8 = defpackage.eicg.a(r8)
            csjj r2 = new csjj
            r2.<init>(r4, r5, r6)
            r0.a = r6
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 == r1) goto L66
        L4e:
            if (r7 == 0) goto L63
            fcsu r7 = r5.b
            java.lang.Object r7 = r7.b()
            csjh r7 = (defpackage.csjh) r7
            fdjx r8 = r7.b
            csjg r0 = new csjg
            r0.<init>(r7, r6, r4)
            r6 = 3
            defpackage.auvw.m(r8, r4, r0, r6)
        L63:
            fctx r6 = defpackage.fctx.a
            return r6
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csjm.b(boolean, boolean, fcxy):java.lang.Object");
    }
}
