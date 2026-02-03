package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awvh implements awzf, awzo, awvl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/core/myidentity/CachedMyIdentityManager");
    public final awye b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fdjx f;
    private final ardl g;
    private final eizx h = new eizx();

    public awvh(awye awyeVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fdjx fdjxVar2, ardl ardlVar) {
        this.b = awyeVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fdjxVar;
        this.f = fdjxVar2;
        this.g = ardlVar;
    }

    private final Object m(fcxy fcxyVar) {
        return ejaa.a(this.f, this.h, new awux(this, null)).c(fcxyVar);
    }

    private final Object n(fcxy fcxyVar) {
        ekgb ekgbVarA = this.b.a();
        if (!ekgbVarA.isEmpty()) {
            return ekgbVarA;
        }
        Object objM = m(fcxyVar);
        return objM == fcyl.a ? objM : (Iterable) objM;
    }

    @Override // defpackage.awzf
    public final axcm a(String str) {
        return ((awzf) this.c.b()).a(str);
    }

    @Override // defpackage.awzf
    public final eiju b() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new awuv(this, null));
    }

    @Override // defpackage.awzf
    public final eiju c(axcm axcmVar) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new awvb(this, axcmVar, null));
    }

    @Override // defpackage.awzo
    @fcsv
    public final eiju d() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new awvg(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.awut
            if (r0 == 0) goto L13
            r0 = r8
            awut r0 = (defpackage.awut) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awut r0 = new awut
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r8)
            goto L7e
        L3b:
            defpackage.fctl.b(r8)
            return r8
        L3f:
            defpackage.fctl.b(r8)
            ardl r8 = r7.g
            boolean r8 = r8.a()
            r2 = 0
            if (r8 == 0) goto L63
            fdjx r8 = r7.f
            eizx r3 = r7.h
            awuu r4 = new awuu
            r4.<init>(r7, r2)
            fdkf r8 = defpackage.ejaa.a(r8, r3, r4)
            r0.d = r5
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L62
            goto Ld1
        L62:
            return r8
        L63:
            awye r8 = r7.b
            ekhx r8 = r8.a
            r8.getClass()
            boolean r5 = r8.isEmpty()
            if (r5 != 0) goto Lbc
            r0.a = r8
            r0.d = r4
            java.lang.Object r0 = r7.n(r0)
            if (r0 != r1) goto L7b
            goto Ld1
        L7b:
            r6 = r0
            r0 = r8
            r8 = r6
        L7e:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L89:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r8.next()
            r3 = r2
            awxn r3 = (defpackage.awxn) r3
            axcm r3 = r3.b()
            r4 = r0
            ekhx r4 = (defpackage.ekhx) r4
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L89
            r1.add(r2)
            goto L89
        La7:
            int r8 = r1.size()
            ekhx r0 = (defpackage.ekhx) r0
            int r0 = r0.size()
            if (r8 != r0) goto Lb4
            return r1
        Lb4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r8.<init>(r0)
            throw r8
        Lbc:
            r0.d = r3
            fdjx r8 = r7.f
            eizx r3 = r7.h
            awus r4 = new awus
            r4.<init>(r7, r2)
            fdkf r8 = defpackage.ejaa.a(r8, r3, r4)
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto Ld2
        Ld1:
            return r1
        Ld2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awvh.e(fcxy):java.lang.Object");
    }

    @Override // defpackage.awzf
    public final Object f(fcxy fcxyVar) {
        return n(fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.axcm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.awuy
            if (r0 == 0) goto L13
            r0 = r6
            awuy r0 = (defpackage.awuy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awuy r0 = new awuy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axcm r5 = r0.d
            defpackage.fctl.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            awye r6 = r4.b
            j$.util.Optional r6 = r6.b(r5)
            boolean r2 = r6.isPresent()
            if (r2 == 0) goto L45
            java.lang.Object r5 = r6.get()
            return r5
        L45:
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r4.m(r0)
            if (r6 == r1) goto L75
        L4f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            awye r6 = r4.b
            j$.util.Optional r6 = r6.b(r5)
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L62
            java.lang.Object r5 = r6.get()
            return r5
        L62:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "No MyIdentity found for token "
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awvh.g(axcm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awvh.h(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.axcm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.awvc
            if (r0 == 0) goto L13
            r0 = r6
            awvc r0 = (defpackage.awvc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awvc r0 = new awvc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axcm r5 = r0.d
            defpackage.fctl.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r4.e(r0)
            if (r6 == r1) goto L6f
        L3e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L50
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L50
        L4e:
            r3 = r1
            goto L6a
        L50:
            java.util.Iterator r6 = r6.iterator()
        L54:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r6.next()
            awxn r0 = (defpackage.awxn) r0
            axcm r0 = r0.b()
            boolean r0 = defpackage.fdbq.f(r0, r5)
            if (r0 == 0) goto L54
        L6a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awvh.i(axcm, fcxy):java.lang.Object");
    }

    @Override // defpackage.awzo
    public final Object j(fcxy fcxyVar) {
        Object objC = ejaa.a(this.f, this.h, new awve(this, null)).c(fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[LOOP:0: B:22:0x006d->B:24:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.awur
            if (r0 == 0) goto L13
            r0 = r7
            awur r0 = (defpackage.awur) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awur r0 = new awur
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r7)
            goto L5a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            defpackage.fctl.b(r7)
            goto L4b
        L38:
            defpackage.fctl.b(r7)
            fcsu r7 = r6.c
            java.lang.Object r7 = r7.b()
            awzf r7 = (defpackage.awzf) r7
            r0.d = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 == r1) goto L85
        L4b:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = r6.l(r0)
            if (r0 == r1) goto L85
            r5 = r0
            r0 = r7
            r7 = r5
        L5a:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            awye r7 = r6.b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L6d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()
            awxn r3 = (defpackage.awxn) r3
            axcm r3 = r3.b()
            r1.add(r3)
            goto L6d
        L81:
            r7.c(r1)
            return r0
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awvh.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.awuw
            if (r0 == 0) goto L13
            r0 = r5
            awuw r0 = (defpackage.awuw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awuw r0 = new awuw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.c
            java.lang.Object r5 = r5.b()
            awzf r5 = (defpackage.awzf) r5
            r0.c = r3
            java.lang.Object r5 = r5.f(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            awye r0 = r4.b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0.d(r5)
            ekgb r5 = r0.a()
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awvh.l(fcxy):java.lang.Object");
    }

    @Override // defpackage.awvl
    public final Object o(Iterable iterable, Iterable iterable2, fcxy fcxyVar) {
        Object objC = ejaa.a(this.e, this.h, new awvd(this, iterable, iterable2, null)).c(fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.awvl
    public final /* synthetic */ Object q(axcm axcmVar, String str) {
        return fctx.a;
    }

    @Override // defpackage.awvl
    public final /* synthetic */ void p() {
    }
}
