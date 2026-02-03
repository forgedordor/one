package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clli implements clhc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl");
    public final dbfa b;
    public final dbeh c;
    public final dber d;
    private final fcyh e;

    public clli(fcyh fcyhVar, dbfa dbfaVar, dbeh dbehVar, dber dberVar) {
        fcyhVar.getClass();
        this.e = fcyhVar;
        this.b = dbfaVar;
        this.c = dbehVar;
        this.d = dberVar;
    }

    private static final dbeu k(int i, evqs evqsVar) {
        dbet dbetVar = (dbet) dbeu.a.createBuilder();
        dbetVar.getClass();
        dbetVar.copyOnWrite();
        dbeu dbeuVar = (dbeu) dbetVar.instance;
        dbeuVar.b |= 1;
        dbeuVar.c = i;
        dbetVar.copyOnWrite();
        dbeu dbeuVar2 = (dbeu) dbetVar.instance;
        dbeuVar2.b |= 2;
        dbeuVar2.d = evqsVar;
        dbetVar.copyOnWrite();
        dbeu dbeuVar3 = (dbeu) dbetVar.instance;
        dbeuVar3.e = 1;
        dbeuVar3.b |= 4;
        evsn evsnVarBuild = dbetVar.build();
        evsnVarBuild.getClass();
        return (dbeu) evsnVarBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.clhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.clld
            if (r0 == 0) goto L13
            r0 = r5
            clld r0 = (defpackage.clld) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clld r0 = new clld
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r5)
            fctk r5 = (defpackage.fctk) r5
            java.lang.Object r5 = r5.a
            goto L3e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.f(r0)
            if (r5 == r1) goto Lbe
        L3e:
            boolean r0 = defpackage.fctk.d(r5)
            if (r0 == 0) goto L90
            dbdd r5 = (defpackage.dbdd) r5
            int r0 = r5.b
            if (r0 <= 0) goto L82
            clna r0 = defpackage.clna.a
            evsf r0 = r0.createBuilder()
            clmz r0 = (defpackage.clmz) r0
            r0.getClass()
            cloq r1 = defpackage.cloq.a
            evsf r1 = r1.createBuilder()
            cloo r1 = (defpackage.cloo) r1
            r1.getClass()
            clop r2 = defpackage.clop.SUCCESS
            defpackage.clor.b(r2, r1)
            cloq r1 = defpackage.clor.a(r1)
            defpackage.clnb.b(r1, r0)
            int r5 = r5.b
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            clna r1 = (defpackage.clna) r1
            int r2 = r1.b
            r2 = r2 | 2
            r1.b = r2
            r1.d = r5
            clna r5 = defpackage.clnb.a(r0)
            goto L90
        L82:
            java.lang.String r5 = "Invalid maxDatagramSize ["
            java.lang.String r1 = "] in get capabilities response."
            java.lang.String r5 = defpackage.a.e(r0, r5, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L90:
            java.lang.Throwable r0 = defpackage.fctk.c(r5)
            if (r0 != 0) goto L97
            return r5
        L97:
            clna r5 = defpackage.clna.a
            evsf r5 = r5.createBuilder()
            clmz r5 = (defpackage.clmz) r5
            r5.getClass()
            cloq r0 = defpackage.cloq.a
            evsf r0 = r0.createBuilder()
            cloo r0 = (defpackage.cloo) r0
            r0.getClass()
            clop r1 = defpackage.clop.FAILURE
            defpackage.clor.b(r1, r0)
            cloq r0 = defpackage.clor.a(r0)
            defpackage.clnb.b(r0, r5)
            clna r5 = defpackage.clnb.a(r5)
            return r5
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.clhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.clle
            if (r0 == 0) goto L13
            r0 = r5
            clle r0 = (defpackage.clle) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clle r0 = new clle
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r5)
            fctk r5 = (defpackage.fctk) r5
            java.lang.Object r5 = r5.a
            goto L3e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 == r1) goto Lc9
        L3e:
            boolean r0 = defpackage.fctk.d(r5)
            if (r0 == 0) goto L9b
            dbdl r5 = (defpackage.dbdl) r5
            clnd r0 = defpackage.clnd.a
            evsf r0 = r0.createBuilder()
            clnc r0 = (defpackage.clnc) r0
            r0.getClass()
            cloq r1 = defpackage.cloq.a
            evsf r1 = r1.createBuilder()
            cloo r1 = (defpackage.cloo) r1
            r1.getClass()
            clop r2 = defpackage.clop.SUCCESS
            defpackage.clor.b(r2, r1)
            cloq r1 = defpackage.clor.a(r1)
            defpackage.clne.b(r1, r0)
            clod r1 = defpackage.clod.a
            evsf r1 = r1.createBuilder()
            clob r1 = (defpackage.clob) r1
            r1.getClass()
            int r5 = r5.b
            int r5 = defpackage.dbes.b(r5)
            if (r5 != 0) goto L7c
            goto L7d
        L7c:
            r3 = r5
        L7d:
            cloc r5 = defpackage.clhu.a(r3)
            defpackage.cloe.b(r5, r1)
            clod r5 = defpackage.cloe.a(r1)
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            clnd r1 = (defpackage.clnd) r1
            r1.d = r5
            int r5 = r1.b
            r5 = r5 | 2
            r1.b = r5
            clnd r5 = defpackage.clne.a(r0)
        L9b:
            java.lang.Throwable r0 = defpackage.fctk.c(r5)
            if (r0 != 0) goto La2
            return r5
        La2:
            clnd r5 = defpackage.clnd.a
            evsf r5 = r5.createBuilder()
            clnc r5 = (defpackage.clnc) r5
            r5.getClass()
            cloq r0 = defpackage.cloq.a
            evsf r0 = r0.createBuilder()
            cloo r0 = (defpackage.cloo) r0
            r0.getClass()
            clop r1 = defpackage.clop.FAILURE
            defpackage.clor.b(r1, r0)
            cloq r0 = defpackage.clor.a(r0)
            defpackage.clne.b(r0, r5)
            clnd r5 = defpackage.clne.a(r5)
            return r5
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03c4, code lost:
    
        if (r1 != r3) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.clhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.clhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.clog r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.d(clog, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.clhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cllh
            if (r0 == 0) goto L13
            r0 = r5
            cllh r0 = (defpackage.cllh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cllh r0 = new cllh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r5)
            fctk r5 = (defpackage.fctk) r5
            java.lang.Object r5 = r5.a
            goto L3e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.j(r0)
            if (r5 == r1) goto L9a
        L3e:
            boolean r0 = defpackage.fctk.d(r5)
            if (r0 == 0) goto L6c
            dbfe r5 = (defpackage.dbfe) r5
            clom r5 = defpackage.clom.a
            evsf r5 = r5.createBuilder()
            clol r5 = (defpackage.clol) r5
            r5.getClass()
            cloq r0 = defpackage.cloq.a
            evsf r0 = r0.createBuilder()
            cloo r0 = (defpackage.cloo) r0
            r0.getClass()
            clop r1 = defpackage.clop.SUCCESS
            defpackage.clor.b(r1, r0)
            cloq r0 = defpackage.clor.a(r0)
            defpackage.clon.b(r0, r5)
            clom r5 = defpackage.clon.a(r5)
        L6c:
            java.lang.Throwable r0 = defpackage.fctk.c(r5)
            if (r0 != 0) goto L73
            return r5
        L73:
            clom r5 = defpackage.clom.a
            evsf r5 = r5.createBuilder()
            clol r5 = (defpackage.clol) r5
            r5.getClass()
            cloq r0 = defpackage.cloq.a
            evsf r0 = r0.createBuilder()
            cloo r0 = (defpackage.cloo) r0
            r0.getClass()
            clop r1 = defpackage.clop.FAILURE
            defpackage.clor.b(r1, r0)
            cloq r0 = defpackage.clor.a(r0)
            defpackage.clon.b(r0, r5)
            clom r5 = defpackage.clon.a(r5)
            return r5
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.clks
            if (r0 == 0) goto L13
            r0 = r6
            clks r0 = (defpackage.clks) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clks r0 = new clks
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.e
            fcyh r6 = defpackage.eicg.a(r6)
            clkt r2 = new clkt
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            fctk r6 = (defpackage.fctk) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.clku
            if (r0 == 0) goto L13
            r0 = r6
            clku r0 = (defpackage.clku) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clku r0 = new clku
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.e
            fcyh r6 = defpackage.eicg.a(r6)
            clkv r2 = new clkv
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            fctk r6 = (defpackage.fctk) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.clkw
            if (r0 == 0) goto L13
            r0 = r6
            clkw r0 = (defpackage.clkw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clkw r0 = new clkw
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.e
            fcyh r6 = defpackage.eicg.a(r6)
            clky r2 = new clky
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            fctk r6 = (defpackage.fctk) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.h(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.dbeu r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.clkz
            if (r0 == 0) goto L13
            r0 = r7
            clkz r0 = (defpackage.clkz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clkz r0 = new clkz
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.e
            fcyh r7 = defpackage.eicg.a(r7)
            clla r2 = new clla
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            fctk r7 = (defpackage.fctk) r7
            java.lang.Object r6 = r7.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.i(dbeu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cllb
            if (r0 == 0) goto L13
            r0 = r6
            cllb r0 = (defpackage.cllb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cllb r0 = new cllb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.e
            fcyh r6 = defpackage.eicg.a(r6)
            cllc r2 = new cllc
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            fctk r6 = (defpackage.fctk) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clli.j(fcxy):java.lang.Object");
    }
}
