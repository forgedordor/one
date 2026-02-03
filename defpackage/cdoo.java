package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdoo extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cdoq c;
    final /* synthetic */ ConversationIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdoo(cdoq cdoqVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cdoqVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdoo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r6 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r6 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r6 == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:19:0x0064). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L11
            defpackage.fctl.b(r6)
            goto L8e
        L11:
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L64
        L17:
            defpackage.fctl.b(r6)
            goto L39
        L1b:
            defpackage.fctl.b(r6)
            cdoq r6 = r5.c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r5.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r4 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r4.<init>(r1)
            anty r6 = r6.a
            anpj r6 = r6.e(r4)
            eiju r6 = r6.b()
            r5.b = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L97
        L39:
            ekgb r6 = (defpackage.ekgb) r6
            r6.getClass()
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L45
            goto L69
        L45:
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
        L4a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r1.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            eiju r6 = r6.s()
            r5.a = r1
            r5.b = r2
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L97
        L64:
            anvg r4 = defpackage.anvg.b
            if (r6 != r4) goto L4a
            r3 = 0
        L69:
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r5.d
            r6.<init>(r1)
            if (r3 == 0) goto L75
            akbl r1 = defpackage.akbl.b
            goto L77
        L75:
            akbl r1 = defpackage.akbl.c
        L77:
            cdoq r2 = r5.c
            ajln r2 = r2.b
            eiju r6 = r2.A(r6, r1)
            r6.getClass()
            r1 = 0
            r5.a = r1
            r1 = 3
            r5.b = r1
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L97
        L8e:
            r0 = r6
            java.lang.Void r0 = (java.lang.Void) r0
            cdoq r0 = r5.c
            r0.b()
            return r6
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdoo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdoo(this.c, this.d, fcxyVar);
    }
}
