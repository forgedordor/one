package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tki extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ tkk c;
    final /* synthetic */ tlk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tki(tkk tkkVar, tlk tlkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = tkkVar;
        this.d = tlkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tki) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if (r2.e.a(r15, null, true, r8, r14) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r14.b
            r2 = 2
            r3 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L15
            defpackage.fctl.b(r15)
            goto L95
        L15:
            java.lang.Object r1 = r14.a
            defpackage.fctl.b(r15)
            goto L67
        L1b:
            defpackage.fctl.b(r15)
            goto L4e
        L1f:
            defpackage.fctl.b(r15)
            tkk r15 = r14.c
            tlk r1 = r14.d
            r14.b = r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = r1.b
            java.lang.String r4 = r6.b()
            defpackage.barn.b(r4)
            fcsu r15 = r15.d
            java.lang.Object r15 = r15.b()
            cpjw r15 = (defpackage.cpjw) r15
            elka r9 = defpackage.elka.CONVERSATION_FROM_UNSPAM_ACTION
            int r10 = r1.f
            r12 = 0
            r13 = 17260(0x436c, float:2.4186E-41)
            r4 = 0
            r7 = 0
            r8 = 0
            r11 = 5
            cpkh r1 = defpackage.cpkg.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = r15.c(r1, r14)
            if (r15 == r0) goto L98
        L4e:
            r1 = r15
            cpkr r1 = (defpackage.cpkr) r1
            if (r1 == 0) goto L95
            tkk r15 = r14.c
            fcsu r15 = r15.d
            java.lang.Object r15 = r15.b()
            cpjw r15 = (defpackage.cpjw) r15
            r14.a = r1
            r14.b = r2
            java.lang.Object r15 = r15.b(r1, r14)
            if (r15 == r0) goto L98
        L67:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r15 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r15
            if (r15 == 0) goto L95
            tkk r2 = r14.c
            alqm r15 = r15.g()
            alqj r15 = r15.G(r3)
            java.lang.String r15 = r15.toString()
            tlk r3 = r14.d
            tkh r8 = new tkh
            cpkr r1 = (defpackage.cpkr) r1
            r8.<init>()
            r1 = 0
            r14.a = r1
            r1 = 3
            r14.b = r1
            tiy r4 = r2.e
            r6 = 0
            r9 = r14
            r7 = r5
            r5 = r15
            java.lang.Object r15 = r4.a(r5, r6, r7, r8, r9)
            if (r15 != r0) goto L95
            goto L98
        L95:
            fctx r15 = defpackage.fctx.a
            return r15
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tki.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tki(this.c, this.d, fcxyVar);
    }
}
