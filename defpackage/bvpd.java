package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvpd extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvot b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvpd(bvot bvotVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvotVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvpd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (defpackage.fdxs.c(r8, r7) != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[Catch: all -> 0x001c, PHI: r8
      0x008a: PHI (r8v21 java.lang.Object) = (r8v10 java.lang.Object), (r8v0 java.lang.Object) binds: [B:23:0x0088, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:6:0x000f, B:7:0x0014, B:24:0x008a, B:8:0x0018, B:18:0x0047, B:20:0x004f, B:22:0x0076, B:13:0x0022, B:15:0x0032), top: B:30:0x0009 }] */
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
            java.lang.String r2 = "GaiaDevicePairingOptOutManagerImpl.kt"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L18
            if (r1 == r4) goto L14
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L1c
            goto La6
        L14:
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L1c
            goto L8a
        L18:
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L1c
            goto L47
        L1c:
            r8 = move-exception
            goto L9d
        L1f:
            defpackage.fctl.b(r8)
            bvot r8 = r7.b     // Catch: java.lang.Throwable -> L1c
            fcsu r1 = r8.d     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L1c
            aqpb r1 = (defpackage.aqpb) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L76
            fcsu r8 = r8.a     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L1c
            bvll r8 = (defpackage.bvll) r8     // Catch: java.lang.Throwable -> L1c
            eiju r8 = r8.b()     // Catch: java.lang.Throwable -> L1c
            r7.a = r5     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)     // Catch: java.lang.Throwable -> L1c
            if (r8 != r0) goto L47
            goto L9c
        L47:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L1c
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r8 != 0) goto L76
            bvot r8 = r7.b     // Catch: java.lang.Throwable -> L1c
            cqce r8 = r8.e     // Catch: java.lang.Throwable -> L1c
            ekrg r0 = defpackage.cqce.a     // Catch: java.lang.Throwable -> L1c
            ekrw r0 = r0.e()     // Catch: java.lang.Throwable -> L1c
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L1c
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L1c
            java.lang.String r8 = r8.b     // Catch: java.lang.Throwable -> L1c
            r0.X(r1, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r8 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingOptOutManagerImpl$switchGaiaPairing$1"
            java.lang.String r1 = "invokeSuspend"
            r3 = 164(0xa4, float:2.3E-43)
            ekrw r8 = r0.h(r8, r1, r3, r2)     // Catch: java.lang.Throwable -> L1c
            ekrd r8 = (defpackage.ekrd) r8     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = "Cannot switch gaia pairing, device cannot register for gaia pairing"
            r8.q(r0)     // Catch: java.lang.Throwable -> L1c
            fctx r8 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L1c
            return r8
        L76:
            bvpj r8 = defpackage.bvpk.a     // Catch: java.lang.Throwable -> L1c
            efwo r1 = r7.c     // Catch: java.lang.Throwable -> L1c
            bvpc r2 = new bvpc     // Catch: java.lang.Throwable -> L1c
            bvot r5 = r7.b     // Catch: java.lang.Throwable -> L1c
            r6 = 0
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L1c
            r7.a = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r8 = r8.b(r1, r3, r2, r7)     // Catch: java.lang.Throwable -> L1c
            if (r8 == r0) goto L9c
        L8a:
            bvot$a r8 = (bvot.a) r8     // Catch: java.lang.Throwable -> L1c
            bvmv r8 = r8.aI()     // Catch: java.lang.Throwable -> L1c
            eiju r8 = r8.c()     // Catch: java.lang.Throwable -> L1c
            r7.a = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)     // Catch: java.lang.Throwable -> L1c
            if (r8 != r0) goto La6
        L9c:
            return r0
        L9d:
            bvot r0 = r7.b
            cqce r0 = r0.e
            java.lang.String r1 = "Error while switching Gaia device pairing"
            r0.s(r1, r8)
        La6:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvpd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvpd(this.b, this.c, fcxyVar);
    }
}
