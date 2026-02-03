package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agap implements agak {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/statemachine/RequestedOperation");
    private final afza b;

    public agap(afza afzaVar) {
        afzaVar.getClass();
        this.b = afzaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v4, types: [fctx, java.lang.Object] */
    @Override // defpackage.agak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r11, defpackage.afzy r12, defpackage.afyz r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.agao
            if (r0 == 0) goto L13
            r0 = r14
            agao r0 = (defpackage.agao) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            agao r0 = new agao
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "Marking navigation request as completed"
            r4 = 62
            r5 = 1
            java.lang.String r6 = "execute"
            java.lang.String r7 = "com/google/android/apps/messaging/navigation/statemachine/RequestedOperation"
            java.lang.String r8 = "RequestedState.kt"
            if (r2 == 0) goto L3d
            if (r2 != r5) goto L35
            int r11 = r0.a
            defpackage.fctl.b(r14)     // Catch: java.lang.Throwable -> L33
            goto L7c
        L33:
            r12 = move-exception
            goto L93
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            defpackage.fctl.b(r14)
            boolean r14 = r13 instanceof defpackage.afyw
            if (r14 == 0) goto La8
            ekrg r14 = defpackage.agap.a     // Catch: java.lang.Throwable -> L33
            ekrw r2 = r14.h()     // Catch: java.lang.Throwable -> L33
            r9 = 57
            ekrw r2 = r2.h(r7, r6, r9, r8)     // Catch: java.lang.Throwable -> L33
            ekrd r2 = (defpackage.ekrd) r2     // Catch: java.lang.Throwable -> L33
            java.lang.String r9 = "Marking navigation request as dispatched"
            r2.q(r9)     // Catch: java.lang.Throwable -> L33
            afza r2 = r10.b     // Catch: java.lang.Throwable -> L33
            r2.d(r11)     // Catch: java.lang.Throwable -> L33
            ekrw r14 = r14.h()     // Catch: java.lang.Throwable -> L33
            r2 = 59
            ekrw r14 = r14.h(r7, r6, r2, r8)     // Catch: java.lang.Throwable -> L33
            ekrd r14 = (defpackage.ekrd) r14     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "Invoking navigation handler for target %s"
            r14.t(r2, r12)     // Catch: java.lang.Throwable -> L33
            afyw r13 = (defpackage.afyw) r13     // Catch: java.lang.Throwable -> L33
            afzv r12 = (defpackage.afzv) r12     // Catch: java.lang.Throwable -> L33
            r0.a = r11     // Catch: java.lang.Throwable -> L33
            r0.d = r5     // Catch: java.lang.Throwable -> L33
            java.lang.Object r12 = r13.a(r12, r0)     // Catch: java.lang.Throwable -> L33
            if (r12 != r1) goto L7c
            return r1
        L7c:
            ekrg r12 = defpackage.agap.a
            ekrw r12 = r12.h()
            ekrw r12 = r12.h(r7, r6, r4, r8)
            ekrd r12 = (defpackage.ekrd) r12
            r12.q(r3)
            afza r12 = r10.b
            r12.b(r11)
            fctx r11 = defpackage.fctx.a
            return r11
        L93:
            ekrg r13 = defpackage.agap.a
            ekrw r13 = r13.h()
            ekrw r13 = r13.h(r7, r6, r4, r8)
            ekrd r13 = (defpackage.ekrd) r13
            r13.q(r3)
            afza r13 = r10.b
            r13.b(r11)
            throw r12
        La8:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "RequestedOperation can only be executed for targets without a result."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agap.a(int, afzy, afyz, fcxy):java.lang.Object");
    }
}
