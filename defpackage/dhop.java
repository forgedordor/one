package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhop implements dhov {
    public static final ekrg a = ekrg.c("com/google/android/libraries/abuse/hades/moirai/MoiraiApi");
    public final dhnv b;
    public final dhwt c;
    public final dhub d;
    public final dhpu e;
    public dhwy f;
    public final feav g;
    private final dhoh h;
    private final fdjq i;
    private volatile boolean j;
    private final ahjw k;

    public dhop(dhnv dhnvVar, ahjw ahjwVar, dhwt dhwtVar, dhub dhubVar, dhoh dhohVar, fdjq fdjqVar, dhxa dhxaVar) {
        ahjwVar.getClass();
        dhxaVar.getClass();
        this.b = dhnvVar;
        this.k = ahjwVar;
        this.c = dhwtVar;
        this.d = dhubVar;
        this.h = dhohVar;
        this.i = fdjqVar;
        ahkn ahknVar = ahjwVar.a.a;
        this.e = new dhrh(dhnvVar, ahknVar.dz(), ahknVar.gz(), new dhqg(ahknVar.dw(), (dhxa) ahknVar.kT.b(), ahknVar.dx()), (dhxa) ahknVar.kT.b(), ahknVar.dw());
        this.g = new feaz();
    }

    private final Object g(dhnv dhnvVar, int i) {
        dhuh dhuhVarA = this.d.a(dhnvVar.b);
        if (dhuhVarA != null) {
            dhuhVarA.f(dhnvVar, i);
        }
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (defpackage.fctx.a != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[PHI: r2
      0x008f: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v11 java.lang.Object) binds: [B:35:0x008d, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dhoj
            if (r0 == 0) goto L13
            r0 = r10
            dhoj r0 = (defpackage.dhoj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dhoj r0 = new dhoj
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L51
            if (r2 == r8) goto L4d
            if (r2 == r7) goto L49
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            defpackage.fctl.b(r10)
            goto Lc5
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)
            goto L8f
        L43:
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)
            goto L78
        L49:
            defpackage.fctl.b(r10)
            goto L66
        L4d:
            defpackage.fctl.b(r10)
            goto L5c
        L51:
            defpackage.fctl.b(r10)
            r0.d = r8
            java.lang.Object r10 = r9.e(r0)
            if (r10 == r1) goto Lc8
        L5c:
            dhpu r10 = r9.e
            r0.d = r7
            java.lang.Object r10 = r10.a(r0)
            if (r10 == r1) goto Lc8
        L66:
            dhvz r10 = (defpackage.dhvz) r10
            if (r10 == 0) goto Lc5
            dhnv r2 = r9.b
            r0.a = r10
            r0.d = r6
            r6 = 7
            java.lang.Object r2 = r9.g(r2, r6)
            if (r2 == r1) goto Lc8
            r2 = r10
        L78:
            dhwy r10 = r9.f
            if (r10 != 0) goto L82
            java.lang.String r10 = "classifier"
            defpackage.fdbq.c(r10)
            r10 = r3
        L82:
            r0.a = r2
            r0.d = r5
            r5 = r2
            dhvz r5 = (defpackage.dhvz) r5
            java.lang.Object r10 = r10.b(r5, r0)
            if (r10 == r1) goto Lc8
        L8f:
            r0.a = r3
            r0.d = r4
            ekrg r10 = defpackage.dhop.a
            ekrw r10 = r10.h()
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.String r3 = "MoiraiApi.kt"
            java.lang.String r4 = "com/google/android/libraries/abuse/hades/moirai/MoiraiApi"
            java.lang.String r5 = "logProtections"
            ekrw r10 = r10.h(r4, r5, r0, r3)
            ekrd r10 = (defpackage.ekrd) r10
            eldz r0 = defpackage.eldz.h
            eldz r0 = r0.f()
            dhvz r2 = (defpackage.dhvz) r2
            evqs r2 = r2.a()
            byte[] r2 = r2.I()
            java.lang.String r0 = r0.j(r2)
            java.lang.String r2 = "Loaded protections with protection token: %s"
            r10.t(r2, r0)
            fctx r10 = defpackage.fctx.a
            if (r10 != r1) goto Lc5
            goto Lc8
        Lc5:
            fctx r10 = defpackage.fctx.a
            return r10
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhop.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dhov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dhuu r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dhok
            if (r0 == 0) goto L13
            r0 = r6
            dhok r0 = (defpackage.dhok) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhok r0 = new dhok
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcvo r6 = defpackage.fcvo.a
            r0.c = r3
            r2 = 0
            java.lang.Object r6 = r4.c(r5, r2, r6, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            dhuw r6 = (defpackage.dhuw) r6
            dhvp r5 = r6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhop.b(dhuu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dhuu r11, defpackage.sfp r12, java.util.List r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhop.c(dhuu, sfp, java.util.List, fcxy):java.lang.Object");
    }

    @Override // defpackage.dhov
    public final Object d(dhuu dhuuVar, sfp sfpVar, fcxy fcxyVar) throws Throwable {
        Object objC = c(dhuuVar, sfpVar, fcvo.a, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dhoo
            if (r0 == 0) goto L13
            r0 = r8
            dhoo r0 = (defpackage.dhoo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhoo r0 = new dhoo
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2b:
            java.lang.String r1 = r0.d
            int r2 = r0.f
            int r0 = r0.e
            defpackage.fctl.b(r8)
            r3 = r1
            r1 = r0
            goto L52
        L37:
            defpackage.fctl.b(r8)
            dhwy r8 = r7.f
            if (r8 != 0) goto L5e
            r8 = 2
            r0.e = r8
            r2 = 3
            r0.f = r2
            java.lang.String r4 = "Classification attempted before initialize called."
            r0.d = r4
            r0.c = r3
            dhuo r0 = defpackage.dhuo.a
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r1 = r8
            r8 = r0
            r3 = r4
        L52:
            r5 = r8
            dhuo r5 = (defpackage.dhuo) r5
            dhvf r0 = new dhvf
            r4 = 0
            r6 = 24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r0
        L5e:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhop.e(fcxy):java.lang.Object");
    }

    @Override // defpackage.dhov
    public final Object f() {
        dhwy dhwyVar = this.f;
        if (dhwyVar != null) {
            dhwyVar.close();
        } else {
            ((ekrd) a.h().h("com/google/android/libraries/abuse/hades/moirai/MoiraiApi", "close", 215, "MoiraiApi.kt")).q("Moirai API v %s not initialized, skipping close");
        }
        this.j = true;
        return fctx.a;
    }
}
