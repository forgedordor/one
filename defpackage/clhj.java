package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhj implements clhd {
    public final fcsu a;
    private final clhc b;
    private final fdjx c;
    private final fctc d;

    public clhj(fcsu fcsuVar, clhc clhcVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        clhcVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = clhcVar;
        this.c = fdjxVar;
        this.d = fctd.a(new fdae() { // from class: clhe
            @Override // defpackage.fdae
            public final Object invoke() {
                ecem.b();
                cmgk cmgkVar = (cmgk) this.a.a.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.SATELLITE_SETTINGS);
                clhk clhkVar = (clhk) clhl.a.createBuilder();
                clhkVar.getClass();
                evsn evsnVarBuild = clhkVar.build();
                evsnVarBuild.getClass();
                cmggVarC.f((clhl) evsnVarBuild);
                return cmgkVar.a(cmggVarC.a());
            }
        });
    }

    private final cmfo d() {
        return (cmfo) this.d.a();
    }

    @Override // defpackage.clhd
    public final eiju a() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new clhi(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.clhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.clhg
            if (r0 == 0) goto L13
            r0 = r7
            clhg r0 = (defpackage.clhg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clhg r0 = new clhg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r7)
            goto L66
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.fctl.b(r7)
            goto L5a
        L39:
            defpackage.fctl.b(r7)
            goto L4c
        L3d:
            defpackage.fctl.b(r7)
            cmfo r7 = r6.d()
            r0.c = r5
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L70
        L4c:
            clhl r7 = (defpackage.clhl) r7
            int r7 = r7.c
            if (r7 > 0) goto L6a
            r0.c = r4
            java.lang.Object r7 = r6.c(r0)
            if (r7 == r1) goto L70
        L5a:
            cmfo r7 = r6.d()
            r0.c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L70
        L66:
            clhl r7 = (defpackage.clhl) r7
            int r7 = r7.c
        L6a:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            return r0
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clhj.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r2.d(r4, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.clhh
            if (r0 == 0) goto L13
            r0 = r6
            clhh r0 = (defpackage.clhh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clhh r0 = new clhh
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
            goto L59
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
            clhc r6 = r5.b
            r0.c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L5c
        L43:
            clna r6 = (defpackage.clna) r6
            int r6 = r6.d
            cmfo r2 = r5.d()
            clhf r4 = new clhf
            r4.<init>()
            r0.c = r3
            java.lang.Object r6 = r2.d(r4, r0)
            if (r6 != r1) goto L59
            goto L5c
        L59:
            fctx r6 = defpackage.fctx.a
            return r6
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clhj.c(fcxy):java.lang.Object");
    }
}
