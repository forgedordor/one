package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdf {
    private static final cqce b = cqce.g("BugleGaia", "DittoUnpairHandler");
    public final fcsu a;
    private final fdjx c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public cfdf(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.c = fdjxVar;
        this.a = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
    }

    public final eiju a(bvks bvksVar, String str) {
        str.getClass();
        cfef cfefVarA = ((cfeh) this.d.b()).a(bvksVar, epby.GET_UPDATES);
        cfefVarA.c = str;
        eozc eozcVar = (eozc) eoze.a.createBuilder();
        epfn epfnVar = (epfn) ((epfm) epfn.a.createBuilder()).build();
        eozcVar.copyOnWrite();
        eoze eozeVar = (eoze) eozcVar.instance;
        epfnVar.getClass();
        eozeVar.c = epfnVar;
        eozeVar.b = 14;
        cfefVarA.b(eozcVar.build());
        cfefVarA.f = true;
        eiju eijuVarB = ((cfya) this.e.b()).b(cfefVarA.a());
        eijuVarB.getClass();
        return eijuVarB;
    }

    public final eiju b(bvks bvksVar) {
        bvksVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new cfdd(bvksVar, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bvks r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cfdc
            if (r0 == 0) goto L13
            r0 = r6
            cfdc r0 = (defpackage.cfdc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfdc r0 = new cfdc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)     // Catch: defpackage.fbtf -> L55
            goto L5c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.f
            java.lang.Object r6 = r6.b()
            cfga r6 = (defpackage.cfga) r6
            ezol r5 = r5.d
            cffz r5 = r6.a(r5)
            fcsu r6 = r4.g     // Catch: defpackage.fbtf -> L55
            java.lang.Object r6 = r6.b()     // Catch: defpackage.fbtf -> L55
            cema r6 = (defpackage.cema) r6     // Catch: defpackage.fbtf -> L55
            eiju r5 = r6.a(r5)     // Catch: defpackage.fbtf -> L55
            r0.c = r3     // Catch: defpackage.fbtf -> L55
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)     // Catch: defpackage.fbtf -> L55
            if (r5 != r1) goto L5c
            return r1
        L55:
            cqce r5 = defpackage.cfdf.b
            java.lang.String r6 = "RevokeRelayPairingRpcHandlerFactory failed with StatusRuntimeException"
            r5.n(r6)
        L5c:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdf.c(bvks, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.bvix r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cfde
            if (r0 == 0) goto L13
            r0 = r7
            cfde r0 = (defpackage.cfde) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfde r0 = new cfde
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)     // Catch: defpackage.fbtf -> L5d
            goto L64
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.a
            java.lang.Object r7 = r7.b()
            bvkr r7 = (defpackage.bvkr) r7
            r2 = r6
            bviv r2 = (defpackage.bviv) r2
            bvks r2 = r2.b
            boolean r7 = r7.s(r2)
            if (r7 != 0) goto L4c
            cqce r7 = defpackage.cfdf.b
            java.lang.String r4 = "Desktop not found when attempting to unpair gaia desktop"
            r7.r(r4)
        L4c:
            bviv r6 = (defpackage.bviv) r6     // Catch: defpackage.fbtf -> L5d
            java.lang.String r6 = r6.a     // Catch: defpackage.fbtf -> L5d
            eiju r6 = r5.a(r2, r6)     // Catch: defpackage.fbtf -> L5d
            r0.c = r3     // Catch: defpackage.fbtf -> L5d
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)     // Catch: defpackage.fbtf -> L5d
            if (r6 != r1) goto L64
            return r1
        L5d:
            cqce r6 = defpackage.cfdf.b
            java.lang.String r7 = "sendUnpairGaiaRpc failed with StatusRuntimeException"
            r6.n(r7)
        L64:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdf.d(bvix, fcxy):java.lang.Object");
    }

    public final void e(ezol ezolVar) {
        fcsu fcsuVar = this.h;
        if (!((bviy) fcsuVar.b()).b(ezolVar)) {
            b.p("No need to clear Ditto active desktop ids");
        } else {
            ((bviy) fcsuVar.b()).a();
            b.p("Ditto active desktop ids have been cleared");
        }
    }
}
