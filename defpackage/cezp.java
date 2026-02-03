package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cezp implements cezt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/executor/PhoneRegistrationRpcExecutor");
    private final cejj b;

    public cezp(cejj cejjVar) {
        cejjVar.getClass();
        this.b = cejjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (r11 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cezt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cfrh r9, boolean r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cezo
            if (r0 == 0) goto L13
            r0 = r11
            cezo r0 = (defpackage.cezo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cezo r0 = new cezo
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r11)
            goto Lc8
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.fctl.b(r11)
            goto Lb5
        L3b:
            boolean r10 = r0.a
            defpackage.fctl.b(r11)
            goto L7f
        L41:
            defpackage.fctl.b(r11)
            cejj r11 = r8.b
            r2 = r9
            cfre r2 = (defpackage.cfre) r2
            cfrg r6 = r2.a
            int r7 = r6.ordinal()
            if (r7 == r5) goto L6c
            r10 = 4
            if (r7 == r10) goto L68
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r10 = java.lang.String.valueOf(r6)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Unsupported registration type "
            java.lang.String r10 = r11.concat(r10)
            r9.<init>(r10)
            throw r9
        L68:
            cfrb r9 = (defpackage.cfrb) r9
            r9 = 0
            throw r9
        L6c:
            java.lang.String r9 = r2.b
            eiju r9 = r11.b(r9)
            r9.getClass()
            r0.a = r10
            r0.d = r4
            java.lang.Object r11 = defpackage.fdxs.c(r9, r0)
            if (r11 == r1) goto Lcc
        L7f:
            cejg r11 = (defpackage.cejg) r11
            if (r10 == 0) goto Lb9
            ekrg r9 = defpackage.cezp.a
            ekrw r9 = r9.j()
            ekrz r10 = defpackage.eksq.a
            java.lang.String r2 = "BugleNetwork"
            r9.X(r10, r2)
            r10 = 28
            java.lang.String r2 = "PhoneRegistrationRpcExecutor.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/net/executor/PhoneRegistrationRpcExecutor"
            java.lang.String r4 = "getAuthToken"
            ekrw r9 = r9.h(r3, r4, r10, r2)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Get authtoken for phone registration with forced refresh to execute RPC."
            r9.q(r10)
            cedo r9 = defpackage.cedo.FORCE_REFRESH
            eiju r9 = r11.m(r9)
            r9.getClass()
            r0.d = r5
            java.lang.Object r11 = defpackage.fdxs.c(r9, r0)
            if (r11 != r1) goto Lb5
            goto Lcc
        Lb5:
            r11.getClass()
            return r11
        Lb9:
            eiju r9 = r11.l()
            r9.getClass()
            r0.d = r3
            java.lang.Object r11 = defpackage.fdxs.c(r9, r0)
            if (r11 == r1) goto Lcc
        Lc8:
            r11.getClass()
            return r11
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cezp.a(cfrh, boolean, fcxy):java.lang.Object");
    }
}
