package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akmk extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ ConversationId f;
    final /* synthetic */ akml g;
    final /* synthetic */ aoer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akmk(ConversationId conversationId, akml akmlVar, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = conversationId;
        this.g = akmlVar;
        this.h = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akmk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (defpackage.fdxs.c(r2, r9) != r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b1: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:178), block:B:30:0x00b1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L18
            java.lang.Object r0 = r9.b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r1 = r9.a
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L15
            goto La2
        L15:
            r10 = move-exception
            goto Lb2
        L18:
            java.lang.Object r1 = r9.d
            java.lang.Object r2 = r9.c
            java.lang.Object r4 = r9.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r4
            java.lang.Object r5 = r9.a
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2b
            r8 = r2
            r2 = r1
            r1 = r5
            r5 = r4
            r4 = r8
            goto L6b
        L2b:
            r10 = move-exception
            goto Lb1
        L2e:
            defpackage.fctl.b(r10)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r9.f
            akml r10 = r9.g
            aoer r1 = r9.h
            java.lang.String r5 = "RbmConversationRepository#setActiveSelfIdentity"
            eieu r5 = defpackage.eiiy.a(r5)
            boolean r6 = r4 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto La9
            fcsu r6 = r10.b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L2b
            ajvr r6 = (defpackage.ajvr) r6     // Catch: java.lang.Throwable -> L2b
            r7 = r4
            com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId r7 = (com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId) r7     // Catch: java.lang.Throwable -> L2b
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r7 = r7.b     // Catch: java.lang.Throwable -> L2b
            eiju r6 = r6.x(r7, r1)     // Catch: java.lang.Throwable -> L2b
            r6.getClass()     // Catch: java.lang.Throwable -> L2b
            r9.a = r5     // Catch: java.lang.Throwable -> L2b
            r9.b = r4     // Catch: java.lang.Throwable -> L2b
            r9.c = r10     // Catch: java.lang.Throwable -> L2b
            r9.d = r1     // Catch: java.lang.Throwable -> L2b
            r9.e = r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = defpackage.fdxs.c(r6, r9)     // Catch: java.lang.Throwable -> L2b
            if (r2 == r0) goto La8
            r8 = r4
            r4 = r10
            r10 = r2
            r2 = r1
            r1 = r5
            r5 = r8
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L15
            boolean r6 = r10.booleanValue()     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto La1
            akml r4 = (defpackage.akml) r4     // Catch: java.lang.Throwable -> L15
            fcsu r4 = r4.d     // Catch: java.lang.Throwable -> L15
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L15
            bydc r4 = (defpackage.bydc) r4     // Catch: java.lang.Throwable -> L15
            com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId) r5     // Catch: java.lang.Throwable -> L15
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r5.a     // Catch: java.lang.Throwable -> L15
            r5.getClass()     // Catch: java.lang.Throwable -> L15
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r6 = r2.h()     // Catch: java.lang.Throwable -> L15
            j$.util.Optional r2 = j$.util.Optional.of(r2)     // Catch: java.lang.Throwable -> L15
            eiju r2 = r4.h(r5, r6, r2)     // Catch: java.lang.Throwable -> L15
            r9.a = r1     // Catch: java.lang.Throwable -> L15
            r9.b = r10     // Catch: java.lang.Throwable -> L15
            r9.c = r3     // Catch: java.lang.Throwable -> L15
            r9.d = r3     // Catch: java.lang.Throwable -> L15
            r4 = 2
            r9.e = r4     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = defpackage.fdxs.c(r2, r9)     // Catch: java.lang.Throwable -> L15
            if (r2 == r0) goto La8
        La1:
            r0 = r10
        La2:
            defpackage.fczl.a(r1, r3)
            r0.getClass()
        La8:
            return r0
        La9:
            java.lang.String r10 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        Lb1:
            r1 = r5
        Lb2:
            throw r10     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r0 = move-exception
            defpackage.fczl.a(r1, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akmk(this.f, this.g, this.h, fcxyVar);
    }
}
