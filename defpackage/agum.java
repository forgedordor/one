package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agum implements aguh {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/penpal/conversation/WelcomeMessageGeneratorImpl");
    private static final fddq b = new fddq(BasePaymentResult.ERROR_REQUEST_FAILED, 270);
    private final Context c;
    private final agud d;
    private final fcsu e;
    private final cogw f;
    private final fcsu g;
    private final ajvr h;
    private final awjh i;
    private final arph j;
    private final fcsu k;

    public agum(fdjx fdjxVar, Context context, agud agudVar, fcsu fcsuVar, cogw cogwVar, fcsu fcsuVar2, ajvr ajvrVar, awjh awjhVar, arph arphVar, fcsu fcsuVar3) {
        fdjxVar.getClass();
        context.getClass();
        agudVar.getClass();
        fcsuVar.getClass();
        cogwVar.getClass();
        fcsuVar2.getClass();
        ajvrVar.getClass();
        awjhVar.getClass();
        arphVar.getClass();
        fcsuVar3.getClass();
        this.c = context;
        this.d = agudVar;
        this.e = fcsuVar;
        this.f = cogwVar;
        this.g = fcsuVar2;
        this.h = ajvrVar;
        this.i = awjhVar;
        this.j = arphVar;
        this.k = fcsuVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aguh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5, defpackage.aoer r6, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.aguj
            if (r0 == 0) goto L13
            r0 = r8
            aguj r0 = (defpackage.aguj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aguj r0 = new aguj
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L27
            goto L71
        L27:
            r5 = move-exception
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r8)
            ejxr r8 = defpackage.crbf.ak
            java.lang.Object r8 = r8.get()
            cczi r8 = (defpackage.cczi) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L49
            goto L71
        L49:
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r4.c(r5, r6, r7, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L71
            return r1
        L52:
            ekrg r6 = defpackage.agum.a
            ekrw r6 = r6.i()
            ekrd r6 = (defpackage.ekrd) r6
            ekrw r5 = r6.g(r5)
            r6 = 81
            java.lang.String r7 = "WelcomeMessageGeneratorImpl.kt"
            java.lang.String r8 = "com/google/android/apps/messaging/penpal/conversation/WelcomeMessageGeneratorImpl"
            java.lang.String r0 = "insertMessageIfEmptyConversation"
            ekrw r5 = r5.h(r8, r0, r6, r7)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Failed to insert Gemini welcome message"
            r5.q(r6)
        L71:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agum.a(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, aoer, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, long r8, defpackage.aoer r10, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r12 instanceof defpackage.agui
            if (r0 == 0) goto L13
            r0 = r12
            agui r0 = (defpackage.agui) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            agui r0 = new agui
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            chug r7 = r0.e
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r12)
            goto Lb9
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r12)
            chxn r12 = defpackage.chxo.F()
            r2 = 0
            basd r2 = defpackage.basd.a(r2)
            r4 = r12
            chug r4 = (defpackage.chug) r4
            r4.a = r2
            j$.util.Optional r2 = r10.o()
            java.lang.Object r2 = r2.get()
            alqm r2 = (defpackage.alqm) r2
            j$.util.Optional r2 = r2.e()
            java.lang.Object r2 = r2.get()
            aubq r2 = (defpackage.aubq) r2
            r12.m(r2)
            alqm r2 = r11.g()
            java.lang.String r2 = r2.p(r3)
            r12.l(r2)
            alqm r2 = r11.g()
            j$.util.Optional r2 = r2.e()
            java.lang.Object r2 = r2.get()
            aubq r2 = (defpackage.aubq) r2
            r12.k(r2)
            r4.d = r7
            r12.o(r8)
            r12.j(r8)
            java.lang.String r7 = "text/plain"
            r4.h = r7
            r12.i()
            r7 = 0
            r12.p(r7)
            r12.e(r7)
            r12.f(r7)
            r12.c(r7)
            r12.d(r7)
            r12.g(r7)
            alqm r7 = r11.g()
            j$.util.Optional r7 = r7.e()
            java.lang.Object r7 = r7.get()
            aubq r7 = (defpackage.aubq) r7
            r0.a = r10
            r0.e = r4
            r0.d = r3
            awjh r8 = r6.i
            java.lang.Object r7 = r8.c(r7, r0)
            if (r7 == r1) goto Le4
            r5 = r12
            r12 = r7
            r7 = r5
        Lb9:
            awjl r12 = (defpackage.awjl) r12
            r7.n(r12)
            arph r8 = r6.j
            boolean r8 = r8.a()
            if (r8 == 0) goto Ldf
            fcsu r8 = r6.k
            java.lang.Object r8 = r8.b()
            awzf r8 = (defpackage.awzf) r8
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r9 = r10.h()
            java.lang.String r9 = r9.b()
            axcm r8 = r8.a(r9)
            r9 = r7
            chug r9 = (defpackage.chug) r9
            r9.c = r8
        Ldf:
            chxo r7 = r7.r()
            return r7
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agum.b(java.lang.String, long, aoer, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (defpackage.fdbq.f(r5.de("messageExistsExpression"), "0") != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:44:0x0159, B:46:0x015d, B:48:0x0180, B:42:0x013f, B:29:0x00c9, B:31:0x00d2, B:33:0x00d8, B:35:0x00e4, B:39:0x0123), top: B:63:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r15v0, types: [agum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r16, defpackage.aoer r17, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agum.c(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, aoer, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.agul
            if (r0 == 0) goto L13
            r0 = r10
            agul r0 = (defpackage.agul) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            agul r0 = new agul
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r10)     // Catch: java.lang.IllegalStateException -> L29
            goto Laf
        L29:
            r9 = move-exception
            goto Lbc
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.fctl.b(r10)
            ajvr r10 = r8.h     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r9.A()     // Catch: java.lang.IllegalStateException -> L29
            r2.<init>(r5)     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r10 = r10.L(r2, r3)     // Catch: java.lang.IllegalStateException -> L29
            ajmh r10 = r10.c()     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9 = r9.C()     // Catch: java.lang.IllegalStateException -> L29
            com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId r2 = new com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId     // Catch: java.lang.IllegalStateException -> L29
            r5 = -1
            r2.<init>(r9, r5)     // Catch: java.lang.IllegalStateException -> L29
            ezgd r9 = defpackage.ezgd.a     // Catch: java.lang.IllegalStateException -> L29
            evsf r9 = r9.createBuilder()     // Catch: java.lang.IllegalStateException -> L29
            ezgc r9 = (defpackage.ezgc) r9     // Catch: java.lang.IllegalStateException -> L29
            r9.getClass()     // Catch: java.lang.IllegalStateException -> L29
            ezeg r5 = defpackage.ezeg.a     // Catch: java.lang.IllegalStateException -> L29
            evsf r5 = r5.createBuilder()     // Catch: java.lang.IllegalStateException -> L29
            ezef r5 = (defpackage.ezef) r5     // Catch: java.lang.IllegalStateException -> L29
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L29
            r5.copyOnWrite()     // Catch: java.lang.IllegalStateException -> L29
            MessageType extends evsn<MessageType, BuilderType> r6 = r5.instance     // Catch: java.lang.IllegalStateException -> L29
            ezeg r6 = (defpackage.ezeg) r6     // Catch: java.lang.IllegalStateException -> L29
            r7 = 4
            int r7 = defpackage.ezaa.a(r7)     // Catch: java.lang.IllegalStateException -> L29
            r6.b = r7     // Catch: java.lang.IllegalStateException -> L29
            evsn r5 = r5.build()     // Catch: java.lang.IllegalStateException -> L29
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L29
            ezeg r5 = (defpackage.ezeg) r5     // Catch: java.lang.IllegalStateException -> L29
            r9.copyOnWrite()     // Catch: java.lang.IllegalStateException -> L29
            MessageType extends evsn<MessageType, BuilderType> r6 = r9.instance     // Catch: java.lang.IllegalStateException -> L29
            ezgd r6 = (defpackage.ezgd) r6     // Catch: java.lang.IllegalStateException -> L29
            r6.c = r5     // Catch: java.lang.IllegalStateException -> L29
            r5 = 3
            r6.b = r5     // Catch: java.lang.IllegalStateException -> L29
            ezah r5 = defpackage.ezah.NUDGE_CLASSIFICATION     // Catch: java.lang.IllegalStateException -> L29
            defpackage.eyzq.b(r5, r9)     // Catch: java.lang.IllegalStateException -> L29
            ezgd r9 = defpackage.eyzq.a(r9)     // Catch: java.lang.IllegalStateException -> L29
            java.util.List r9 = defpackage.fcva.b(r9)     // Catch: java.lang.IllegalStateException -> L29
            ekgb r9 = defpackage.ekfv.a(r9)     // Catch: java.lang.IllegalStateException -> L29
            eiju r9 = r10.m(r2, r9)     // Catch: java.lang.IllegalStateException -> L29
            r9.getClass()     // Catch: java.lang.IllegalStateException -> L29
            r0.c = r4     // Catch: java.lang.IllegalStateException -> L29
            java.lang.Object r10 = defpackage.fdxs.c(r9, r0)     // Catch: java.lang.IllegalStateException -> L29
            if (r10 != r1) goto Laf
            return r1
        Laf:
            r10.getClass()     // Catch: java.lang.IllegalStateException -> L29
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.IllegalStateException -> L29
            boolean r9 = r10.booleanValue()     // Catch: java.lang.IllegalStateException -> L29
            if (r9 == 0) goto Ldb
            r3 = r4
            goto Ldb
        Lbc:
            ekrg r10 = defpackage.agum.a
            ekrw r10 = r10.j()
            ekrd r10 = (defpackage.ekrd) r10
            ekrw r9 = r10.g(r9)
            r10 = 212(0xd4, float:2.97E-43)
            java.lang.String r0 = "WelcomeMessageGeneratorImpl.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/penpal/conversation/WelcomeMessageGeneratorImpl"
            java.lang.String r2 = "nudgeMessage"
            ekrw r9 = r9.h(r1, r2, r10, r0)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Failed to add nudge classification"
            r9.q(r10)
        Ldb:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agum.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }
}
