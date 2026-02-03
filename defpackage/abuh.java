package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuh implements abud {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/emergency/conversationprovider/EmergencyConversationProviderImpl");
    public final fcsu a;
    private final fcsu c;
    private final fcsu d;

    public abuh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.a = fcsuVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.abud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.abug
            if (r0 == 0) goto L13
            r0 = r6
            abug r0 = (defpackage.abug) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abug r0 = new abug
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            alqk r5 = r0.d
            defpackage.fctl.b(r6)
            goto L68
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            if (r5 == 0) goto L43
            fcsu r5 = r4.c
            java.lang.Object r5 = r5.b()
            alrj r5 = (defpackage.alrj) r5
            alqm r5 = r5.m()
            goto L4f
        L43:
            fcsu r5 = r4.c
            java.lang.Object r5 = r5.b()
            alrj r5 = (defpackage.alrj) r5
            alqm r5 = r5.l()
        L4f:
            fcsu r6 = r4.d
            java.lang.Object r6 = r6.b()
            anty r6 = (defpackage.anty) r6
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r6 = r6.h(r5)
            r2 = r5
            alqk r2 = (defpackage.alqk) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r4.b(r6, r0)
            if (r6 == r1) goto L9f
        L68:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6
            ekrg r0 = defpackage.abuh.b
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleSatellite"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.cqnc.t
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r6.d()
            r0.X(r1, r2)
            ekrz r1 = defpackage.cqnc.G
            r0.X(r1, r5)
            r5 = 52
            java.lang.String r1 = "EmergencyConversationProviderImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/emergency/conversationprovider/EmergencyConversationProviderImpl"
            java.lang.String r3 = "getOrCreateEsosConversation"
            ekrw r5 = r0.h(r2, r3, r5, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Created or retrieved eSOS Conversation"
            r5.q(r0)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r6.d()
            return r5
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abuh.a(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.abue
            if (r0 == 0) goto L13
            r0 = r6
            abue r0 = (defpackage.abue) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abue r0 = new abue
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            abuf r6 = new abuf
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdjy.a(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abuh.b(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, fcxy):java.lang.Object");
    }
}
