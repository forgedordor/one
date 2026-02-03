package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngx {
    private static final ekrg a = ekrg.c("com/google/android/libraries/compose/core/mdd/MddUtil");
    private final dtsl b;

    public dngx(dtsl dtslVar) {
        dtslVar.getClass();
        this.b = dtslVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.dtpd r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dngv
            if (r0 == 0) goto L13
            r0 = r8
            dngv r0 = (defpackage.dngv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dngv r0 = new dngv
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            java.lang.String r6 = r0.e
            defpackage.fctl.b(r8)
            goto L5d
        L3a:
            defpackage.fctl.b(r8)
            dtsl r8 = r5.b
            dtpz r2 = defpackage.dtqa.f()
            r2.b(r6)
            dtqa r2 = r2.a()
            com.google.common.util.concurrent.ListenableFuture r8 = r8.e(r2)
            r8.getClass()
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L71
        L5d:
            dtma r8 = (defpackage.dtma) r8
            if (r8 != 0) goto L70
            r8 = 0
            r0.e = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r6 = r5.b(r6, r7, r0)
            if (r6 != r1) goto L6f
            goto L71
        L6f:
            return r6
        L70:
            return r8
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dngx.a(java.lang.String, dtpd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, defpackage.dtpd r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dngw
            if (r0 == 0) goto L13
            r0 = r8
            dngw r0 = (defpackage.dngw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dngw r0 = new dngw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.d
            defpackage.fctl.b(r8)     // Catch: defpackage.dtox -> L3a
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r6 = r0.d
            defpackage.fctl.b(r8)     // Catch: defpackage.dtox -> L3a
            goto L53
        L3a:
            r7 = move-exception
            goto L77
        L3c:
            defpackage.fctl.b(r8)
            dtsl r8 = r5.b     // Catch: defpackage.dtox -> L3a
            com.google.common.util.concurrent.ListenableFuture r7 = r7.a(r8)     // Catch: defpackage.dtox -> L3a
            r7.getClass()     // Catch: defpackage.dtox -> L3a
            r0.d = r6     // Catch: defpackage.dtox -> L3a
            r0.c = r4     // Catch: defpackage.dtox -> L3a
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)     // Catch: defpackage.dtox -> L3a
            if (r7 != r1) goto L53
            goto L76
        L53:
            r0.d = r6     // Catch: defpackage.dtox -> L3a
            r0.c = r3     // Catch: defpackage.dtox -> L3a
            dtsl r7 = r5.b     // Catch: defpackage.dtox -> L3a
            dtoy r8 = defpackage.dtoz.n()     // Catch: defpackage.dtox -> L3a
            r8.c(r6)     // Catch: defpackage.dtox -> L3a
            ejwi r2 = defpackage.dtnd.a     // Catch: defpackage.dtox -> L3a
            r8.b(r2)     // Catch: defpackage.dtox -> L3a
            dtoz r8 = r8.a()     // Catch: defpackage.dtox -> L3a
            com.google.common.util.concurrent.ListenableFuture r7 = r7.c(r8)     // Catch: defpackage.dtox -> L3a
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)     // Catch: defpackage.dtox -> L3a
            if (r8 == r1) goto L76
        L73:
            dtma r8 = (defpackage.dtma) r8     // Catch: defpackage.dtox -> L3a
            return r8
        L76:
            return r1
        L77:
            dtow r8 = r7.a
            dtow r0 = defpackage.dtow.GROUP_NOT_FOUND_ERROR
            java.lang.String r1 = "tryDownloadFileGroup"
            java.lang.String r2 = "com/google/android/libraries/compose/core/mdd/MddUtil"
            java.lang.String r3 = "MddUtil.kt"
            if (r8 != r0) goto L9d
            ekrg r8 = defpackage.dngx.a
            ekrw r8 = r8.j()
            ekrd r8 = (defpackage.ekrd) r8
            ekrw r7 = r8.g(r7)
            r8 = 34
            ekrw r7 = r7.h(r2, r1, r8, r3)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "No such file group exists: %s."
            r7.t(r8, r6)
            goto Lb6
        L9d:
            ekrg r8 = defpackage.dngx.a
            ekrw r8 = r8.i()
            ekrd r8 = (defpackage.ekrd) r8
            ekrw r7 = r8.g(r7)
            r8 = 40
            ekrw r7 = r7.h(r2, r1, r8, r3)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "Download failed for file group: %s."
            r7.t(r8, r6)
        Lb6:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dngx.b(java.lang.String, dtpd, fcxy):java.lang.Object");
    }
}
