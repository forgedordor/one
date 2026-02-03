package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxur implements bxun {
    public final fcsu a;
    private final fcsu b;
    private final fdjx c;

    public bxur(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.a = fcsuVar2;
        this.c = fdjxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bxun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r7, java.lang.String r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bxuq
            if (r0 == 0) goto L13
            r0 = r9
            bxuq r0 = (defpackage.bxuq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bxuq r0 = new bxuq
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L89
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.fctl.b(r9)
            goto L6a
        L36:
            defpackage.fctl.b(r9)
            fcsu r9 = r6.b
            java.lang.Object r9 = r9.b()
            bxwy r9 = (defpackage.bxwy) r9
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$FreeTextSearchFilter r2 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$FreeTextSearchFilter
            r2.<init>(r8)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationSearchFilter r8 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationSearchFilter
            java.lang.String r7 = r7.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = defpackage.barn.b(r7)
            r8.<init>(r7)
            ekgb r7 = defpackage.ekgb.s(r2, r8)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery r7 = com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.d(r7)
            com.google.common.util.concurrent.ListenableFuture r7 = r9.a(r7)
            r7.getClass()
            r0.c = r4
            java.lang.Object r9 = defpackage.fdxs.c(r7, r0)
            if (r9 == r1) goto L8d
        L6a:
            fdjx r7 = r6.c
            bxwf r9 = (defpackage.bxwf) r9
            fcyi r8 = defpackage.fcyi.a
            fdjz r2 = defpackage.fdjz.a
            fcyh r8 = defpackage.eicg.a(r8)
            bxup r4 = new bxup
            r5 = 0
            r4.<init>(r5, r6, r9)
            fdkf r7 = defpackage.fdin.b(r7, r8, r2, r4)
            r0.c = r3
            java.lang.Object r9 = r7.c(r0)
            if (r9 != r1) goto L89
            goto L8d
        L89:
            r9.getClass()
            return r9
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxur.a(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, java.lang.String, fcxy):java.lang.Object");
    }
}
