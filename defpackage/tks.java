package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tks extends fcyz implements fdat {
    Object a;
    int b;
    int c;
    final /* synthetic */ tku d;
    final /* synthetic */ tlk e;
    final /* synthetic */ ahat f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tks(tku tkuVar, tlk tlkVar, ahat ahatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = tkuVar;
        this.e = tlkVar;
        this.f = ahatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tks) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r7.a(r8, (java.lang.Boolean) r4, r10, r11, r14) == r0) goto L30;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r14.c
            r2 = 0
            r3 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L13
            defpackage.fctl.b(r15)
            goto Lab
        L13:
            int r1 = r14.b
            java.lang.Object r4 = r14.a
            defpackage.fctl.b(r15)
            goto L65
        L1b:
            defpackage.fctl.b(r15)
            tku r15 = r14.d
            djwc r1 = r15.e
            boolean r1 = r1.d
            if (r1 == 0) goto L28
            r4 = r5
            goto L29
        L28:
            r4 = r2
        L29:
            tlk r1 = r14.e
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = r1.a
            r7.getClass()
            r14.a = r4
            r14.b = r3
            r14.c = r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = r1.b
            java.lang.String r8 = r6.b()
            defpackage.barn.b(r8)
            boolean r8 = defpackage.fdbq.f(r4, r5)
            if (r8 == 0) goto L48
            elka r8 = defpackage.elka.CONVERSATION_FROM_UNBLOCK_ACTION
            goto L4a
        L48:
            elka r8 = defpackage.elka.CONVERSATION_FROM_UNSPAM_ACTION
        L4a:
            r9 = r8
            int r10 = r1.f
            fcsu r15 = r15.d
            java.lang.Object r15 = r15.b()
            cpjw r15 = (defpackage.cpjw) r15
            r12 = 0
            r13 = 17260(0x436c, float:2.4186E-41)
            r8 = 0
            r11 = 4
            cpkh r1 = defpackage.cpkg.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = r15.c(r1, r14)
            if (r15 == r0) goto Lae
            r1 = r3
        L65:
            if (r3 == r1) goto L69
            r1 = 0
            goto L6a
        L69:
            r1 = r3
        L6a:
            ahat r5 = r14.f
            cpkr r15 = (defpackage.cpkr) r15
            r5.a()
            tlk r5 = r14.e
            tku r6 = r14.d
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = r5.a
            r7.getClass()
            alqm r7 = r7.g()
            alqj r3 = r7.G(r3)
            java.lang.String r8 = r3.toString()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            if (r15 != 0) goto L93
            tkq r15 = new tkq
            r15.<init>()
            r11 = r15
            goto L99
        L93:
            tkr r1 = new tkr
            r1.<init>()
            r11 = r1
        L99:
            tiy r7 = r6.g
            r14.a = r2
            r15 = 2
            r14.c = r15
            r9 = r4
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r12 = r14
            java.lang.Object r15 = r7.a(r8, r9, r10, r11, r12)
            if (r15 != r0) goto Lab
            goto Lae
        Lab:
            fctx r15 = defpackage.fctx.a
            return r15
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tks.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tks(this.d, this.e, this.f, fcxyVar);
    }
}
