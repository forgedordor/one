package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvoy extends fcyz implements fdat {
    int a;
    final /* synthetic */ egbv b;
    final /* synthetic */ bvot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvoy(egbv egbvVar, bvot bvotVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = egbvVar;
        this.c = bvotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvoy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            java.lang.String r2 = "GaiaDevicePairingOptOutManagerImpl.kt"
            java.lang.String r3 = "Bugle.Gaia.Pairing.Disabled.When.Removing.Account.Failure.Count"
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 == r4) goto L11
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            goto L4c
        L11:
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            goto L36
        L15:
            r9 = move-exception
            goto L82
        L17:
            r9 = move-exception
            goto L88
        L19:
            defpackage.fctl.b(r9)
            bvpo r9 = defpackage.bvpp.a     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            egbv r1 = r8.b     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            egdc r1 = (defpackage.egdc) r1     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            efwo r1 = r1.a     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            bvox r5 = new bvox     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            bvot r6 = r8.c     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            r7 = 0
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            r8.a = r4     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            r4 = 4
            java.lang.Object r9 = r9.a(r1, r4, r5, r8)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            if (r9 != r0) goto L36
            goto L4b
        L36:
            bvot$a r9 = (bvot.a) r9     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            bvmv r9 = r9.aI()     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            egbv r1 = r8.b     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            eiju r9 = r9.l(r1)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            r1 = 2
            r8.a = r1     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            if (r9 != r0) goto L4c
        L4b:
            return r0
        L4c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            if (r9 == 0) goto L8d
            bvot r9 = r8.c     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            fcsu r0 = r9.c     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            ains r0 = (defpackage.ains) r0     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            java.lang.String r1 = "Bugle.Gaia.Pairing.Disabled.When.Removing.Account.Success.Count"
            r0.c(r1)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            ekrg r9 = r9.f     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            ekrw r9 = r9.h()     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            ekrz r0 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            java.lang.String r1 = "BugleGDitto"
            r9.X(r0, r1)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingOptOutManagerImpl$optOutFromGaiaPairing$3"
            java.lang.String r1 = "invokeSuspend"
            r4 = 148(0x94, float:2.07E-43)
            ekrw r9 = r9.h(r0, r1, r4, r2)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            java.lang.String r0 = "Successfully disabled Gaia device pairing"
            r9.q(r0)     // Catch: java.lang.Throwable -> L15 defpackage.bvpp -> L17
            goto L8d
        L82:
            bvot r0 = r8.c
            r0.h(r3, r9)
            goto L8d
        L88:
            bvot r0 = r8.c
            r0.g(r3, r9)
        L8d:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvoy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvoy(this.b, this.c, fcxyVar);
    }
}
