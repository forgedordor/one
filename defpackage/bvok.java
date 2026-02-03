package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvok extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvoq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvok(bvoq bvoqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvoqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvok) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r10 == r0) goto L17;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 0
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$handleClickSwitchToGaia$1"
            java.lang.String r5 = "BugleGDitto"
            r6 = 1
            java.lang.String r7 = "GaiaDevicePairingManagerImpl.kt"
            defpackage.fctl.b(r10)
            if (r1 == 0) goto L16
            if (r1 == r6) goto L44
            goto L5e
        L16:
            bvoq r10 = r9.b
            ekrg r1 = r10.i
            ekrw r1 = r1.e()
            ekrz r8 = defpackage.eksq.a
            r1.X(r8, r5)
            r8 = 81
            ekrw r1 = r1.h(r4, r3, r8, r7)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r8 = "re-enable auto-enable gaia pairing."
            r1.q(r8)
            fcsu r10 = r10.c
            java.lang.Object r10 = r10.b()
            bvll r10 = (defpackage.bvll) r10
            eiju r10 = r10.k(r2)
            r9.a = r6
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 == r0) goto Lac
        L44:
            bvoq r10 = r9.b
            fcsu r1 = r10.b
            java.lang.Object r1 = r1.b()
            egbf r1 = (defpackage.egbf) r1
            efwo r10 = r10.a
            com.google.common.util.concurrent.ListenableFuture r10 = r1.c(r10)
            r1 = 2
            r9.a = r1
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 != r0) goto L5e
            goto Lac
        L5e:
            egbe r10 = (defpackage.egbe) r10
            egbs r10 = r10.b()
            java.lang.String r10 = r10.k
            java.lang.String r0 = "pseudonymous"
            boolean r10 = defpackage.fdbq.f(r10, r0)
            if (r10 == 0) goto L8d
            bvoq r10 = r9.b
            ekrg r10 = r10.i
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r5)
            r0 = 86
            ekrw r10 = r10.h(r4, r3, r0, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "No GAIA account is signed in."
            r10.q(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L8d:
            bvoq r10 = r9.b
            ekrg r10 = r10.i
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r5)
            r0 = 89
            ekrw r10 = r10.h(r4, r3, r0, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "GAIA account has signed in."
            r10.q(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvok.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvok(this.b, fcxyVar);
    }
}
