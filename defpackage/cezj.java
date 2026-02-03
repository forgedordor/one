package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cezj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/droidguard/DroidguardHandleManager");
    private final String b;
    private final dcpn c;
    private final feav d = new feaz();
    private dcpo e;

    public cezj(String str, dcpn dcpnVar) {
        this.b = str;
        this.c = dcpnVar;
    }

    private final void c() {
        dcpo dcpoVar = this.e;
        if (dcpoVar != null && dcpoVar.c()) {
            dcpoVar.close();
            this.e = null;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/droidguard/DroidguardHandleManager", "closeDroidGuardHandle", 145, "DroidguardHandleManager.kt")).q("Automation Detection: Droidguard handle closed");
    }

    private final void d() {
        dcpo dcpoVar = this.e;
        if (dcpoVar == null || !dcpoVar.c()) {
            c();
            dcpn dcpnVar = this.c;
            String str = this.b;
            dcpy dcpyVar = dcpnVar.a;
            this.e = (dcpo) new dcps(dcpyVar, str).b(dcpyVar.b);
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/droidguard/DroidguardHandleManager", "forceInitDroidGuardHandle", 134, "DroidguardHandleManager.kt")).q("Automation Detection: Droidguard handle init complete");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cezh
            if (r0 == 0) goto L13
            r0 = r9
            cezh r0 = (defpackage.cezh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cezh r0 = new cezh
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            feaz r8 = r0.f
            eieu r1 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L61
        L2d:
            r8 = move-exception
            goto Lbf
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.fctl.b(r9)
            fcyh r9 = r0.u()
            boolean r9 = defpackage.eicg.b(r9)
            if (r9 == 0) goto Lc5
            java.lang.String r9 = "DroidguardHandleManager#getDroidguardResultToken"
            eieu r9 = defpackage.eiiy.h(r9)
            feav r2 = r7.d     // Catch: java.lang.Throwable -> Lbd
            r0.a = r8     // Catch: java.lang.Throwable -> Lbd
            r0.e = r9     // Catch: java.lang.Throwable -> Lbd
            r4 = r2
            feaz r4 = (defpackage.feaz) r4     // Catch: java.lang.Throwable -> Lbd
            r0.f = r4     // Catch: java.lang.Throwable -> Lbd
            r0.d = r3     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == r1) goto Lbc
            r0 = r8
            r1 = r9
            r8 = r2
        L61:
            r7.d()     // Catch: java.lang.Throwable -> Lb7
            cezn r9 = defpackage.cezn.a     // Catch: java.lang.Throwable -> Lb7
            ekgb r2 = r9.a()     // Catch: java.lang.Throwable -> Lb7
            ekqh r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb7
            r2.getClass()     // Catch: java.lang.Throwable -> Lb7
        L71:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r3 == 0) goto L99
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lb7
            android.view.MotionEvent r3 = (android.view.MotionEvent) r3     // Catch: java.lang.Throwable -> Lb7
            r3.getClass()     // Catch: java.lang.Throwable -> Lb7
            dcpo r4 = r7.e     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto L71
            boolean r5 = r4.c()     // Catch: java.lang.Throwable -> Lb7
            if (r5 == 0) goto L71
            java.lang.String r5 = "evt"
            fcti r6 = new fcti     // Catch: java.lang.Throwable -> Lb7
            r6.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lb7
            java.util.Map r3 = defpackage.fcwa.c(r6)     // Catch: java.lang.Throwable -> Lb7
            r4.b(r3)     // Catch: java.lang.Throwable -> Lb7
            goto L71
        L99:
            dcpo r2 = r7.e     // Catch: java.lang.Throwable -> Lb7
            r3 = 0
            if (r2 == 0) goto La9
            boolean r4 = r2.c()     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto La9
            java.lang.String r0 = r2.a(r0)     // Catch: java.lang.Throwable -> Lb7
            goto Laa
        La9:
            r0 = r3
        Laa:
            r9.c()     // Catch: java.lang.Throwable -> Lb7
            r7.c()     // Catch: java.lang.Throwable -> Lb7
            r8.d()     // Catch: java.lang.Throwable -> L2d
            defpackage.fczl.a(r1, r3)
            return r0
        Lb7:
            r9 = move-exception
            r8.d()     // Catch: java.lang.Throwable -> L2d
            throw r9     // Catch: java.lang.Throwable -> L2d
        Lbc:
            return r1
        Lbd:
            r8 = move-exception
            r1 = r9
        Lbf:
            throw r8     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r9 = move-exception
            defpackage.fczl.a(r1, r8)
            throw r9
        Lc5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cezj.a(java.util.Map, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cezi
            if (r0 == 0) goto L13
            r0 = r7
            cezi r0 = (defpackage.cezi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cezi r0 = new cezi
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            feaz r1 = r0.e
            eieu r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5b
        L2b:
            r7 = move-exception
            goto L72
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.fctl.b(r7)
            fcyh r7 = r0.u()
            boolean r7 = defpackage.eicg.b(r7)
            if (r7 == 0) goto L78
            java.lang.String r7 = "DroidguardHandleManager#initDroidGuardHandle"
            eieu r7 = defpackage.eiiy.h(r7)
            feav r2 = r6.d     // Catch: java.lang.Throwable -> L6e
            r0.d = r7     // Catch: java.lang.Throwable -> L6e
            r4 = r2
            feaz r4 = (defpackage.feaz) r4     // Catch: java.lang.Throwable -> L6e
            r0.e = r4     // Catch: java.lang.Throwable -> L6e
            r0.c = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == r1) goto L6d
            r0 = r7
            r1 = r2
        L5b:
            r6.d()     // Catch: java.lang.Throwable -> L68
            r1.d()     // Catch: java.lang.Throwable -> L2b
            r7 = 0
            defpackage.fczl.a(r0, r7)
            fctx r7 = defpackage.fctx.a
            return r7
        L68:
            r7 = move-exception
            r1.d()     // Catch: java.lang.Throwable -> L2b
            throw r7     // Catch: java.lang.Throwable -> L2b
        L6d:
            return r1
        L6e:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L72:
            throw r7     // Catch: java.lang.Throwable -> L73
        L73:
            r1 = move-exception
            defpackage.fczl.a(r0, r7)
            throw r1
        L78:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cezj.b(fcxy):java.lang.Object");
    }
}
