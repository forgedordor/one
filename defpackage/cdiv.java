package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdiv implements cdiq {
    private static final cqce b = cqce.g("BugleGaia", "BugleGaiaAuthWrapperImpl");
    public final fcsu a;
    private final fdjx c;
    private final ehtk d;

    public cdiv(fdjx fdjxVar, ehtk ehtkVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        ehtkVar.getClass();
        fcsuVar.getClass();
        this.c = fdjxVar;
        this.d = ehtkVar;
        this.a = fcsuVar;
    }

    @Override // defpackage.cdiq
    public final eiju a(efwo efwoVar) {
        efwoVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new cdir(this, efwoVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.efwo r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cdis
            if (r0 == 0) goto L13
            r0 = r8
            cdis r0 = (defpackage.cdis) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cdis r0 = new cdis
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            goto L4c
        L2b:
            r8 = move-exception
            goto L86
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            ehtk r8 = r6.d     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            com.google.common.util.concurrent.ListenableFuture r8 = r8.b(r7)     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            r8.getClass()     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            r0.a = r7     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            r0.d = r4     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            if (r8 != r1) goto L4c
            return r1
        L4c:
            cdiz r8 = new cdiz     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            r8.<init>()     // Catch: com.google.android.gms.auth.UserRecoverableAuthException -> L2b android.accounts.NetworkErrorException -> L52 defpackage.dbmi -> L67
            return r8
        L52:
            r7 = move-exception
            cqce r8 = defpackage.cdiv.b
            cqbd r8 = r8.e()
            java.lang.String r0 = "Network error during gaia auth check"
            r8.I(r0)
            r8.s(r7)
            cdiy r7 = new cdiy
            r7.<init>()
            goto Lbe
        L67:
            r7 = move-exception
            cqce r8 = defpackage.cdiv.b
            cqbd r8 = r8.e()
            java.lang.String r0 = "Unrecoverable error detected for account"
            r8.I(r0)
            r8.s(r7)
            fdjx r8 = r6.c
            cdiu r0 = new cdiu
            r0.<init>(r6, r7, r5)
            defpackage.auvw.k(r8, r5, r5, r0, r3)
            cdiy r7 = new cdiy
            r7.<init>()
            goto Lbe
        L86:
            cqce r0 = defpackage.cdiv.b
            cqbd r1 = r0.e()
            java.lang.String r2 = "User recoverable error detected for account"
            r1.I(r2)
            r1.s(r8)
            android.content.Intent r1 = r8.a()
            if (r1 != 0) goto Lb6
            cqbd r7 = r0.e()
            java.lang.String r0 = "User recoverable error has null intent"
            r7.I(r0)
            r7.r()
            fdjx r7 = r6.c
            cdit r0 = new cdit
            r0.<init>(r6, r8, r5)
            defpackage.auvw.k(r7, r5, r5, r0, r3)
            cdiy r7 = new cdiy
            r7.<init>()
            goto Lbe
        Lb6:
            cdja r8 = new cdja
            efwo r7 = (defpackage.efwo) r7
            r8.<init>(r7, r1)
            r7 = r8
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdiv.b(efwo, fcxy):java.lang.Object");
    }
}
