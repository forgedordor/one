package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmkm extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler");
    public final fcsu b;
    private final fdjx c;
    private final fcsu d;
    private final long e;

    public cmkm(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, long j) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = fdjxVar;
        this.b = fcsuVar;
        this.d = fcsuVar2;
        this.e = j;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.c((int) this.e);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("SimStateUpdateHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cmko.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "sim_state_update_queue";
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cmko cmkoVar = (cmko) evuhVar;
        cmkoVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new cmkl(this, cmkoVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.eoaz r8, defpackage.fcxy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cmkk
            if (r0 == 0) goto L13
            r0 = r9
            cmkk r0 = (defpackage.cmkk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmkk r0 = new cmkk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L5c
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r9)
            ekrg r9 = defpackage.cmkm.a
            ekrw r9 = r9.h()
            r2 = 114(0x72, float:1.6E-43)
            java.lang.String r4 = "SimStateUpdateHandler.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler"
            java.lang.String r6 = "handleUpdatePhoneSimsState"
            ekrw r9 = r9.h(r5, r6, r2, r4)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r2 = "Handling update phone SIM state."
            r9.q(r2)
            fcsu r9 = r7.b
            java.lang.Object r9 = r9.b()
            cmjl r9 = (defpackage.cmjl) r9
            r0.c = r3
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            cmme r9 = (defpackage.cmme) r9
            cmky r8 = defpackage.cmky.WORK_TYPE_UPDATE_PHONE_SIMS_STATE
            r7.l(r8)
            cbcw r8 = defpackage.cbcw.i()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmkm.k(eoaz, fcxy):java.lang.Object");
    }

    public final void l(cmky cmkyVar) {
        cmlp cmlpVar = (cmlp) this.d.b();
        cmkyVar.getClass();
        ((ains) cmlpVar.a.b()).e("Bugle.Dsdr.SimStateUpdateHandler", cmkyVar.ordinal());
    }
}
