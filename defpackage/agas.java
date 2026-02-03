package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agas implements agak {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/statemachine/RequestedWithResultOperation");
    private final afza b;

    public agas(afza afzaVar) {
        afzaVar.getClass();
        this.b = afzaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.agak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, defpackage.afzy r9, defpackage.afyz r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.agar
            if (r0 == 0) goto L13
            r0 = r11
            agar r0 = (defpackage.agar) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            agar r0 = new agar
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            java.lang.String r3 = "execute"
            java.lang.String r4 = "com/google/android/apps/messaging/navigation/statemachine/RequestedWithResultOperation"
            r5 = 1
            java.lang.String r6 = "RequestedWithResultState.kt"
            if (r2 == 0) goto L3d
            if (r2 != r5) goto L35
            int r8 = r0.a
            java.lang.Object r10 = r0.b
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            goto L5b
        L31:
            r9 = move-exception
            goto L82
        L33:
            r9 = move-exception
            goto L61
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            defpackage.fctl.b(r11)
            boolean r11 = r10 instanceof defpackage.afyy
            if (r11 == 0) goto La7
            afza r11 = r7.b     // Catch: java.lang.Exception -> L31
            r11.d(r8)     // Catch: java.lang.Exception -> L31
            r11 = r10
            afyy r11 = (defpackage.afyy) r11     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            afzx r9 = (defpackage.afzx) r9     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            r0.b = r10     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            r0.a = r8     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            r0.e = r5     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            java.lang.Object r11 = r11.b(r9, r0)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            if (r11 != r1) goto L5b
            return r1
        L5b:
            afza r9 = r7.b     // Catch: java.lang.Exception -> L31
            r9.c(r8, r11)     // Catch: java.lang.Exception -> L31
            goto La4
        L61:
            boolean r10 = r10 instanceof defpackage.afyx     // Catch: java.lang.Exception -> L31
            if (r10 == 0) goto L81
            ekrg r10 = defpackage.agas.a     // Catch: java.lang.Exception -> L31
            ekrw r10 = r10.e()     // Catch: java.lang.Exception -> L31
            ekrd r10 = (defpackage.ekrd) r10     // Catch: java.lang.Exception -> L31
            ekrw r9 = r10.g(r9)     // Catch: java.lang.Exception -> L31
            r10 = 69
            ekrw r9 = r9.h(r4, r3, r10, r6)     // Catch: java.lang.Exception -> L31
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Exception -> L31
            java.lang.String r10 = "Ignoring cancellation exception from NavigationHandler#navigate to allow resuming navigation."
            r9.q(r10)     // Catch: java.lang.Exception -> L31
            fctx r8 = defpackage.fctx.a     // Catch: java.lang.Exception -> L31
            return r8
        L81:
            throw r9     // Catch: java.lang.Exception -> L31
        L82:
            ekrg r10 = defpackage.agas.a
            ekrw r10 = r10.e()
            ekrd r10 = (defpackage.ekrd) r10
            ekrw r10 = r10.g(r9)
            r11 = 82
            ekrw r10 = r10.h(r4, r3, r11, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "Navigation handler or navigation completion threw, completing navigation with failure."
            r10.q(r11)
            afza r10 = r7.b
            java.lang.Object r9 = defpackage.fctl.a(r9)
            r10.c(r8, r9)
        La4:
            fctx r8 = defpackage.fctx.a
            return r8
        La7:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "RequestedWithResultOperation can only be executed for targets with a result."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agas.a(int, afzy, afyz, fcxy):java.lang.Object");
    }
}
