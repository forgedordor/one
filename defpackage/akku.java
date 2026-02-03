package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akku extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ akkv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akku(akkv akkvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = akkvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akku) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L10
            defpackage.fctl.b(r9)
            return r9
        L10:
            java.lang.Object r1 = r8.a
            defpackage.fctl.b(r9)
            r3 = r1
            goto L4e
        L17:
            defpackage.fctl.b(r9)
            goto L31
        L1b:
            defpackage.fctl.b(r9)
            akkv r9 = r8.c
            anpj r9 = r9.d
            eiju r9 = r9.b()
            r9.getClass()
            r8.b = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 == r0) goto L7a
        L31:
            akkv r1 = r8.c
            akkx r9 = (defpackage.akkx) r9
            com.google.android.apps.messaging.shared.api.messaging.Conversation r1 = r1.b
            anpj r1 = r1.g()
            eiju r1 = r1.b()
            r1.getClass()
            r8.a = r9
            r8.b = r2
            java.lang.Object r1 = defpackage.fdxs.c(r1, r8)
            if (r1 == r0) goto L7a
            r3 = r9
            r9 = r1
        L4e:
            akkv r1 = r8.c
            r2 = r9
            ekgb r2 = (defpackage.ekgb) r2
            fcsu r9 = r1.a
            java.lang.Object r9 = r9.b()
            akcv r9 = (defpackage.akcv) r9
            r2.getClass()
            r3.getClass()
            com.google.android.apps.messaging.shared.api.messaging.Conversation r4 = r1.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r4.d()
            r4 = 0
            r8.a = r4
            r4 = 3
            r8.b = r4
            ajln r4 = r1.c
            r6 = 0
            r7 = r8
            r1 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L79
            goto L7a
        L79:
            return r9
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akku.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akku(this.c, fcxyVar);
    }
}
