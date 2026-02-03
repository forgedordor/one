package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfn extends fcyz implements fdat {
    int a;
    final /* synthetic */ tfq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfn(tfq tfqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tfqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tfn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L31
            goto L50
        Ld:
            tfq r5 = r4.b
            r4.a = r2
            tfx r5 = r5.h
            fcsu r1 = r5.b
            java.lang.Object r1 = r1.b()
            bakh r1 = (defpackage.bakh) r1
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r5.d
            java.lang.String r5 = r5.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.barn.b(r5)
            aukf r2 = defpackage.aukf.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY
            java.lang.Object r5 = r1.c(r5, r2, r4)
            if (r5 == r0) goto L2f
            fctx r5 = defpackage.fctx.a
        L2f:
            if (r5 == r0) goto L53
        L31:
            tfq r5 = r4.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r5.d
            java.lang.String r1 = r1.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.barn.b(r1)
            aukf r2 = defpackage.aukf.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY
            r3 = 2
            r4.a = r3
            tfh r5 = r5.e
            r3 = 5
            java.lang.Object r5 = r5.c(r1, r3, r2, r4)
            if (r5 == r0) goto L4d
            fctx r5 = defpackage.fctx.a
        L4d:
            if (r5 != r0) goto L50
            goto L53
        L50:
            fctx r5 = defpackage.fctx.a
            return r5
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tfn(this.b, fcxyVar);
    }
}
