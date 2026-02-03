package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzc extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler");
    public final anty b;
    public final alrj c;
    public final fcsu d;
    private final fdjx e;
    private final ajln f;

    public agzc(fdjx fdjxVar, anty antyVar, ajln ajlnVar, alrj alrjVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        antyVar.getClass();
        ajlnVar.getClass();
        alrjVar.getClass();
        this.e = fdjxVar;
        this.b = antyVar;
        this.f = ajlnVar;
        this.c = alrjVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        pzh pzhVar = new pzh();
        pzhVar.b = true;
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("PenpalBotRecipientRestoreHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = agze.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ((agze) evuhVar).getClass();
        if (((Optional) this.d.b()).isEmpty() || !((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            eiju eijuVarE = eijx.e(cbcw.i());
            eijuVarE.getClass();
            return eijuVarE;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGemini");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler", "processPendingWorkItemAsync", 77, "PenpalBotRecipientRestoreHandler.kt")).q("Start to process penpal bot recipient restore request.");
        return auvw.c(this.e, fcyi.a, fdjz.a, new agyy(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.agyz
            if (r0 == 0) goto L13
            r0 = r13
            agyz r0 = (defpackage.agyz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            agyz r0 = new agyz
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r13)
            goto L7d
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.fctl.b(r13)
            anty r13 = r11.b
            anue r12 = r12.F()
            fcsu r2 = r11.d
            chpb r4 = new chpb
            java.lang.Object r5 = r2.b()
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = r5.get()
            cgsa r5 = (defpackage.cgsa) r5
            java.lang.String r7 = r5.s()
            chpq r8 = defpackage.chpq.PROFILE_UNSPECIFIED_SOURCE
            r9 = 0
            r10 = 19
            r5 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            chpc r5 = new chpc
            java.lang.Object r2 = r2.b()
            j$.util.Optional r2 = (j$.util.Optional) r2
            java.lang.Object r2 = r2.get()
            cgsa r2 = (defpackage.cgsa) r2
            android.net.Uri r2 = r2.c()
            r6 = 0
            r7 = 4
            r5.<init>(r2, r8, r6, r7)
            eiju r12 = r13.E(r12, r4, r5)
            r12.getClass()
            r0.c = r3
            java.lang.Object r13 = defpackage.fdxs.c(r12, r0)
            if (r13 != r1) goto L7d
            return r1
        L7d:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            ekrg r12 = defpackage.agzc.a
            ekrw r12 = r12.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleGemini"
            r12.X(r0, r1)
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r1 = "PenpalBotRecipientRestoreHandler.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler"
            java.lang.String r3 = "restoreGeminiNameAndAvatar"
            ekrw r12 = r12.h(r2, r3, r0, r1)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r0 = "Restore Gemini name and avatar result: %s"
            r12.t(r0, r13)
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzc.k(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.agza
            if (r2 == 0) goto L17
            r2 = r1
            agza r2 = (defpackage.agza) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            agza r2 = new agza
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3b
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            defpackage.fctl.b(r1)
            goto La9
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            defpackage.fctl.b(r1)
            goto L64
        L3b:
            defpackage.fctl.b(r1)
            ajln r1 = r0.f
            akzk r7 = new akzk
            ekgb r8 = defpackage.ekgb.r(r18)
            r8.getClass()
            r15 = 0
            r16 = 246(0xf6, float:3.45E-43)
            r9 = 0
            r10 = 0
            r11 = 3
            r12 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            eiju r1 = r1.h(r7)
            r1.getClass()
            r2.c = r6
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 == r3) goto Lce
        L64:
            ekgb r1 = (defpackage.ekgb) r1
            r1.getClass()
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto Lcb
            ajln r4 = r0.f
            r6 = 0
            java.lang.Object r1 = r1.get(r6)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r1
            fcsu r6 = r0.d
            java.lang.Object r7 = r6.b()
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.Object r7 = r7.get()
            cgsa r7 = (defpackage.cgsa) r7
            java.lang.String r7 = r7.s()
            java.lang.Object r6 = r6.b()
            j$.util.Optional r6 = (j$.util.Optional) r6
            java.lang.Object r6 = r6.get()
            cgsa r6 = (defpackage.cgsa) r6
            android.net.Uri r6 = r6.c()
            eiju r1 = r4.z(r1, r7, r6)
            r1.getClass()
            r2.c = r5
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 == r3) goto Lce
        La9:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            ekrg r2 = defpackage.agzc.a
            ekrw r2 = r2.h()
            ekrz r3 = defpackage.eksq.a
            java.lang.String r4 = "BugleGemini"
            r2.X(r3, r4)
            r3 = 174(0xae, float:2.44E-43)
            java.lang.String r4 = "PenpalBotRecipientRestoreHandler.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler"
            java.lang.String r6 = "restorePenpalBotConversation"
            ekrw r2 = r2.h(r5, r6, r3, r4)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r3 = "Restore Gemini conversation info result: %s"
            r2.t(r3, r1)
        Lcb:
            fctx r1 = defpackage.fctx.a
            return r1
        Lce:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzc.l(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(final com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.agzb
            if (r0 == 0) goto L13
            r0 = r7
            agzb r0 = (defpackage.agzb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            agzb r0 = new agzb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "restorePenpalBotParticipantType"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            defpackage.fctl.b(r7)
            goto L57
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            bsbs r7 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.f()
            r7.ap(r3)
            agyx r2 = new agyx
            r2.<init>()
            r7.U(r2)
            r6 = 3
            r7.I(r6)
            bsbr r6 = r7.b()
            eiju r6 = r6.i()
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L86
        L57:
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            ekrg r7 = defpackage.agzc.a
            ekrw r7 = r7.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleGemini"
            r7.X(r0, r1)
            r0 = 151(0x97, float:2.12E-43)
            java.lang.String r1 = "PenpalBotRecipientRestoreHandler.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/penpal/worker/PenpalBotRecipientRestoreHandler"
            ekrw r7 = r7.h(r2, r3, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            if (r6 <= 0) goto L79
            goto L7a
        L79:
            r4 = 0
        L7a:
            java.lang.String r6 = "Restore Gemini participant type result: %s"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r7.t(r6, r0)
            fctx r6 = defpackage.fctx.a
            return r6
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzc.m(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, fcxy):java.lang.Object");
    }
}
