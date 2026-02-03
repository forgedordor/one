package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afzg implements fdpm {
    final /* synthetic */ afzi a;
    final /* synthetic */ fdjx b;

    public afzg(afzi afziVar, fdjx fdjxVar) {
        this.a = afziVar;
        this.b = fdjxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r9.c(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(defpackage.afzu r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.afzf
            if (r0 == 0) goto L13
            r0 = r9
            afzf r0 = (defpackage.afzf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afzf r0 = new afzf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L7a
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            goto L4b
        L38:
            defpackage.fctl.b(r9)
            afzi r9 = r7.a
            lva r2 = defpackage.lva.ON_RESUME
            r0.a = r8
            r0.d = r4
            lvc r9 = r9.c
            java.lang.Object r9 = defpackage.dphg.b(r9, r2, r0)
            if (r9 == r1) goto L7d
        L4b:
            ekrg r9 = defpackage.afzi.a
            ekrw r9 = r9.f()
            r2 = 44
            java.lang.String r4 = "NavigationRouterControllerImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl$initialize$1$1"
            java.lang.String r6 = "emit"
            ekrw r9 = r9.h(r5, r6, r2, r4)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r2 = "Collected navigation state: %s"
            r9.t(r2, r8)
            fdjx r9 = r7.b
            boolean r9 = defpackage.fdjy.g(r9)
            if (r9 == 0) goto L7a
            afzi r9 = r7.a
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r9.c(r8, r0)
            if (r8 != r1) goto L7a
            goto L7d
        L7a:
            fctx r8 = defpackage.fctx.a
            return r8
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzg.fO(afzu, fcxy):java.lang.Object");
    }
}
