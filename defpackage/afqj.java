package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqj extends fcyz implements fdat {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ fdjx d;
    final /* synthetic */ afqm e;
    final /* synthetic */ fhaz f;
    final /* synthetic */ vvw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqj(fdjx fdjxVar, afqm afqmVar, fhaz fhazVar, vvw vvwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = fdjxVar;
        this.e = afqmVar;
        this.f = fhazVar;
        this.g = vvwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afqj) c((fcvv) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r1.c(r2, r7, r3, r6) == r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r7)
            goto L69
        Ld:
            java.lang.Object r1 = r6.a
            java.lang.Object r2 = r6.c
            com.google.android.apps.messaging.shared.api.messaging.Conversation r2 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r2
            defpackage.fctl.b(r7)
            goto L37
        L17:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.c
            fcvv r7 = (defpackage.fcvv) r7
            java.lang.Object r7 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r7
            afqm r1 = r6.e
            vvw r3 = r6.g
            r6.c = r7
            r6.a = r1
            r6.b = r2
            afpo r2 = r1.n
            java.lang.Object r2 = r2.a(r3, r6)
            if (r2 == r0) goto L6c
            r5 = r2
            r2 = r7
            r7 = r5
        L37:
            vvw r7 = (defpackage.vvw) r7
            if (r7 != 0) goto L53
            eksp r7 = defpackage.afqm.a
            afqm r1 = (defpackage.afqm) r1
            cujd r7 = r1.s
            android.content.Context r0 = r1.e
            r1 = 2132084352(0x7f150680, float:1.9808872E38)
            java.lang.String r0 = r0.getString(r1)
            r0.getClass()
            r7.a(r0)
            fctx r7 = defpackage.fctx.a
            return r7
        L53:
            afqm r1 = r6.e
            fhaz r3 = r6.f
            r3.getClass()
            r4 = 0
            r6.c = r4
            r6.a = r4
            r4 = 2
            r6.b = r4
            java.lang.Object r7 = r1.c(r2, r7, r3, r6)
            if (r7 != r0) goto L69
            goto L6c
        L69:
            fctx r7 = defpackage.fctx.a
            return r7
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afqj afqjVar = new afqj(this.d, this.e, this.f, this.g, fcxyVar);
        afqjVar.c = obj;
        return afqjVar;
    }
}
