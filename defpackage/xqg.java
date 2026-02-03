package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqg extends fcyz implements fdat {
    int a;
    final /* synthetic */ xqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqg(xqi xqiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xqiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xqg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r1.c(r5, r2, r4) == r0) goto L15;
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
            goto L31
        Ld:
            xqi r5 = r4.b
            r4.a = r2
            fdpl r5 = r5.d
            java.lang.Object r5 = defpackage.fdtc.a(r5, r4)
            if (r5 == r0) goto L34
        L19:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = defpackage.fcva.Y(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            if (r5 == 0) goto L31
            xqi r1 = r4.b
            eofr r2 = defpackage.eofr.REPORTED_NOT_SPAM
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r1.c(r5, r2, r4)
            if (r5 != r0) goto L31
            goto L34
        L31:
            fctx r5 = defpackage.fctx.a
            return r5
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xqg(this.b, fcxyVar);
    }
}
