package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawo {
    public static final void b(String str) {
        ekrw ekrwVarH = dawu.b.h();
        ekrwVarH.X(eksq.a, "BugleWelcome");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/welcome/v1/consent/VerificationWorker$Companion", "logInfo", 174, "VerificationWorker.kt")).D("%s %s", "VerificationWorker:", str);
    }

    public static final void c(String str, Throwable th) {
        ekrw ekrwVarI = dawu.b.i();
        ekrwVarI.X(eksq.a, "BugleWelcome");
        ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/welcome/v1/consent/VerificationWorker$Companion", "logSevere", 179, "VerificationWorker.kt")).D("%s %s", "VerificationWorker:", str);
    }

    public static final void d(String str) {
        ekrw ekrwVarJ = dawu.b.j();
        ekrwVarJ.X(eksq.a, "BugleWelcome");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/welcome/v1/consent/VerificationWorker$Companion", "logWarning", 176, "VerificationWorker.kt")).D("%s %s", "VerificationWorker:", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.egsh r8, long r9, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.dawn
            if (r0 == 0) goto L13
            r0 = r11
            dawn r0 = (defpackage.dawn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dawn r0 = new dawn
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r11)
            goto L7a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r11)
            java.lang.Class<dawu> r11 = defpackage.dawu.class
            egsj r11 = defpackage.egsn.n(r11)
            pzh r2 = new pzh
            r2.<init>()
            r4 = 2
            r2.c(r4)
            pzj r2 = r2.a()
            r11.d(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            egsa r4 = new egsa
            r4.<init>(r9, r2)
            r2 = r11
            egrx r2 = (defpackage.egrx) r2
            r2.c = r4
            pzy r4 = defpackage.pzy.d
            egsb r5 = new egsb
            java.lang.String r6 = "CONSENT_VERIFICATION_WORKER"
            r5.<init>(r6, r4)
            r11.g(r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            egsa r5 = new egsa
            r5.<init>(r9, r4)
            r2.c = r5
            egsn r9 = r11.h()
            com.google.common.util.concurrent.ListenableFuture r8 = r8.c(r9)
            r0.c = r3
            java.lang.Object r11 = defpackage.fdxs.c(r8, r0)
            if (r11 != r1) goto L7a
            return r1
        L7a:
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawo.a(egsh, long, fcxy):java.lang.Object");
    }
}
