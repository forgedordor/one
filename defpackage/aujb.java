package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aujb {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler");
    public final fcyh b;
    public final fcsu c;
    public final fcsu d;
    public final efnn e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final asrp j;

    public aujb(fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, auau auauVar, fcsu fcsuVar5, cqdr cqdrVar, fcsu fcsuVar6, asrp asrpVar, efnn efnnVar) {
        fcyhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        auauVar.getClass();
        fcsuVar5.getClass();
        cqdrVar.getClass();
        fcsuVar6.getClass();
        asrpVar.getClass();
        this.b = fcyhVar;
        this.c = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.d = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = asrpVar;
        this.e = efnnVar;
    }

    public final asrg a(ajts ajtsVar, ekgb ekgbVar) {
        ajtsVar.getClass();
        if (ajtsVar.c() == ajlj.ONE_ON_ONE) {
            E e = ekgbVar.get(0);
            e.getClass();
            alqm alqmVar = (alqm) e;
            if (!alqmVar.e().isPresent()) {
                return ((asrh) this.d.b()).b(alqmVar.p(true));
            }
            return new asrg((aubq) alqmVar.e().get());
        }
        String strN = ajtsVar.N();
        if (strN == null || strN.length() <= 0) {
            throw new IllegalArgumentException("RCS group id is missing.");
        }
        String strM = ajtsVar.M();
        if (strM == null || strM.length() <= 0) {
            throw new IllegalArgumentException("RCS conference uri is missing.");
        }
        if (ekgbVar.isEmpty()) {
            throw new IllegalArgumentException("No group participants provided.");
        }
        asrh asrhVar = (asrh) this.d.b();
        String strN2 = ajtsVar.N();
        strN2.getClass();
        String strM2 = ajtsVar.M();
        strM2.getClass();
        return asrhVar.d(strN2, strM2, ekgbVar);
    }

    public final cbcw b(chvf chvfVar, cayy cayyVar) {
        chvfVar.getClass();
        if (chvfVar.c() == 0) {
            ((ekrd) a.e().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler", "handleSendMessageResult", 352, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send successful.");
            return cbcw.i();
        }
        if (chvfVar.c() == -1) {
            ((ekrd) a.e().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler", "handleSendMessageResult", 356, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send pending.");
            return cbcw.i();
        }
        ((ekrd) a.j().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler", "handleSendMessageResult", 360, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
        return (cayyVar == null || !cayyVar.c()) ? cbcw.k() : cbcw.m();
    }

    public final Object c(BugleConversationId bugleConversationId, fcxy fcxyVar) {
        eiju eijuVarB = ((DefaultConversation) ((ajvr) this.g.b()).L(bugleConversationId, false)).f.b();
        eijuVarB.getClass();
        return fdxs.c(eijuVarB, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.auiy
            if (r0 == 0) goto L13
            r0 = r7
            auiy r0 = (defpackage.auiy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            auiy r0 = new auiy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L59
        L36:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.g
            java.lang.Object r7 = r7.b()
            ajvr r7 = (defpackage.ajvr) r7
            r2 = 0
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r6 = r7.L(r6, r2)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r6
            anpj r6 = r6.f
            eiju r6 = r6.b()
            r6.getClass()
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L71
        L59:
            ajts r7 = (defpackage.ajts) r7
            aoer r6 = r7.h()
            fcsu r7 = r5.f
            java.lang.Object r7 = r7.b()
            chtk r7 = (defpackage.chtk) r7
            r0.c = r3
            java.lang.Object r6 = r7.i(r6, r0)
            if (r6 != r1) goto L70
            goto L71
        L70:
            return r6
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aujb.d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, fcxy):java.lang.Object");
    }

    public final Object e(chfd chfdVar, aubq aubqVar, awjl awjlVar, aufx aufxVar, boolean z, fcxy fcxyVar) {
        return f(chfdVar, awjlVar, null, aubqVar, aufxVar, z, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.chfd r17, defpackage.awjl r18, defpackage.awpx r19, defpackage.aubq r20, defpackage.aufx r21, boolean r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aujb.f(chfd, awjl, awpx, aubq, aufx, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.chfd r10, defpackage.asrg r11, defpackage.aubq r12, defpackage.aufx r13, boolean r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r15 instanceof defpackage.auja
            if (r0 == 0) goto L13
            r0 = r15
            auja r0 = (defpackage.auja) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            auja r0 = new auja
            r0.<init>(r9, r15)
        L18:
            r8 = r0
            java.lang.Object r15 = r8.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.fctl.b(r15)
            return r15
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            boolean r14 = r8.a
            aufx r13 = r8.g
            aubq r12 = r8.f
            chfd r10 = r8.e
            defpackage.fctl.b(r15)
            goto L54
        L3f:
            defpackage.fctl.b(r15)
            asrp r15 = r9.j
            r8.e = r10
            r8.f = r12
            r8.g = r13
            r8.a = r14
            r8.d = r3
            java.lang.Object r15 = r15.a(r11, r8)
            if (r15 == r0) goto L70
        L54:
            r5 = r12
            r6 = r13
            r7 = r14
            chbs r15 = (defpackage.chbs) r15
            awjl r3 = r15.a
            awpx r4 = r15.b
            r11 = 0
            r8.e = r11
            r8.f = r11
            r8.g = r11
            r8.d = r2
            r1 = r9
            r2 = r10
            java.lang.Object r10 = r1.f(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L6f
            goto L70
        L6f:
            return r10
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aujb.g(chfd, asrg, aubq, aufx, boolean, fcxy):java.lang.Object");
    }
}
