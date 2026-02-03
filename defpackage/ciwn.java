package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwn implements ciwj {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcs/incoming/util/IncomingRcsGroupMessageRecipientResolverImpl");
    public final fcsu a;
    private final fcsu c;
    private final fcyh d;
    private final fdjx e;

    public ciwn(fcsu fcsuVar, fcsu fcsuVar2, fcyh fcyhVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.d = fcyhVar;
        this.e = fdjxVar;
    }

    @Override // defpackage.ciwj
    public final eiju a(ConversationIdType conversationIdType, aubq aubqVar) {
        aubqVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new ciwm(this, conversationIdType, aubqVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, defpackage.aubq r13, defpackage.fcxy r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.ciwl
            if (r0 == 0) goto L13
            r0 = r14
            ciwl r0 = (defpackage.ciwl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ciwl r0 = new ciwl
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "resolveRecipientFromRcsGroupConversation"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/rcs/incoming/util/IncomingRcsGroupMessageRecipientResolverImpl"
            java.lang.String r5 = "BugleDataModel"
            r6 = 2
            r7 = 1
            java.lang.String r8 = "IncomingRcsGroupMessageRecipientResolverImpl.kt"
            if (r2 == 0) goto L48
            if (r2 == r7) goto L40
            if (r2 != r6) goto L38
            aubq r12 = r0.f
            aubq r13 = r0.e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r0.d
            defpackage.fctl.b(r14)
            goto La1
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            aubq r13 = r0.e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12 = r0.d
            defpackage.fctl.b(r14)
            goto L5f
        L48:
            defpackage.fctl.b(r14)
            fcsu r14 = r11.c
            java.lang.Object r14 = r14.b()
            chtk r14 = (defpackage.chtk) r14
            r0.d = r12
            r0.e = r13
            r0.c = r7
            java.lang.Object r14 = r14.j(r12, r0)
            if (r14 == r1) goto Ld1
        L5f:
            aubq r14 = (defpackage.aubq) r14
            if (r14 != 0) goto L83
            ekrg r14 = defpackage.ciwn.b
            ekrw r14 = r14.j()
            ekrz r0 = defpackage.eksq.a
            r14.X(r0, r5)
            ekrd r14 = (defpackage.ekrd) r14
            ekrz r0 = defpackage.cqnc.s
            r14.X(r0, r12)
            r12 = 49
            ekrw r12 = r14.h(r4, r3, r12, r8)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r14 = "The current active self cannot be retrieved for the conversation id."
            r12.q(r14)
            return r13
        L83:
            fcyh r2 = r11.d
            fcyh r2 = defpackage.eicg.a(r2)
            ciwk r7 = new ciwk
            r9 = 0
            r7.<init>(r9, r11, r12, r14)
            r0.d = r12
            r0.e = r13
            r0.f = r14
            r0.c = r6
            java.lang.Object r0 = defpackage.fdin.a(r2, r7, r0)
            if (r0 == r1) goto Ld1
            r10 = r0
            r0 = r12
            r12 = r14
            r14 = r10
        La1:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Laa
            return r12
        Laa:
            ekrg r14 = defpackage.ciwn.b
            ekrw r14 = r14.j()
            ekrz r1 = defpackage.eksq.a
            r14.X(r1, r5)
            ekrd r14 = (defpackage.ekrd) r14
            ekrz r1 = defpackage.cqnc.s
            r14.X(r1, r0)
            ekrz r0 = defpackage.cqnc.I
            java.lang.String r12 = r12.d
            r14.X(r0, r12)
            r12 = 67
            ekrw r12 = r14.h(r4, r3, r12, r8)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r14 = "The current active self of the conversation is not part of the conversation."
            r12.q(r14)
            return r13
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciwn.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aubq, fcxy):java.lang.Object");
    }
}
