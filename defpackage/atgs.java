package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atgs implements atgt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries");
    public final atgk b;
    public final atfx c;
    private final fcyh d;

    public atgs(fcyh fcyhVar, atgk atgkVar, atfx atfxVar) {
        fcyhVar.getClass();
        this.d = fcyhVar;
        this.b = atgkVar;
        this.c = atfxVar;
    }

    private final Object c(athh athhVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new atgm(null, this, athhVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (c(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.athh r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.atgl
            if (r0 == 0) goto L13
            r0 = r10
            atgl r0 = (defpackage.atgl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atgl r0 = new atgl
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r10)
            goto L7a
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            athh r9 = r0.d
            defpackage.fctl.b(r10)
            goto L6e
        L38:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.atgs.a
            ekrw r10 = r10.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r5 = "BugleFileTransfer"
            r10.X(r2, r5)
            ekrd r10 = (defpackage.ekrd) r10
            ekrz r2 = defpackage.coie.j
            r10.X(r2, r9)
            r2 = 82
            java.lang.String r5 = "FileTransferProcessorWithRetries.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries"
            java.lang.String r7 = "cancelProcessing"
            ekrw r10 = r10.h(r6, r7, r2, r5)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r2 = "Cancelling processing and scheduled work item."
            r10.q(r2)
            atfx r10 = r8.c
            r0.d = r9
            r0.c = r4
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 == r1) goto L7d
        L6e:
            r10 = 0
            r0.d = r10
            r0.c = r3
            java.lang.Object r9 = r8.c(r9, r0)
            if (r9 != r1) goto L7a
            goto L7d
        L7a:
            fctx r9 = defpackage.fctx.a
            return r9
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgs.a(athh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.athh r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.atgq
            if (r0 == 0) goto L13
            r0 = r12
            atgq r0 = (defpackage.atgq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atgq r0 = new atgq
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "queueWorkItem"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries"
            java.lang.String r5 = "BugleFileTransfer"
            r6 = 1
            java.lang.String r7 = "FileTransferProcessorWithRetries.kt"
            if (r2 == 0) goto L39
            if (r2 != r6) goto L31
            athh r11 = r0.d
            defpackage.fctl.b(r12)
            goto L76
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            defpackage.fctl.b(r12)
            java.lang.String r12 = defpackage.athg.b(r11)
            ekrg r2 = defpackage.atgs.a
            ekrw r2 = r2.h()
            ekrz r8 = defpackage.eksq.a
            r2.X(r8, r5)
            ekrd r2 = (defpackage.ekrd) r2
            ekrz r8 = defpackage.coie.j
            r2.X(r8, r11)
            r8 = 89
            ekrw r2 = r2.h(r4, r3, r8, r7)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r8 = "Queueing work item."
            r2.q(r8)
            fcyh r2 = r10.d
            fcyh r2 = defpackage.eicg.a(r2)
            atgp r8 = new atgp
            r9 = 0
            r8.<init>(r9, r10, r12)
            r0.d = r11
            r0.c = r6
            java.lang.Object r12 = defpackage.fdin.a(r2, r8, r0)
            if (r12 != r1) goto L76
            return r1
        L76:
            r12.getClass()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r12.booleanValue()
            ekrg r0 = defpackage.atgs.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.coie.j
            r0.X(r1, r11)
            r11 = 103(0x67, float:1.44E-43)
            ekrw r11 = r0.h(r4, r3, r11, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r0 = "Queued work item - %s."
            r11.t(r0, r12)
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgs.b(athh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (c(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.athh r9, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.atgn
            if (r0 == 0) goto L13
            r0 = r11
            atgn r0 = (defpackage.atgn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atgn r0 = new atgn
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r11)
            goto L7a
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            athh r9 = r0.d
            defpackage.fctl.b(r11)
            goto L6e
        L38:
            defpackage.fctl.b(r11)
            ekrg r11 = defpackage.atgs.a
            ekrw r11 = r11.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r5 = "BugleFileTransfer"
            r11.X(r2, r5)
            ekrd r11 = (defpackage.ekrd) r11
            ekrz r2 = defpackage.coie.j
            r11.X(r2, r9)
            r2 = 59
            java.lang.String r5 = "FileTransferProcessorWithRetries.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries"
            java.lang.String r7 = "pauseProcessing"
            ekrw r11 = r11.h(r6, r7, r2, r5)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Pausing processing and scheduled work item."
            r11.q(r2)
            atfx r11 = r8.c
            r0.d = r9
            r0.c = r4
            java.lang.Object r10 = r11.d(r9, r10, r0)
            if (r10 == r1) goto L7d
        L6e:
            r10 = 0
            r0.d = r10
            r0.c = r3
            java.lang.Object r9 = r8.c(r9, r0)
            if (r9 != r1) goto L7a
            goto L7d
        L7a:
            fctx r9 = defpackage.fctx.a
            return r9
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgs.d(athh, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (b(r6, r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.atgo
            if (r0 == 0) goto L13
            r0 = r7
            atgo r0 = (defpackage.atgo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            atgo r0 = new atgo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L47
        L38:
            defpackage.fctl.b(r7)
            atfx r7 = r5.c
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.f(r6, r0)
            if (r7 == r1) goto L72
        L47:
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r6 = r6.H()
            if (r6 == 0) goto L6a
            athh r6 = r6.z()
            if (r6 == 0) goto L62
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L5f
            goto L72
        L5f:
            fctx r6 = defpackage.fctx.a
            return r6
        L62:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Processing id is null."
            r6.<init>(r7)
            throw r6
        L6a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Can't process message without attachment."
            r6.<init>(r7)
            throw r6
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgs.f(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (b(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.athh r6, int r7, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.atgr
            if (r0 == 0) goto L13
            r0 = r9
            atgr r0 = (defpackage.atgr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atgr r0 = new atgr
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            athh r6 = r0.d
            defpackage.fctl.b(r9)
            goto L4b
        L38:
            defpackage.fctl.b(r9)
            atfx r9 = r5.c
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = r9.j(r6, r7, r8, r0)
            if (r7 == r1) goto L49
            fctx r7 = defpackage.fctx.a
        L49:
            if (r7 == r1) goto L5a
        L4b:
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r1) goto L57
            goto L5a
        L57:
            fctx r6 = defpackage.fctx.a
            return r6
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgs.i(athh, int, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }
}
