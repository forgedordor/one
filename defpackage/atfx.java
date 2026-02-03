package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atfx implements atgt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor");
    private final aqzv A;
    private final fcsu B;
    private final ains C;
    private final aqzt D;
    private final aqza E;
    private final aqzz F;
    private final arag G;
    private final aral H;
    private final aqzx I;
    private final aqzn J;
    private final fcsu K;
    private final arac L;
    private final atjm M;
    public final fdjx b;
    public final atjz c;
    public final fcsu d;
    public final cqsu e;
    public final ConcurrentMap f;
    public final dqsn g;
    public final cqtc h;
    public final fcsu i;
    public final atjo j;
    public final cqmz k;
    public final araa l;
    public final aqzy m;
    private final fcyh n;
    private final fcyh o;
    private final atho p;
    private final atew q;
    private final atje r;
    private final atih s;
    private final athw t;
    private final atip u;
    private final atfa v;
    private final athb w;
    private final cogw x;
    private final coii y;
    private final bxfu z;

    public atfx(fdjx fdjxVar, fdjx fdjxVar2, fcyh fcyhVar, fcyh fcyhVar2, atho athoVar, atew atewVar, atjm atjmVar, atje atjeVar, atih atihVar, athw athwVar, atip atipVar, atfa atfaVar, athb athbVar, atjz atjzVar, fcsu fcsuVar, cqsu cqsuVar, cogw cogwVar, ConcurrentMap concurrentMap, dqsn dqsnVar, cqtc cqtcVar, fcsu fcsuVar2, atjo atjoVar, coii coiiVar, bxfu bxfuVar, aqzv aqzvVar, fcsu fcsuVar3, ains ainsVar, cqmz cqmzVar, aqzt aqztVar, aqza aqzaVar, aqzz aqzzVar, arag aragVar, aral aralVar, aqzx aqzxVar, aqzn aqznVar, araa araaVar, aqzy aqzyVar, fcsu fcsuVar4, arac aracVar) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        atjzVar.getClass();
        fcsuVar.getClass();
        cqsuVar.getClass();
        cogwVar.getClass();
        concurrentMap.getClass();
        dqsnVar.getClass();
        cqtcVar.getClass();
        fcsuVar2.getClass();
        coiiVar.getClass();
        bxfuVar.getClass();
        aqzvVar.getClass();
        fcsuVar3.getClass();
        ainsVar.getClass();
        cqmzVar.getClass();
        aqztVar.getClass();
        aragVar.getClass();
        aralVar.getClass();
        aqznVar.getClass();
        fcsuVar4.getClass();
        aracVar.getClass();
        this.b = fdjxVar;
        this.n = fcyhVar;
        this.o = fcyhVar2;
        this.p = athoVar;
        this.q = atewVar;
        this.M = atjmVar;
        this.r = atjeVar;
        this.s = atihVar;
        this.t = athwVar;
        this.u = atipVar;
        this.v = atfaVar;
        this.w = athbVar;
        this.c = atjzVar;
        this.d = fcsuVar;
        this.e = cqsuVar;
        this.x = cogwVar;
        this.f = concurrentMap;
        this.g = dqsnVar;
        this.h = cqtcVar;
        this.i = fcsuVar2;
        this.j = atjoVar;
        this.y = coiiVar;
        this.z = bxfuVar;
        this.A = aqzvVar;
        this.B = fcsuVar3;
        this.C = ainsVar;
        this.k = cqmzVar;
        this.D = aqztVar;
        this.E = aqzaVar;
        this.F = aqzzVar;
        this.G = aragVar;
        this.H = aralVar;
        this.I = aqzxVar;
        this.J = aqznVar;
        this.l = araaVar;
        this.m = aqzyVar;
        this.K = fcsuVar4;
        this.L = aracVar;
    }

    static /* synthetic */ Object m(atfx atfxVar, atha athaVar, boolean z, boolean z2, long j, boolean z3, long j2, fcxy fcxyVar) {
        return atfxVar.n(athaVar, z, z2, j, z3, false, "video/avc", null, fcxyVar);
    }

    @fcsv
    private final Object o(MessagePartCoreData messagePartCoreData, fcxy fcxyVar) {
        if (!messagePartCoreData.bp() || messagePartCoreData.R() == null) {
            return false;
        }
        if (messagePartCoreData.bj()) {
            String strR = messagePartCoreData.R();
            strR.getClass();
            ContentType contentTypeF = auby.f(strR);
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleFileTransfer");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "shouldResizeMessagePart", 916, "FileTransferProcessor.kt")).D("Original content type: %s. Resolved content type: %s", messagePartCoreData.R(), contentTypeF);
            return k(contentTypeF, fcxyVar);
        }
        if (messagePartCoreData.bx()) {
            Uri uriT = messagePartCoreData.t();
            uriT.getClass();
            return p(uriT, fcxyVar);
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleFileTransfer");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "shouldResizeMessagePart", 926, "FileTransferProcessor.kt")).q("Attachment is neither image nor video so no resizing.");
        return false;
    }

    private final Object p(Uri uri, fcxy fcxyVar) {
        return fdin.a(this.n, new atfr(this, uri, null), fcxyVar);
    }

    private final void q(athk athkVar, final atha athaVar, atii atiiVar) throws Throwable {
        this.C.c("Bugle.FileProcessing.Starts");
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleFileTransfer");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = coie.j;
        athh athhVar = athaVar.b;
        ekrdVar.X(ekrzVar, athhVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "startPipeline", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "FileTransferProcessor.kt")).I("Adding processing pipeline to in progress map. Processing request: contentUri = %s, contentType = %s, encryptionProtocol = %s.", atiiVar.a, atiiVar.b, Long.valueOf(cbqy.a(atiiVar.k)));
        fdlt fdltVar = new fdlt(null);
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        fdkf fdkfVarB = fdin.b(this.b, eicg.a(fcyiVar), fdjzVar, new atfs(null, this, fdltVar, athaVar, athhVar, athkVar, atiiVar));
        if (this.l.a()) {
            fdkfVarB.hK(new fdap() { // from class: atfb
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws Throwable {
                    Throwable th = (Throwable) obj;
                    if (th != null) {
                        atha athaVar2 = athaVar;
                        if (!(th instanceof CancellationException)) {
                            atfx atfxVar = this.a;
                            if (!((eoth) ((aqxx) atfxVar.m).a.b()).a("bugle.log_file_processing_event_when_pipeline_fails_with_exception")) {
                                throw th;
                            }
                            atjp atjpVar = athaVar2.e;
                            atjpVar.m = 7;
                            atfxVar.j.a(athaVar2.b, Long.valueOf(atjpVar.c), atjpVar);
                            throw th;
                        }
                        ekrw ekrwVarH2 = atfx.a.h();
                        ekrwVarH2.X(eksq.a, "BugleFileTransfer");
                        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
                        ekrdVar2.X(coie.j, athaVar2.b);
                        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "handleInvokeOnCompletion", 284, "FileTransferProcessor.kt")).q("Pipeline execution was cancelled.");
                    }
                    return fctx.a;
                }
            });
            fdltVar.R(fctx.a);
        }
        this.f.put(athhVar, new athf(athkVar, athaVar, fdkfVarB));
    }

    private static final boolean r(MessageCoreData messageCoreData) {
        int[] iArrDn = MessageData.dn();
        int iK = messageCoreData.k();
        int i = 0;
        while (true) {
            if (i >= 5) {
                break;
            }
            if (iK != iArrDn[i]) {
                i++;
            } else if (i >= 0) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleFileTransfer");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.MEDIUM);
                ekrdVar.X(cqnc.b, messageCoreData.C());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "isMessageInSuccessfulOutgoingStatus", 955, "FileTransferProcessor.kt")).r("The message was already marked with one of the successful statuses (status = %s). Skipping processing.", messageCoreData.k());
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.atgt
    public final Object a(athh athhVar, fcxy fcxyVar) {
        athf athfVar = (athf) this.f.get(athhVar);
        if (athfVar == null) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleFileTransfer");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(coie.j, athhVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "cancelProcessing", 858, "FileTransferProcessor.kt")).q("Processing id missing from map while cancelling processing.");
            return fctx.a;
        }
        ekrw ekrwVarH2 = a.h();
        ekrwVarH2.X(eksq.a, "BugleFileTransfer");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.X(coie.j, athhVar);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor", "cancelProcessing", 861, "FileTransferProcessor.kt")).q("Cancelling processing.");
        Object objA = fdin.a(eicg.a(this.n), new atfc(null, athfVar, this, athhVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.rcs.client.messaging.data.ContentType r6, android.net.Uri r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.atfg
            if (r0 == 0) goto L13
            r0 = r8
            atfg r0 = (defpackage.atfg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atfg r0 = new atfg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L60
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            java.lang.String r8 = r6.toString()
            boolean r8 = defpackage.le.z(r8)
            if (r8 == 0) goto L41
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L41:
            java.lang.String r8 = r6.toString()
            boolean r8 = defpackage.le.m(r8)
            if (r8 == 0) goto L6c
            fcyh r8 = r5.n
            fcyh r8 = defpackage.eicg.a(r8)
            atff r2 = new atff
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L6c:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.b(com.google.android.rcs.client.messaging.data.ContentType, android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (defpackage.fdxs.c(r11, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.athh r11, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.d(athh, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.athj r36, defpackage.fcxy r37) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.e(athj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0180, code lost:
    
        if (g(r2, r1, 0, r13) != r3) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0362  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    @Override // defpackage.atgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r24, defpackage.fcxy r25) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.f(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.athh r22, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r23, int r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.g(athh, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (j(r7, r8, r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.athh r7, int r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.atfo
            if (r0 == 0) goto L13
            r0 = r9
            atfo r0 = (defpackage.atfo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            atfo r0 = new atfo
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r9)
            goto La6
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r8 = r0.a
            athh r7 = r0.e
            defpackage.fctl.b(r9)
            goto L56
        L3c:
            defpackage.fctl.b(r9)
            fcyh r9 = r6.o
            fcyh r9 = defpackage.eicg.a(r9)
            atfn r2 = new atfn
            r2.<init>(r3, r6, r7)
            r0.e = r7
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = defpackage.fdin.a(r9, r2, r0)
            if (r9 == r1) goto Lb7
        L56:
            aqzz r2 = r6.F
            aqxz r2 = (defpackage.aqxz) r2
            fcsu r2 = r2.a
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r9
            java.lang.Object r2 = r2.b()
            eoth r2 = (defpackage.eoth) r2
            java.lang.String r5 = "bugle.perform_graceful_return_on_empty_message_core_data"
            boolean r2 = r2.a(r5)
            if (r2 == 0) goto L99
            if (r9 == 0) goto L6f
            goto L9b
        L6f:
            ekrg r8 = defpackage.atfx.a
            ekrw r8 = r8.j()
            ekrz r9 = defpackage.eksq.a
            java.lang.String r0 = "BugleFileTransfer"
            r8.X(r9, r0)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r9 = defpackage.coie.j
            r8.X(r9, r7)
            r7 = 595(0x253, float:8.34E-43)
            java.lang.String r9 = "FileTransferProcessor.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor"
            java.lang.String r1 = "resumeProcessing"
            ekrw r7 = r8.h(r0, r1, r7, r9)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "MessageCoreData is null."
            r7.q(r8)
            fctx r7 = defpackage.fctx.a
            return r7
        L99:
            if (r9 == 0) goto La9
        L9b:
            r0.e = r3
            r0.d = r4
            java.lang.Object r7 = r6.j(r7, r8, r9, r0)
            if (r7 != r1) goto La6
            goto Lb7
        La6:
            fctx r7 = defpackage.fctx.a
            return r7
        La9:
            java.lang.String r8 = "MessageCoreData is null for "
            java.lang.String r9 = "."
            java.lang.String r7 = defpackage.a.h(r7, r8, r9)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r7)
            throw r8
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.h(athh, int, fcxy):java.lang.Object");
    }

    @Override // defpackage.atgt
    public final Object i(athh athhVar, int i, MessageCoreData messageCoreData, fcxy fcxyVar) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (f(r2, r4) == r5) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0203, code lost:
    
        if (defpackage.fdbq.f(r2, defpackage.bvug.a) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02fa, code lost:
    
        if (defpackage.fctx.a == r5) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0329, code lost:
    
        if (g(r6, r2, r1, r4) != r5) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0319  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.athh r31, int r32, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r33, defpackage.fcxy r34) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.j(athh, int, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.google.android.rcs.client.messaging.data.ContentType r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.atfq
            if (r0 == 0) goto L13
            r0 = r7
            atfq r0 = (defpackage.atfq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atfq r0 = new atfq
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.rcs.client.messaging.data.AutoValue_ContentType r6 = r0.d
            defpackage.fctl.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            r7 = r6
            com.google.android.rcs.client.messaging.data.AutoValue_ContentType r7 = (com.google.android.rcs.client.messaging.data.AutoValue_ContentType) r7
            r0.d = r7
            r0.c = r3
            fcyh r7 = r5.n
            atfe r2 = new atfe
            r4 = 0
            r2.<init>(r5, r4)
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 == r1) goto L65
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 0
            if (r7 == 0) goto L5f
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "image/png"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L5f
            goto L60
        L5f:
            r3 = r0
        L60:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.k(com.google.android.rcs.client.messaging.data.ContentType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r8, defpackage.athh r9, defpackage.bvdq r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.atfv
            if (r0 == 0) goto L13
            r0 = r11
            atfv r0 = (defpackage.atfv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            atfv r0 = new atfv
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            athh r9 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r11)
            goto L9b
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.fctl.b(r11)
            java.lang.String[] r11 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.a
            bsjh r11 = new bsjh
            r11.<init>()
            java.lang.String r2 = "FileTransferProcessor#updateMessagePart"
            r11.ap(r2)
            java.lang.Integer r2 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.e()
            int r2 = r2.intValue()
            java.lang.Integer r4 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.e()
            int r4 = r4.intValue()
            r5 = 60080(0xeab0, float:8.419E-41)
            java.lang.String r6 = "processing_id"
            if (r4 >= r5) goto L5c
            defpackage.dqru.x(r6, r4)
        L5c:
            if (r2 < r5) goto L6f
            if (r9 != 0) goto L66
            android.content.ContentValues r2 = r11.a
            r2.putNull(r6)
            goto L6f
        L66:
            android.content.ContentValues r2 = r11.a
            java.lang.String r4 = defpackage.athg.b(r9)
            r2.put(r6, r4)
        L6f:
            bsjl r2 = new bsjl
            r2.<init>()
            java.lang.String r4 = r8.W()
            r2.j(r4)
            r11.C(r2)
            if (r10 == 0) goto L83
            r11.q(r10)
        L83:
            fcyh r10 = r7.o
            fcyh r10 = defpackage.eicg.a(r10)
            atfu r2 = new atfu
            r4 = 0
            r2.<init>(r4, r7, r11)
            r0.a = r8
            r0.e = r9
            r0.d = r3
            java.lang.Object r11 = defpackage.fdin.a(r10, r2, r0)
            if (r11 == r1) goto Ld9
        L9b:
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto La0
            goto Ld6
        La0:
            int r10 = r11.intValue()
            if (r10 != 0) goto Ld6
            ekrg r10 = defpackage.atfx.a
            ekrw r10 = r10.j()
            ekrz r11 = defpackage.eksq.a
            java.lang.String r0 = "BugleFileTransfer"
            r10.X(r11, r0)
            ekrd r10 = (defpackage.ekrd) r10
            ekrz r11 = defpackage.cqnc.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8 = r8.B()
            r10.X(r11, r8)
            ekrz r8 = defpackage.coie.j
            r10.X(r8, r9)
            r8 = 509(0x1fd, float:7.13E-43)
            java.lang.String r9 = "FileTransferProcessor.kt"
            java.lang.String r11 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessor"
            java.lang.String r0 = "updateMessagePart"
            ekrw r8 = r10.h(r11, r0, r8, r9)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r9 = "Failed to update processing id for message part."
            r8.q(r9)
        Ld6:
            fctx r8 = defpackage.fctx.a
            return r8
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.l(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, athh, bvdq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r13v8, types: [eygg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [eygg, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.atha r19, boolean r20, boolean r21, long r22, boolean r24, boolean r25, java.lang.String r26, java.lang.Boolean r27, defpackage.fcxy r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfx.n(atha, boolean, boolean, long, boolean, boolean, java.lang.String, java.lang.Boolean, fcxy):java.lang.Object");
    }
}
