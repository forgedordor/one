package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbi implements ajzi {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/DestinationPopulationOpenConversationListener");
    private final awnf b;
    private final fcsu c;
    private final fdjx d;
    private final cohg e;

    public akbi(awnf awnfVar, fcsu fcsuVar, fdjx fdjxVar) {
        awnfVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.b = awnfVar;
        this.c = fcsuVar;
        this.d = fdjxVar;
        this.e = new cohf("DestinationPopulationOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.e.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new akbf(this, bugleConversation, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (d(r14, r15, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0180, code lost:
    
        if (defpackage.fdxs.c(r14, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111 A[PHI: r14 r15
      0x0111: PHI (r14v18 com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation) = 
      (r14v16 com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation)
      (r14v31 com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation)
     binds: [B:43:0x010f, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r15v26 java.lang.Object) = (r15v25 java.lang.Object), (r15v1 java.lang.Object) binds: [B:43:0x010f, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbi.c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
    
        if (defpackage.fdxs.c(r11, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r11, defpackage.ajts r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.akbh
            if (r0 == 0) goto L13
            r0 = r13
            akbh r0 = (defpackage.akbh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akbh r0 = new akbh
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "updateRcsGroup"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/DestinationPopulationOpenConversationListener"
            java.lang.String r5 = "BugleCME"
            r6 = 2
            r7 = 1
            java.lang.String r8 = "DestinationPopulationOpenConversationListener.kt"
            if (r2 == 0) goto L43
            if (r2 == r7) goto L3b
            if (r2 != r6) goto L33
            defpackage.fctl.b(r13)
            goto Lcf
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            java.lang.Object r11 = r0.a
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r12 = r0.e
            defpackage.fctl.b(r13)
            goto L87
        L43:
            defpackage.fctl.b(r13)
            java.lang.String r12 = r12.N()
            if (r12 != 0) goto L72
            ekrg r12 = defpackage.akbi.a
            ekrw r12 = r12.j()
            ekrz r13 = defpackage.eksq.a
            r12.X(r13, r5)
            ekrd r12 = (defpackage.ekrd) r12
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r11 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r11
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r11 = r11.a
            ekrz r13 = defpackage.cqnc.t
            r12.X(r13, r11)
            r11 = 124(0x7c, float:1.74E-43)
            ekrw r11 = r12.h(r4, r3, r11, r8)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r12 = "RCS group conversation does not contain a group ID"
            r11.q(r12)
            fctx r11 = defpackage.fctx.a
            return r11
        L72:
            awnf r13 = r10.b
            r2 = r11
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r2 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r2
            r0.e = r2
            r0.a = r13
            r0.d = r7
            java.lang.Object r12 = r13.m(r12, r0)
            if (r12 == r1) goto Ld2
            r9 = r12
            r12 = r11
            r11 = r13
            r13 = r9
        L87:
            awpx r13 = (defpackage.awpx) r13
            awjl r11 = r11.a(r13)
            ekrg r13 = defpackage.akbi.a
            ekrw r13 = r13.h()
            ekrz r2 = defpackage.eksq.a
            r13.X(r2, r5)
            ekrd r13 = (defpackage.ekrd) r13
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r12 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r12
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r12 = r12.a
            ekrz r2 = defpackage.cqnc.t
            r13.X(r2, r12)
            ekrz r2 = defpackage.cqnc.ag
            r13.X(r2, r11)
            r2 = 132(0x84, float:1.85E-43)
            ekrw r13 = r13.h(r4, r3, r2, r8)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r2 = "Setting the destination token for the RCS group conversation."
            r13.q(r2)
            fcsu r13 = r10.c
            java.lang.Object r13 = r13.b()
            ajvr r13 = (defpackage.ajvr) r13
            eiju r11 = r13.Q(r12, r11)
            r12 = 0
            r0.e = r12
            r0.a = r12
            r0.d = r6
            java.lang.Object r11 = defpackage.fdxs.c(r11, r0)
            if (r11 != r1) goto Lcf
            goto Ld2
        Lcf:
            fctx r11 = defpackage.fctx.a
            return r11
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbi.d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, ajts, fcxy):java.lang.Object");
    }
}
