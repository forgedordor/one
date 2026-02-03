package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cihr extends cayv {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/rcs/groups/icon/cleanup/GroupIconCleanupHandler");
    public final lkb a;
    public final fcsu b;
    private final fdjx d;
    private final fcyh e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public cihr(fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, lkb lkbVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        lkbVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.d = fdjxVar;
        this.e = fcyhVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.a = lkbVar;
        this.b = fcsuVar3;
        this.h = fcsuVar4;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c = true;
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("GroupIconCleanupHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = caxy.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ((caxy) evuhVar).getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new ciho(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        if (defpackage.fdin.a(r2, r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cihk
            if (r0 == 0) goto L13
            r0 = r12
            cihk r0 = (defpackage.cihk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cihk r0 = new cihk
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            java.lang.String r6 = "cleanupGroupConversationIcons"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/rcs/groups/icon/cleanup/GroupIconCleanupHandler"
            java.lang.String r8 = "BugleGroupManagement"
            java.lang.String r9 = "GroupIconCleanupHandler.kt"
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            defpackage.fctl.b(r12)
            goto Lc1
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3c:
            defpackage.fctl.b(r12)
            goto L5f
        L40:
            defpackage.fctl.b(r12)
            fcsu r12 = r11.h
            java.lang.Object r12 = r12.b()
            ains r12 = (defpackage.ains) r12
            java.lang.String r2 = "Bugle.Rcs.Groups.Icon.Cleanup.Count"
            r12.c(r2)
            r0.c = r5
            fcyh r12 = r11.e
            cihm r2 = new cihm
            r2.<init>(r3)
            java.lang.Object r12 = defpackage.fdin.a(r12, r2, r0)
            if (r12 == r1) goto Lde
        L5f:
            ekgb r12 = (defpackage.ekgb) r12
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L84
            ekrg r12 = defpackage.cihr.c
            ekrw r12 = r12.h()
            ekrz r0 = defpackage.eksq.a
            r12.X(r0, r8)
            r0 = 90
            ekrw r12 = r12.h(r7, r6, r0, r9)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r0 = "No conversations to cleanup"
            r12.q(r0)
            cbcw r12 = defpackage.cbcw.i()
            return r12
        L84:
            ekrg r2 = defpackage.cihr.c
            ekrw r2 = r2.h()
            ekrz r5 = defpackage.eksq.a
            r2.X(r5, r8)
            r5 = 96
            ekrw r2 = r2.h(r7, r6, r5, r9)
            ekrd r2 = (defpackage.ekrd) r2
            int r5 = r12.size()
            java.lang.String r10 = "There are %d conversations which need to be cleaned up"
            r2.r(r10, r5)
            fcsu r2 = r11.h
            java.lang.Object r2 = r2.b()
            ains r2 = (defpackage.ains) r2
            int r5 = r12.size()
            java.lang.String r10 = "Bugle.Rcs.Groups.Icon.Cleanup.Conversation.Count"
            r2.d(r10, r5)
            fcyh r2 = r11.e
            cihl r5 = new cihl
            r5.<init>(r11, r12, r3)
            r0.c = r4
            java.lang.Object r12 = defpackage.fdin.a(r2, r5, r0)
            if (r12 != r1) goto Lc1
            goto Lde
        Lc1:
            ekrg r12 = defpackage.cihr.c
            ekrw r12 = r12.h()
            ekrz r0 = defpackage.eksq.a
            r12.X(r0, r8)
            r0 = 103(0x67, float:1.44E-43)
            ekrw r12 = r12.h(r7, r6, r0, r9)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r0 = "GroupIconCleanupWorker finished"
            r12.q(r0)
            cbcw r12 = defpackage.cbcw.i()
            return r12
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihr.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.cihn
            if (r0 == 0) goto L13
            r0 = r10
            cihn r0 = (defpackage.cihn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cihn r0 = new cihn
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r10)
            goto Lc9
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            defpackage.fctl.b(r10)
            goto La2
        L39:
            defpackage.fctl.b(r10)
            fcsu r10 = r9.g
            java.lang.Object r10 = r10.b()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            java.lang.String r2 = "handleFlagChange"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/rcs/groups/icon/cleanup/GroupIconCleanupHandler"
            java.lang.String r6 = "BugleGroupManagement"
            java.lang.String r7 = "GroupIconCleanupHandler.kt"
            if (r10 != 0) goto L6f
            ekrg r10 = defpackage.cihr.c
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r6)
            r0 = 69
            ekrw r10 = r10.h(r5, r2, r0, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "GroupIconCleanupWorker disabled, canceling work"
            r10.q(r0)
            cbcw r10 = defpackage.cbcw.i()
            return r10
        L6f:
            fcsu r10 = r9.f
            java.lang.Object r10 = r10.b()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L9a
            ekrg r10 = defpackage.cihr.c
            ekrw r10 = r10.h()
            ekrz r4 = defpackage.eksq.a
            r10.X(r4, r6)
            r4 = 76
            ekrw r10 = r10.h(r5, r2, r4, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r2 = "GroupIconCleanupWorker disabled because feature flag is enabled, canceling work"
            r10.q(r2)
            cbcw r10 = defpackage.cbcw.i()
            goto La4
        L9a:
            r0.d = r4
            java.lang.Object r10 = r9.k(r0)
            if (r10 == r1) goto Lcf
        La2:
            cbcw r10 = (defpackage.cbcw) r10
        La4:
            fcsu r2 = r9.f
            java.lang.Object r2 = r2.b()
            r2.getClass()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.a = r10
            r0.d = r3
            fcyh r3 = r9.e
            cihq r4 = new cihq
            r5 = 0
            r4.<init>(r9, r2, r5)
            java.lang.Object r0 = defpackage.fdin.a(r3, r4, r0)
            if (r0 != r1) goto Lc6
            goto Lcf
        Lc6:
            r8 = r0
            r0 = r10
            r10 = r8
        Lc9:
            cihw r10 = (defpackage.cihw) r10
            r0.getClass()
            return r0
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihr.l(fcxy):java.lang.Object");
    }
}
