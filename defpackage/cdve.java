package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdve implements dnuy {
    public final fcsu a;
    public final ekrg b;
    private final fdjx c;
    private final ccyf d;
    private final dnvi e;
    private final fdkf f;

    public cdve(fcsu fcsuVar, fdjx fdjxVar, ccyf ccyfVar, dnvi dnviVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        dnviVar.getClass();
        this.a = fcsuVar;
        this.c = fdjxVar;
        this.d = ccyfVar;
        this.e = dnviVar;
        this.b = ekrg.c("com/google/android/apps/messaging/shared/mdd/geller/EmotifyControllerImpl");
        this.f = fdin.b(fdjxVar, eicg.a(fcyi.a), fdjz.b, new cdvd(null, this));
    }

    @Override // defpackage.dnuy
    public final Object a(fcxy fcxyVar) {
        return this.f.c(fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dnuy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cdvc
            if (r0 == 0) goto L13
            r0 = r6
            cdvc r0 = (defpackage.cdvc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdvc r0 = new cdvc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L43
        L36:
            defpackage.fctl.b(r6)
            ccyf r6 = r5.d
            r0.c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L64
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5f
            dnvi r6 = r5.e
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L64
        L55:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L5e
            goto L5f
        L5e:
            r4 = 0
        L5f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdve.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.dnuy
    public final void c() {
        ccyf ccyfVar = this.d;
        if (ccyfVar.d.b()) {
            return;
        }
        auvw.k(ccyfVar.b, null, null, new ccye(ccyfVar, null), 3);
    }
}
