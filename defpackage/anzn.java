package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzn extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/ParticipantContactSyncHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;

    public anzn(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.e = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(5);
        caxzVarL.f(pza.a);
        caxzVarL.g(1000L);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("ContactRecipientDeletedSyncHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = anzp.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        anzp anzpVar = (anzp) evuhVar;
        anzpVar.getClass();
        Object objB = this.e.b();
        objB.getClass();
        return auvw.c((fdjx) objB, fcyi.a, fdjz.a, new anzm(anzpVar, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r6, defpackage.fcxy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.anzi
            if (r0 == 0) goto L13
            r0 = r7
            anzi r0 = (defpackage.anzi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            anzi r0 = new anzi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L4e
        L28:
            r6 = move-exception
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L28
            r7.getClass()     // Catch: java.lang.Throwable -> L28
            fcyh r7 = (defpackage.fcyh) r7     // Catch: java.lang.Throwable -> L28
            anzk r2 = new anzk     // Catch: java.lang.Throwable -> L28
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L28
            r0.c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L4e
            return r1
        L4e:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r7 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r7     // Catch: java.lang.Throwable -> L28
            return r7
        L51:
            ekrg r7 = defpackage.anzn.a
            ekrw r7 = r7.i()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleRecipientSync"
            r7.X(r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            ekrw r6 = r7.g(r6)
            r7 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = "ParticipantContactSyncHandler.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/api/messaging/recipient/sync/ParticipantContactSyncHandler"
            java.lang.String r2 = "getParticipant"
            ekrw r6 = r6.h(r1, r2, r7, r0)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r7 = "ParticipantContactSync: failed to read participant"
            r6.q(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzn.k(java.lang.String, fcxy):java.lang.Object");
    }
}
