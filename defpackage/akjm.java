package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akjm implements akkd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/mmsgroupupgrade/DefaultMmsGroupUpgradeDelegate");
    public static final Set b = fcwm.d(cins.a, cins.b, cins.c, cins.d, cins.e, cins.f, cins.g);
    public final ciok c;
    public final cogw d;
    public final fcsu e;
    public final fcsu f;
    private final fdjx g;
    private final fdjx h;
    private final fcsu i;
    private final asre j;
    private final cioj k;
    private final akkc l;
    private final aiwz m;

    public akjm(fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, asre asreVar, cioj ciojVar, akkc akkcVar, ciok ciokVar, aiwz aiwzVar, cogw cogwVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        asreVar.getClass();
        ciojVar.getClass();
        ciokVar.getClass();
        cogwVar.getClass();
        fcsuVar3.getClass();
        this.g = fdjxVar;
        this.h = fdjxVar2;
        this.i = fcsuVar;
        this.j = asreVar;
        this.k = ciojVar;
        this.l = akkcVar;
        this.c = ciokVar;
        this.m = aiwzVar;
        this.d = cogwVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
    }

    public static final boolean g(akkf akkfVar) {
        return akkfVar == akkf.a;
    }

    @Override // defpackage.akkd
    public final eiju a() {
        return auvw.c(this.g, fcyi.a, fdjz.a, new akjh(this, null));
    }

    @Override // defpackage.akkd
    public final eiju b(BugleConversation bugleConversation) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new akjl(bugleConversation, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, defpackage.aubq r7, java.util.List r8, defpackage.fcxy r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.akjc
            if (r0 == 0) goto L13
            r0 = r9
            akjc r0 = (defpackage.akjc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akjc r0 = new akjc
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r9)
            goto Lb4
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r9)
            asre r9 = r5.j
            auce r2 = defpackage.auce.a
            evsf r2 = r2.createBuilder()
            aucd r2 = (defpackage.aucd) r2
            r2.getClass()
            defpackage.aucf.b(r6, r2)
            defpackage.aucf.d(r7, r2)
            defpackage.aucf.f(r2)
            defpackage.aucf.e(r8, r2)
            aueb r7 = defpackage.aueb.a
            evsf r7 = r7.createBuilder()
            auea r7 = (defpackage.auea) r7
            r7.getClass()
            defpackage.auec.b(r3, r7)
            aueb r7 = defpackage.auec.a(r7)
            r2.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r2.instance
            auce r8 = (defpackage.auce) r8
            r8.i = r7
            int r7 = r8.b
            r7 = r7 | 32
            r8.b = r7
            aucb r7 = defpackage.aucb.a
            evsf r7 = r7.createBuilder()
            auca r7 = (defpackage.auca) r7
            r7.getClass()
            defpackage.aucc.b(r6, r7)
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            r6.getClass()
            r7.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r7.instance
            aucb r8 = (defpackage.aucb) r8
            int r4 = r8.b
            r4 = r4 | 8
            r8.b = r4
            r8.f = r6
            aucb r6 = defpackage.aucc.a(r7)
            evqs r6 = r6.toByteString()
            defpackage.aucf.c(r6, r2)
            auce r6 = defpackage.aucf.a(r2)
            eiju r6 = r9.b(r6)
            r6.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r6, r0)
            if (r9 != r1) goto Lb4
            return r1
        Lb4:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjm.c(java.lang.String, aubq, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r14, defpackage.fcxy r15) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjm.d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r13 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r13 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0142, code lost:
    
        if (f(r10, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r10, defpackage.ajts r11, defpackage.aubk r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjm.e(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, ajts, aubk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.cins r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.akjk
            if (r0 == 0) goto L13
            r0 = r7
            akjk r0 = (defpackage.akjk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akjk r0 = new akjk
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cins r6 = r0.e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r0.d
            defpackage.fctl.b(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r7)
            cioj r7 = r4.k
            r0.d = r5
            r0.e = r6
            r0.c = r3
            fcyh r7 = r7.b
            fcyh r7 = defpackage.eicg.a(r7)
            cioc r2 = new cioc
            r3 = 0
            r2.<init>(r3, r6, r5)
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 == r1) goto L82
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7f
            ekrg r7 = defpackage.akjm.a
            ekrw r7 = r7.e()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleGroupManagement"
            r7.X(r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            ekrz r0 = defpackage.cqnc.s
            r7.X(r0, r5)
            r5 = 247(0xf7, float:3.46E-43)
            java.lang.String r0 = "DefaultMmsGroupUpgradeDelegate.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/api/messaging/conversation/mmsgroupupgrade/DefaultMmsGroupUpgradeDelegate"
            java.lang.String r2 = "updateMmsGroupUpgradeStatus"
            ekrw r5 = r7.h(r1, r2, r5, r0)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r7 = "Updated MmsGroupUpgradeStatus to %s"
            r5.t(r7, r6)
        L7f:
            fctx r5 = defpackage.fctx.a
            return r5
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjm.f(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, cins, fcxy):java.lang.Object");
    }
}
