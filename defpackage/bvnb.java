package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvnb extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bvmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvnb(bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvnb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r7.a
            defpackage.fctl.b(r8)
            goto L64
        Lf:
            defpackage.fctl.b(r8)
            goto L2e
        L13:
            defpackage.fctl.b(r8)
            bvmw r8 = r7.c
            fcsu r1 = r8.b
            java.lang.Object r1 = r1.b()
            egbf r1 = (defpackage.egbf) r1
            efwo r8 = r8.a
            com.google.common.util.concurrent.ListenableFuture r8 = r1.c(r8)
            r7.b = r2
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 == r0) goto Le5
        L2e:
            egbe r8 = (defpackage.egbe) r8
            egbs r1 = r8.b()
            java.lang.String r1 = r1.k
            java.lang.String r2 = "pseudonymous"
            boolean r1 = defpackage.fdbq.f(r1, r2)
            if (r1 == 0) goto L40
            r8 = 0
            return r8
        L40:
            egbs r8 = r8.b()
            java.lang.String r8 = r8.g
            r8.getClass()
            bvmw r1 = r7.c
            fcsu r1 = r1.c
            java.lang.Object r1 = r1.b()
            bvll r1 = (defpackage.bvll) r1
            eiju r1 = r1.e()
            r7.a = r8
            r2 = 2
            r7.b = r2
            java.lang.Object r1 = defpackage.fdxs.c(r1, r7)
            if (r1 == r0) goto Le5
            r0 = r8
            r8 = r1
        L64:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$enablePairing$1"
            java.lang.String r3 = "BugleGDitto"
            java.lang.String r4 = "GaiaDevicePairingManagerDelegateImpl.kt"
            if (r8 == 0) goto Lbd
            int r5 = r8.length()
            if (r5 <= 0) goto Lbd
            boolean r5 = defpackage.fdbq.f(r8, r0)
            if (r5 == 0) goto L9d
            bvmw r0 = r7.c
            ekrg r5 = r0.l
            ekrw r5 = r5.h()
            ekrz r6 = defpackage.eksq.a
            r5.X(r6, r3)
            r3 = 455(0x1c7, float:6.38E-43)
            ekrw r1 = r5.h(r2, r1, r3, r4)
            ekrd r1 = (defpackage.ekrd) r1
            efwo r0 = r0.a
            java.lang.String r2 = "No need to enable the Gaia pairing, as it is already on, accountId = %s"
            java.lang.String r0 = r0.toString()
            r1.t(r2, r0)
            return r8
        L9d:
            bvmw r8 = r7.c
            ekrg r5 = r8.l
            ekrw r5 = r5.j()
            ekrz r6 = defpackage.eksq.a
            r5.X(r6, r3)
            r6 = 463(0x1cf, float:6.49E-43)
            ekrw r5 = r5.h(r2, r1, r6, r4)
            ekrd r5 = (defpackage.ekrd) r5
            efwo r8 = r8.a
            java.lang.String r6 = "Enable the Gaia pairing for another account, accountId = %s"
            java.lang.String r8 = r8.toString()
            r5.t(r6, r8)
        Lbd:
            bvmw r8 = r7.c
            fcsu r5 = r8.c
            java.lang.Object r5 = r5.b()
            bvll r5 = (defpackage.bvll) r5
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r5.n(r6)
            ekrg r8 = r8.l
            ekrw r8 = r8.h()
            ekrz r5 = defpackage.eksq.a
            r8.X(r5, r3)
            r3 = 470(0x1d6, float:6.59E-43)
            ekrw r8 = r8.h(r2, r1, r3, r4)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r1 = "Gaia device pairing has been enabled"
            r8.q(r1)
        Le5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvnb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvnb(this.c, fcxyVar);
    }
}
