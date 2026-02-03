package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agun extends fcyz implements fdat {
    int a;
    final /* synthetic */ aguo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agun(aguo aguoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aguoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
    
        if (r14 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L11
            defpackage.fctl.b(r14)
            if (r1 == r3) goto L4e
            if (r1 == r2) goto La9
            goto Ld5
        L11:
            defpackage.fctl.b(r14)
            ejxr r14 = defpackage.crbf.ak
            java.lang.Object r14 = r14.get()
            cczi r14 = (defpackage.cczi) r14
            java.lang.Object r14 = r14.e()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto Ldb
            ejxr r14 = defpackage.crbf.aH
            java.lang.Object r14 = r14.get()
            cczi r14 = (defpackage.cczi) r14
            java.lang.Object r14 = r14.e()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Ldb
            aguo r14 = r13.b
            fcsu r14 = r14.a
            java.lang.Object r14 = r14.b()
            cgte r14 = (defpackage.cgte) r14
            r13.a = r3
            java.lang.Object r14 = r14.g(r13)
            if (r14 == r0) goto Lda
        L4e:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L58
            goto Ldb
        L58:
            aguo r14 = r13.b
            fcsu r1 = r14.a
            java.lang.Object r1 = r1.b()
            cgte r1 = (defpackage.cgte) r1
            r1.k()
            fcsu r1 = r14.b
            java.lang.Object r1 = r1.b()
            alrj r1 = (defpackage.alrj) r1
            alqm r1 = r1.v()
            fcsu r3 = r14.c
            java.lang.Object r3 = r3.b()
            anty r3 = (defpackage.anty) r3
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r1 = r3.h(r1)
            fcsu r14 = r14.d
            java.lang.Object r14 = r14.b()
            ajln r14 = (defpackage.ajln) r14
            akzk r3 = new akzk
            ekgb r4 = defpackage.ekgb.r(r1)
            r4.getClass()
            r11 = 0
            r12 = 246(0xf6, float:3.45E-43)
            r5 = 0
            r6 = 0
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            eiju r14 = r14.h(r3)
            r14.getClass()
            r13.a = r2
            java.lang.Object r14 = defpackage.fdxs.c(r14, r13)
            if (r14 == r0) goto Lda
        La9:
            ekgb r14 = (defpackage.ekgb) r14
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto Ldb
            aguo r1 = r13.b
            fcsu r1 = r1.d
            java.lang.Object r1 = r1.b()
            ajln r1 = (defpackage.ajln) r1
            r2 = 0
            java.lang.Object r14 = r14.get(r2)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r14 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r14
            elka r2 = defpackage.elka.CONVERSATION_FROM_BG_STARTUP_TASK
            eiju r14 = r1.G(r14, r2)
            r14.getClass()
            r1 = 3
            r13.a = r1
            java.lang.Object r14 = defpackage.fdxs.c(r14, r13)
            if (r14 != r0) goto Ld5
            goto Lda
        Ld5:
            java.lang.Void r14 = (java.lang.Void) r14
            fctx r14 = defpackage.fctx.a
            return r14
        Lda:
            return r0
        Ldb:
            fctx r14 = defpackage.fctx.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agun.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agun(this.b, fcxyVar);
    }
}
