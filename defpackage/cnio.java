package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnio implements cnik {
    private static final cczi a = cdag.g(cdag.b, "penpal_oauth2_transport_scope", "https://www.googleapis.com/auth/tachyon");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/tachygram/chat/penpal/PenpalGaiaOauth2TokenProviderImpl");
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final ains f;

    public cnio(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, ains ainsVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        ainsVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = ainsVar;
    }

    static /* synthetic */ Exception e(cnis cnisVar) {
        return f(cnisVar, false);
    }

    private static final Exception f(cnis cnisVar, boolean z) {
        return new eqcx(cnisVar.a, new eqcs(eqcp.r, z ? eqcr.b : eqcr.a), cnisVar);
    }

    @Override // defpackage.cnik
    public final Object a(fcxy fcxyVar) {
        return c(fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.efwo r5, defpackage.fcxy r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cnil
            if (r0 == 0) goto L13
            r0 = r6
            cnil r0 = (defpackage.cnil) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnil r0 = new cnil
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.d
            java.lang.Object r6 = r6.b()
            egej r6 = (defpackage.egej) r6
            com.google.common.util.concurrent.ListenableFuture r5 = r6.a(r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L5e
        L46:
            android.accounts.Account r6 = (android.accounts.Account) r6
            if (r6 == 0) goto L4b
            return r6
        L4b:
            ains r5 = r4.f
            java.lang.String r6 = "Bugle.Penpal.Transport.OAuth2.Failure.AccountIdNotFound"
            r5.c(r6)
            cnis r5 = new cnis
            java.lang.String r6 = "Penpal failed to retrieve Android Account for AccountId"
            r5.<init>(r6)
            java.lang.Exception r5 = e(r5)
            throw r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnio.b(efwo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnio.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cnin
            if (r0 == 0) goto L13
            r0 = r5
            cnin r0 = (defpackage.cnin) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnin r0 = new cnin
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.e
            java.lang.Object r5 = r5.b()
            cgte r5 = (defpackage.cgte) r5
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L5a
        L42:
            efwo r5 = (defpackage.efwo) r5
            if (r5 == 0) goto L47
            return r5
        L47:
            ains r5 = r4.f
            java.lang.String r0 = "Bugle.Penpal.Transport.OAuth2.Failure.NoPenpalAccount"
            r5.c(r0)
            cnis r5 = new cnis
            java.lang.String r0 = "No Penpal active account set or account invalid"
            r5.<init>(r0)
            java.lang.Exception r5 = e(r5)
            throw r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnio.d(fcxy):java.lang.Object");
    }
}
