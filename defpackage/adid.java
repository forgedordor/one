package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adid implements adhu {
    private final ecjh a;

    public adid(ecjh ecjhVar) {
        ecjhVar.getClass();
        this.a = ecjhVar;
    }

    @Override // defpackage.adhu
    public final Object a(fcxy fcxyVar) {
        return crrj.a(this.a, new fdap() { // from class: adhw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                adil adilVar = (adil) obj;
                adilVar.getClass();
                return Boolean.valueOf(adilVar.c);
            }
        }, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.adhu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.adib
            if (r0 == 0) goto L13
            r0 = r5
            adib r0 = (defpackage.adib) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            adib r0 = new adib
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ecjh r5 = r4.a
            adhz r2 = new adhz
            r2.<init>()
            r0.c = r3
            java.lang.Object r5 = defpackage.crrj.a(r5, r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adid.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.adhu
    public final Object c(fcxy fcxyVar) {
        Object objB = crrj.b(this.a, new fdap() { // from class: adhx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                adii adiiVar = (adii) obj;
                adiiVar.copyOnWrite();
                adil adilVar = (adil) adiiVar.instance;
                adil adilVar2 = adil.a;
                adilVar.b |= 1;
                adilVar.c = true;
                return fctx.a;
            }
        }, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.adhu
    public final Object d(final adik adikVar, fcxy fcxyVar) {
        Object objB = crrj.b(this.a, new fdap() { // from class: adhv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                adii adiiVar = (adii) obj;
                adiiVar.copyOnWrite();
                adil adilVar = (adil) adiiVar.instance;
                adil adilVar2 = adil.a;
                adilVar.e = adikVar.d;
                adilVar.b |= 4;
                return fctx.a;
            }
        }, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.adhu
    public final Object e(final adik adikVar, fcxy fcxyVar) {
        Object objB = crrj.b(this.a, new fdap() { // from class: adia
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                adii adiiVar = (adii) obj;
                adiiVar.copyOnWrite();
                adil adilVar = (adil) adiiVar.instance;
                adil adilVar2 = adil.a;
                adilVar.d = adikVar.d;
                adilVar.b |= 2;
                return fctx.a;
            }
        }, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.adhu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.adic
            if (r0 == 0) goto L13
            r0 = r5
            adic r0 = (defpackage.adic) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            adic r0 = new adic
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ecjh r5 = r4.a
            adhy r2 = new adhy
            r2.<init>()
            r0.c = r3
            java.lang.Object r5 = defpackage.crrj.a(r5, r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adid.f(fcxy):java.lang.Object");
    }
}
