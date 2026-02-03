package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cihj implements ccyz {
    public final fcsu a;
    private final fdjx b;
    private final fcsu c;
    private final fcsu d;
    private final lkb e;

    public cihj(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, lkb lkbVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        lkbVar.getClass();
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.a = fcsuVar3;
        this.e = lkbVar;
    }

    @Override // defpackage.ccyz
    public final void a() {
        if (((Boolean) this.c.b()).booleanValue()) {
            auvw.m(this.b, null, new cihi(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cihh
            if (r0 == 0) goto L13
            r0 = r5
            cihh r0 = (defpackage.cihh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cihh r0 = new cihh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            lkb r5 = r4.e
            fdpl r5 = r5.b()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.c(r5, r0)
            if (r5 == r1) goto L5c
        L40:
            cihw r5 = (defpackage.cihw) r5
            if (r5 == 0) goto L4b
            boolean r5 = r5.c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L4c
        L4b:
            r5 = 0
        L4c:
            fcsu r0 = r4.d
            java.lang.Object r0 = r0.b()
            boolean r5 = defpackage.fdbq.f(r5, r0)
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihj.c(fcxy):java.lang.Object");
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return true;
    }
}
