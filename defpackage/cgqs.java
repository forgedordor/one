package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgqs extends cayl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/incomingmessage/pwq/ConversationNotificationHandler");
    private final fdjx b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final cgpw g;

    public cgqs(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cgpw cgpwVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cgpwVar.getClass();
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = cgpwVar;
    }

    public static final ConversationIdType o(cgqv cgqvVar) {
        return barn.b(cgqvVar.c);
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WAKELOCK);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("QueueNotificationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cgqv.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayl
    public final eiju j(cayy cayyVar, ekgb ekgbVar) {
        ekgbVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new cgqq(ekgbVar, this, null));
    }

    public final ConversationId k(ConversationIdType conversationIdType) {
        badt badtVarB = this.g.b(conversationIdType);
        if (badtVarB != null) {
            return badtVarB.H();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cgqo
            if (r0 == 0) goto L13
            r0 = r6
            cgqo r0 = (defpackage.cgqo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgqo r0 = new cgqo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.c
            java.lang.Object r6 = r6.b()
            ajln r6 = (defpackage.ajln) r6
            eiju r5 = r6.l(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgqs.l(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cgqp
            if (r0 == 0) goto L13
            r0 = r6
            cgqp r0 = (defpackage.cgqp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgqp r0 = new cgqp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.f
            java.lang.Object r6 = r6.b()
            akbs r6 = (defpackage.akbs) r6
            eiju r5 = r6.b(r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgqs.m(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, j$.time.Duration r13, boolean r14, defpackage.cgrc r15, defpackage.akbr r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.cgqr
            if (r1 == 0) goto L15
            r1 = r0
            cgqr r1 = (defpackage.cgqr) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            cgqr r1 = new cgqr
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12 = r1.d
            defpackage.fctl.b(r0)
            goto L63
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            defpackage.fctl.b(r0)
            cgrc r0 = defpackage.cgrc.b
            if (r15 != r0) goto L46
            fcsu r0 = r11.d
            java.lang.Object r0 = r0.b()
            r0.getClass()
            cgqw r0 = (defpackage.cgqw) r0
            goto L51
        L46:
            fcsu r0 = r11.e
            java.lang.Object r0 = r0.b()
            r0.getClass()
            cgqw r0 = (defpackage.cgqw) r0
        L51:
            r5 = r0
            r1.d = r12
            r1.c = r4
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            java.lang.Object r13 = r5.a(r6, r7, r8, r9, r10)
            if (r13 != r2) goto L63
            return r2
        L63:
            ekrg r13 = defpackage.cgqs.a
            ekrw r13 = r13.h()
            ekrz r14 = defpackage.eksq.a
            java.lang.String r15 = "BugleNotifications"
            r13.X(r14, r15)
            r14 = 227(0xe3, float:3.18E-43)
            java.lang.String r15 = "ConversationNotificationHandler.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/notification2o/incomingmessage/pwq/ConversationNotificationHandler"
            java.lang.String r1 = "queueNotification"
            ekrw r13 = r13.h(r0, r1, r14, r15)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r14 = "queued notification work item for conversation %s"
            r13.t(r14, r12)
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgqs.n(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, j$.time.Duration, boolean, cgrc, akbr, fcxy):java.lang.Object");
    }
}
