package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzbx implements bypt {
    public final fcsu a;
    public final aipo b;
    public final fcyh c;
    public final String d;
    public final bzbe e;
    public final bzce f;
    public final int g;
    public final bzgt h;
    public final bzhe i;
    private final ains j;
    private final fdjx k;
    private final fcsu l;
    private final fcsu m;
    private final bzba n;
    private final bzbb o;

    public bzbx(bzgu bzguVar, bzhf bzhfVar, fcsu fcsuVar, ains ainsVar, aipo aipoVar, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar2, fcsu fcsuVar3, String str, bzba bzbaVar, bzbb bzbbVar, bzbe bzbeVar, bzce bzceVar, int i) {
        this.a = fcsuVar;
        this.j = ainsVar;
        this.b = aipoVar;
        this.k = fdjxVar;
        this.c = fcyhVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.d = str;
        this.n = bzbaVar;
        this.o = bzbbVar;
        this.e = bzbeVar;
        this.f = bzceVar;
        this.g = i;
        dqsn dqsnVar = (dqsn) bzguVar.a.b();
        dqsnVar.getClass();
        fcyh fcyhVar2 = (fcyh) bzguVar.b.b();
        fcyhVar2.getClass();
        apon aponVar = (apon) bzguVar.c.b();
        aponVar.getClass();
        this.h = new bzgt(dqsnVar, fcyhVar2, aponVar, str, bzbaVar, bzbbVar, bzbeVar, bzceVar, fcsuVar2, fcsuVar3);
        ains ainsVar2 = (ains) bzhfVar.a.b();
        ainsVar2.getClass();
        cden cdenVar = (cden) bzhfVar.b.b();
        cdenVar.getClass();
        apqc apqcVar = (apqc) bzhfVar.c.b();
        apqcVar.getClass();
        fdjx fdjxVar2 = (fdjx) bzhfVar.d.b();
        fdjxVar2.getClass();
        ((fdjx) bzhfVar.e.b()).getClass();
        aukz aukzVar = (aukz) bzhfVar.f.b();
        aukzVar.getClass();
        this.i = new bzhe(ainsVar2, cdenVar, apqcVar, fdjxVar2, aukzVar, str, bzbaVar);
    }

    @Override // defpackage.bypt
    public final eiju a(ekgb ekgbVar, Optional optional) {
        ekgbVar.getClass();
        return auvw.c(this.k, fcyi.a, fdjz.a, new bzbg(this, ekgbVar, optional, null));
    }

    @Override // defpackage.bypt
    public final eiju b(String str, String str2, int i, boolean z) {
        str2.getClass();
        return auvw.c(this.k, fcyi.a, fdjz.a, new bzbt(this, z, str2, str, i, null));
    }

    @Override // defpackage.bypt
    public final eiju c(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        return auvw.c(this.k, fcyi.a, fdjz.a, new bzbm(this, str2, str, i, null));
    }

    public final bzbz d() {
        return new bzbz("(batch)", 3, new bzch("unknown", 0, 0, this.g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef A[LOOP:0: B:33:0x00e9->B:35:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137 A[LOOP:1: B:37:0x0131->B:39:0x0137, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v3, types: [byqu] */
    /* JADX WARN: Type inference failed for: r25v0, types: [bzbx] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ekgb r26, j$.util.Optional r27, defpackage.fcxy r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbx.e(ekgb, j$.util.Optional, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r7, defpackage.bzbz r8, defpackage.fcxy r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bzbn
            if (r0 == 0) goto L13
            r0 = r9
            bzbn r0 = (defpackage.bzbn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzbn r0 = new bzbn
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L4b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r9)
            java.lang.String r9 = r6.d
            bzhh r2 = defpackage.bzhh.b
            java.lang.String r9 = r2.b(r9)
            aipo r2 = r6.b
            bzbo r4 = new bzbo
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            r0.c = r3
            java.lang.Object r9 = defpackage.aipq.a(r2, r9, r4, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            fctk r9 = (defpackage.fctk) r9
            java.lang.Object r7 = r9.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbx.f(java.lang.String, bzbz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r9, java.lang.String r10, java.lang.String r11, int r12, defpackage.fcxy r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.bzbp
            if (r0 == 0) goto L13
            r0 = r13
            bzbp r0 = (defpackage.bzbp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzbp r0 = new bzbp
            r0.<init>(r8, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L29
            if (r2 == r4) goto L29
            if (r2 != r3) goto L31
        L29:
            defpackage.fctl.b(r13)
            fctk r13 = (defpackage.fctk) r13
            java.lang.Object r9 = r13.a
            return r9
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.fctl.b(r13)
            if (r5 == r9) goto L40
            r9 = r5
            goto L41
        L40:
            r9 = r4
        L41:
            int r13 = r8.g
            bzbz r2 = new bzbz
            bzch r6 = new bzch
            r7 = 0
            r6.<init>(r11, r12, r7, r13)
            r2.<init>(r10, r9, r6)
            r9 = 9
            int r11 = defpackage.bzas.a(r9)
            r11 = r11 & r12
            int r9 = defpackage.bzas.a(r9)
            if (r11 != r9) goto L65
            r0.c = r5
            java.lang.Object r9 = r8.f(r10, r2, r0)
            if (r9 != r1) goto L64
            goto L7d
        L64:
            return r9
        L65:
            boolean r9 = defpackage.bypr.a(r12)
            if (r9 == 0) goto L75
            r0.c = r4
            java.lang.Object r9 = r8.j(r10, r2, r0)
            if (r9 != r1) goto L74
            goto L7d
        L74:
            return r9
        L75:
            r0.c = r3
            java.lang.Object r9 = r8.h(r10, r2, r0)
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbx.g(boolean, java.lang.String, java.lang.String, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, defpackage.bzbz r8, defpackage.fcxy r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bzbq
            if (r0 == 0) goto L13
            r0 = r9
            bzbq r0 = (defpackage.bzbq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzbq r0 = new bzbq
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L4b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r9)
            java.lang.String r9 = r6.d
            bzhh r2 = defpackage.bzhh.c
            java.lang.String r9 = r2.b(r9)
            aipo r2 = r6.b
            bzbr r4 = new bzbr
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            r0.c = r3
            java.lang.Object r9 = defpackage.aipq.a(r2, r9, r4, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            fctk r9 = (defpackage.fctk) r9
            java.lang.Object r7 = r9.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbx.h(java.lang.String, bzbz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:14:0x002f, B:36:0x008c, B:38:0x0096, B:40:0x009e, B:41:0x00a5, B:19:0x003f, B:52:0x00c9, B:22:0x004d, B:31:0x006d, B:33:0x0070, B:48:0x00b1, B:27:0x005b), top: B:57:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:14:0x002f, B:36:0x008c, B:38:0x0096, B:40:0x009e, B:41:0x00a5, B:19:0x003f, B:52:0x00c9, B:22:0x004d, B:31:0x006d, B:33:0x0070, B:48:0x00b1, B:27:0x005b), top: B:57:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r10, defpackage.bzbz r11, defpackage.fcxy r12) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbx.i(java.lang.String, bzbz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r7, defpackage.bzbz r8, defpackage.fcxy r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bzbu
            if (r0 == 0) goto L13
            r0 = r9
            bzbu r0 = (defpackage.bzbu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzbu r0 = new bzbu
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L4b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r9)
            java.lang.String r9 = r6.d
            bzhh r2 = defpackage.bzhh.a
            java.lang.String r9 = r2.b(r9)
            aipo r2 = r6.b
            bzbw r4 = new bzbw
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.c = r3
            java.lang.Object r9 = defpackage.aipq.a(r2, r9, r4, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            fctk r9 = (defpackage.fctk) r9
            java.lang.Object r7 = r9.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbx.j(java.lang.String, bzbz, fcxy):java.lang.Object");
    }

    public final Object k(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c), new bzbk(null, this, new cpyt()), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.bzff r7, java.lang.String r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bzbj
            if (r0 == 0) goto L13
            r0 = r9
            bzbj r0 = (defpackage.bzbj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzbj r0 = new bzbj
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r8 = r0.e
            bzff r7 = r0.d
            defpackage.fctl.b(r9)
            goto L48
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r9)
            bzba r9 = r6.n
            bzcc r2 = r7.a
            java.lang.String r2 = r2.a
            r0.d = r7
            r0.e = r8
            r0.c = r3
            java.lang.Object r9 = r9.c(r8, r2)
            if (r9 == r1) goto L7f
        L48:
            ains r0 = r6.j
            java.lang.String r1 = r6.d
            bzau r9 = (defpackage.bzau) r9
            bzhh r2 = defpackage.bzhh.c
            int r4 = r2.ordinal()
            r5 = 2
            if (r4 != r5) goto L7d
            java.lang.String r2 = r2.a(r1)
            int r4 = r9.c
            java.lang.String r5 = ".AlreadyExists"
            java.lang.String r2 = r2.concat(r5)
            r0.e(r2, r4)
            cpyi r0 = defpackage.cpyi.UNKNOWN
            int r9 = r9.ordinal()
            if (r9 == 0) goto L7c
            if (r9 == r3) goto L76
            fctg r7 = new fctg
            r7.<init>()
            throw r7
        L76:
            bzdg r7 = new bzdg
            r7.<init>(r1, r8)
            throw r7
        L7c:
            return r7
        L7d:
            r7 = 0
            throw r7
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbx.l(bzff, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.Object r5, java.lang.String r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bzbl
            if (r0 == 0) goto L13
            r0 = r7
            bzbl r0 = (defpackage.bzbl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzbl r0 = new bzbl
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L4a
        L27:
            r5 = move-exception
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            boolean r7 = defpackage.fctk.d(r5)
            if (r7 == 0) goto L53
            bzff r5 = (defpackage.bzff) r5     // Catch: java.lang.Throwable -> L27
            bzcc r7 = r5.a     // Catch: java.lang.Throwable -> L27
            boolean r7 = r7.b     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto L4e
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r4.l(r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 == r1) goto L4d
        L4a:
            bzff r7 = (defpackage.bzff) r7     // Catch: java.lang.Throwable -> L27
            return r7
        L4d:
            return r1
        L4e:
            return r5
        L4f:
            java.lang.Object r5 = defpackage.fctl.a(r5)
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbx.m(java.lang.Object, java.lang.String, fcxy):java.lang.Object");
    }
}
