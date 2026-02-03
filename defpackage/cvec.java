package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvec extends fcyz implements fdat {
    int a;
    final /* synthetic */ cved b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvec(cved cvedVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvedVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvec) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r4 == r0) goto L16;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L3b
        Ld:
            cved r4 = r3.b
            fcsu r4 = r4.a
            java.lang.Object r4 = r4.b()
            csms r4 = (defpackage.csms) r4
            r3.a = r2
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L4f
        L1f:
            efwo r4 = (defpackage.efwo) r4
            if (r4 == 0) goto L4c
            cved r1 = r3.b
            fcsu r1 = r1.b
            java.lang.Object r1 = r1.b()
            egbf r1 = (defpackage.egbf) r1
            com.google.common.util.concurrent.ListenableFuture r4 = r1.c(r4)
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 != r0) goto L3b
            goto L4f
        L3b:
            cved r0 = r3.b
            egbe r4 = (defpackage.egbe) r4
            egbs r4 = r4.b()
            java.lang.String r4 = r4.g
            android.content.Intent r0 = r0.e
            java.lang.String r1 = "extra.accountName"
            r0.putExtra(r1, r4)
        L4c:
            fctx r4 = defpackage.fctx.a
            return r4
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvec.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvec(this.b, fcxyVar);
    }
}
