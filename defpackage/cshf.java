package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cshf implements csgy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiV2Impl");
    public final fcsu b;
    public final fcyh c;
    private final eygg d;
    private final fcyh e;
    private final fcsu f;

    public cshf(fcsu fcsuVar, eygg eyggVar, fcyh fcyhVar, fcyh fcyhVar2, fcsu fcsuVar2) {
        fcsuVar.getClass();
        eyggVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.d = eyggVar;
        this.c = fcyhVar;
        this.e = fcyhVar2;
        this.f = fcsuVar2;
    }

    @Override // defpackage.csgy
    public final Object a(String str, fcxy fcxyVar) {
        if (!TextUtils.isEmpty(str)) {
            return c(cshx.b, dhut.b(str), fcxyVar);
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiV2Impl", "classifyDestination", 80, "BugleMoiraiApiV2Impl.kt")).q("BugleMoiraiApiV2Impl#classify: empty phone number");
        return new dhvp((String) null, (dhun) null, 7);
    }

    @Override // defpackage.csgy
    public final Object b(cspj cspjVar, String str, scg scgVar, sck sckVar, fcxy fcxyVar) {
        return e(cspjVar, str, scgVar, sckVar, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cshx r7, defpackage.dhuu r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cshb
            if (r0 == 0) goto L13
            r0 = r9
            cshb r0 = (defpackage.cshb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cshb r0 = new cshb
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            dhuu r8 = r0.d
            defpackage.fctl.b(r9)
            goto L51
        L39:
            defpackage.fctl.b(r9)
            r0.d = r8
            r0.c = r4
            fcyh r9 = r6.e
            fcyh r9 = defpackage.eicg.a(r9)
            cshe r2 = new cshe
            r2.<init>(r5, r6, r7)
            java.lang.Object r9 = defpackage.fdin.a(r9, r2, r0)
            if (r9 == r1) goto L8f
        L51:
            cshw r9 = (defpackage.cshw) r9
            if (r9 != 0) goto L7c
            ekrg r7 = defpackage.cshf.a
            ekrw r7 = r7.g()
            ekrz r8 = defpackage.eksq.a
            java.lang.String r9 = "BugleSpam"
            r7.X(r8, r9)
            r8 = 169(0xa9, float:2.37E-43)
            java.lang.String r9 = "BugleMoiraiApiV2Impl.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiV2Impl"
            java.lang.String r1 = "callHadesClassify"
            ekrw r7 = r7.h(r0, r1, r8, r9)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "moiraiApi is null"
            r7.q(r8)
            dhvp r7 = new dhvp
            r8 = 7
            r7.<init>(r5, r5, r8)
            return r7
        L7c:
            fcyh r7 = r6.c
            cshc r2 = new cshc
            r2.<init>(r9, r8, r5)
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = defpackage.eicj.a(r7, r2, r0)
            if (r7 != r1) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cshf.c(cshx, dhuu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cshd
            if (r0 == 0) goto L13
            r0 = r8
            cshd r0 = (defpackage.cshd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cshd r0 = new cshd
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r8)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            goto L73
        L28:
            r7 = move-exception
            goto L77
        L2a:
            r7 = move-exception
            goto L7b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r8)
            eygg r8 = r6.d     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            java.lang.Object r8 = r8.b()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            crav r8 = (defpackage.crav) r8     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            ezdx r2 = defpackage.ezdx.a     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            evsf r2 = r2.createBuilder()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            ezdw r2 = (defpackage.ezdw) r2     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r2.getClass()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            defpackage.eyvx.c(r2)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            ezdv r5 = defpackage.ezdv.a     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            evsf r5 = r5.createBuilder()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            ezdu r5 = (defpackage.ezdu) r5     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            defpackage.eyvw.b(r7, r5)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            ezdv r7 = defpackage.eyvw.a(r5)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r2.b(r7)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            ezdx r7 = defpackage.eyvx.a(r2)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            eiju r7 = r8.a(r7)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r0.c = r4     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            if (r8 != r1) goto L73
            return r1
        L73:
            java.util.Locale r8 = (java.util.Locale) r8     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r3 = r8
            goto L7e
        L77:
            defpackage.csgz.a(r7)
            goto L7e
        L7b:
            defpackage.csgz.a(r7)
        L7e:
            java.lang.String r7 = "getLanguage"
            java.lang.String r8 = "com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiV2Impl"
            java.lang.String r0 = "BugleSpam"
            java.lang.String r1 = "BugleMoiraiApiV2Impl.kt"
            if (r3 == 0) goto La8
            ekrg r2 = defpackage.cshf.a
            ekrw r2 = r2.g()
            ekrz r4 = defpackage.eksq.a
            r2.X(r4, r0)
            r0 = 241(0xf1, float:3.38E-43)
            ekrw r7 = r2.h(r8, r7, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "Detected language."
            r7.q(r8)
            java.lang.String r7 = r3.getLanguage()
            r7.getClass()
            return r7
        La8:
            ekrg r2 = defpackage.cshf.a
            ekrw r2 = r2.j()
            ekrz r3 = defpackage.eksq.a
            r2.X(r3, r0)
            r0 = 244(0xf4, float:3.42E-43)
            ekrw r7 = r2.h(r8, r7, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "Unable to detect language."
            r7.q(r8)
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cshf.d(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cspj r9, java.lang.String r10, defpackage.scg r11, defpackage.sck r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cshf.e(cspj, java.lang.String, scg, sck, fcxy):java.lang.Object");
    }
}
