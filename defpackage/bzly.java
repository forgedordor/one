package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzly implements caar {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor");
    private final aurx b;

    public bzly(aurx aurxVar) {
        aurxVar.getClass();
        this.b = aurxVar;
    }

    @Override // defpackage.caas
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((bzzx) obj).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bzlz r13, java.util.List r14, defpackage.fcxy r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzly.b(bzlz, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bzlz r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bzlu
            if (r0 == 0) goto L13
            r0 = r8
            bzlu r0 = (defpackage.bzlu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzlu r0 = new bzlu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "previous_session_ids"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r8)     // Catch: defpackage.fbtf -> L29
            goto L4d
        L29:
            r7 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r8)
            fcsu r7 = r7.hF()     // Catch: defpackage.fbtf -> L29
            java.lang.Object r7 = r7.b()     // Catch: defpackage.fbtf -> L29
            cpmc r7 = (defpackage.cpmc) r7     // Catch: defpackage.fbtf -> L29
            eiju r7 = r7.r(r3)     // Catch: defpackage.fbtf -> L29
            r0.c = r4     // Catch: defpackage.fbtf -> L29
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)     // Catch: defpackage.fbtf -> L29
            if (r8 != r1) goto L4d
            return r1
        L4d:
            eqnd r8 = (defpackage.eqnd) r8     // Catch: defpackage.fbtf -> L29
            j$.util.Optional r7 = j$.util.Optional.of(r8)     // Catch: defpackage.fbtf -> L29
            return r7
        L54:
            io.grpc.Status r8 = r7.a
            io.grpc.Status$Code r0 = r8.getCode()
            io.grpc.Status r1 = io.grpc.Status.g
            io.grpc.Status$Code r1 = r1.getCode()
            if (r0 != r1) goto L67
            j$.util.Optional r7 = j$.util.Optional.empty()
            return r7
        L67:
            ekrg r0 = defpackage.bzly.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleCms"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r0 = r0.g(r7)
            r1 = 104(0x68, float:1.46E-43)
            java.lang.String r2 = "UploadSessionIdsWorkItemProcessor.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor"
            java.lang.String r5 = "getServerObject"
            ekrw r0 = r0.h(r4, r5, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Error when getting Object with correlation_id = %s, status = %s"
            r0.D(r1, r3, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzly.c(bzlz, fcxy):java.lang.Object");
    }

    @Override // defpackage.caar
    public final /* bridge */ /* synthetic */ Object d(Object obj, cayy cayyVar, Object obj2, fcxy fcxyVar) {
        return g((bzlz) obj, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.bzlz r11, java.util.List r12, java.lang.String r13, defpackage.fcxy r14) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.bzlw
            if (r0 == 0) goto L13
            r0 = r14
            bzlw r0 = (defpackage.bzlw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzlw r0 = new bzlw
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r14)     // Catch: java.lang.Exception -> L27
            goto L7f
        L27:
            r0 = move-exception
            r11 = r0
            goto L85
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            defpackage.fctl.b(r14)
            eqnu r14 = defpackage.eqnu.a
            evsf r14 = r14.createBuilder()
            eqnt r14 = (defpackage.eqnt) r14
            r14.getClass()
            defpackage.eqnv.c(r14)
            r8 = 0
            r9 = 62
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r4 = r12
            java.lang.String r12 = defpackage.fcva.aF(r4, r5, r6, r7, r8, r9)
            defpackage.eqnv.b(r12, r14)
            defpackage.eqnv.d(r14)
            eqnu r12 = defpackage.eqnv.a(r14)
            fcsu r11 = r11.hF()     // Catch: java.lang.Exception -> L27
            java.lang.Object r11 = r11.b()     // Catch: java.lang.Exception -> L27
            cpmc r11 = (defpackage.cpmc) r11     // Catch: java.lang.Exception -> L27
            evrw r14 = defpackage.evrw.a     // Catch: java.lang.Exception -> L27
            evsf r14 = r14.createBuilder()     // Catch: java.lang.Exception -> L27
            evrv r14 = (defpackage.evrv) r14     // Catch: java.lang.Exception -> L27
            r14.getClass()     // Catch: java.lang.Exception -> L27
            evrw r14 = defpackage.evrx.a(r14)     // Catch: java.lang.Exception -> L27
            r2 = 0
            eiju r11 = r11.X(r13, r12, r14, r2)     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r14 = defpackage.fdxs.c(r11, r0)     // Catch: java.lang.Exception -> L27
            if (r14 == r1) goto L84
        L7f:
            eqnu r14 = (defpackage.eqnu) r14     // Catch: java.lang.Exception -> L27
            fctx r11 = defpackage.fctx.a
            return r11
        L84:
            return r1
        L85:
            ekrg r12 = defpackage.bzly.a
            ekrw r12 = r12.j()
            ekrz r13 = defpackage.eksq.a
            java.lang.String r14 = "BugleCms"
            r12.X(r13, r14)
            ekrd r12 = (defpackage.ekrd) r12
            ekrw r12 = r12.g(r11)
            r13 = 158(0x9e, float:2.21E-43)
            java.lang.String r14 = "UploadSessionIdsWorkItemProcessor.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor"
            java.lang.String r1 = "updateSessionIdsObject"
            ekrw r12 = r12.h(r0, r1, r13, r14)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r13 = "Failed to update payload part"
            r12.q(r13)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzly.e(bzlz, java.util.List, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        if (e(r6, r7, r12, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        if (b(r6, r7, r0) == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[LOOP:1: B:35:0x00cb->B:37:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [cmfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bzlz r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzly.f(bzlz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.bzlz r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bzlv
            if (r0 == 0) goto L13
            r0 = r6
            bzlv r0 = (defpackage.bzlv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzlv r0 = new bzlv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L27
            goto L63
        L27:
            r5 = move-exception
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r4.f(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L63
            return r1
        L3d:
            ekrg r6 = defpackage.bzly.a
            ekrw r6 = r6.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleCms"
            r6.X(r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            ekrw r5 = r6.g(r5)
            r6 = 56
            java.lang.String r0 = "UploadSessionIdsWorkItemProcessor.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor"
            java.lang.String r2 = "processCmsWorkItem"
            ekrw r5 = r5.h(r1, r2, r6, r0)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Failed to upload previous session ids."
            r5.q(r6)
        L63:
            cbcw r5 = defpackage.cbcw.i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzly.g(bzlz, fcxy):java.lang.Object");
    }
}
