package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjob implements bayf, baxy, baxx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/participant/ConversationDraftingUpdater");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fdjx h;
    public final cjoh i;
    public final aqnx j;
    public final cjoi k;
    private final fdjx l;

    public cjob(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fdjx fdjxVar, fdjx fdjxVar2, cjoh cjohVar, cjoi cjoiVar, aqnx aqnxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fdjxVar;
        this.l = fdjxVar2;
        this.i = cjohVar;
        this.k = cjoiVar;
        this.j = aqnxVar;
    }

    public static final boolean f(bojh bojhVar) {
        return bvdi.c(bojhVar.k()) && !bojhVar.an();
    }

    private final void h(ConversationIdType conversationIdType, Recipient recipient) {
        auvw.m(this.h, null, new cjoa(this, conversationIdType, recipient, null), 3);
    }

    @Override // defpackage.baxx
    public final void a(axcm axcmVar, ConversationIdType conversationIdType, awjl awjlVar) {
        auvw.c(this.l, fcyi.a, fdjz.a, new cjnx(this, axcmVar, conversationIdType, awjlVar, null));
    }

    @Override // defpackage.baxy
    public final void b(ConversationIdType conversationIdType, Recipient recipient) {
        h(conversationIdType, recipient);
    }

    @Override // defpackage.bayf
    public final void c(ConversationIdType conversationIdType, Recipient recipient) {
        conversationIdType.getClass();
        h(conversationIdType, recipient);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjnu
            if (r0 == 0) goto L13
            r0 = r6
            cjnu r0 = (defpackage.cjnu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjnu r0 = new cjnu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.c
            java.lang.Object r6 = r6.b()
            cteb r6 = (defpackage.cteb) r6
            ctea r2 = new ctea
            r2.<init>()
            eosc r5 = r6.c
            eiju r5 = defpackage.eijx.g(r2, r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjob.d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.bojh r5, com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cjnv
            if (r0 == 0) goto L13
            r0 = r7
            cjnv r0 = (defpackage.cjnv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjnv r0 = new cjnv
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            r7 = 2
            anpj r6 = r6.E(r7)
            eiju r6 = r6.b()
            r6.getClass()
            r0.a = r5
            r0.d = r3
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L68
        L4a:
            anyy r7 = (defpackage.anyy) r7
            boolean r6 = r7.q()
            r7 = 0
            if (r6 == 0) goto L62
            bojh r5 = (defpackage.bojh) r5
            int r6 = r5.r()
            if (r6 != 0) goto L62
            boolean r5 = f(r5)
            if (r5 == 0) goto L62
            goto L63
        L62:
            r3 = r7
        L63:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjob.e(bojh, com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.awjl r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cjnw
            if (r0 == 0) goto L13
            r0 = r7
            cjnw r0 = (defpackage.cjnw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjnw r0 = new cjnw
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            awjl r6 = r0.e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r0.d
            defpackage.fctl.b(r7)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r7)
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r4.d(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            fdjx r7 = r4.h
            cjny r0 = new cjny
            r1 = 0
            r0.<init>(r4, r5, r6, r1)
            r5 = 3
            defpackage.auvw.m(r7, r1, r0, r5)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjob.g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, awjl, fcxy):java.lang.Object");
    }
}
