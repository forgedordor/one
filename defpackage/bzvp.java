package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzvp {
    private final cpmc a;
    private final fcsu b;
    private final fdjx c;

    static {
        cdag.f(cdag.b, "cms_settings_data_storage_info_outdate_threshold_millis", 86400000L);
    }

    public bzvp(cpmc cpmcVar, aurx aurxVar, cogw cogwVar, fcsu fcsuVar, fdjx fdjxVar) {
        cpmcVar.getClass();
        aurxVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = cpmcVar;
        this.b = fcsuVar;
        this.c = fdjxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bzvn
            if (r0 == 0) goto L13
            r0 = r8
            bzvn r0 = (defpackage.bzvn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzvn r0 = new bzvn
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L59
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r8)
            ejxr r8 = defpackage.cpyl.x
            java.lang.Object r8 = r8.get()
            cczi r8 = (defpackage.cczi) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L4b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L4b:
            cpmc r8 = r6.a
            eiju r7 = r8.ah(r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)
            if (r8 == r1) goto L8f
        L59:
            eqoq r8 = (defpackage.eqoq) r8
            long r0 = r8.b
            long r7 = r8.c
            double r0 = (double) r0
            double r7 = (double) r7
            cczi r2 = defpackage.cpyl.B
            java.lang.Object r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            double r4 = r2.doubleValue()
            double r0 = r0 / r7
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 > 0) goto L74
            r7 = r3
            goto L75
        L74:
            r7 = 0
        L75:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r8.getClass()
            if (r3 == r7) goto L80
            r7 = 3
            goto L81
        L80:
            r7 = 2
        L81:
            fcsu r0 = r6.b
            java.lang.Object r0 = r0.b()
            ains r0 = (defpackage.ains) r0
            java.lang.String r1 = "Bugle.Sqs.UserStorageInfoUtil.OutCome"
            r0.e(r1, r7)
            return r8
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzvp.a(int, fcxy):java.lang.Object");
    }

    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bzvo(this, null));
    }
}
