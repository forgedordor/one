package defpackage;

import android.content.Context;
import com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csjw implements cscu, cqci {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/messagescamguard/MessageScamGuardSpamProtection");
    private final Context b;
    private final fcsu c;
    private final AtomicReference d;
    private final AtomicReference e;

    public csjw(Context context, fcsu fcsuVar) {
        context.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.c = fcsuVar;
        this.d = new AtomicReference(null);
        this.e = new AtomicReference(false);
    }

    @Override // defpackage.cscu
    public final csdl a() {
        return csdl.l;
    }

    @Override // defpackage.cscu
    public final eieu b() {
        return eiiy.a("MessageScamGuardSpamProtection.classify");
    }

    @Override // defpackage.cscu
    public final /* synthetic */ eieu c() {
        return csct.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        if (r0 != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cscu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.csch r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csjw.d(csch, fcxy):java.lang.Object");
    }

    @Override // defpackage.cscu
    public final /* synthetic */ Object e(csch cschVar, int i, fcxy fcxyVar) {
        return csct.b();
    }

    @Override // defpackage.cscu
    public final /* synthetic */ boolean f() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csjw.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[Catch: all -> 0x00af, TryCatch #3 {all -> 0x00af, blocks: (B:36:0x0098, B:37:0x009a, B:42:0x00a7, B:40:0x00a1, B:35:0x0073), top: B:58:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.csjv
            java.lang.String r1 = "MessageScamGuardSpamProtection.kt"
            if (r0 == 0) goto L15
            r0 = r8
            csjv r0 = (defpackage.csjv) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            csjv r0 = new csjv
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            eieu r0 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L61
        L2c:
            r8 = move-exception
            goto L73
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            defpackage.fctl.b(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r7.d
            java.lang.Object r8 = r8.get()
            com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier r8 = (com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier) r8
            if (r8 == 0) goto L44
            return r8
        L44:
            fcyh r8 = r0.u()
            boolean r8 = defpackage.eicg.b(r8)
            if (r8 == 0) goto Lb6
            java.lang.String r8 = "MessageScamGuardSpamProtection#loadClassifier"
            eieu r8 = defpackage.eiiy.h(r8)
            r0.d = r8     // Catch: java.lang.Throwable -> L6f
            r0.c = r4     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r7.g(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 == r2) goto L6e
            r6 = r0
            r0 = r8
            r8 = r6
        L61:
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L6c
            android.content.Context r2 = r7.b     // Catch: java.lang.Throwable -> L2c
            com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier r8 = com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier.a(r2, r8)     // Catch: java.lang.Throwable -> L2c
            goto L98
        L6c:
            r8 = r5
            goto L98
        L6e:
            return r2
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            ekrg r2 = defpackage.csjw.a     // Catch: java.lang.Throwable -> Laf
            ekrw r2 = r2.j()     // Catch: java.lang.Throwable -> Laf
            ekrz r3 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = "BugleSpam"
            r2.X(r3, r4)     // Catch: java.lang.Throwable -> Laf
            ekrd r2 = (defpackage.ekrd) r2     // Catch: java.lang.Throwable -> Laf
            ekrw r8 = r2.g(r8)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/messagescamguard/MessageScamGuardSpamProtection"
            java.lang.String r3 = "loadClassifier"
            r4 = 169(0xa9, float:2.37E-43)
            ekrw r8 = r8.h(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> Laf
            ekrd r8 = (defpackage.ekrd) r8     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = "unable to create the msg model from path"
            r8.q(r1)     // Catch: java.lang.Throwable -> Laf
            goto L6c
        L98:
            java.util.concurrent.atomic.AtomicReference r1 = r7.d     // Catch: java.lang.Throwable -> Laf
        L9a:
            boolean r2 = r1.compareAndSet(r5, r8)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto La1
            goto La7
        La1:
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L9a
        La7:
            java.lang.Object r8 = r1.get()     // Catch: java.lang.Throwable -> Laf
            defpackage.fczl.a(r0, r5)
            return r8
        Laf:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r1 = move-exception
            defpackage.fczl.a(r0, r8)
            throw r1
        Lb6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csjw.h(fcxy):java.lang.Object");
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        TextClassifier textClassifier;
        if (i < 40 || (textClassifier = (TextClassifier) this.d.getAndSet(null)) == null) {
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/util/spam/messagescamguard/MessageScamGuardSpamProtection", "reclaimMemory", 194, "MessageScamGuardSpamProtection.kt")).q("trimming memory: closing msg model.");
        textClassifier.close();
    }
}
