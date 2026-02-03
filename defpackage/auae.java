package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auae implements atzy {
    private final ajln a;
    private final aofc b;
    private final aoew c;

    public auae(ajln ajlnVar, aofc aofcVar, aoew aoewVar) {
        ajlnVar.getClass();
        aofcVar.getClass();
        aoewVar.getClass();
        this.a = ajlnVar;
        this.b = aofcVar;
        this.c = aoewVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.awjl r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.auac
            if (r0 == 0) goto L13
            r0 = r6
            auac r0 = (defpackage.auac) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            auac r0 = new auac
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
            ajln r6 = r4.a
            eiju r5 = r6.i(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L53
        L43:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r6
            if (r6 == 0) goto L50
            java.lang.String r5 = r6.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.barn.b(r5)
            return r5
        L50:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.barn.a
            return r5
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auae.a(awjl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.awjl r8, defpackage.axcm r9, defpackage.ajsm r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.auad
            if (r0 == 0) goto L13
            r0 = r11
            auad r0 = (defpackage.auad) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            auad r0 = new auad
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r11)
            goto L9a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.a
            ajsm r9 = r0.f
            awjl r10 = r0.e
            defpackage.fctl.b(r11)
            goto L74
        L40:
            ajsm r10 = r0.f
            awjl r8 = r0.e
            defpackage.fctl.b(r11)
            goto L59
        L48:
            defpackage.fctl.b(r11)
            aoew r11 = r7.c
            r0.e = r8
            r0.f = r10
            r0.d = r5
            java.lang.Object r11 = r11.a(r9, r0)
            if (r11 == r1) goto Lb3
        L59:
            aofc r9 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r11 = (com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId) r11
            eiju r9 = r9.e(r11)
            r0.e = r8
            r0.f = r10
            r0.a = r11
            r0.d = r4
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto Lb3
            r6 = r10
            r10 = r8
            r8 = r11
            r11 = r9
            r9 = r6
        L74:
            r11.getClass()
            j$.util.Optional r11 = (j$.util.Optional) r11
            java.lang.Object r11 = defpackage.fdct.b(r11)
            aoer r11 = (defpackage.aoer) r11
            if (r11 == 0) goto La5
            ajln r8 = r7.a
            eiju r8 = r8.n(r10, r11, r9)
            r8.getClass()
            r9 = 0
            r0.e = r9
            r0.f = r9
            r0.a = r9
            r0.d = r3
            java.lang.Object r11 = defpackage.fdxs.c(r8, r0)
            if (r11 != r1) goto L9a
            goto Lb3
        L9a:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r11 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r11
            java.lang.String r8 = r11.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = defpackage.barn.b(r8)
            return r8
        La5:
            java.lang.String r9 = "Received empty SelfIdentity, for the given SelfIdentityId: "
            java.lang.String r10 = "."
            java.lang.String r8 = defpackage.a.h(r8, r9, r10)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r8)
            throw r9
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auae.b(awjl, axcm, ajsm, fcxy):java.lang.Object");
    }
}
