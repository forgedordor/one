package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chbr implements chbf, cdce {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/pipeline/data/PipelineWorkRepositoryImpl");
    public final feav a;
    private final chbc c;
    private final awgx d;
    private final fcsu e;
    private final fdjx f;
    private final AtomicBoolean g;

    public chbr(chbc chbcVar, awgx awgxVar, fcsu fcsuVar, fdjx fdjxVar) {
        chbcVar.getClass();
        awgxVar.getClass();
        fdjxVar.getClass();
        this.c = chbcVar;
        this.d = awgxVar;
        this.e = fcsuVar;
        this.f = fdjxVar;
        this.a = new feaz();
        this.g = new AtomicBoolean(false);
    }

    @Override // defpackage.cdce
    public final void a() {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BuglePipeline");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/data/PipelineWorkRepositoryImpl", "onFcmPhoneTickleReceived", 204, "PipelineWorkRepositoryImpl.kt")).q("Phone Fcm tickle received, precomputing PipelineWorkRepository cache");
        auvw.m(this.f, null, new chbn(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[Catch: all -> 0x002c, LOOP:0: B:26:0x0071->B:28:0x0077, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x002c, blocks: (B:13:0x0028, B:25:0x0060, B:26:0x0071, B:28:0x0077), top: B:39:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.chbh
            if (r0 == 0) goto L13
            r0 = r9
            chbh r0 = (defpackage.chbh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chbh r0 = new chbh
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            feaz r0 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L60
        L2c:
            r9 = move-exception
            goto L98
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            feaz r2 = r0.d
            defpackage.fctl.b(r9)
            r9 = r2
            goto L50
        L3e:
            defpackage.fctl.b(r9)
            feav r9 = r8.a
            r2 = r9
            feaz r2 = (defpackage.feaz) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r2 = r9.b(r0)
            if (r2 == r1) goto L9c
        L50:
            r2 = r9
            feaz r2 = (defpackage.feaz) r2     // Catch: java.lang.Throwable -> L94
            r0.d = r2     // Catch: java.lang.Throwable -> L94
            r0.c = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = r8.k(r0)     // Catch: java.lang.Throwable -> L94
            if (r0 == r1) goto L9c
            r7 = r0
            r0 = r9
            r9 = r7
        L60:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r2 = 10
            int r2 = defpackage.fcva.p(r9, r2)     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2c
        L71:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L90
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L2c
            chbd r2 = (defpackage.chbd) r2     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r5 = 127(0x7f, float:1.78E-43)
            r6 = 0
            chbd r3 = defpackage.chbd.a(r2, r6, r3, r4, r5)     // Catch: java.lang.Throwable -> L2c
            awgx r5 = r8.d     // Catch: java.lang.Throwable -> L2c
            cgzx r2 = r2.a     // Catch: java.lang.Throwable -> L2c
            r5.d(r2, r3)     // Catch: java.lang.Throwable -> L2c
            r1.add(r3)     // Catch: java.lang.Throwable -> L2c
            goto L71
        L90:
            r0.d()
            return r1
        L94:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L98:
            r0.d()
            throw r9
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.chbj
            if (r0 == 0) goto L13
            r0 = r7
            chbj r0 = (defpackage.chbj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chbj r0 = new chbj
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            feaz r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5f
        L2c:
            r7 = move-exception
            goto L69
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            feaz r2 = r0.d
            defpackage.fctl.b(r7)
            r7 = r2
            goto L4f
        L3d:
            defpackage.fctl.b(r7)
            feav r7 = r6.a
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L6d
        L4f:
            r2 = r7
            feaz r2 = (defpackage.feaz) r2     // Catch: java.lang.Throwable -> L65
            r0.d = r2     // Catch: java.lang.Throwable -> L65
            r0.c = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r6.k(r0)     // Catch: java.lang.Throwable -> L65
            if (r0 == r1) goto L6d
            r5 = r0
            r0 = r7
            r7 = r5
        L5f:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L2c
            r0.d()
            return r7
        L65:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L69:
            r0.d()
            throw r7
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.chbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cgzx r17, defpackage.cgxy r18, byte[] r19, java.lang.String r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.d(cgzx, cgxy, byte[], java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:25:0x006c, B:27:0x0076, B:28:0x00a0), top: B:36:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:25:0x006c, B:27:0x0076, B:28:0x00a0), top: B:36:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.chbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cgzx r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.chbm
            java.lang.String r1 = "PipelineWorkRepositoryImpl.kt"
            if (r0 == 0) goto L15
            r0 = r9
            chbm r0 = (defpackage.chbm) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            chbm r0 = new chbm
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L45
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            feaz r8 = r0.e
            cgzx r0 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L30
            goto L6c
        L30:
            r9 = move-exception
            goto Lb7
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            feaz r8 = r0.e
            cgzx r3 = r0.d
            defpackage.fctl.b(r9)
            r9 = r8
            r8 = r3
            goto L59
        L45:
            defpackage.fctl.b(r9)
            feav r9 = r7.a
            r0.d = r8
            r3 = r9
            feaz r3 = (defpackage.feaz) r3
            r0.e = r3
            r0.c = r5
            java.lang.Object r3 = r9.b(r0)
            if (r3 == r2) goto Lbb
        L59:
            r0.d = r8     // Catch: java.lang.Throwable -> Lb3
            r3 = r9
            feaz r3 = (defpackage.feaz) r3     // Catch: java.lang.Throwable -> Lb3
            r0.e = r3     // Catch: java.lang.Throwable -> Lb3
            r0.c = r4     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r7.j(r0)     // Catch: java.lang.Throwable -> Lb3
            if (r0 == r2) goto Lbb
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L6c:
            awgx r9 = (defpackage.awgx) r9     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L30
            chbd r9 = (defpackage.chbd) r9     // Catch: java.lang.Throwable -> L30
            if (r9 != 0) goto La0
            ekrg r9 = defpackage.chbr.b     // Catch: java.lang.Throwable -> L30
            ekrw r9 = r9.j()     // Catch: java.lang.Throwable -> L30
            ekrz r2 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "BuglePipeline"
            r9.X(r2, r3)     // Catch: java.lang.Throwable -> L30
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L30
            ekrz r2 = defpackage.cgxx.a     // Catch: java.lang.Throwable -> L30
            ekrz r2 = defpackage.cgxx.a     // Catch: java.lang.Throwable -> L30
            r9.X(r2, r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "com/google/android/apps/messaging/shared/pipeline/data/PipelineWorkRepositoryImpl"
            java.lang.String r2 = "markAsWaiting"
            r3 = 155(0x9b, float:2.17E-43)
            ekrw r9 = r9.h(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L30
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "Work item not present, skipping marking it as waiting."
            r9.q(r0)     // Catch: java.lang.Throwable -> L30
            fctx r9 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L30
            goto Laf
        La0:
            awgx r1 = r7.d     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 0
            chbd r9 = defpackage.chbd.a(r9, r4, r2, r5, r3)     // Catch: java.lang.Throwable -> L30
            r1.d(r0, r9)     // Catch: java.lang.Throwable -> L30
            fctx r9 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L30
        Laf:
            r8.d()
            return r9
        Lb3:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        Lb7:
            r8.d()
            throw r9
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.e(cgzx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (((defpackage.fdlr) r11).o(r0) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [cgzx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [feav] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9, types: [feav] */
    @Override // defpackage.chbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cgzx r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.chbo
            if (r0 == 0) goto L13
            r0 = r11
            chbo r0 = (defpackage.chbo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            chbo r0 = new chbo
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.a
            feav r10 = (defpackage.feav) r10
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L41
            goto L8f
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            java.lang.Object r10 = r0.a
            feav r10 = (defpackage.feav) r10
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L41
            goto L83
        L41:
            r11 = move-exception
            goto L99
        L43:
            feaz r10 = r0.e
            java.lang.Object r2 = r0.a
            cgzx r2 = (defpackage.cgzx) r2
            defpackage.fctl.b(r11)
            r11 = r10
            r10 = r2
            goto L63
        L4f:
            defpackage.fctl.b(r11)
            feav r11 = r9.a
            r0.a = r10
            r2 = r11
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r5
            java.lang.Object r2 = r11.b(r0)
            if (r2 == r1) goto L9d
        L63:
            awgx r2 = r9.d     // Catch: java.lang.Throwable -> L95
            r2.e(r10)     // Catch: java.lang.Throwable -> L95
            chbc r2 = r9.c     // Catch: java.lang.Throwable -> L95
            r0.a = r11     // Catch: java.lang.Throwable -> L95
            r5 = 0
            r0.e = r5     // Catch: java.lang.Throwable -> L95
            r0.d = r4     // Catch: java.lang.Throwable -> L95
            fdjx r4 = r2.b     // Catch: java.lang.Throwable -> L95
            eizx r6 = r2.c     // Catch: java.lang.Throwable -> L95
            chax r7 = new chax     // Catch: java.lang.Throwable -> L95
            r7.<init>(r2, r10, r5)     // Catch: java.lang.Throwable -> L95
            fdkf r10 = defpackage.ejaa.a(r4, r6, r7)     // Catch: java.lang.Throwable -> L95
            if (r10 == r1) goto L9d
            r8 = r11
            r11 = r10
            r10 = r8
        L83:
            fdlr r11 = (defpackage.fdlr) r11     // Catch: java.lang.Throwable -> L41
            r0.a = r10     // Catch: java.lang.Throwable -> L41
            r0.d = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r11 = r11.o(r0)     // Catch: java.lang.Throwable -> L41
            if (r11 == r1) goto L9d
        L8f:
            fctx r11 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L41
            r10.d()
            return r11
        L95:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L99:
            r10.d()
            throw r11
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.f(cgzx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0105, code lost:
    
        if (((defpackage.fdkf) r13).o(r0) != r2) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:15:0x0036, B:20:0x004b, B:39:0x00f9, B:23:0x005a, B:33:0x009d, B:35:0x00a8, B:36:0x00d1), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:15:0x0036, B:20:0x004b, B:39:0x00f9, B:23:0x005a, B:33:0x009d, B:35:0x00a8, B:36:0x00d1), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0, types: [chbr] */
    /* JADX WARN: Type inference failed for: r12v0, types: [j$.time.Instant, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // defpackage.chbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cgzx r11, j$.time.Instant r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.g(cgzx, j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        if (((defpackage.fdkf) r13).o(r0) != r2) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:15:0x0036, B:20:0x004b, B:39:0x00fb, B:23:0x005a, B:33:0x009d, B:35:0x00a8, B:36:0x00d1), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:15:0x0036, B:20:0x004b, B:39:0x00fb, B:23:0x005a, B:33:0x009d, B:35:0x00a8, B:36:0x00d1), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0, types: [chbr] */
    /* JADX WARN: Type inference failed for: r12v0, types: [j$.time.Instant, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // defpackage.chbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cgzx r11, j$.time.Instant r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.h(cgzx, j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.chbg
            if (r0 == 0) goto L13
            r0 = r9
            chbg r0 = (defpackage.chbg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chbg r0 = new chbg
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L3a
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            defpackage.fctl.b(r9)
            r0.c = r3
            java.lang.Object r9 = r8.j(r0)
            if (r9 == r1) goto Ldc
        L3a:
            awgx r9 = (defpackage.awgx) r9
            android.util.LruCache r9 = r9.a
            java.util.Map r9 = r9.snapshot()
            java.util.Collection r9 = r9.values()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4f:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r9.next()
            r2 = r1
            chbd r2 = (defpackage.chbd) r2
            java.lang.String r2 = r2.d
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L6c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L6c:
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto L4f
        L72:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r1 = r0.size()
            int r1 = defpackage.fcwa.a(r1)
            r9.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L87:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ldb
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ld5
            java.lang.Object r3 = r1.next()
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lcf
            r4 = r3
            chbd r4 = (defpackage.chbd) r4
            j$.time.Instant r4 = r4.e
        Lb6:
            java.lang.Object r5 = r1.next()
            r6 = r5
            chbd r6 = (defpackage.chbd) r6
            j$.time.Instant r6 = r6.e
            int r7 = r4.compareTo(r6)
            if (r7 <= 0) goto Lc6
            r4 = r6
        Lc6:
            if (r7 <= 0) goto Lc9
            r3 = r5
        Lc9:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto Lb6
        Lcf:
            chbd r3 = (defpackage.chbd) r3
            r9.put(r2, r3)
            goto L87
        Ld5:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            r9.<init>()
            throw r9
        Ldb:
            return r9
        Ldc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.i(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r14 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.j(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.chbk
            if (r0 == 0) goto L13
            r0 = r5
            chbk r0 = (defpackage.chbk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chbk r0 = new chbk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 == r1) goto L60
        L3a:
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r5 = r5.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r5.next()
            r2 = r1
            chbd r2 = (defpackage.chbd) r2
            int r2 = r2.h
            r3 = 2
            if (r2 == r3) goto L49
            r0.add(r1)
            goto L49
        L5f:
            return r0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbr.k(fcxy):java.lang.Object");
    }
}
