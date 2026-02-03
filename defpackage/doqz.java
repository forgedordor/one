package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqz {
    private static final ekrg b = ekrg.c("com/google/android/libraries/compose/photos/ui/transport/GooglePhotosSendTypeValidator");
    public final dopm a;
    private final fdjx c;
    private final doqr d;

    public doqz(dopm dopmVar, fdjx fdjxVar, doqr doqrVar) {
        dopmVar.getClass();
        fdjxVar.getClass();
        this.a = dopmVar;
        this.c = fdjxVar;
        this.d = doqrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dlsu r7, defpackage.fdkf r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.doqv
            if (r0 == 0) goto L13
            r0 = r9
            doqv r0 = (defpackage.doqv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            doqv r0 = new doqv
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r9)
            goto L5d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            dlsu r7 = r0.d
            defpackage.fctl.b(r9)
            goto L46
        L39:
            defpackage.fctl.b(r9)
            r0.d = r7
            r0.c = r5
            java.lang.Object r9 = r8.c(r0)
            if (r9 == r1) goto L8e
        L46:
            dooy r9 = (defpackage.dooy) r9
            r8 = 0
            if (r9 == 0) goto L60
            dooy[] r2 = new defpackage.dooy[r5]
            r2[r3] = r9
            java.util.Set r2 = defpackage.fcwm.c(r2)
            r0.d = r8
            r0.c = r4
            java.lang.Object r9 = r6.c(r7, r9, r2, r0)
            if (r9 == r1) goto L8e
        L5d:
            r8 = r9
            dooy r8 = (defpackage.dooy) r8
        L60:
            if (r8 != 0) goto L64
        L62:
            r3 = r5
            goto L89
        L64:
            int[] r7 = defpackage.doqu.a
            int r9 = r8.ordinal()
            r7 = r7[r9]
            r9 = -1
            if (r7 != r9) goto L70
            goto L62
        L70:
            ekrg r7 = defpackage.doqz.b
            ekrw r7 = r7.i()
            r9 = 67
            java.lang.String r0 = "GooglePhotosSendTypeValidator.kt"
            java.lang.String r1 = "com/google/android/libraries/compose/photos/ui/transport/GooglePhotosSendTypeValidator"
            java.lang.String r2 = "canUsePhotosLinkSendType"
            ekrw r7 = r7.h(r1, r2, r9, r0)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r9 = "Google Photos requirement %s is still missing, preventing to use its transport."
            r7.t(r9, r8)
        L89:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doqz.a(dlsu, fdkf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dlsu r9, defpackage.fdae r10, defpackage.fdap r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.doqw
            if (r0 == 0) goto L13
            r0 = r12
            doqw r0 = (defpackage.doqw) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            doqw r0 = new doqw
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.a
            fdae r9 = (defpackage.fdae) r9
            defpackage.fctl.b(r12)
            goto L7e
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.c
            java.lang.Object r10 = r0.b
            java.lang.Object r11 = r0.a
            dlsu r11 = (defpackage.dlsu) r11
            defpackage.fctl.b(r12)
            r7 = r12
            r12 = r9
            r9 = r11
            r11 = r7
            goto L64
        L47:
            defpackage.fctl.b(r12)
            fdjx r12 = r8.c
            doqx r2 = new doqx
            r2.<init>(r8, r9, r5)
            r6 = 3
            fdkf r12 = defpackage.fdil.c(r12, r5, r2, r6)
            r0.a = r9
            r0.b = r10
            r0.c = r12
            r0.f = r4
            java.lang.Object r11 = r11.invoke(r0)
            if (r11 == r1) goto L90
        L64:
            dosh r11 = (defpackage.dosh) r11
            if (r11 == 0) goto L8f
            int r2 = r11.ordinal()
            if (r2 == 0) goto L6f
            return r11
        L6f:
            r0.a = r10
            r0.b = r5
            r0.c = r5
            r0.f = r3
            java.lang.Object r12 = r8.a(r9, r12, r0)
            if (r12 == r1) goto L90
            r9 = r10
        L7e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 == 0) goto L89
            dosh r9 = defpackage.dosh.a
            return r9
        L89:
            r9.invoke()
            dosh r9 = defpackage.dosh.b
            return r9
        L8f:
            return r5
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doqz.b(dlsu, fdae, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r12 != r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [doqz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dlsu r9, defpackage.dooy r10, java.util.Set r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.doqy
            if (r0 == 0) goto L13
            r0 = r12
            doqy r0 = (defpackage.doqy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            doqy r0 = new doqy
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r12)
            goto L7e
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            java.lang.Object r11 = r0.a
            dlsu r9 = r0.e
            defpackage.fctl.b(r12)
            goto L64
        L3a:
            defpackage.fctl.b(r12)
            ekrg r12 = defpackage.doqz.b
            ekrw r12 = r12.j()
            r2 = 84
            java.lang.String r5 = "GooglePhotosSendTypeValidator.kt"
            java.lang.String r6 = "com/google/android/libraries/compose/photos/ui/transport/GooglePhotosSendTypeValidator"
            java.lang.String r7 = "tryToRecoverFrom"
            ekrw r12 = r12.h(r6, r7, r2, r5)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r2 = "Trying to recover from missing Google Photos requirement %s (encountered: %s)"
            r12.D(r2, r10, r11)
            doqr r12 = r8.d
            r0.e = r9
            r0.a = r11
            r0.d = r4
            java.lang.Object r12 = r12.c(r9, r10, r0)
            if (r12 == r1) goto L82
        L64:
            dooy r12 = (defpackage.dooy) r12
            r10 = 0
            if (r12 == 0) goto L81
            boolean r2 = r11.contains(r12)
            if (r2 != 0) goto L80
            r11.add(r12)
            r0.e = r10
            r0.a = r10
            r0.d = r3
            java.lang.Object r12 = r8.c(r9, r12, r11, r0)
            if (r12 == r1) goto L82
        L7e:
            dooy r12 = (defpackage.dooy) r12
        L80:
            return r12
        L81:
            return r10
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doqz.c(dlsu, dooy, java.util.Set, fcxy):java.lang.Object");
    }
}
