package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrl implements csrc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamGrpcProxyImpl");
    public final Context b;
    private final fcyh c;

    public csrl(Context context, fcyh fcyhVar) {
        context.getClass();
        fcyhVar.getClass();
        this.b = context;
        this.c = fcyhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.eyjy r8, defpackage.ezso r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.csrd
            if (r0 == 0) goto L13
            r0 = r10
            csrd r0 = (defpackage.csrd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csrd r0 = new csrd
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r10)
            fbnd r10 = r8.a
            fbrk r2 = defpackage.eyjz.a
            if (r2 != 0) goto L73
            java.lang.Class<eyjz> r4 = defpackage.eyjz.class
            monitor-enter(r4)
            fbrk r2 = defpackage.eyjz.a     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            fbrh r2 = defpackage.fbrk.a()     // Catch: java.lang.Throwable -> L70
            fbrj r5 = defpackage.fbrj.UNARY     // Catch: java.lang.Throwable -> L70
            r2.c = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "AddSpamSignalV2"
            java.lang.String r5 = defpackage.fbrk.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.d = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            ezso r5 = defpackage.ezso.a     // Catch: java.lang.Throwable -> L70
            evrr r6 = defpackage.fcrj.a     // Catch: java.lang.Throwable -> L70
            fcrh r6 = new fcrh     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.a = r6     // Catch: java.lang.Throwable -> L70
            ezsq r5 = defpackage.ezsq.a     // Catch: java.lang.Throwable -> L70
            fcrh r6 = new fcrh     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.b = r6     // Catch: java.lang.Throwable -> L70
            fbrk r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.eyjz.a = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            fbnc r8 = r8.b
            fbnh r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.fcrw.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.fdxs.c(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrl.a(eyjy, ezso, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Map r5, java.lang.String r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.csre
            if (r0 == 0) goto L13
            r0 = r7
            csre r0 = (defpackage.csre) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csre r0 = new csre
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            r0.c = r3
            fcyh r7 = r4.c
            fcyh r7 = defpackage.eicg.a(r7)
            csrf r2 = new csrf
            r3 = 0
            r2.<init>(r3, r4, r6, r5)
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 == r1) goto L59
        L46:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L51
            int r5 = r7.length()
            if (r5 == 0) goto L51
            return r7
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "DroidGuard result is null or empty"
            r5.<init>(r6)
            throw r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrl.b(java.util.Map, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eyjy r8, defpackage.eztc r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.csri
            if (r0 == 0) goto L13
            r0 = r10
            csri r0 = (defpackage.csri) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csri r0 = new csri
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r10)
            fbnd r10 = r8.a
            fbrk r2 = defpackage.eyjz.d
            if (r2 != 0) goto L73
            java.lang.Class<eyjz> r4 = defpackage.eyjz.class
            monitor-enter(r4)
            fbrk r2 = defpackage.eyjz.d     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            fbrh r2 = defpackage.fbrk.a()     // Catch: java.lang.Throwable -> L70
            fbrj r5 = defpackage.fbrj.UNARY     // Catch: java.lang.Throwable -> L70
            r2.c = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "GetFuzzyMatchingTemplates"
            java.lang.String r5 = defpackage.fbrk.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.d = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            eztc r5 = defpackage.eztc.a     // Catch: java.lang.Throwable -> L70
            evrr r6 = defpackage.fcrj.a     // Catch: java.lang.Throwable -> L70
            fcrh r6 = new fcrh     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.a = r6     // Catch: java.lang.Throwable -> L70
            ezte r5 = defpackage.ezte.a     // Catch: java.lang.Throwable -> L70
            fcrh r6 = new fcrh     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.b = r6     // Catch: java.lang.Throwable -> L70
            fbrk r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.eyjz.d = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            fbnc r8 = r8.b
            fbnh r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.fcrw.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.fdxs.c(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrl.c(eyjy, eztc, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.eyjy r8, defpackage.eztg r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.csrj
            if (r0 == 0) goto L13
            r0 = r10
            csrj r0 = (defpackage.csrj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csrj r0 = new csrj
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r10)
            fbnd r10 = r8.a
            fbrk r2 = defpackage.eyjz.b
            if (r2 != 0) goto L73
            java.lang.Class<eyjz> r4 = defpackage.eyjz.class
            monitor-enter(r4)
            fbrk r2 = defpackage.eyjz.b     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            fbrh r2 = defpackage.fbrk.a()     // Catch: java.lang.Throwable -> L70
            fbrj r5 = defpackage.fbrj.UNARY     // Catch: java.lang.Throwable -> L70
            r2.c = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "GetSpamState"
            java.lang.String r5 = defpackage.fbrk.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.d = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            eztg r5 = defpackage.eztg.a     // Catch: java.lang.Throwable -> L70
            evrr r6 = defpackage.fcrj.a     // Catch: java.lang.Throwable -> L70
            fcrh r6 = new fcrh     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.a = r6     // Catch: java.lang.Throwable -> L70
            ezti r5 = defpackage.ezti.a     // Catch: java.lang.Throwable -> L70
            fcrh r6 = new fcrh     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.b = r6     // Catch: java.lang.Throwable -> L70
            fbrk r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.eyjz.b = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            fbnc r8 = r8.b
            fbnh r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.fcrw.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.fdxs.c(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrl.d(eyjy, eztg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eyjy r8, defpackage.eztk r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.csrk
            if (r0 == 0) goto L13
            r0 = r10
            csrk r0 = (defpackage.csrk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csrk r0 = new csrk
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r10)
            fbnd r10 = r8.a
            fbrk r2 = defpackage.eyjz.c
            if (r2 != 0) goto L73
            java.lang.Class<eyjz> r4 = defpackage.eyjz.class
            monitor-enter(r4)
            fbrk r2 = defpackage.eyjz.c     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            fbrh r2 = defpackage.fbrk.a()     // Catch: java.lang.Throwable -> L70
            fbrj r5 = defpackage.fbrj.UNARY     // Catch: java.lang.Throwable -> L70
            r2.c = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "GetURLState"
            java.lang.String r5 = defpackage.fbrk.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.d = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            eztk r5 = defpackage.eztk.a     // Catch: java.lang.Throwable -> L70
            evrr r6 = defpackage.fcrj.a     // Catch: java.lang.Throwable -> L70
            fcrh r6 = new fcrh     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.a = r6     // Catch: java.lang.Throwable -> L70
            eztm r5 = defpackage.eztm.a     // Catch: java.lang.Throwable -> L70
            fcrh r6 = new fcrh     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.b = r6     // Catch: java.lang.Throwable -> L70
            fbrk r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.eyjz.c = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            fbnc r8 = r8.b
            fbnh r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.fcrw.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.fdxs.c(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrl.e(eyjy, eztk, fcxy):java.lang.Object");
    }
}
