package defpackage;

import com.google.android.gms.spatula.settings.SpatulaSettingPreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmm implements csmf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsProxyImpl");
    public final dedz b;
    private final egej c;
    private final awgx d;
    private final fcyh e;
    private csmb f;

    public csmm(egej egejVar, dedz dedzVar, awgx awgxVar, fcyh fcyhVar, fdjx fdjxVar) {
        egejVar.getClass();
        awgxVar.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.c = egejVar;
        this.b = dedzVar;
        this.d = awgxVar;
        this.e = fcyhVar;
    }

    private static final boolean g(SpatulaSettingPreference spatulaSettingPreference) {
        return spatulaSettingPreference.a == 2;
    }

    @Override // defpackage.csmf
    public final csmb a() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsProxyImpl", "getLastUsedSpatulaSettings", 109, "SpatulaSettingsProxyImpl.kt")).t("Getting last used Spatula settings %s", this.f);
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x00e5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e5, blocks: (B:42:0x00ab, B:29:0x0063, B:31:0x0069, B:32:0x006e), top: B:59:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csmm.b(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.csmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.efwo r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.csmi
            java.lang.String r1 = "SpatulaSettingsProxyImpl.kt"
            if (r0 == 0) goto L15
            r0 = r10
            csmi r0 = (defpackage.csmi) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            csmi r0 = new csmi
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            eieu r9 = r0.d
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2c
            goto L5d
        L2c:
            r10 = move-exception
            goto L88
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.fctl.b(r10)
            fcyh r10 = r0.u()
            boolean r10 = defpackage.eicg.b(r10)
            if (r10 == 0) goto L8e
            java.lang.String r10 = "SpatulaSettingsProxyImpl.getSpatulaSettingsForAccount"
            eieu r10 = defpackage.eiiy.h(r10)
            awgx r3 = r8.d     // Catch: java.lang.Throwable -> L84
            csmj r6 = new csmj     // Catch: java.lang.Throwable -> L84
            r6.<init>(r8, r9, r4)     // Catch: java.lang.Throwable -> L84
            r0.d = r10     // Catch: java.lang.Throwable -> L84
            r0.c = r5     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = r3.b(r9, r6, r0)     // Catch: java.lang.Throwable -> L84
            if (r9 == r2) goto L83
            r7 = r10
            r10 = r9
            r9 = r7
        L5d:
            csmb r10 = (defpackage.csmb) r10     // Catch: java.lang.Throwable -> L2c
            ekrg r0 = defpackage.csmm.a     // Catch: java.lang.Throwable -> L2c
            ekrw r0 = r0.h()     // Catch: java.lang.Throwable -> L2c
            ekrz r2 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "BugleSpam"
            r0.X(r2, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsProxyImpl"
            java.lang.String r3 = "getSpatulaSettingsForAccount"
            r5 = 67
            ekrw r0 = r0.h(r2, r3, r5, r1)     // Catch: java.lang.Throwable -> L2c
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "getSpatulaSettingsForAccount settings %s"
            r0.t(r1, r10)     // Catch: java.lang.Throwable -> L2c
            r8.f = r10     // Catch: java.lang.Throwable -> L2c
            defpackage.fczl.a(r9, r4)
            return r10
        L83:
            return r2
        L84:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L88:
            throw r10     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            defpackage.fczl.a(r9, r10)
            throw r0
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csmm.c(efwo, fcxy):java.lang.Object");
    }

    @Override // defpackage.csmf
    public final Object d(fcxy fcxyVar) {
        return eicj.a(this.e, new csml(this, null), fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2 A[Catch: dcgc -> 0x0042, dcff -> 0x0045, all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:14:0x003d, B:50:0x00b5, B:57:0x00c2, B:58:0x00cd, B:60:0x00d4, B:61:0x00f7, B:28:0x005d), top: B:73:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd A[Catch: dcgc -> 0x0042, dcff -> 0x0045, all -> 0x0061, TRY_LEAVE, TryCatch #2 {all -> 0x0061, blocks: (B:14:0x003d, B:50:0x00b5, B:57:0x00c2, B:58:0x00cd, B:60:0x00d4, B:61:0x00f7, B:28:0x005d), top: B:73:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v0, types: [csmm] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v8, types: [eieu] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.efwo r17, defpackage.fcxy r18) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csmm.e(efwo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r9 != r2) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r8v0, types: [efwo] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.efwo r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.csmk
            java.lang.String r1 = "SpatulaSettingsProxyImpl.kt"
            if (r0 == 0) goto L15
            r0 = r9
            csmk r0 = (defpackage.csmk) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            csmk r0 = new csmk
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L41
            if (r3 == r4) goto L38
            if (r3 != r5) goto L30
            eieu r8 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            goto L7d
        L2e:
            r9 = move-exception
            goto L8b
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            eieu r8 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L3e
            goto L67
        L3e:
            r9 = move-exception
            goto Lc0
        L41:
            defpackage.fctl.b(r9)
            fcyh r9 = r0.u()
            boolean r9 = defpackage.eicg.b(r9)
            if (r9 == 0) goto Lc6
            java.lang.String r9 = "SpatulaSettingsProxyImpl#getSpatulaSettingsForAccountId"
            eieu r9 = defpackage.eiiy.h(r9)
            egej r3 = r7.c     // Catch: java.lang.Throwable -> Lbc
            com.google.common.util.concurrent.ListenableFuture r8 = r3.b(r8)     // Catch: java.lang.Throwable -> Lbc
            r0.d = r9     // Catch: java.lang.Throwable -> Lbc
            r0.c = r4     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)     // Catch: java.lang.Throwable -> Lbc
            if (r8 == r2) goto Lbb
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L3e
            if (r9 != 0) goto L6d
            java.lang.String r9 = ""
        L6d:
            dedz r3 = r7.b     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            defn r9 = r3.a(r9)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            r0.d = r8     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            r0.c = r5     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            java.lang.Object r9 = defpackage.febo.a(r9, r0)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            if (r9 == r2) goto Lbb
        L7d:
            com.google.android.gms.spatula.settings.SpatulaSettingPreference r9 = (com.google.android.gms.spatula.settings.SpatulaSettingPreference) r9     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            csmb r0 = new csmb     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            boolean r2 = g(r9)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            boolean r9 = r9.b     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            r0.<init>(r2, r9, r5)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L3e
            goto Lb6
        L8b:
            ekrg r0 = defpackage.csmm.a     // Catch: java.lang.Throwable -> L3e
            ekrw r0 = r0.j()     // Catch: java.lang.Throwable -> L3e
            ekrz r2 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "BugleSpam"
            r0.X(r2, r3)     // Catch: java.lang.Throwable -> L3e
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L3e
            ekrw r9 = r0.g(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsProxyImpl"
            java.lang.String r2 = "getSpatulaSettingsForAccountId"
            r3 = 170(0xaa, float:2.38E-43)
            ekrw r9 = r9.h(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L3e
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "failed to get Spatula settings."
            r9.q(r0)     // Catch: java.lang.Throwable -> L3e
            csmb r0 = new csmb     // Catch: java.lang.Throwable -> L3e
            r9 = 7
            r1 = 0
            r0.<init>(r1, r1, r9)     // Catch: java.lang.Throwable -> L3e
        Lb6:
            r9 = 0
            defpackage.fczl.a(r8, r9)
            return r0
        Lbb:
            return r2
        Lbc:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        Lc0:
            throw r9     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r0 = move-exception
            defpackage.fczl.a(r8, r9)
            throw r0
        Lc6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csmm.f(efwo, fcxy):java.lang.Object");
    }
}
