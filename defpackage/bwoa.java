package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwoa extends cayv {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "SyncGroupThenEncryptionStatusWorkHandler");
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/groupsync/SyncGroupThenEncryptionStatusWorkHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fdjx j;

    public bwoa(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fdjx fdjxVar, fdjx fdjxVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.i = fcsuVar5;
        this.d = fcsuVar6;
        this.e = fcsuVar7;
        this.j = fdjxVar2;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("SyncGroupThenEncryptionStatusWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = bwnv.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        bwnv bwnvVar = (bwnv) evuhVar;
        bwnvVar.getClass();
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Begin sync for group and conversation etouffee status");
        cqbdVarC.r();
        return auvw.c(this.j, fcyi.a, fdjz.a, new bwny(this, bwnvVar, barn.b(bwnvVar.c), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.aubq r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bwnx
            if (r0 == 0) goto L13
            r0 = r7
            bwnx r0 = (defpackage.bwnx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwnx r0 = new bwnx
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            if (r6 == 0) goto L5b
            aubq r7 = defpackage.aubq.a
            boolean r7 = defpackage.fdbq.f(r6, r7)
            if (r7 == 0) goto L3d
            goto L5b
        L3d:
            fcsu r7 = r4.h
            java.lang.Object r7 = r7.b()
            bvvb r7 = (defpackage.bvvb) r7
            bvva r5 = r7.a(r6, r5)
            eiju r5 = r5.a()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            cbcw r5 = defpackage.cbcw.i()
            return r5
        L5b:
            ekrg r6 = defpackage.bwoa.f
            ekrw r6 = r6.j()
            ekrz r7 = defpackage.eksq.a
            java.lang.String r0 = "BugleE2eeEtouffee"
            r6.X(r7, r0)
            ekrd r6 = (defpackage.ekrd) r6
            ekrz r7 = defpackage.cqnc.s
            r6.X(r7, r5)
            r5 = 152(0x98, float:2.13E-43)
            java.lang.String r7 = "SyncGroupThenEncryptionStatusWorkHandler.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/groupsync/SyncGroupThenEncryptionStatusWorkHandler"
            java.lang.String r1 = "kickOffEncryptionStatusUpdater"
            ekrw r5 = r6.h(r0, r1, r5, r7)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "selfChatEndpoint not available, not syncing etouffee status"
            r5.q(r6)
            cbcw r5 = defpackage.cbcw.k()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwoa.k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aubq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.aubq r7, java.lang.String r8, defpackage.fcxy r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bwnz
            if (r0 == 0) goto L13
            r0 = r9
            bwnz r0 = (defpackage.bwnz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bwnz r0 = new bwnz
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            java.lang.String r8 = r0.f
            aubq r2 = r0.e
            defpackage.fctl.b(r9)
            goto L61
        L3c:
            defpackage.fctl.b(r9)
            fcsu r9 = r6.g
            java.lang.Object r9 = r9.b()
            cnas r9 = (defpackage.cnas) r9
            fcsu r2 = r6.i
            java.lang.Object r2 = r2.b()
            cnlh r2 = (defpackage.cnlh) r2
            r0.e = r7
            r0.f = r8
            r0.a = r9
            r0.d = r4
            java.lang.Object r2 = defpackage.cnlh.g(r2, r7, r0)
            if (r2 == r1) goto L78
            r5 = r2
            r2 = r7
            r7 = r9
            r9 = r5
        L61:
            eqfb r9 = (defpackage.eqfb) r9
            cnaz r7 = r7.a(r9)
            r9 = 0
            r0.e = r9
            r0.f = r9
            r0.a = r9
            r0.d = r3
            java.lang.Object r7 = r7.b(r8, r2, r0)
            if (r7 != r1) goto L77
            goto L78
        L77:
            return r7
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwoa.l(aubq, java.lang.String, fcxy):java.lang.Object");
    }
}
