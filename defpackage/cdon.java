package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdon implements bakm {
    public final aptm a;
    private final fcsu b;
    private final fdjx c;
    private final fcsu d;
    private final anty e;
    private final akbs f;

    public cdon(fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2, anty antyVar, aptm aptmVar, akbs akbsVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        antyVar.getClass();
        aptmVar.getClass();
        akbsVar.getClass();
        this.b = fcsuVar;
        this.c = fdjxVar;
        this.d = fcsuVar2;
        this.e = antyVar;
        this.a = aptmVar;
        this.f = akbsVar;
    }

    @Override // defpackage.bakm
    public final void a(ConversationIdType conversationIdType, ajsm ajsmVar) {
        auvw.k(this.c, null, null, new cdom(this, conversationIdType, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cdok
            if (r0 == 0) goto L13
            r0 = r6
            cdok r0 = (defpackage.cdok) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdok r0 = new cdok
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            akbs r6 = r4.f
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r2.<init>(r5)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.h(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            fcsu r0 = r4.d
            akbk r6 = (defpackage.akbk) r6
            java.lang.Object r0 = r0.b()
            cdmg r0 = (defpackage.cdmg) r0
            akbj r0 = new akbj
            r0.<init>(r6)
            defpackage.cdmg.e(r5, r0)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdon.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (r7 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cdol
            if (r0 == 0) goto L13
            r0 = r7
            cdol r0 = (defpackage.cdol) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdol r0 = new cdol
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r0.d
            defpackage.fctl.b(r7)
            goto L90
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r0.d
            defpackage.fctl.b(r7)
            goto L56
        L3a:
            defpackage.fctl.b(r7)
            anty r7 = r5.e
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r2.<init>(r6)
            anpj r7 = r7.e(r2)
            eiju r7 = r7.b()
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto La6
        L56:
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.fcva.p(r7, r4)
            r2.<init>(r4)
            java.util.Iterator r7 = r7.iterator()
        L6a:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r7.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r4 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r4
            alqm r4 = r4.g()
            r2.add(r4)
            goto L6a
        L7e:
            fcsu r7 = r5.b
            java.lang.Object r7 = r7.b()
            anvh r7 = (defpackage.anvh) r7
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r7.b(r2, r0)
            if (r7 == r1) goto La6
        L90:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto La3
            fcsu r7 = r5.d
            java.lang.Object r7 = r7.b()
            cdmg r7 = (defpackage.cdmg) r7
            defpackage.cdmg.b(r6)
        La3:
            fctx r6 = defpackage.fctx.a
            return r6
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdon.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }
}
