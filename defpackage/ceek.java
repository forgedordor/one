package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceek extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cfdv d;
    final /* synthetic */ ceel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceek(cfdv cfdvVar, ceel ceelVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = cfdvVar;
        this.e = ceelVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceek) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r8 == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[PHI: r8
      0x005f: PHI (r8v10 java.lang.Object) = (r8v6 java.lang.Object), (r8v0 java.lang.Object) binds: [B:13:0x005d, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L10
            defpackage.fctl.b(r8)
            if (r1 == r2) goto L5f
            goto L74
        L10:
            java.lang.Object r1 = r7.b
            java.lang.Object r3 = r7.a
            defpackage.fctl.b(r8)
            goto L45
        L18:
            defpackage.fctl.b(r8)
            cfdv r8 = r7.d
            ceel r1 = r7.e
            cenj r4 = r1.c
            java.lang.String r5 = r1.b
            ezpo r4 = r4.a(r5)
            evsn r4 = r4.build()
            r4.getClass()
            ezpp r4 = (defpackage.ezpp) r4
            eiju r4 = r8.c(r4)
            r7.a = r8
            cezv r1 = r1.d
            r7.b = r1
            r7.c = r3
            java.lang.Object r3 = defpackage.fdxs.c(r4, r7)
            if (r3 == r0) goto La0
            r6 = r3
            r3 = r8
            r8 = r6
        L45:
            r8.getClass()
            eziu r8 = (defpackage.eziu) r8
            cfdv r3 = (defpackage.cfdv) r3
            cezv r1 = (defpackage.cezv) r1
            eiju r8 = r3.d(r1, r8)
            r1 = 0
            r7.a = r1
            r7.b = r1
            r7.c = r2
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 == r0) goto La0
        L5f:
            cfdv r1 = r7.d
            eziw r8 = (defpackage.eziw) r8
            r8.getClass()
            eiju r8 = r1.e(r8)
            r1 = 3
            r7.c = r1
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto L74
            goto La0
        L74:
            eziw r8 = (defpackage.eziw) r8
            ekrg r0 = defpackage.ceel.a
            ekrw r0 = r0.e()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleNetwork"
            r0.X(r1, r2)
            r1 = 72
            java.lang.String r2 = "GaiaDeviceInfoProviderV2.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/net/GaiaDeviceInfoProviderV2$getRegisteredGaiaDeviceInfo$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ceel r1 = r7.e
            java.lang.String r2 = "Received registered Gaia device information for app: %s"
            java.lang.String r1 = r1.b
            r0.t(r2, r1)
            evtg r8 = r8.c
            r8.getClass()
            return r8
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceek.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ceek(this.d, this.e, fcxyVar);
    }
}
