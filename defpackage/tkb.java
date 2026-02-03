package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkb extends fcyz implements fdat {
    int a;
    Object b;
    int c;
    final /* synthetic */ tkd d;
    final /* synthetic */ tlk e;
    final /* synthetic */ ahat f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkb(tkd tkdVar, tlk tlkVar, ahat ahatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = tkdVar;
        this.e = tlkVar;
        this.f = ahatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tkb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r7.a(r8, r9, (java.lang.Boolean) r4, r1, r14) == r0) goto L34;
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
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L13
            defpackage.fctl.b(r15)
            goto Lc4
        L13:
            int r1 = r14.a
            java.lang.Object r4 = r14.b
            defpackage.fctl.b(r15)
            goto L7f
        L1b:
            defpackage.fctl.b(r15)
            tkd r15 = r14.d
            djwc r1 = r15.e
            boolean r1 = r1.d
            if (r1 == 0) goto L28
            r5 = r4
            goto L29
        L28:
            r5 = r2
        L29:
            tlk r1 = r14.e
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = r1.a
            r7.getClass()
            cczi r6 = defpackage.crtr.a
            ejxr r6 = defpackage.crtr.T
            java.lang.Object r6 = r6.get()
            cczi r6 = (defpackage.cczi) r6
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r3 == r6) goto L48
            r6 = 4
            goto L49
        L48:
            r6 = 3
        L49:
            r11 = r6
            r14.b = r5
            r14.a = r3
            r14.c = r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = r1.b
            java.lang.String r8 = r6.b()
            defpackage.barn.b(r8)
            boolean r8 = defpackage.fdbq.f(r4, r4)
            if (r8 == 0) goto L62
            elka r8 = defpackage.elka.CONVERSATION_FROM_UNBLOCK_ACTION
            goto L64
        L62:
            elka r8 = defpackage.elka.CONVERSATION_FROM_UNSPAM_ACTION
        L64:
            r9 = r8
            int r10 = r1.f
            fcsu r15 = r15.d
            java.lang.Object r15 = r15.b()
            cpjw r15 = (defpackage.cpjw) r15
            r12 = 0
            r13 = 17260(0x436c, float:2.4186E-41)
            r8 = 0
            cpkh r1 = defpackage.cpkg.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = r15.c(r1, r14)
            if (r15 == r0) goto Lc7
            r1 = r3
            r4 = r5
        L7f:
            if (r3 == r1) goto L83
            r1 = 0
            goto L84
        L83:
            r1 = r3
        L84:
            ahat r5 = r14.f
            cpkr r15 = (defpackage.cpkr) r15
            r5.a()
            tlk r5 = r14.e
            tkd r6 = r14.d
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = r5.a
            r7.getClass()
            alqm r7 = r7.g()
            alqj r3 = r7.G(r3)
            java.lang.String r8 = r3.toString()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            if (r15 == 0) goto Lac
            tjz r1 = new tjz
            r1.<init>()
            goto Lb1
        Lac:
            tka r1 = new tka
            r1.<init>()
        Lb1:
            r11 = r1
            tiy r7 = r6.g
            r14.b = r2
            r15 = 2
            r14.c = r15
            r10 = r4
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r12 = r14
            java.lang.Object r15 = r7.a(r8, r9, r10, r11, r12)
            if (r15 != r0) goto Lc4
            goto Lc7
        Lc4:
            fctx r15 = defpackage.fctx.a
            return r15
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tkb(this.d, this.e, this.f, fcxyVar);
    }
}
