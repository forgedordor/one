package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csba implements ajzi {
    public final fcsu a;
    private final fdjx b;
    private final cohg c;

    public csba(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.b = fdjxVar;
        this.a = fcsuVar;
        this.c = new cohf("AutomationDetectionOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.c.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        if (crtr.a()) {
            return auvw.c(this.b, fcyi.a, fdjz.a, new csaz(bugleConversation, this, null));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.csay
            if (r0 == 0) goto L13
            r0 = r6
            csay r0 = (defpackage.csay) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csay r0 = new csay
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            alza r5 = r5.m()
            r6 = 2
            eiju r5 = r5.O(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L74
        L43:
            ekgb r6 = (defpackage.ekgb) r6
            int r5 = r6.size()
            r0 = 0
            if (r5 <= r3) goto L51
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L51:
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L5c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L5c:
            java.lang.Object r5 = r6.get(r0)
            ajlt r5 = (defpackage.ajlt) r5
            ajmc r5 = r5.d()
            int r5 = r5.d()
            r6 = 3
            if (r5 != r6) goto L6e
            goto L6f
        L6e:
            r3 = r0
        L6f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csba.c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, fcxy):java.lang.Object");
    }
}
