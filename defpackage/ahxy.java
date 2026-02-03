package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
@fcsv
/* loaded from: classes2.dex */
public final class ahxy implements ahwe {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcyh g;
    public final fcsu h;
    public final fcsu i;
    public final fdjx j;
    public final ahtq k;
    private final fcsu l;

    public ahxy(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcyh fcyhVar, fcsu fcsuVar6, fcsu fcsuVar7, fdjx fdjxVar, ahtq ahtqVar, fcsu fcsuVar8) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcyhVar.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fdjxVar.getClass();
        fcsuVar8.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcyhVar;
        this.h = fcsuVar6;
        this.i = fcsuVar7;
        this.j = fdjxVar;
        this.k = ahtqVar;
        this.l = fcsuVar8;
    }

    static /* synthetic */ Duration l(ahxy ahxyVar, enzp enzpVar, UUID uuid) {
        return ahxyVar.n(enzpVar, uuid, true);
    }

    private final Duration n(enzp enzpVar, UUID uuid, boolean z) {
        return ahwi.c((ahwi) this.i.b(), enzpVar, uuid, 1, z, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(int i, enze enzeVar) {
        ahwi.d((ahwi) this.i.b(), enzp.REQUEST_RESTORE_AFTER_APP_UPDATE, i, null, enzeVar, 0, 44);
    }

    @Override // defpackage.ahwe
    public final int a() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #1 {all -> 0x0043, blocks: (B:13:0x003a, B:51:0x0134, B:48:0x0113, B:53:0x0148), top: B:64:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:13:0x003a, B:51:0x0134, B:48:0x0113, B:53:0x0148), top: B:64:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v5, types: [eieu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r22, defpackage.aiaf r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.b(java.util.UUID, aiaf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ahxc
            if (r0 == 0) goto L13
            r0 = r10
            ahxc r0 = (defpackage.ahxc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahxc r0 = new ahxc
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r9 = r0.d
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L2a:
            r10 = move-exception
            goto L6e
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.fctl.b(r10)
            java.lang.String r10 = "BasicRestoreWorkflowSteps#doAttachmentRestore"
            eieu r10 = defpackage.eiiy.h(r10)
            fdcg r2 = new fdcg     // Catch: java.lang.Throwable -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L6a
            enzp r5 = defpackage.enzp.DO_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L6a
            l(r8, r5, r9)     // Catch: java.lang.Throwable -> L6a
            fcyh r5 = r8.g     // Catch: java.lang.Throwable -> L6a
            fcyh r5 = defpackage.eicg.a(r5)     // Catch: java.lang.Throwable -> L6a
            ahxe r6 = new ahxe     // Catch: java.lang.Throwable -> L6a
            r6.<init>(r3, r8, r9, r2)     // Catch: java.lang.Throwable -> L6a
            r0.d = r10     // Catch: java.lang.Throwable -> L6a
            r0.c = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r9 = defpackage.fdin.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L6a
            if (r9 == r1) goto L69
            r7 = r10
            r10 = r9
            r9 = r7
        L5f:
            fdhi r10 = (defpackage.fdhi) r10     // Catch: java.lang.Throwable -> L2a
            long r0 = r10.c     // Catch: java.lang.Throwable -> L2a
            defpackage.fczl.a(r9, r3)
            fctx r9 = defpackage.fctx.a
            return r9
        L69:
            return r1
        L6a:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L6e:
            throw r10     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            defpackage.fczl.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.c(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.UUID r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ahxf
            if (r0 == 0) goto L13
            r0 = r9
            ahxf r0 = (defpackage.ahxf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahxf r0 = new ahxf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r8 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L2a:
            r9 = move-exception
            goto L6a
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.fctl.b(r9)
            java.lang.String r9 = "BasicRestoreWorkflowSteps#doBugleDbRestore"
            eieu r9 = defpackage.eiiy.h(r9)
            enzp r2 = defpackage.enzp.DO_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L66
            r5 = 0
            r7.n(r2, r8, r5)     // Catch: java.lang.Throwable -> L66
            fcyh r2 = r7.g     // Catch: java.lang.Throwable -> L66
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> L66
            ahxi r5 = new ahxi     // Catch: java.lang.Throwable -> L66
            r5.<init>(r3, r7, r8)     // Catch: java.lang.Throwable -> L66
            r0.d = r9     // Catch: java.lang.Throwable -> L66
            r0.c = r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = defpackage.fdin.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L66
            if (r8 == r1) goto L65
            r6 = r9
            r9 = r8
            r8 = r6
        L5b:
            fdhi r9 = (defpackage.fdhi) r9     // Catch: java.lang.Throwable -> L2a
            long r0 = r9.c     // Catch: java.lang.Throwable -> L2a
            defpackage.fczl.a(r8, r3)
            fctx r8 = defpackage.fctx.a
            return r8
        L65:
            return r1
        L66:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6a:
            throw r9     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            defpackage.fczl.a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.d(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.UUID r19, defpackage.aiaf r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof defpackage.ahxj
            if (r3 == 0) goto L19
            r3 = r2
            ahxj r3 = (defpackage.ahxj) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            ahxj r3 = new ahxj
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            fcyl r4 = defpackage.fcyl.a
            int r5 = r3.c
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            java.util.UUID r1 = r3.d
            defpackage.fctl.b(r2)
            goto L51
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            defpackage.fctl.b(r2)
            ayrq r2 = defpackage.ayrq.a
            ahxk r5 = new ahxk
            r7 = 0
            r8 = r20
            r5.<init>(r0, r1, r8, r7)
            r3.d = r1
            r3.c = r6
            java.lang.String r6 = "BasicRestoreWorkflowSteps#doCompleteRestore"
            java.lang.Object r2 = r2.a(r6, r5, r3)
            if (r2 != r4) goto L51
            return r4
        L51:
            r7 = r1
            fdhi r2 = (defpackage.fdhi) r2
            long r1 = r2.c
            fcsu r3 = r0.i
            java.lang.Object r3 = r3.b()
            r5 = r3
            ahwi r5 = (defpackage.ahwi) r5
            enzp r6 = defpackage.enzp.DO_COMPLETE_RESTORE
            long r3 = defpackage.fdhi.h(r1)
            int r1 = defpackage.fdhi.d(r1)
            long r1 = (long) r1
            j$.time.Duration r13 = j$.time.Duration.ofSeconds(r3, r1)
            r13.getClass()
            r16 = 0
            r17 = 1916(0x77c, float:2.685E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            defpackage.ahwi.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.e(java.util.UUID, aiaf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.UUID r20, defpackage.aiba r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = r3 instanceof defpackage.ahxp
            if (r4 == 0) goto L1b
            r4 = r3
            ahxp r4 = (defpackage.ahxp) r4
            int r5 = r4.c
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.c = r5
            goto L20
        L1b:
            ahxp r4 = new ahxp
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.a
            fcyl r5 = defpackage.fcyl.a
            int r6 = r4.c
            r7 = 1
            if (r6 == 0) goto L3d
            if (r6 != r7) goto L35
            aiba r1 = r4.e
            java.util.UUID r2 = r4.d
            defpackage.fctl.b(r3)
            r13 = r1
            r8 = r2
            goto L59
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            defpackage.fctl.b(r3)
            ayrq r3 = defpackage.ayrq.a
            ahxq r6 = new ahxq
            r8 = 0
            r6.<init>(r1, r0, r2, r8)
            r4.d = r1
            r4.e = r2
            r4.c = r7
            java.lang.String r7 = "BasicRestoreWorkflowSteps#initializeRestore"
            java.lang.Object r3 = r3.a(r7, r6, r4)
            if (r3 != r5) goto L57
            return r5
        L57:
            r8 = r1
            r13 = r2
        L59:
            fdhi r3 = (defpackage.fdhi) r3
            long r1 = r3.c
            fcsu r3 = r0.i
            java.lang.Object r3 = r3.b()
            r6 = r3
            ahwi r6 = (defpackage.ahwi) r6
            enzp r7 = defpackage.enzp.INITIALIZE_RESTORE_WORKFLOW
            long r3 = defpackage.fdhi.h(r1)
            int r1 = defpackage.fdhi.d(r1)
            long r1 = (long) r1
            j$.time.Duration r14 = j$.time.Duration.ofSeconds(r3, r1)
            r14.getClass()
            r17 = 0
            r18 = 1852(0x73c, float:2.595E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            defpackage.ahwi.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.f(java.util.UUID, aiba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.UUID r18, java.io.File r19, defpackage.szf r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r17 = this;
            r3 = r17
            r2 = r18
            r0 = r21
            boolean r1 = r0 instanceof defpackage.ahxr
            if (r1 == 0) goto L19
            r1 = r0
            ahxr r1 = (defpackage.ahxr) r1
            int r4 = r1.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r1.c = r4
            goto L1e
        L19:
            ahxr r1 = new ahxr
            r1.<init>(r3, r0)
        L1e:
            r6 = r1
            java.lang.Object r0 = r6.a
            fcyl r7 = defpackage.fcyl.a
            int r1 = r6.c
            r8 = 1
            if (r1 == 0) goto L41
            if (r1 != r8) goto L39
            j$.time.Duration r1 = r6.e
            eieu r2 = r6.f
            java.util.UUID r4 = r6.d
            defpackage.fctl.b(r0)     // Catch: java.lang.Throwable -> L36
            r14 = r1
            r13 = r4
            goto L71
        L36:
            r0 = move-exception
            r1 = r0
            goto L8d
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            defpackage.fctl.b(r0)
            java.lang.String r0 = "BasicRestoreWorkflowSteps#requestAttachmentRestore"
            eieu r9 = defpackage.eiiy.h(r0)
            enzp r0 = defpackage.enzp.REQUEST_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L8a
            j$.time.Duration r10 = l(r3, r0, r2)     // Catch: java.lang.Throwable -> L8a
            fcyh r0 = r3.g     // Catch: java.lang.Throwable -> L8a
            fcyh r11 = defpackage.eicg.a(r0)     // Catch: java.lang.Throwable -> L8a
            ahxs r0 = new ahxs     // Catch: java.lang.Throwable -> L8a
            r1 = 0
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8a
            r6.d = r2     // Catch: java.lang.Throwable -> L8a
            r6.f = r9     // Catch: java.lang.Throwable -> L8a
            r6.e = r10     // Catch: java.lang.Throwable -> L8a
            r6.c = r8     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = defpackage.fdin.a(r11, r0, r6)     // Catch: java.lang.Throwable -> L8a
            if (r0 == r7) goto L89
            r13 = r2
            r2 = r9
            r14 = r10
        L71:
            fcsu r0 = r3.i     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L36
            r11 = r0
            ahwi r11 = (defpackage.ahwi) r11     // Catch: java.lang.Throwable -> L36
            enzp r12 = defpackage.enzp.REQUEST_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L36
            r15 = 0
            r16 = 504(0x1f8, float:7.06E-43)
            defpackage.ahwi.b(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L36
            r0 = 0
            defpackage.fczl.a(r2, r0)
            fctx r0 = defpackage.fctx.a
            return r0
        L89:
            return r7
        L8a:
            r0 = move-exception
            r1 = r0
            r2 = r9
        L8d:
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            defpackage.fczl.a(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.g(java.util.UUID, java.io.File, szf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.UUID r18, java.io.File r19, defpackage.szu r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r17 = this;
            r3 = r17
            r2 = r18
            r0 = r21
            boolean r1 = r0 instanceof defpackage.ahxt
            if (r1 == 0) goto L19
            r1 = r0
            ahxt r1 = (defpackage.ahxt) r1
            int r4 = r1.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r1.c = r4
            goto L1e
        L19:
            ahxt r1 = new ahxt
            r1.<init>(r3, r0)
        L1e:
            r6 = r1
            java.lang.Object r0 = r6.a
            fcyl r7 = defpackage.fcyl.a
            int r1 = r6.c
            r8 = 1
            if (r1 == 0) goto L41
            if (r1 != r8) goto L39
            j$.time.Duration r1 = r6.e
            eieu r2 = r6.f
            java.util.UUID r4 = r6.d
            defpackage.fctl.b(r0)     // Catch: java.lang.Throwable -> L36
            r14 = r1
            r13 = r4
            goto L71
        L36:
            r0 = move-exception
            r1 = r0
            goto L8d
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            defpackage.fctl.b(r0)
            java.lang.String r0 = "BasicRestoreWorkflowSteps#requestBugleDbRestore"
            eieu r9 = defpackage.eiiy.h(r0)
            enzp r0 = defpackage.enzp.REQUEST_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L8a
            j$.time.Duration r10 = l(r3, r0, r2)     // Catch: java.lang.Throwable -> L8a
            fcyh r0 = r3.g     // Catch: java.lang.Throwable -> L8a
            fcyh r11 = defpackage.eicg.a(r0)     // Catch: java.lang.Throwable -> L8a
            ahxv r0 = new ahxv     // Catch: java.lang.Throwable -> L8a
            r1 = 0
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8a
            r6.d = r2     // Catch: java.lang.Throwable -> L8a
            r6.f = r9     // Catch: java.lang.Throwable -> L8a
            r6.e = r10     // Catch: java.lang.Throwable -> L8a
            r6.c = r8     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = defpackage.fdin.a(r11, r0, r6)     // Catch: java.lang.Throwable -> L8a
            if (r0 == r7) goto L89
            r13 = r2
            r2 = r9
            r14 = r10
        L71:
            fcsu r0 = r3.i     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L36
            r11 = r0
            ahwi r11 = (defpackage.ahwi) r11     // Catch: java.lang.Throwable -> L36
            enzp r12 = defpackage.enzp.REQUEST_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L36
            r15 = 0
            r16 = 504(0x1f8, float:7.06E-43)
            defpackage.ahwi.b(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L36
            r0 = 0
            defpackage.fczl.a(r2, r0)
            fctx r0 = defpackage.fctx.a
            return r0
        L89:
            return r7
        L8a:
            r0 = move-exception
            r1 = r0
            r2 = r9
        L8d:
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            defpackage.fczl.a(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.h(java.util.UUID, java.io.File, szu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[Catch: all -> 0x0042, TryCatch #2 {all -> 0x0042, blocks: (B:12:0x0038, B:30:0x00c7, B:32:0x00cd, B:34:0x00d9, B:35:0x00f2, B:19:0x0056, B:21:0x0064, B:24:0x0086, B:26:0x00a4, B:29:0x00c2), top: B:57:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a A[Catch: all -> 0x0172, TryCatch #1 {all -> 0x0172, blocks: (B:38:0x0112, B:40:0x011a, B:41:0x0134), top: B:55:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #1 {all -> 0x0172, blocks: (B:38:0x0112, B:40:0x011a, B:41:0x0134), top: B:55:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x010e -> B:13:0x003b). Please report as a decompilation issue!!! */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.i(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r13 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.UUID r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.ahxx
            if (r0 == 0) goto L13
            r0 = r13
            ahxx r0 = (defpackage.ahxx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ahxx r0 = new ahxx
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            ekfx r12 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r13)
            goto L57
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            defpackage.fctl.b(r13)
            goto L4d
        L3a:
            defpackage.fctl.b(r13)
            fcsu r13 = r11.b
            java.lang.Object r13 = r13.b()
            ahwd r13 = (defpackage.ahwd) r13
            r0.d = r4
            java.lang.Object r13 = r13.m(r12, r0)
            if (r13 == r1) goto Lc9
        L4d:
            r2 = r13
            ekgb r2 = (defpackage.ekgb) r2
            ekqh r12 = r2.iterator()
            r12.getClass()
        L57:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lbd
            java.lang.Object r13 = r12.next()
            r13.getClass()
            btrc r13 = (defpackage.btrc) r13
            aiad r4 = r13.m()
            java.lang.String r7 = r4.e
            r7.getClass()
            aiad r4 = r13.m()
            int r5 = r4.c
            r6 = 3
            if (r5 != r6) goto L7d
            java.lang.Object r4 = r4.d
            ahzy r4 = (defpackage.ahzy) r4
            goto L7f
        L7d:
            ahzy r4 = defpackage.ahzy.a
        L7f:
            long r4 = r4.c
            int r4 = (int) r4
            aiad r5 = r13.m()
            int r8 = r5.c
            if (r8 != r6) goto L8f
            java.lang.Object r5 = r5.d
            ahzy r5 = (defpackage.ahzy) r5
            goto L91
        L8f:
            ahzy r5 = defpackage.ahzy.a
        L91:
            fcsu r6 = r11.d
            long r9 = r5.e
            java.lang.Object r5 = r6.b()
            ahtn r5 = (defpackage.ahtn) r5
            ahtq r8 = r11.k
            r6 = r4
            r5.h(r6, r7, r8, r9)
            fcsu r4 = r11.b
            java.lang.Object r4 = r4.b()
            ahwd r4 = (defpackage.ahwd) r4
            long r5 = r13.k()
            r0.a = r2
            r13 = r12
            ekfx r13 = (defpackage.ekfx) r13
            r0.e = r13
            r0.d = r3
            java.lang.Object r13 = r4.q(r5, r0)
            if (r13 != r1) goto L57
            goto Lc9
        Lbd:
            ekgb r2 = (defpackage.ekgb) r2
            int r12 = r2.size()
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxy.j(java.util.UUID, fcxy):java.lang.Object");
    }

    public final void k(enzp enzpVar, UUID uuid) {
        ahwi.d((ahwi) this.i.b(), enzpVar, 3, uuid, null, 0, 56);
    }
}
