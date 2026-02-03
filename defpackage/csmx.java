package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmx implements csms {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/spam/spatula/datastore/SpatulaAccountDataServiceImpl");
    public final fcsu a;
    private final fdjx c;
    private final fcsu d;

    public csmx(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = fdjxVar;
        this.a = fcsuVar;
        this.d = fcsuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:13:0x002b, B:33:0x008c, B:34:0x0095, B:36:0x009b, B:38:0x00a8), top: B:59:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.csmt
            if (r0 == 0) goto L13
            r0 = r9
            csmt r0 = (defpackage.csmt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csmt r0 = new csmt
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Integer r1 = r0.d
            eieu r0 = r0.e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L8c
        L2f:
            r9 = move-exception
            goto Lb9
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            eieu r2 = r0.e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L40
            goto L6f
        L40:
            r9 = move-exception
            r0 = r2
            goto Lb9
        L44:
            defpackage.fctl.b(r9)
            fcyh r9 = r0.u()
            boolean r9 = defpackage.eicg.b(r9)
            if (r9 == 0) goto Lbf
            java.lang.String r9 = "SpatulaAccountDataServiceImpl.getActiveUser"
            eieu r9 = defpackage.eiiy.h(r9)
            fdjx r2 = r8.c     // Catch: java.lang.Throwable -> Lb5
            fcyh r2 = r2.hE()     // Catch: java.lang.Throwable -> Lb5
            csmu r6 = new csmu     // Catch: java.lang.Throwable -> Lb5
            r6.<init>(r8, r5)     // Catch: java.lang.Throwable -> Lb5
            r0.e = r9     // Catch: java.lang.Throwable -> Lb5
            r0.c = r4     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r2 = defpackage.eicj.a(r2, r6, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r2 == r1) goto Lb4
            r7 = r2
            r2 = r9
            r9 = r7
        L6f:
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L40
            fcsu r4 = r8.d     // Catch: java.lang.Throwable -> L40
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L40
            egbf r4 = (defpackage.egbf) r4     // Catch: java.lang.Throwable -> L40
            com.google.common.util.concurrent.ListenableFuture r4 = r4.e()     // Catch: java.lang.Throwable -> L40
            r0.e = r2     // Catch: java.lang.Throwable -> L40
            r0.d = r9     // Catch: java.lang.Throwable -> L40
            r0.c = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = defpackage.fdxs.c(r4, r0)     // Catch: java.lang.Throwable -> L40
            if (r0 == r1) goto Lb4
            r1 = r9
            r9 = r0
            r0 = r2
        L8c:
            r9.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2f
        L95:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L2f
            r3 = r2
            efwo r3 = (defpackage.efwo) r3     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.a()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L95
            int r4 = r1.intValue()     // Catch: java.lang.Throwable -> L2f
            if (r3 != r4) goto L95
            goto Lb0
        Laf:
            r2 = r5
        Lb0:
            defpackage.fczl.a(r0, r5)
            return r2
        Lb4:
            return r1
        Lb5:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        Lb9:
            throw r9     // Catch: java.lang.Throwable -> Lba
        Lba:
            r1 = move-exception
            defpackage.fczl.a(r0, r9)
            throw r1
        Lbf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csmx.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.csms
    public final void b(efwo efwoVar) {
        auvw.k(this.c, null, null, new csmw(this, efwoVar, null), 3);
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/spatula/datastore/SpatulaAccountDataServiceImpl", "setActiveUser", 61, "SpatulaAccountDataServiceImpl.kt")).r("Setting active user to AccountId=%s", efwoVar.a());
    }
}
