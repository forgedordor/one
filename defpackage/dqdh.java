package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqdh {
    private static final ekrg d = ekrg.c("com/google/android/libraries/compose/voice/recorder/VoiceRecorder");
    public final dqcw a;
    public dlzk b;
    public Uri c;
    private final fdjx e;
    private final fdjx f;
    private final dqdk g;
    private final Optional h;
    private fdlr i;
    private final ahnu j;

    public dqdh(fdjx fdjxVar, fdjx fdjxVar2, dqdk dqdkVar, ahnu ahnuVar, Optional optional, dqcw dqcwVar) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        dqdkVar.getClass();
        ahnuVar.getClass();
        this.e = fdjxVar;
        this.f = fdjxVar2;
        this.g = dqdkVar;
        this.j = ahnuVar;
        this.h = optional;
        this.a = dqcwVar;
    }

    private final dqdi g() {
        return this.g.b;
    }

    public final domv a() {
        return this.g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x03aa, code lost:
    
        if (r4.a(r2) == r3) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035b A[Catch: Exception -> 0x037d, TryCatch #1 {Exception -> 0x037d, blocks: (B:90:0x0369, B:83:0x0332, B:85:0x035b, B:86:0x035f, B:88:0x0365), top: B:107:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0365 A[Catch: Exception -> 0x037d, TryCatch #1 {Exception -> 0x037d, blocks: (B:90:0x0369, B:83:0x0332, B:85:0x035b, B:86:0x035f, B:88:0x0365), top: B:107:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0369 A[Catch: Exception -> 0x037d, PHI: r4 r5 r17
      0x0369: PHI (r4v8 ??) = (r4v9 ??), (r4v27 ??) binds: [B:89:0x0367, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r5v7 android.net.Uri) = (r5v8 android.net.Uri), (r5v39 android.net.Uri) binds: [B:89:0x0367, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r17v2 java.lang.String) = (r17v3 java.lang.String), (r17v11 java.lang.String) binds: [B:89:0x0367, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x037d, blocks: (B:90:0x0369, B:83:0x0332, B:85:0x035b, B:86:0x035f, B:88:0x0365), top: B:107:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x037b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v27, types: [dlzk] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [dlzk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [dlzk, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fdat r39, defpackage.fdat r40, defpackage.fdau r41, defpackage.fcxy r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqdh.b(fdat, fdat, fdau, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dqdb
            if (r0 == 0) goto L13
            r0 = r5
            dqdb r0 = (defpackage.dqdb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqdb r0 = new dqdb
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
            java.lang.Object r5 = r4.e(r0)
            if (r5 == r1) goto L74
        L3a:
            dqdk r5 = r4.g
            j$.time.Duration r5 = r5.f
            j$.time.Duration r0 = j$.time.Duration.ZERO
            int r0 = r5.compareTo(r0)
            if (r0 > 0) goto L62
            ekrg r5 = defpackage.dqdh.d
            ekrw r5 = r5.h()
            r0 = 137(0x89, float:1.92E-43)
            java.lang.String r1 = "VoiceRecorder.kt"
            java.lang.String r2 = "com/google/android/libraries/compose/voice/recorder/VoiceRecorder"
            java.lang.String r3 = "startTrackingAudioLevel"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Audio level polling is disabled by override."
            r5.q(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L62:
            fdjx r0 = r4.f
            dqdc r1 = new dqdc
            r2 = 0
            r1.<init>(r4, r5, r2)
            r5 = 3
            fdlr r5 = defpackage.fdil.d(r0, r2, r2, r1, r5)
            r4.i = r5
            fctx r5 = defpackage.fctx.a
            return r5
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqdh.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        if (r2.a(r0) != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:21:0x0058, B:34:0x007e, B:36:0x0086, B:37:0x0089, B:32:0x0074), top: B:59:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089 A[Catch: all -> 0x005c, Exception -> 0x005f, TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:21:0x0058, B:34:0x007e, B:36:0x0086, B:37:0x0089, B:32:0x0074), top: B:59:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [dlzk, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqdh.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dqdg
            if (r0 == 0) goto L13
            r0 = r5
            dqdg r0 = (defpackage.dqdg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqdg r0 = new dqdg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fdlr r5 = r4.i
            if (r5 == 0) goto L50
            r0.c = r3
            java.lang.Object r5 = defpackage.fdlw.a(r5, r0)
            if (r5 == r1) goto L4f
        L3e:
            r5 = 0
            r4.i = r5
            dqcw r5 = r4.a
            fdue r0 = r5.a
            java.util.List r1 = r0.d()
            r5.b = r1
            r0.e()
            goto L50
        L4f:
            return r1
        L50:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqdh.e(fcxy):java.lang.Object");
    }

    public final boolean f() {
        return this.b != null;
    }
}
