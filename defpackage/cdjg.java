package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdjg extends cayv {
    public final Optional b;
    public final fcsu c;
    public final apqc d;
    private final fdjx f;
    private final egbf g;
    private final egyt h;
    private final cdku i;
    private final fcsu j;
    private static final cczi e = cdag.e(cdag.b, "gaia_auth_check_result_max_retry", 3);
    public static final cqce a = cqce.g("BugleGaia", "GaiaAuthCheckResultHandler");

    public cdjg(fdjx fdjxVar, Optional optional, egbf egbfVar, egyt egytVar, cdku cdkuVar, fcsu fcsuVar, fcsu fcsuVar2, apqc apqcVar) {
        fdjxVar.getClass();
        optional.getClass();
        egbfVar.getClass();
        egytVar.getClass();
        cdkuVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        apqcVar.getClass();
        this.f = fdjxVar;
        this.b = optional;
        this.g = egbfVar;
        this.h = egytVar;
        this.i = cdkuVar;
        this.j = fcsuVar;
        this.c = fcsuVar2;
        this.d = apqcVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        Object objE = e.e();
        objE.getClass();
        caxzVarL.c(((Number) objE).intValue());
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.b);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("GaiaAuthCheckResultHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = bzzx.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        bzzx bzzxVar = (bzzx) evuhVar;
        bzzxVar.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new cdjf(this, bzzxVar, cayyVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r9 != r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r7, defpackage.cayy r8, defpackage.fcxy r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cdjc
            if (r0 == 0) goto L13
            r0 = r9
            cdjc r0 = (defpackage.cdjc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cdjc r0 = new cdjc
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.a
            defpackage.fctl.b(r9)
            goto Lad
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.a
            java.lang.Object r8 = r0.b
            defpackage.fctl.b(r9)
            goto L5d
        L3d:
            defpackage.fctl.b(r9)
            egyt r9 = r6.h
            egbf r2 = r6.g
            egyi r2 = r2.b()
            egzr r5 = defpackage.egzr.DONT_CARE
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a(r2, r5)
            r9.getClass()
            r0.b = r8
            r0.a = r7
            r0.e = r4
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto Lc5
        L5d:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto Lb3
            java.util.Iterator r9 = r9.iterator()
        L65:
            boolean r2 = r9.hasNext()
            r4 = 0
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r9.next()
            r5 = r2
            egbe r5 = (defpackage.egbe) r5
            efwo r5 = r5.a()
            efwq r5 = (defpackage.efwq) r5
            int r5 = r5.a
            if (r5 != r7) goto L65
            goto L7f
        L7e:
            r2 = r4
        L7f:
            egbe r2 = (defpackage.egbe) r2
            if (r2 == 0) goto Lb3
            egbs r9 = r2.b()
            java.lang.String r9 = r9.k
            java.lang.String r5 = "pseudonymous"
            boolean r9 = defpackage.fdbq.f(r9, r5)
            if (r9 == 0) goto L9d
            cqce r8 = defpackage.cdjg.a
            java.lang.String r9 = "Gaia authentication not performed because account is pseudonymous"
            r8.r(r9)
            cbcw r8 = defpackage.cbcw.k()
            goto Lb0
        L9d:
            efwo r9 = r2.a()
            r0.b = r4
            r0.a = r7
            r0.e = r3
            java.lang.Object r9 = r6.l(r9, r8, r0)
            if (r9 == r1) goto Lc5
        Lad:
            r8 = r9
            cbcw r8 = (defpackage.cbcw) r8
        Lb0:
            if (r8 == 0) goto Lb3
            return r8
        Lb3:
            cqce r8 = defpackage.cdjg.a
            java.lang.String r9 = "Get GaiaAuthCheckResult failed because unable to find account for Id "
            java.lang.String r0 = "."
            java.lang.String r7 = defpackage.a.e(r7, r9, r0)
            r8.r(r7)
            cbcw r7 = defpackage.cbcw.k()
            return r7
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdjg.k(int, cayy, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.efwo r6, defpackage.cayy r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cdjd
            if (r0 == 0) goto L13
            r0 = r8
            cdjd r0 = (defpackage.cdjd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cdjd r0 = new cdjd
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.a
            efwq r6 = r0.e
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L2c
            goto L55
        L2c:
            r6 = move-exception
            goto L9a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.fctl.b(r8)
            j$.util.Optional r8 = r5.b     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = r8.orElseThrow()     // Catch: java.lang.Exception -> L2c
            cdiq r8 = (defpackage.cdiq) r8     // Catch: java.lang.Exception -> L2c
            eiju r8 = r8.a(r6)     // Catch: java.lang.Exception -> L2c
            r2 = r6
            efwq r2 = (defpackage.efwq) r2     // Catch: java.lang.Exception -> L2c
            r0.e = r2     // Catch: java.lang.Exception -> L2c
            r0.a = r7     // Catch: java.lang.Exception -> L2c
            r0.d = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)     // Catch: java.lang.Exception -> L2c
            if (r8 != r1) goto L55
            return r1
        L55:
            cdjb r8 = (defpackage.cdjb) r8     // Catch: java.lang.Exception -> L2c
            cdku r0 = r5.i     // Catch: java.lang.Exception -> L2c
            fcsu r1 = r0.f     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Exception -> L2c
            cdji r1 = (defpackage.cdji) r1     // Catch: java.lang.Exception -> L2c
            java.util.concurrent.atomic.AtomicReference r1 = r1.c     // Catch: java.lang.Exception -> L2c
            j$.util.Optional r2 = j$.util.Optional.of(r8)     // Catch: java.lang.Exception -> L2c
            r1.set(r2)     // Catch: java.lang.Exception -> L2c
            boolean r1 = r8 instanceof defpackage.cdja     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L79
            egzh r0 = r0.e     // Catch: java.lang.Exception -> L2c
            eiju r1 = defpackage.eijx.e(r4)     // Catch: java.lang.Exception -> L2c
            egyj r2 = defpackage.cdku.a     // Catch: java.lang.Exception -> L2c
            r0.a(r1, r2)     // Catch: java.lang.Exception -> L2c
        L79:
            boolean r8 = r8 instanceof defpackage.cdiz     // Catch: java.lang.Exception -> L2c
            if (r8 == 0) goto L95
            fcsu r8 = r5.j     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Exception -> L2c
            cdji r8 = (defpackage.cdji) r8     // Catch: java.lang.Exception -> L2c
            r6.getClass()     // Catch: java.lang.Exception -> L2c
            java.util.Set r8 = r8.b     // Catch: java.lang.Exception -> L2c
            efwq r6 = (defpackage.efwq) r6     // Catch: java.lang.Exception -> L2c
            int r6 = r6.a     // Catch: java.lang.Exception -> L2c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L2c
            r8.add(r6)     // Catch: java.lang.Exception -> L2c
        L95:
            cbcw r6 = defpackage.cbcw.i()     // Catch: java.lang.Exception -> L2c
            return r6
        L9a:
            boolean r7 = r7.c()
            if (r7 == 0) goto La8
            cqce r7 = defpackage.cdjg.a
            java.lang.String r8 = "Getting gaia auth check result failed, will retry"
            r7.s(r8, r6)
            goto Lba
        La8:
            fdjx r7 = r5.f
            cdje r8 = new cdje
            r8.<init>(r5, r6, r4)
            r0 = 3
            defpackage.auvw.k(r7, r4, r4, r8, r0)
            cqce r7 = defpackage.cdjg.a
            java.lang.String r8 = "Getting gaia auth check result failed, no retries left"
            r7.s(r8, r6)
        Lba:
            cbcw r6 = defpackage.cbcw.m()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdjg.l(efwo, cayy, fcxy):java.lang.Object");
    }
}
