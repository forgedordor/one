package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zem extends fcyz implements fdat {
    int a;
    final /* synthetic */ zen b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zem(zen zenVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zenVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zem) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r2.a((defpackage.ekgb) r5, r1, r4) == r0) goto L13;
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
            if (r1 == r2) goto L19
            goto L35
        Ld:
            zen r5 = r4.b
            r4.a = r2
            fdpl r5 = r5.b
            java.lang.Object r5 = defpackage.fdtc.a(r5, r4)
            if (r5 == r0) goto L38
        L19:
            zen r1 = r4.b
            ekgb r5 = (defpackage.ekgb) r5
            fcsu r2 = r1.f
            java.lang.Object r2 = r2.b()
            vpq r2 = (defpackage.vpq) r2
            com.google.android.apps.messaging.shared.api.messaging.Conversation r1 = r1.j
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.d()
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r2.a(r5, r1, r4)
            if (r5 != r0) goto L35
            goto L38
        L35:
            fctx r5 = defpackage.fctx.a
            return r5
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zem.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zem(this.b, fcxyVar);
    }
}
