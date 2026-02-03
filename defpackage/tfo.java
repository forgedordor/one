package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfo extends fcyz implements fdat {
    int a;
    final /* synthetic */ tfq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfo(fcxy fcxyVar, tfq tfqVar) {
        super(2, fcxyVar);
        this.b = tfqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tfo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r5 == r0) goto L15;
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
            if (r1 == r2) goto L27
            goto L46
        Ld:
            java.lang.Object r5 = r4.c
            fdjx r5 = (defpackage.fdjx) r5
            tfq r5 = r4.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r5.d
            java.lang.String r1 = r1.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.barn.b(r1)
            r4.a = r2
            aglr r5 = r5.f
            java.lang.Object r5 = r5.c(r1, r4)
            if (r5 == r0) goto L49
        L27:
            tfq r5 = r4.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r5.d
            java.lang.String r1 = r1.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = defpackage.barn.b(r1)
            r2 = 2
            r4.a = r2
            tfh r5 = r5.e
            r2 = 6
            aukf r3 = defpackage.aukf.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY
            java.lang.Object r5 = r5.c(r1, r2, r3, r4)
            if (r5 == r0) goto L43
            fctx r5 = defpackage.fctx.a
        L43:
            if (r5 != r0) goto L46
            goto L49
        L46:
            fctx r5 = defpackage.fctx.a
            return r5
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tfo tfoVar = new tfo(fcxyVar, this.b);
        tfoVar.c = obj;
        return tfoVar;
    }
}
