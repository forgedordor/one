package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awiz implements awjh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager");
    public final awgx b;
    public final fcsu c;
    public final fcsu d;
    private final awgx e;
    private final fcyh f;
    private final fdjx g;
    private final awzf h;
    private final awyu i;
    private final fcsu j;

    public awiz(awgx awgxVar, awgx awgxVar2, fcsu fcsuVar, fcsu fcsuVar2, fcyh fcyhVar, fdjx fdjxVar, awzf awzfVar, awyu awyuVar, fcsu fcsuVar3) {
        awgxVar.getClass();
        awgxVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        awzfVar.getClass();
        awyuVar.getClass();
        fcsuVar3.getClass();
        this.e = awgxVar;
        this.b = awgxVar2;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.f = fcyhVar;
        this.g = fdjxVar;
        this.h = awzfVar;
        this.i = awyuVar;
        this.j = fcsuVar3;
    }

    private final Object k(String str, awja awjaVar, fcxy fcxyVar) {
        return this.b.b(str, new awiv(this, str, awjaVar, null), fcxyVar);
    }

    @Override // defpackage.awjh
    public final eiju a(aubq aubqVar) {
        return auvw.c(this.g, fcyi.a, fdjz.a, new awio(this, aubqVar, null));
    }

    @Override // defpackage.awjh
    public final eiju b(awjl awjlVar) {
        return auvw.c(this.g, fcyi.a, fdjz.a, new awir(this, awjlVar, null));
    }

    @Override // defpackage.awjh
    public final Object c(aubq aubqVar, fcxy fcxyVar) {
        int i = aubqVar.c;
        aubp aubpVarB = aubp.b(i);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        if (aubpVarB == aubp.GROUP) {
            throw new IllegalArgumentException("Group type not supported.");
        }
        String str = aubqVar.d;
        str.getClass();
        awin awinVar = new awin();
        aubp aubpVarB2 = aubp.b(i);
        if (aubpVarB2 == null) {
            aubpVarB2 = aubp.UNKNOWN_TYPE;
        }
        awja awjaVarApply = awinVar.apply(aubpVarB2);
        awjaVarApply.getClass();
        return k(str, awjaVarApply, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.axcm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.awip
            if (r0 == 0) goto L13
            r0 = r7
            awip r0 = (defpackage.awip) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awip r0 = new awip
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L43
        L36:
            defpackage.fctl.b(r7)
            awzf r7 = r5.h
            r0.c = r4
            java.lang.Object r7 = r7.g(r6, r0)
            if (r7 == r1) goto L87
        L43:
            awxn r7 = (defpackage.awxn) r7
            awxl r6 = r7.a()
            awxl r2 = defpackage.awxl.a
            if (r6 != r2) goto L7f
            awyu r6 = r5.i
            awyv r6 = r6.a(r7)
            j$.util.Optional r6 = r6.c()
            r6.getClass()
            java.lang.Object r6 = defpackage.fdct.b(r6)
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            if (r6 != 0) goto L64
            return r7
        L64:
            fcsu r2 = r5.d
            java.lang.Object r2 = r2.b()
            crmx r2 = (defpackage.crmx) r2
            boolean r2 = r2.I(r6)
            if (r2 != 0) goto L73
            return r7
        L73:
            awja r7 = defpackage.awja.a
            r0.c = r3
            java.lang.Object r6 = r5.k(r6, r7, r0)
            if (r6 != r1) goto L7e
            goto L87
        L7e:
            return r6
        L7f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awiz.d(axcm, fcxy):java.lang.Object");
    }

    @Override // defpackage.awjh
    public final Object e(awjl awjlVar, fcxy fcxyVar) {
        return this.e.b(awjlVar, new awiq(awjlVar, this, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Iterable r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.awis
            if (r0 == 0) goto L13
            r0 = r7
            awis r0 = (defpackage.awis) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awis r0 = new awis
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
            awgx r7 = r5.e
            java.util.Set r6 = defpackage.fcva.av(r6)
            awit r2 = new awit
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r7 = r7.c(r6, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r6 = r7.values()
            java.util.List r6 = defpackage.fcva.ao(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awiz.f(java.lang.Iterable, fcxy):java.lang.Object");
    }

    @Override // defpackage.awjh
    public final Object g(ezol ezolVar, fcxy fcxyVar) {
        awja awjaVar;
        String str = ezolVar.c;
        str.getClass();
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        int iOrdinal = felmVarB.ordinal();
        if (iOrdinal == 1) {
            awjaVar = awja.a;
        } else if (iOrdinal == 2) {
            awjaVar = awja.c;
        } else if (iOrdinal == 10) {
            awjaVar = awja.b;
        } else {
            if (iOrdinal != 41) {
                felm felmVarB2 = felm.b(ezolVar.b);
                if (felmVarB2 == null) {
                    felmVarB2 = felm.UNRECOGNIZED;
                }
                throw new IllegalArgumentException(a.h(felmVarB2, "Tachyon ID type ", " cannot be converted to a Destination AddressType."));
            }
            awjaVar = awja.d;
        }
        return k(str, awjaVar, fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r9, defpackage.awja r10, defpackage.fcxy r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.awiu
            if (r0 == 0) goto L13
            r0 = r11
            awiu r0 = (defpackage.awiu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awiu r0 = new awiu
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r11)
            goto L8e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            awja r10 = r0.e
            java.lang.String r9 = r0.d
            defpackage.fctl.b(r11)
            goto L59
        L3b:
            defpackage.fctl.b(r11)
            r0.d = r9
            r0.e = r10
            r0.c = r4
            fcyh r11 = r8.f
            fcyh r11 = defpackage.eicg.a(r11)
            awiy r2 = new awiy
            r2.<init>(r5, r10, r9, r8)
            java.lang.Object r11 = defpackage.fdin.a(r11, r2, r0)
            if (r11 == r1) goto L57
            fctx r11 = defpackage.fctx.a
        L57:
            if (r11 == r1) goto L98
        L59:
            ekrg r11 = defpackage.awiz.a
            ekrw r11 = r11.e()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "BugleCME"
            r11.X(r2, r4)
            r2 = 153(0x99, float:2.14E-43)
            java.lang.String r4 = "CachingDestinationManager.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager"
            java.lang.String r7 = "matchExactOrCreate"
            ekrw r11 = r11.h(r6, r7, r2, r4)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Cache miss matching destination. Loading from database."
            r11.q(r2)
            fcsu r11 = r8.c
            java.lang.Object r11 = r11.b()
            awjc r11 = (defpackage.awjc) r11
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r11 = r11.b(r9, r10, r0)
            if (r11 != r1) goto L8e
            goto L98
        L8e:
            awgx r9 = r8.e
            awjb r11 = (defpackage.awjb) r11
            awjl r10 = r11.a
            r9.d(r10, r11)
            return r10
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awiz.h(java.lang.String, awja, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.awjl r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.awiw
            if (r0 == 0) goto L13
            r0 = r7
            awiw r0 = (defpackage.awiw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awiw r0 = new awiw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            awjl r6 = r0.d
            defpackage.fctl.b(r7)
            goto L46
        L38:
            defpackage.fctl.b(r7)
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = r5.e(r6, r0)
            if (r7 != r1) goto L46
            goto L82
        L46:
            awjb r7 = (defpackage.awjb) r7
            awja r2 = r7.b
            int r2 = r2.ordinal()
            if (r2 == 0) goto L9e
            if (r2 == r4) goto L84
            if (r2 == r3) goto L77
            r6 = 3
            if (r2 != r6) goto L71
            aubq r6 = defpackage.aubq.a
            evsf r6 = r6.createBuilder()
            aubn r6 = (defpackage.aubn) r6
            r6.getClass()
            java.lang.String r7 = r7.c
            defpackage.aubr.b(r7, r6)
            aubp r7 = defpackage.aubp.EMERGENCY
            defpackage.aubr.c(r7, r6)
            aubq r6 = defpackage.aubr.a(r6)
            return r6
        L71:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        L77:
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r5.j(r6, r0)
            if (r6 != r1) goto L83
        L82:
            return r1
        L83:
            return r6
        L84:
            aubq r6 = defpackage.aubq.a
            evsf r6 = r6.createBuilder()
            aubn r6 = (defpackage.aubn) r6
            r6.getClass()
            java.lang.String r7 = r7.c
            defpackage.aubr.b(r7, r6)
            aubp r7 = defpackage.aubp.BOT
            defpackage.aubr.c(r7, r6)
            aubq r6 = defpackage.aubr.a(r6)
            return r6
        L9e:
            aubq r6 = defpackage.aubq.a
            evsf r6 = r6.createBuilder()
            aubn r6 = (defpackage.aubn) r6
            r6.getClass()
            java.lang.String r7 = r7.c
            defpackage.aubr.b(r7, r6)
            aubp r7 = defpackage.aubp.PHONE
            defpackage.aubr.c(r7, r6)
            aubq r6 = defpackage.aubr.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awiz.i(awjl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r7 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.awjl r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.awix
            if (r0 == 0) goto L13
            r0 = r7
            awix r0 = (defpackage.awix) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awix r0 = new awix
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L49
        L36:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.j
            java.lang.Object r7 = r7.b()
            awnf r7 = (defpackage.awnf) r7
            r0.c = r4
            java.lang.Object r7 = r7.k(r6, r0)
            if (r7 == r1) goto L6b
        L49:
            fcsu r6 = r5.j
            awpx r7 = (defpackage.awpx) r7
            java.lang.Object r6 = r6.b()
            awnf r6 = (defpackage.awnf) r6
            r0.c = r3
            java.lang.Object r7 = r6.h(r7, r0)
            if (r7 == r1) goto L6b
        L5b:
            awmp r7 = (defpackage.awmp) r7
            audu r6 = r7.a()
            aubq r6 = r6.d
            if (r6 != 0) goto L67
            aubq r6 = defpackage.aubq.a
        L67:
            r6.getClass()
            return r6
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awiz.j(awjl, fcxy):java.lang.Object");
    }
}
