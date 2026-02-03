package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvp implements ehwh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/synclet/ZinniaMaintenanceSynclet");
    public final fcsu b;
    public final fcsu c;
    public final awyu d;
    public final arny e;
    public final arnw f;
    private final fdjx g;
    private final fcsu h;
    private final dggx i;
    private final ains j;
    private final ccvd k;
    private final cctq l;
    private final ckhg m;
    private final fcsu n;

    public ccvp(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, dggx dggxVar, awyu awyuVar, ains ainsVar, ccvd ccvdVar, arny arnyVar, arnw arnwVar, cctq cctqVar, ckhg ckhgVar, fcsu fcsuVar4) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        dggxVar.getClass();
        awyuVar.getClass();
        ainsVar.getClass();
        arnyVar.getClass();
        ckhgVar.getClass();
        fcsuVar4.getClass();
        this.g = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.h = fcsuVar3;
        this.i = dggxVar;
        this.d = awyuVar;
        this.j = ainsVar;
        this.k = ccvdVar;
        this.e = arnyVar;
        this.f = arnwVar;
        this.l = cctqVar;
        this.m = ckhgVar;
        this.n = fcsuVar4;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.g, fcyi.a, fdjz.a, new ccvo(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.awyv r11, defpackage.fcxy r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.ccvf
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r12
            ccvf r0 = (defpackage.ccvf) r0
            int r2 = r0.c
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.c = r2
            goto L18
        L13:
            ccvf r0 = new ccvf
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 0
            java.lang.String r5 = "hasRcs"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/e2ee/mls/synclet/ZinniaMaintenanceSynclet"
            java.lang.String r7 = "BugleE2eeMls"
            r8 = 1
            java.lang.String r9 = "ZinniaMaintenanceSynclet.kt"
            if (r3 == 0) goto L3a
            if (r3 != r8) goto L32
            awyv r11 = r0.d
            defpackage.fctl.b(r12)
            goto L8d
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            defpackage.fctl.b(r12)
            j$.util.Optional r12 = r11.e()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L7a
            ekrg r12 = defpackage.ccvp.a
            ekrw r12 = r12.h()
            ekrz r0 = defpackage.eksq.a
            r12.X(r0, r7)
            r0 = 214(0xd6, float:3.0E-43)
            ekrw r12 = r12.h(r6, r5, r0, r9)
            ekrd r12 = (defpackage.ekrd) r12
            j$.util.Optional r11 = r11.d()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            java.lang.Object r11 = r11.orElse(r0)
            r11.getClass()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            java.lang.String r0 = "ZinniaMaintenanceSynclet: Identity does not have a provisioning ID, won't be used for Zinnia maintenance. SubId: %s"
            r12.r(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            return r11
        L7a:
            dggx r12 = r10.i
            awxn r3 = r11.a
            axcm r3 = r3.b()
            r0.d = r11
            r0.c = r8
            java.lang.Object r12 = r12.m(r3, r0)
            if (r12 != r2) goto L8d
            return r2
        L8d:
            dgid r12 = (defpackage.dgid) r12
            boolean r12 = r12.c()
            if (r12 != 0) goto Lc8
            ekrg r12 = defpackage.ccvp.a
            ekrw r12 = r12.h()
            ekrz r0 = defpackage.eksq.a
            r12.X(r0, r7)
            r0 = 228(0xe4, float:3.2E-43)
            ekrw r12 = r12.h(r6, r5, r0, r9)
            ekrd r12 = (defpackage.ekrd) r12
            j$.util.Optional r11 = r11.d()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            java.lang.Object r11 = r11.orElse(r0)
            r11.getClass()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            java.lang.String r0 = "ZinniaMaintenanceSynclet: Identity does not have RCS available, won't be used for Zinnia maintenance. SubId: %s"
            r12.r(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            return r11
        Lc8:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccvp.b(awyv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ccpl r10, defpackage.fcxy r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ccvg
            if (r0 == 0) goto L13
            r0 = r11
            ccvg r0 = (defpackage.ccvg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ccvg r0 = new ccvg
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 == r4) goto L29
            if (r2 != r3) goto L2f
        L29:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            return r10
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L3d
            return r10
        L3d:
            r11 = move-exception
            goto L5e
        L3f:
            defpackage.fctl.b(r11)
            fcsu r11 = r9.h     // Catch: java.lang.Exception -> L5b
            java.lang.Object r11 = r11.b()     // Catch: java.lang.Exception -> L5b
            cbun r11 = (defpackage.cbun) r11     // Catch: java.lang.Exception -> L5b
            r2 = 0
            r6 = 6
            cbum r10 = defpackage.cbun.a(r11, r10, r2, r6)     // Catch: java.lang.Exception -> L5b
            r0.a = r10     // Catch: java.lang.Exception -> L3d
            r0.d = r5     // Catch: java.lang.Exception -> L3d
            java.lang.Object r11 = r9.g(r5)     // Catch: java.lang.Exception -> L3d
            if (r11 == r1) goto La5
            return r10
        L5b:
            r10 = move-exception
            r11 = r10
            r10 = 0
        L5e:
            ekrg r2 = defpackage.ccvp.a
            ekrw r2 = r2.i()
            ekrz r5 = defpackage.eksq.a
            java.lang.String r6 = "BugleE2eeMls"
            r2.X(r5, r6)
            ekrd r2 = (defpackage.ekrd) r2
            eksk r5 = defpackage.eksk.FULL
            r2.Z(r5)
            ekrw r2 = r2.g(r11)
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.String r6 = "ZinniaMaintenanceSynclet.kt"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/e2ee/mls/synclet/ZinniaMaintenanceSynclet"
            java.lang.String r8 = "initializeClient"
            ekrw r2 = r2.h(r7, r8, r5, r6)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r5 = "ZinniaMaintenanceSynclet: Exception during client initialization."
            r2.q(r5)
            boolean r11 = r11 instanceof defpackage.cbws
            if (r11 == 0) goto L9a
            r0.a = r10
            r0.d = r4
            r11 = 12
            java.lang.Object r11 = r9.g(r11)
            if (r11 == r1) goto La5
            goto La4
        L9a:
            r0.a = r10
            r0.d = r3
            java.lang.Object r11 = r9.g(r4)
            if (r11 == r1) goto La5
        La4:
            return r10
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccvp.c(ccpl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cbum r6, java.lang.String r7, defpackage.ccpl r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.ccvh
            if (r0 == 0) goto L13
            r0 = r9
            ccvh r0 = (defpackage.ccvh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ccvh r0 = new ccvh
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.e
            defpackage.fctl.b(r9)
            goto L72
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r8 = r0.a
            java.lang.String r7 = r0.e
            defpackage.fctl.b(r9)
            goto L5a
        L3c:
            defpackage.fctl.b(r9)
            fcsu r9 = r5.n
            java.lang.Object r9 = r9.b()
            dflr r9 = (defpackage.dflr) r9
            boolean r9 = r9.a()
            if (r9 == 0) goto L85
            r0.e = r7
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r6.k(r0)
            if (r9 != r1) goto L5a
            goto L84
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r6 = r9.booleanValue()
            if (r6 == 0) goto L85
            cctq r6 = r5.l
            r0.e = r7
            r9 = 0
            r0.a = r9
            r0.d = r3
            java.lang.Object r9 = r6.a(r8, r0)
            if (r9 == r1) goto L84
            r6 = r7
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L85
            ckhg r7 = r5.m
            j$.time.Duration r8 = j$.time.Duration.ZERO
            enxe r9 = defpackage.enxe.REFRESH_CERTIFICATE_CHAIN_FROM_ZINNIA_MAINTENANCE_SYNCLET
            r7.f(r6, r8, r4, r9)
            goto L85
        L84:
            return r1
        L85:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccvp.d(cbum, java.lang.String, ccpl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (g(3) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (g(5) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        if (g(11) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        if (g(6) == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:13:0x003f, B:53:0x00f6, B:14:0x0044, B:51:0x00ec, B:49:0x00e1), top: B:65:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccvp.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r13, defpackage.fdap r14, defpackage.fcxy r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.ccvj
            if (r0 == 0) goto L13
            r0 = r15
            ccvj r0 = (defpackage.ccvj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccvj r0 = new ccvj
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "runWithLogging"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/e2ee/mls/synclet/ZinniaMaintenanceSynclet"
            java.lang.String r6 = "BugleE2eeMls"
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            java.lang.String r11 = "ZinniaMaintenanceSynclet.kt"
            if (r2 == 0) goto L4d
            if (r2 == r9) goto L43
            if (r2 == r8) goto L3f
            if (r2 != r7) goto L37
            defpackage.fctl.b(r15)
            return r10
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3f:
            defpackage.fctl.b(r15)
            return r10
        L43:
            int r13 = r0.d
            defpackage.fctl.b(r15)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L4b
            return r15
        L49:
            r14 = move-exception
            goto L5c
        L4b:
            r14 = move-exception
            goto L91
        L4d:
            defpackage.fctl.b(r15)
            r0.d = r13     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L4b
            r0.c = r9     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L4b
            java.lang.Object r13 = r14.invoke(r0)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L4b
            if (r13 != r1) goto L5b
            goto Lc7
        L5b:
            return r13
        L5c:
            ekrg r15 = defpackage.ccvp.a
            ekrw r15 = r15.i()
            ekrz r2 = defpackage.eksq.a
            r15.X(r2, r6)
            ekrd r15 = (defpackage.ekrd) r15
            eksk r2 = defpackage.eksk.FULL
            r15.Z(r2)
            ekrw r14 = r15.g(r14)
            r15 = 306(0x132, float:4.29E-43)
            ekrw r14 = r14.h(r5, r4, r15, r11)
            ekrd r14 = (defpackage.ekrd) r14
            if (r13 == 0) goto L90
            java.lang.String r15 = "ZinniaMaintenanceSynclet: Exception for %s."
            java.lang.String r2 = defpackage.ccve.a(r13)
            r14.t(r15, r2)
            r0.d = r3
            r0.c = r7
            java.lang.Object r13 = r12.g(r13)
            if (r13 == r1) goto Lc7
            goto Lc6
        L90:
            throw r10
        L91:
            ekrg r15 = defpackage.ccvp.a
            ekrw r15 = r15.h()
            ekrz r2 = defpackage.eksq.a
            r15.X(r2, r6)
            ekrd r15 = (defpackage.ekrd) r15
            eksk r2 = defpackage.eksk.FULL
            r15.Z(r2)
            ekrw r14 = r15.g(r14)
            r15 = 298(0x12a, float:4.18E-43)
            ekrw r14 = r14.h(r5, r4, r15, r11)
            ekrd r14 = (defpackage.ekrd) r14
            if (r13 == 0) goto Lc8
            java.lang.String r15 = "ZinniaMaintenanceSynclet: Job cancelled for %s."
            java.lang.String r13 = defpackage.ccve.a(r13)
            r14.t(r15, r13)
            r0.d = r3
            r0.c = r8
            r13 = 11
            java.lang.Object r13 = r12.g(r13)
            if (r13 == r1) goto Lc7
        Lc6:
            return r10
        Lc7:
            return r1
        Lc8:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccvp.f(int, fdap, fcxy):java.lang.Object");
    }

    public final Object g(int i) {
        this.j.e("Bugle.Mls.Synclet.ZinniaTest.Outcome", i - 1);
        return fctx.a;
    }
}
