package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogs implements cogm {
    public final fcsu a;
    private final fctc b;

    public cogs(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = fctd.a(new fdae() { // from class: cogp
            @Override // defpackage.fdae
            public final Object invoke() {
                cmgk cmgkVar = (cmgk) this.a.a.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.TELEPHONY_DATABASE_UPDATE_SETTINGS);
                cmggVarC.f(cogk.a);
                return cmgkVar.a(cmggVarC.a());
            }
        });
    }

    private final cmfo e() {
        return (cmfo) this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cogm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cogq
            if (r0 == 0) goto L13
            r0 = r5
            cogq r0 = (defpackage.cogq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cogq r0 = new cogq
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
            cmfo r5 = r4.e()
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cogk r5 = (defpackage.cogk) r5
            boolean r5 = r5.c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogs.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cogm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cogr
            if (r0 == 0) goto L13
            r0 = r5
            cogr r0 = (defpackage.cogr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cogr r0 = new cogr
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
            cmfo r5 = r4.e()
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cogk r5 = (defpackage.cogk) r5
            boolean r5 = r5.d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogs.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.cogm
    public final Object c(fcxy fcxyVar) {
        Object objD = e().d(new fdap() { // from class: cogn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cogk cogkVar = (cogk) obj;
                cogkVar.getClass();
                cogj cogjVar = (cogj) cogkVar.toBuilder();
                cogjVar.getClass();
                cogjVar.copyOnWrite();
                cogk cogkVar2 = (cogk) cogjVar.instance;
                cogkVar2.b |= 2;
                cogkVar2.d = true;
                return cogl.a(cogjVar);
            }
        }, fcxyVar);
        return objD == fcyl.a ? objD : fctx.a;
    }

    @Override // defpackage.cogm
    public final Object d(fcxy fcxyVar) {
        Object objD = e().d(new fdap() { // from class: cogo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cogk cogkVar = (cogk) obj;
                cogkVar.getClass();
                cogj cogjVar = (cogj) cogkVar.toBuilder();
                cogjVar.getClass();
                cogjVar.copyOnWrite();
                cogk cogkVar2 = (cogk) cogjVar.instance;
                cogkVar2.b |= 1;
                cogkVar2.c = true;
                return cogl.a(cogjVar);
            }
        }, fcxyVar);
        return objD == fcyl.a ? objD : fctx.a;
    }
}
