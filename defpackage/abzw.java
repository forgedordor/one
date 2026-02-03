package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzw extends fcyz implements fdat {
    int a;
    final /* synthetic */ acaa b;
    final /* synthetic */ efwo c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abzw(acaa acaaVar, efwo efwoVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = acaaVar;
        this.c = efwoVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abzw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r6 == r0) goto L16;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L42
        Ld:
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L2f
        L11:
            r6 = move-exception
            goto L45
        L13:
            defpackage.fctl.b(r6)
            acaa r6 = r5.b     // Catch: java.lang.Throwable -> L11
            fcsu r6 = r6.e     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L11
            egbf r6 = (defpackage.egbf) r6     // Catch: java.lang.Throwable -> L11
            efwo r1 = r5.c     // Catch: java.lang.Throwable -> L11
            com.google.common.util.concurrent.ListenableFuture r6 = r6.c(r1)     // Catch: java.lang.Throwable -> L11
            r5.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L2f
            goto L41
        L2f:
            egbe r6 = (defpackage.egbe) r6     // Catch: java.lang.Throwable -> L11
            acaa r1 = r5.b     // Catch: java.lang.Throwable -> L11
            r6.getClass()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = r5.d     // Catch: java.lang.Throwable -> L11
            r4 = 2
            r5.a = r4     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r1.c(r6, r3, r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r0) goto L42
        L41:
            return r0
        L42:
            abzu r6 = (defpackage.abzu) r6     // Catch: java.lang.Throwable -> L11
            return r6
        L45:
            ekrg r0 = defpackage.acaa.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r3 = "BugleGaia"
            r0.X(r1, r3)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r6 = r0.g(r6)
            r0 = 75
            java.lang.String r1 = "GmsGaiaCapabilityRetriever.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapability$1$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r6 = r6.h(r3, r4, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "Retrieving capability failed"
            r6.q(r0)
            acaa r6 = r5.b
            r6.d(r2)
            abzu r6 = defpackage.abzu.FAILED
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abzw(this.b, this.c, this.d, fcxyVar);
    }
}
