package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpn {
    private static final eksp a = eksp.c("GnpSdk");
    private final ejwi b;

    public dxpn(ejwi ejwiVar) {
        this.b = ejwiVar;
    }

    public final Object a(dxnj dxnjVar, fcxy fcxyVar) {
        int iOrdinal = dxnjVar.ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? new dxfx(null) : b(fcxyVar) : c(fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dxpl
            if (r0 == 0) goto L13
            r0 = r5
            dxpl r0 = (defpackage.dxpl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxpl r0 = new dxpl
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L46
            r1 = 1
            if (r0 != r1) goto L3e
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L2a
            dxfx r0 = new dxfx     // Catch: java.lang.Exception -> L2a
            r0.<init>(r5)     // Catch: java.lang.Exception -> L2a
            return r0
        L2a:
            r5 = move-exception
            eksp r0 = defpackage.dxpn.a
            ekrw r0 = r0.i()
            java.lang.String r1 = "Failed getting YouTube visitor data cookie"
            defpackage.a.N(r0, r1, r5)
            dxfp r0 = new dxfp
            r1 = 10
            r0.<init>(r5, r1)
            return r0
        L3e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L46:
            defpackage.fctl.b(r5)
            eksp r5 = defpackage.dxpn.a
            ekrw r5 = r5.i()
            eksl r5 = (defpackage.eksl) r5
            java.lang.String r0 = "YouTubeVisitorDataProvider not found, can't get YouTube Visitor cookie"
            r5.q(r0)
            dxfp r5 = new dxfp
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 9
            r5.<init>(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxpn.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dxpm
            if (r0 == 0) goto L13
            r0 = r5
            dxpm r0 = (defpackage.dxpm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxpm r0 = new dxpm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ejwi r5 = r4.b
            ejwt r5 = (defpackage.ejwt) r5
            java.lang.Object r5 = r5.a
            dxva r5 = (defpackage.dxva) r5
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L6c
        L46:
            com.google.android.gms.pseudonymous.PseudonymousIdToken r5 = (com.google.android.gms.pseudonymous.PseudonymousIdToken) r5
            java.lang.String r5 = r5.a
            if (r5 != 0) goto L66
            eksp r5 = defpackage.dxpn.a
            ekrw r5 = r5.i()
            eksl r5 = (defpackage.eksl) r5
            java.lang.String r0 = "Failed to get Zwieback ID"
            r5.q(r0)
            dxfq r5 = new dxfq
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 8
            r5.<init>(r1, r0)
            return r5
        L66:
            dxfx r0 = new dxfx
            r0.<init>(r5)
            return r0
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxpn.c(fcxy):java.lang.Object");
    }
}
