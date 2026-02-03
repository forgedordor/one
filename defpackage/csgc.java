package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csgc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TemplatesStore");
    public final ecjh b;
    public final AtomicReference c;
    private final eosd d;
    private final fcyh e;

    public csgc(ecjh ecjhVar, eosd eosdVar, fcyh fcyhVar) {
        ecjhVar.getClass();
        eosdVar.getClass();
        fcyhVar.getClass();
        this.b = ecjhVar;
        this.d = eosdVar;
        this.e = fcyhVar;
        this.c = new AtomicReference(csfo.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.csfw
            java.lang.String r1 = "TemplatesStore.kt"
            if (r0 == 0) goto L15
            r0 = r9
            csfw r0 = (defpackage.csfw) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            csfw r0 = new csfw
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            eieu r0 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L90
        L2c:
            r9 = move-exception
            goto L99
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            defpackage.fctl.b(r9)
            fcyh r9 = r0.u()
            boolean r9 = defpackage.eicg.b(r9)
            if (r9 == 0) goto L9f
            java.lang.String r9 = "TemplatesStore#current"
            eieu r9 = defpackage.eiiy.h(r9)
            java.util.concurrent.atomic.AtomicReference r3 = r8.c     // Catch: java.lang.Throwable -> L95
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L95
            csfp r3 = (defpackage.csfp) r3     // Catch: java.lang.Throwable -> L95
            boolean r6 = r3 instanceof defpackage.csfn     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L7c
            ekrg r0 = defpackage.csgc.a     // Catch: java.lang.Throwable -> L95
            ekrw r0 = r0.h()     // Catch: java.lang.Throwable -> L95
            ekrz r2 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L95
            java.lang.String r4 = "BugleSpam"
            r0.X(r2, r4)     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TemplatesStore"
            java.lang.String r4 = "current$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_util_spam_fuzzymatching_templates_store_AUTO_DEPS_ORIGINAL"
            r6 = 76
            ekrw r0 = r0.h(r2, r4, r6, r1)     // Catch: java.lang.Throwable -> L95
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "cache hit! returning templates at version %s"
            r2 = r3
            csfn r2 = (defpackage.csfn) r2     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L95
            r0.t(r1, r2)     // Catch: java.lang.Throwable -> L95
            defpackage.fczl.a(r9, r5)
            return r3
        L7c:
            fcyh r1 = r8.e     // Catch: java.lang.Throwable -> L95
            csfx r3 = new csfx     // Catch: java.lang.Throwable -> L95
            r3.<init>(r8, r5)     // Catch: java.lang.Throwable -> L95
            r0.d = r9     // Catch: java.lang.Throwable -> L95
            r0.c = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = defpackage.fdin.a(r1, r3, r0)     // Catch: java.lang.Throwable -> L95
            if (r0 == r2) goto L94
            r7 = r0
            r0 = r9
            r9 = r7
        L90:
            defpackage.fczl.a(r0, r5)
            return r9
        L94:
            return r2
        L95:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L99:
            throw r9     // Catch: java.lang.Throwable -> L9a
        L9a:
            r1 = move-exception
            defpackage.fczl.a(r0, r9)
            throw r1
        L9f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csgc.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.csfy
            if (r0 == 0) goto L13
            r0 = r5
            csfy r0 = (defpackage.csfy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csfy r0 = new csfy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            csfn r5 = (defpackage.csfn) r5
            ekgb r5 = r5.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csgc.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final defpackage.ezba r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.csfz
            java.lang.String r1 = "TemplatesStore.kt"
            if (r0 == 0) goto L15
            r0 = r9
            csfz r0 = (defpackage.csfz) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            csfz r0 = new csfz
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            eieu r8 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L65
        L2b:
            r9 = move-exception
            goto L96
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.fctl.b(r9)
            fcyh r9 = r0.u()
            boolean r9 = defpackage.eicg.b(r9)
            if (r9 == 0) goto L9c
            java.lang.String r9 = "TemplatesStore#updateTemplates"
            eieu r9 = defpackage.eiiy.h(r9)
            ecjh r3 = r7.b     // Catch: java.lang.Throwable -> L92
            csfu r5 = new csfu     // Catch: java.lang.Throwable -> L92
            r5.<init>()     // Catch: java.lang.Throwable -> L92
            csfv r8 = new csfv     // Catch: java.lang.Throwable -> L92
            r8.<init>()     // Catch: java.lang.Throwable -> L92
            eosd r5 = r7.d     // Catch: java.lang.Throwable -> L92
            com.google.common.util.concurrent.ListenableFuture r8 = r3.b(r8, r5)     // Catch: java.lang.Throwable -> L92
            r0.d = r9     // Catch: java.lang.Throwable -> L92
            r0.c = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)     // Catch: java.lang.Throwable -> L92
            if (r8 == r2) goto L91
            r8 = r9
        L65:
            ekrg r9 = defpackage.csgc.a     // Catch: java.lang.Throwable -> L2b
            ekrw r9 = r9.h()     // Catch: java.lang.Throwable -> L2b
            ekrz r0 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "BugleSpam"
            r9.X(r0, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TemplatesStore"
            java.lang.String r2 = "updateTemplates"
            r3 = 67
            ekrw r9 = r9.h(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L2b
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "invalidating the spam templates cache"
            r9.q(r0)     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.atomic.AtomicReference r9 = r7.c     // Catch: java.lang.Throwable -> L2b
            csfo r0 = defpackage.csfo.a     // Catch: java.lang.Throwable -> L2b
            r9.set(r0)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            defpackage.fczl.a(r8, r9)
            fctx r8 = defpackage.fctx.a
            return r8
        L91:
            return r2
        L92:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L96:
            throw r9     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            defpackage.fczl.a(r8, r9)
            throw r0
        L9c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csgc.c(ezba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.csga
            if (r0 == 0) goto L13
            r0 = r5
            csga r0 = (defpackage.csga) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csga r0 = new csga
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            csfn r5 = (defpackage.csfn) r5
            java.lang.String r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csgc.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.csgb
            if (r0 == 0) goto L13
            r0 = r5
            csgb r0 = (defpackage.csgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csgb r0 = new csgb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            csfn r5 = (defpackage.csfn) r5
            ekgb r5 = r5.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csgc.e(fcxy):java.lang.Object");
    }
}
