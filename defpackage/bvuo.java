package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvuo implements bakg {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/E2eeConversationActiveIdentityChangedListener");
    public final fcsu a;
    private final ajvr c;
    private final fdjx d;
    private final fcyh e;
    private final fcsu f;

    public bvuo(ajvr ajvrVar, fcsu fcsuVar, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar2) {
        ajvrVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar2.getClass();
        this.c = ajvrVar;
        this.a = fcsuVar;
        this.d = fdjxVar;
        this.e = fcyhVar;
        this.f = fcsuVar2;
    }

    @Override // defpackage.bakg
    public final eieu a() {
        return new cohf("E2eeConversationActiveIdentityChangedListener::onActiveIdentityChanged").a();
    }

    @Override // defpackage.bakg
    public final eiju b(ConversationIdType conversationIdType, aoer aoerVar) {
        aoerVar.getClass();
        return auvw.i(this.d, new bvuk(this, conversationIdType, aoerVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ajlk r5, defpackage.aoer r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bvuj
            if (r0 == 0) goto L13
            r0 = r7
            bvuj r0 = (defpackage.bvuj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bvuj r0 = new bvuj
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r5 = r0.a
            defpackage.fctl.b(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            boolean r5 = r5.t()
            anpj r6 = r6.g()
            eiju r6 = r6.b()
            r6.getClass()
            r0.a = r5
            r0.d = r3
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L5c
        L4d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = defpackage.fdbq.f(r5, r7)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvuo.c(ajlk, aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0117, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, defpackage.aoer r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvuo.d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bvun
            if (r0 == 0) goto L13
            r0 = r6
            bvun r0 = (defpackage.bvun) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvun r0 = new bvun
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            ajvr r6 = r4.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r2.<init>(r5)
            r5 = 0
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5 = r6.L(r2, r5)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r5
            anpj r5 = r5.f
            eiju r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvuo.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }
}
