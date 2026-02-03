package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akoh extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ eiju c;
    final /* synthetic */ boolean d;
    final /* synthetic */ akol e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akoh(eiju eijuVar, boolean z, akol akolVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = eijuVar;
        this.d = z;
        this.e = akolVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akoh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.fctl.b(r5)
            goto L5f
        Lf:
            defpackage.fctl.b(r5)
            goto L20
        L13:
            defpackage.fctl.b(r5)
            eiju r5 = r4.c
            r4.b = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L7c
        L20:
            j$.util.Optional r5 = (j$.util.Optional) r5
            akof r1 = new akof
            r1.<init>()
            akog r2 = new akog
            r2.<init>()
            j$.util.Optional r5 = r5.map(r2)
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L74
            boolean r1 = r5.isPresent()
            if (r1 == 0) goto L69
            boolean r1 = r4.d
            if (r1 == 0) goto L69
            akol r1 = r4.e
            fcsu r1 = r1.c
            java.lang.Object r1 = r1.b()
            akbs r1 = (defpackage.akbs) r1
            java.lang.Object r2 = r5.get()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r2
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = r2.a
            r4.a = r5
            r3 = 2
            r4.b = r3
            java.lang.Object r1 = r1.c(r2, r4)
            if (r1 == r0) goto L7c
            r0 = r5
            r5 = r1
        L5f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L68
            goto L74
        L68:
            r5 = r0
        L69:
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = r5.get()
            ekgb r5 = defpackage.ekgb.r(r5)
            goto L78
        L74:
            int r5 = defpackage.ekgb.d
            ekgb r5 = defpackage.ekoe.a
        L78:
            r5.getClass()
            return r5
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akoh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akoh(this.c, this.d, this.e, fcxyVar);
    }
}
