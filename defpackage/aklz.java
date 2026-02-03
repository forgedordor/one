package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aklz implements cdfg {
    private final fcsu a;
    private final fdjx b;

    public aklz(fcsu fcsuVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fdjxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aklx
            if (r0 == 0) goto L13
            r0 = r5
            aklx r0 = (defpackage.aklx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aklx r0 = new aklx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.a
            java.lang.Object r5 = r5.b()
            ajvr r5 = (defpackage.ajvr) r5
            anpj r5 = r5.H(r3)
            eiju r5 = r5.b()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto La4
        L4a:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L5e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r5.next()
            ajlp r1 = (defpackage.ajlp) r1
            r1.getClass()
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r1.c()
            boolean r2 = r2 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            if (r2 == 0) goto L89
            fcsu r2 = r4.a
            java.lang.Object r2 = r2.b()
            ajvr r2 = (defpackage.ajvr) r2
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.c()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r1
            r3 = 0
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r1 = r2.L(r1, r3)
            goto L9b
        L89:
            fcsu r2 = r4.a
            java.lang.Object r2 = r2.b()
            ajvr r2 = (defpackage.ajvr) r2
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.c()
            ajlm r3 = defpackage.ajlm.MINIMAL
            com.google.android.apps.messaging.shared.api.messaging.Conversation r1 = r2.a(r1, r3)
        L9b:
            r0.add(r1)
            goto L5e
        L9f:
            java.lang.Object r5 = defpackage.fcva.P(r0)
            return r5
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklz.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new akly(this, null));
    }
}
