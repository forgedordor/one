package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aguf extends fcyz implements fdat {
    int a;
    final /* synthetic */ BugleConversation b;
    final /* synthetic */ agug c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aguf(fcxy fcxyVar, BugleConversation bugleConversation, agug agugVar) {
        super(2, fcxyVar);
        this.b = bugleConversation;
        this.c = agugVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aguf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db A[ORIG_RETURN, RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            r4 = 0
            defpackage.fctl.b(r8)
            if (r1 == 0) goto L10
            if (r1 == r3) goto L57
            goto Ldb
        L10:
            java.lang.Object r8 = r7.d
            fdjx r8 = (defpackage.fdjx) r8
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r8 = r7.b
            r1 = 3
            fdkf[] r1 = new defpackage.fdkf[r1]
            r5 = r8
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r5
            anpj r6 = r5.f
            eiju r6 = r6.b()
            r6.getClass()
            fdkf r6 = defpackage.auvw.e(r6)
            r1[r4] = r6
            anpj r5 = r5.d
            eiju r5 = r5.b()
            r5.getClass()
            fdkf r5 = defpackage.auvw.e(r5)
            r1[r3] = r5
            ajlu r8 = r8.a()
            anpj r8 = r8.c()
            eiju r8 = r8.b()
            r8.getClass()
            fdkf r8 = defpackage.auvw.e(r8)
            r1[r2] = r8
            r7.a = r3
            java.lang.Object r8 = defpackage.fdii.b(r1, r7)
            if (r8 == r0) goto Ldd
        L57:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r8.get(r4)
            r1.getClass()
            ajlk r1 = (defpackage.ajlk) r1
            java.lang.Object r5 = r8.get(r3)
            r5.getClass()
            ekgb r5 = (defpackage.ekgb) r5
            java.lang.Object r8 = r8.get(r2)
            r8.getClass()
            ajlh r8 = (defpackage.ajlh) r8
            ajlj r1 = r1.c()
            ajlj r6 = defpackage.ajlj.ONE_ON_ONE
            if (r1 != r6) goto L9e
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L83
            goto L9e
        L83:
            java.util.Iterator r1 = r5.iterator()
        L87:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L9e
            java.lang.Object r6 = r1.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            alqm r6 = r6.g()
            boolean r6 = r6.z()
            if (r6 == 0) goto L87
            goto L9f
        L9e:
            r3 = r4
        L9f:
            aoer r8 = r8.g()
            if (r3 == 0) goto Ldb
            agug r1 = r7.c
            fcsu r1 = r1.a
            java.lang.Object r3 = r1.b()
            j$.util.Optional r3 = (j$.util.Optional) r3
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto Ldb
            if (r8 == 0) goto Ldb
            java.lang.Object r1 = r1.b()
            j$.util.Optional r1 = (j$.util.Optional) r1
            java.lang.Object r1 = r1.get()
            aguh r1 = (defpackage.aguh) r1
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r3 = r7.b
            java.lang.Object r4 = r5.get(r4)
            r4.getClass()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r4 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r4
            r7.a = r2
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r3 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = r3.a
            java.lang.Object r8 = r1.a(r2, r8, r4, r7)
            if (r8 != r0) goto Ldb
            goto Ldd
        Ldb:
            r8 = 0
            return r8
        Ldd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aguf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aguf agufVar = new aguf(fcxyVar, this.b, this.c);
        agufVar.d = obj;
        return agufVar;
    }
}
