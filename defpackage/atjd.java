package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atjd implements athk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/UploadStep");
    private final fcsu b;
    private final couz c;
    private final coir d;
    private final atjz e;
    private final coyz f;
    private final atnv g;
    private final fcsu h;
    private final coun i;
    private final febb j;
    private final aqzv k;
    private final aral l;
    private final cqmz m;
    private final aqvb n;
    private final fcsu o;
    private final arac p;
    private atir q;
    private final AtomicBoolean r = new AtomicBoolean(false);
    private final atjr s = atjr.g;

    public atjd(fcsu fcsuVar, couz couzVar, coir coirVar, atjz atjzVar, coyz coyzVar, atnv atnvVar, fcsu fcsuVar2, coun counVar, febb febbVar, aqzv aqzvVar, aral aralVar, cqmz cqmzVar, aqvb aqvbVar, fcsu fcsuVar3, arac aracVar) {
        this.b = fcsuVar;
        this.c = couzVar;
        this.d = coirVar;
        this.e = atjzVar;
        this.f = coyzVar;
        this.g = atnvVar;
        this.h = fcsuVar2;
        this.i = counVar;
        this.j = febbVar;
        this.k = aqzvVar;
        this.l = aralVar;
        this.m = cqmzVar;
        this.n = aqvbVar;
        this.o = fcsuVar3;
        this.p = aracVar;
    }

    @Override // defpackage.athk
    public final atjr a() {
        return this.s;
    }

    @Override // defpackage.athk
    public final Object b(fcxy fcxyVar) {
        this.r.set(true);
        Object objG = g(fcxyVar);
        return objG == fcyl.a ? objG : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.atii r8, defpackage.athh r9, long r10, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.atiw
            if (r0 == 0) goto L13
            r0 = r12
            atiw r0 = (defpackage.atiw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            atiw r0 = new atiw
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r10 = r0.a
            atii r8 = r0.e
            defpackage.fctl.b(r12)
            goto L78
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.fctl.b(r12)
            atis r12 = r8.l
            if (r12 != 0) goto L78
            ekrg r12 = defpackage.atjd.a
            ekrw r12 = r12.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "BugleFileTransfer"
            r12.X(r2, r4)
            r2 = 312(0x138, float:4.37E-43)
            java.lang.String r4 = "UploadStep.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/UploadStep"
            java.lang.String r6 = "createEncryptedFileUploadInfo"
            ekrw r12 = r12.h(r5, r6, r2, r4)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r2 = "Updating file transfer entry with encrypted file info"
            r12.q(r2)
            atjz r12 = r7.e
            android.net.Uri r2 = r8.a
            r2.getClass()
            com.google.android.rcs.client.messaging.data.ContentType r4 = r8.b
            r4.getClass()
            aubx r4 = defpackage.auby.a(r4)
            r0.e = r8
            r0.a = r10
            r0.d = r3
            java.lang.Object r9 = r12.k(r9, r2, r4, r0)
            if (r9 == r1) goto L77
            goto L78
        L77:
            return r1
        L78:
            arac r9 = r7.p
            boolean r9 = r9.a()
            if (r9 == 0) goto L83
            java.lang.String r9 = r8.c
            goto L85
        L83:
            java.lang.String r9 = "encrypted_file"
        L85:
            eksp r12 = defpackage.cous.h
            couc r12 = new couc
            r12.<init>()
            r12.f(r9)
            android.net.Uri r9 = r8.a
            r12.e(r9)
            com.google.android.rcs.client.messaging.data.ContentType r9 = r8.b
            r12.d(r9)
            r12.g(r10)
            evqs r9 = r8.f
            if (r9 == 0) goto La8
            r12.i(r9)
            com.google.android.rcs.client.messaging.data.ContentType r8 = r8.g
            r12.h(r8)
        La8:
            cous r8 = r12.j()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjd.c(atii, athh, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aubq r5, defpackage.athh r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.atix
            if (r0 == 0) goto L13
            r0 = r7
            atix r0 = (defpackage.atix) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atix r0 = new atix
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            athh r6 = r0.d
            defpackage.fctl.b(r7)     // Catch: defpackage.eqco -> L4e
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            fcsu r7 = r4.b     // Catch: defpackage.eqco -> L4e
            java.lang.Object r7 = r7.b()     // Catch: defpackage.eqco -> L4e
            ahkr r7 = (defpackage.ahkr) r7     // Catch: defpackage.eqco -> L4e
            eqcb r5 = r7.a(r5)     // Catch: defpackage.eqco -> L4e
            r0.d = r6     // Catch: defpackage.eqco -> L4e
            r0.c = r3     // Catch: defpackage.eqco -> L4e
            java.lang.Object r7 = r5.b(r0)     // Catch: defpackage.eqco -> L4e
            if (r7 != r1) goto L4b
            return r1
        L4b:
            evqs r7 = (defpackage.evqs) r7     // Catch: defpackage.eqco -> L4e
            return r7
        L4e:
            ekrg r5 = defpackage.atjd.a
            ekrw r5 = r5.i()
            ekrz r7 = defpackage.eksq.a
            java.lang.String r0 = "BugleFileTransfer"
            r5.X(r7, r0)
            ekrd r5 = (defpackage.ekrd) r5
            ekrz r7 = defpackage.coie.j
            r5.X(r7, r6)
            r6 = 302(0x12e, float:4.23E-43)
            java.lang.String r7 = "UploadStep.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/UploadStep"
            java.lang.String r1 = "getAuthToken"
            ekrw r5 = r5.h(r0, r1, r6, r7)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Could not obtain auth token for upload."
            r5.q(r6)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjd.d(aubq, athh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.coyj r15, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r16, defpackage.athh r17, int r18, defpackage.atjp r19, defpackage.cous r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjd.e(coyj, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, athh, int, atjp, cous, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.coyi r25, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r26, defpackage.athh r27, final int r28, defpackage.atjp r29, com.google.android.rcs.client.messaging.data.ContentType r30, boolean r31, defpackage.atii r32, defpackage.fcxy r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjd.f(coyi, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, athh, int, atjp, com.google.android.rcs.client.messaging.data.ContentType, boolean, atii, fcxy):java.lang.Object");
    }

    @Override // defpackage.athk
    public final Object g(fcxy fcxyVar) {
        if (this.q != null) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleFileTransfer");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrz ekrzVar = coie.j;
            atir atirVar = this.q;
            ekrdVar.X(ekrzVar, atirVar != null ? atirVar.b : null);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/UploadStep", "pause", 479, "UploadStep.kt")).q("Pausing upload.");
            this.c.a(this.q);
        }
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.athk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.atha r15, defpackage.atii r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjd.h(atha, atii, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
    
        if (r3 != r11) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b4, code lost:
    
        if (r3 != r11) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.atha r19, defpackage.cous r20, defpackage.aubq r21, defpackage.evqs r22, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r23, defpackage.atii r24, defpackage.atis r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjd.i(atha, cous, aubq, evqs, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, atii, atis, fcxy):java.lang.Object");
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean l() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.atha r21, defpackage.atii r22, long r23, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atjd.m(atha, atii, long, fcxy):java.lang.Object");
    }
}
