package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzda implements bzce {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/backup/conversations/CmsConversationsUpdater");
    public final cpmc a;
    public final fcyh b;
    private final aqfr d;

    public bzda(cpmc cpmcVar, aqfr aqfrVar, fcyh fcyhVar) {
        cpmcVar.getClass();
        aqfrVar.getClass();
        fcyhVar.getClass();
        this.a = cpmcVar;
        this.d = aqfrVar;
        this.b = fcyhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
    
        if (r12 != r1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [bzbz] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [bzda] */
    @Override // defpackage.bzce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r10, defpackage.bzbz r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzda.a(java.util.Map, bzbz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bzce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.bzbz r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bzct
            if (r0 == 0) goto L13
            r0 = r7
            bzct r0 = (defpackage.bzct) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzct r0 = new bzct
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L58
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            cpmc r7 = r4.a     // Catch: java.lang.Throwable -> L58
            int r6 = r6.c     // Catch: java.lang.Throwable -> L58
            boolean r6 = defpackage.cpxz.b(r6)     // Catch: java.lang.Throwable -> L58
            eiju r6 = r7.ad(r5, r6)     // Catch: java.lang.Throwable -> L58
            r0.d = r5     // Catch: java.lang.Throwable -> L58
            r0.c = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)     // Catch: java.lang.Throwable -> L58
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L58
            bzcb r6 = new bzcb     // Catch: java.lang.Throwable -> L58
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L58
            r7 = r7 ^ r3
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L58
            return r6
        L58:
            r5 = move-exception
            java.lang.Object r5 = defpackage.fctl.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzda.b(java.lang.String, bzbz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bzcu
            if (r0 == 0) goto L13
            r0 = r10
            bzcu r0 = (defpackage.bzcu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzcu r0 = new bzcu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.fctl.b(r10)
            goto L7f
        L37:
            defpackage.fctl.b(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r2 = 10
            int r2 = defpackage.fcva.p(r9, r2)
            int r2 = defpackage.fcwa.a(r2)
            r6 = 16
            int r2 = defpackage.fddu.f(r2, r6)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L53:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r9.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            fctk r7 = new fctk
            r7.<init>(r6)
            r10.put(r2, r7)
            goto L53
        L6d:
            bzcp r9 = new bzcp
            r9.<init>()
            bzcv r2 = new bzcv
            r2.<init>(r8, r3)
            r0.c = r5
            java.lang.Object r10 = defpackage.bzfl.a(r10, r9, r2, r0)
            if (r10 == r1) goto L90
        L7f:
            java.util.Map r10 = (java.util.Map) r10
            bzcw r9 = new bzcw
            r9.<init>(r8, r3)
            r0.c = r4
            java.lang.Object r9 = defpackage.bzfl.c(r10, r9, r0)
            if (r9 != r1) goto L8f
            goto L90
        L8f:
            return r9
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzda.d(java.util.Collection, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.bzce
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eqjv r6, defpackage.bzbz r7, java.util.EnumSet r8, defpackage.fcxy r9) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzda.c(eqjv, bzbz, java.util.EnumSet, fcxy):java.lang.Object");
    }
}
