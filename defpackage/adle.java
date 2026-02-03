package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adle extends fcyz implements fdat {
    int a;
    final /* synthetic */ adlf b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adle(adlf adlfVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = adlfVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adle) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r8 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r8 == r0) goto L27;
     */
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
            r2 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L4a
            goto L77
        Le:
            adlf r8 = r7.b
            fduf r1 = r8.g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r1.f(r3)
            boolean r1 = r7.c
            java.lang.String r3 = "conversationId"
            java.lang.String r4 = "selfIdentity"
            r5 = 0
            if (r1 == 0) goto L4d
            fcsu r1 = r8.e
            java.lang.Object r1 = r1.b()
            ajln r1 = (defpackage.ajln) r1
            aoer r6 = r8.i
            if (r6 != 0) goto L32
            defpackage.fdbq.c(r4)
            r6 = r5
        L32:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r8 = r8.h
            if (r8 != 0) goto L3a
            defpackage.fdbq.c(r3)
            goto L3b
        L3a:
            r5 = r8
        L3b:
            eiju r8 = r1.f(r6, r5)
            r8.getClass()
            r7.a = r2
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 == r0) goto L76
        L4a:
            akhc r8 = (defpackage.akhc) r8
            goto L79
        L4d:
            fcsu r1 = r8.e
            java.lang.Object r1 = r1.b()
            ajln r1 = (defpackage.ajln) r1
            aoer r2 = r8.i
            if (r2 != 0) goto L5d
            defpackage.fdbq.c(r4)
            r2 = r5
        L5d:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r8 = r8.h
            if (r8 != 0) goto L65
            defpackage.fdbq.c(r3)
            goto L66
        L65:
            r5 = r8
        L66:
            eiju r8 = r1.g(r2, r5)
            r8.getClass()
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto L77
        L76:
            return r0
        L77:
            akhg r8 = (defpackage.akhg) r8
        L79:
            adlf r8 = r7.b
            fduf r0 = r8.g
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f(r1)
            boolean r0 = r7.c
            fduf r8 = r8.f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.f(r0)
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adle.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adle(this.b, this.c, fcxyVar);
    }
}
