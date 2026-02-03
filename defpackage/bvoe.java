package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvoe extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bvmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvoe(bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvoe) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r7 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            java.lang.Object r1 = r6.b
            ekqg r1 = (defpackage.ekqg) r1
            defpackage.fctl.b(r7)
            goto L3e
        L11:
            defpackage.fctl.b(r7)
            goto L35
        L15:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.b
            java.lang.String r7 = (java.lang.String) r7
            bvmw r1 = r6.c
            fcsu r1 = r1.d
            java.lang.Object r1 = r1.b()
            bvkr r1 = (defpackage.bvkr) r1
            eiju r7 = r1.i(r7)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 == r0) goto L9b
        L35:
            ekgb r7 = (defpackage.ekgb) r7
            ekqh r1 = r7.iterator()
            r1.getClass()
        L3e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L76
            java.lang.Object r7 = r1.next()
            bowp r7 = (defpackage.bowp) r7
            bvmw r2 = r6.c
            fcsu r3 = r2.d
            java.lang.Object r3 = r3.b()
            bvkr r3 = (defpackage.bvkr) r3
            java.lang.String r4 = r7.q()
            java.lang.String r5 = r7.r()
            j$.util.Optional r7 = r3.m(r7)
            bvks r7 = r3.g(r4, r5, r7)
            cfdf r2 = r2.e
            eiju r7 = r2.b(r7)
            r6.b = r1
            r2 = 2
            r6.a = r2
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 != r0) goto L3e
            goto L9b
        L76:
            bvmw r7 = r6.c
            ekrg r7 = r7.l
            ekrw r7 = r7.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleGDitto"
            r7.X(r0, r1)
            r0 = 283(0x11b, float:3.97E-43)
            java.lang.String r1 = "GaiaDevicePairingManagerDelegateImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$unpairGaiaClients$2"
            java.lang.String r3 = "invokeSuspend"
            ekrw r7 = r7.h(r2, r3, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "Gaia Desktops have been unpaired"
            r7.q(r0)
            fctx r7 = defpackage.fctx.a
            return r7
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvoe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvoe bvoeVar = new bvoe(this.c, fcxyVar);
        bvoeVar.b = obj;
        return bvoeVar;
    }
}
