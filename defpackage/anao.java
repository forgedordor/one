package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anao implements anad {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/importmessages/ImportMessageHandlerImpl");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fcsu f;
    private final fcsu g;
    private final dqsn h;
    private final fcsu i;
    private final fcsu j;

    public anao(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, dqsn dqsnVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        dqsnVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.e = fdjxVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.h = dqsnVar;
        this.d = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
    }

    public static final Object j(MessageIdType messageIdType, MessageIdType messageIdType2) {
        String[] strArr = bqmc.a;
        bqkx bqkxVar = new bqkx();
        bqkxVar.d(messageIdType);
        bqkxVar.e(messageIdType2);
        bqkxVar.c();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleDittoRcs");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/importmessages/ImportMessageHandlerImpl", "updateReplyMessage", 181, "ImportMessageHandlerImpl.kt")).D("UpdateReplyMessage: reply message is updated successfully with messageId: %s, repliedToMessageId: %s.", messageIdType, messageIdType2);
        return fctx.a;
    }

    @Override // defpackage.anad
    public final eiju a(ckwl ckwlVar) {
        ckwlVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new anaj(this, ckwlVar, null));
    }

    @Override // defpackage.anad
    public final eiju b(MessageIdType messageIdType, MessageIdType messageIdType2) {
        messageIdType.getClass();
        messageIdType2.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new anan(this, messageIdType, messageIdType2, null));
    }

    @Override // defpackage.anad
    public final eiju c(anpj anpjVar, BugleConversationId bugleConversationId, aoer aoerVar, amvr amvrVar, basd basdVar, Instant instant, MessageId messageId) {
        anpjVar.getClass();
        bugleConversationId.getClass();
        aoerVar.getClass();
        amvrVar.getClass();
        basdVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new anai(this, anpjVar, bugleConversationId, aoerVar, amvrVar, basdVar, instant, messageId, null));
    }

    @Override // defpackage.anad
    public final eiju d(anpj anpjVar, BugleConversationId bugleConversationId, aoer aoerVar, amwf amwfVar, basd basdVar, Instant instant) {
        anpjVar.getClass();
        bugleConversationId.getClass();
        aoerVar.getClass();
        amwfVar.getClass();
        basdVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new anal(this, anpjVar, bugleConversationId, aoerVar, amwfVar, basdVar, instant, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
    
        if (j(r2, r15) == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.anpj r15, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r16, defpackage.aoer r17, defpackage.amvr r18, defpackage.basd r19, j$.time.Instant r20, int r21, com.google.android.apps.messaging.shared.api.messaging.MessageId r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anao.e(anpj, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, aoer, amvr, basd, j$.time.Instant, int, com.google.android.apps.messaging.shared.api.messaging.MessageId, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.anpj r23, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r24, defpackage.aoer r25, defpackage.amwf r26, defpackage.basd r27, j$.time.Instant r28, int r29, defpackage.fcxy r30) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r30
            boolean r3 = r2 instanceof defpackage.anak
            if (r3 == 0) goto L19
            r3 = r2
            anak r3 = (defpackage.anak) r3
            int r4 = r3.f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f = r4
            goto L1e
        L19:
            anak r3 = new anak
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.d
            fcyl r4 = defpackage.fcyl.a
            int r5 = r3.f
            r6 = 1
            if (r5 == 0) goto L46
            if (r5 != r6) goto L3e
            int r1 = r3.c
            j$.time.Instant r4 = r3.i
            basd r5 = r3.h
            java.lang.Object r6 = r3.b
            java.lang.Object r7 = r3.a
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r3 = r3.g
            defpackage.fctl.b(r2)
            r13 = r1
            r1 = r3
            r8 = r4
            r9 = r5
            r5 = r6
            goto L6d
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L46:
            defpackage.fctl.b(r2)
            r3.g = r1
            r2 = r25
            r3.a = r2
            r5 = r26
            r3.b = r5
            r7 = r27
            r3.h = r7
            r8 = r28
            r3.i = r8
            r9 = r29
            r3.c = r9
            r3.f = r6
            r6 = r23
            java.lang.Object r3 = r0.g(r6, r1, r3)
            if (r3 != r4) goto L6a
            return r4
        L6a:
            r13 = r9
            r9 = r7
            r7 = r2
        L6d:
            fcsu r2 = r0.j
            java.lang.Object r2 = r2.b()
            cogw r2 = (defpackage.cogw) r2
            j$.time.Instant r2 = r2.f()
            fcsu r3 = r0.f
            java.lang.Object r3 = r3.b()
            bveg r3 = (defpackage.bveg) r3
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r4 = r7.h()
            java.lang.String r10 = r4.b()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r11 = r7.h()
            java.lang.String r15 = r5.c()
            long r18 = r8.toEpochMilli()
            long r20 = r2.toEpochMilli()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12 = r1.a
            r16 = 1
            r17 = 1
            r14 = 3
            r8 = r3
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r2 = r8.s(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            j$.util.Optional r3 = r7.o()
            java.lang.Object r3 = r3.get()
            alqm r3 = (defpackage.alqm) r3
            r2.bP(r3)
            dqsn r3 = r0.h
            anae r4 = new anae
            r4.<init>()
            java.lang.String r1 = "ImportMessageHandlerImpl#importTextRcsMessage"
            java.lang.Object r1 = r3.c(r1, r4)
            r1.getClass()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anao.f(anpj, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, aoer, amwf, basd, j$.time.Instant, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.anpj r5, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.anam
            if (r0 == 0) goto L13
            r0 = r7
            anam r0 = (defpackage.anam) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            anam r0 = new anam
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6 = r0.d
            defpackage.fctl.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            eiju r5 = r5.b()
            r5.getClass()
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r5, r0)
            if (r7 == r1) goto Lb0
        L45:
            ajts r7 = (defpackage.ajts) r7
            boolean r5 = r7.z()
            java.lang.String r0 = "preCheckOneOnOneConversation"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/api/messaging/message/importmessages/ImportMessageHandlerImpl"
            java.lang.String r2 = "BugleDittoRcs"
            java.lang.String r3 = "ImportMessageHandlerImpl.kt"
            if (r5 != 0) goto L89
            int r5 = r7.A()
            boolean r5 = defpackage.bvdi.c(r5)
            if (r5 == 0) goto L62
            fctx r5 = defpackage.fctx.a
            return r5
        L62:
            ekrg r5 = defpackage.anao.a
            ekrw r5 = r5.h()
            ekrz r7 = defpackage.eksq.a
            r5.X(r7, r2)
            ekrd r5 = (defpackage.ekrd) r5
            ekrz r7 = defpackage.cqnc.t
            r5.X(r7, r6)
            r6 = 444(0x1bc, float:6.22E-43)
            ekrw r5 = r5.h(r1, r0, r6, r3)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Detected it is not a 1:1 conversation."
            r5.q(r6)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Not a 1:1 conversation."
            r5.<init>(r6)
            throw r5
        L89:
            ekrg r5 = defpackage.anao.a
            ekrw r5 = r5.h()
            ekrz r7 = defpackage.eksq.a
            r5.X(r7, r2)
            ekrd r5 = (defpackage.ekrd) r5
            ekrz r7 = defpackage.cqnc.t
            r5.X(r7, r6)
            r6 = 437(0x1b5, float:6.12E-43)
            ekrw r5 = r5.h(r1, r0, r6, r3)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Detected conversation is deleted."
            r5.q(r6)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Conversation is deleted."
            r5.<init>(r6)
            throw r5
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anao.g(anpj, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, fcxy):java.lang.Object");
    }

    public final void h(basd basdVar, BugleConversationId bugleConversationId) throws cfpn {
        if ((basd.l(basdVar) ? ((baxe) this.g.b()).y(basdVar) : null) == null) {
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleDittoRcs");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.t, bugleConversationId);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/importmessages/ImportMessageHandlerImpl", "precheckMessageNotExists", 462, "ImportMessageHandlerImpl.kt")).q("Detected duplicate message.");
        throw new cfpn();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.anpj r34, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r35, defpackage.aoer r36, defpackage.cfpo r37, defpackage.basd r38, j$.time.Instant r39, int r40, defpackage.fcxy r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anao.i(anpj, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, aoer, cfpo, basd, j$.time.Instant, int, fcxy):java.lang.Object");
    }
}
