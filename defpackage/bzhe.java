package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhe {
    public static final eksp a = eksp.c("BugleCms");
    public final ains b;
    public final cden c;
    public final apqc d;
    public final String e;
    public final bzba f;
    private final fdjx g;
    private final aukz h;

    public bzhe(ains ainsVar, cden cdenVar, apqc apqcVar, fdjx fdjxVar, aukz aukzVar, String str, bzba bzbaVar) {
        this.b = ainsVar;
        this.c = cdenVar;
        this.d = apqcVar;
        this.g = fdjxVar;
        this.h = aukzVar;
        this.e = str;
        this.f = bzbaVar;
    }

    private final void h(bzbz bzbzVar, Throwable th) {
        bzch bzchVar = bzbzVar.b;
        this.h.g(aukk.a(bzchVar.e, bzchVar.b), cpxz.b(bzbzVar.c), bzchVar.c, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Throwable r6, defpackage.bzhh r7, defpackage.bzbz r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.bzhc
            if (r0 == 0) goto L13
            r0 = r9
            bzhc r0 = (defpackage.bzhc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bzhc r0 = new bzhc
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            bzhh r7 = r0.e
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r9)
            goto Lce
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.fctl.b(r9)
            if (r8 == 0) goto L9f
            bzch r9 = r8.b
            int r9 = r9.b
            r2 = 9
            int r2 = defpackage.bzas.a(r2)
            boolean r2 = defpackage.bzgz.a(r9, r2)
            if (r2 == 0) goto L4c
            avbk r9 = defpackage.avbk.CMS_EVENT_TYPE_DELETE_TRIGGERED
            goto L8f
        L4c:
            r2 = 17
            int r2 = defpackage.bzas.a(r2)
            boolean r2 = defpackage.bzgz.a(r9, r2)
            if (r2 == 0) goto L5b
            avbk r9 = defpackage.avbk.CMS_EVENT_TYPE_CREATE_TRIGGERED
            goto L8f
        L5b:
            r2 = 5
            int r2 = defpackage.bzas.a(r2)
            boolean r2 = defpackage.bzgz.a(r9, r2)
            if (r2 != 0) goto L8d
            r2 = 3
            int r2 = defpackage.bzas.a(r2)
            boolean r2 = defpackage.bzgz.a(r9, r2)
            if (r2 != 0) goto L8d
            r2 = 65
            int r2 = defpackage.bzas.a(r2)
            boolean r2 = defpackage.bzgz.a(r9, r2)
            if (r2 != 0) goto L8d
            r2 = 33
            int r2 = defpackage.bzas.a(r2)
            boolean r9 = defpackage.bzgz.a(r9, r2)
            if (r9 == 0) goto L8a
            goto L8d
        L8a:
            avbk r9 = defpackage.avbk.CMS_EVENT_TYPE_UNKNOWN
            goto L8f
        L8d:
            avbk r9 = defpackage.avbk.CMS_EVENT_TYPE_UPDATE_TRIGGERED
        L8f:
            bzba r2 = r5.f
            java.lang.String r4 = r8.a
            j$.util.Optional.empty()
            j$.util.Optional.of(r6)
            r2.e(r9, r4, r8)
            r5.h(r8, r6)
        L9f:
            eksp r9 = defpackage.bzhe.a
            ekrw r9 = r9.i()
            eksl r9 = (defpackage.eksl) r9
            ekrw r9 = r9.g(r6)
            eksl r9 = (defpackage.eksl) r9
            if (r8 == 0) goto Lb4
            bzch r8 = r8.b
            java.lang.String r8 = r8.a
            goto Lb6
        Lb4:
            java.lang.String r8 = "unknown"
        Lb6:
            java.lang.String r2 = "Uncaught exception while processing WorkHandler item %s"
            r9.t(r2, r8)
            cden r8 = r5.c
            eiju r8 = r8.b(r6)
            r0.a = r6
            r0.e = r7
            r0.d = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 != r1) goto Lce
            return r1
        Lce:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r5.c(r7, r6)
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzhe.a(java.lang.Throwable, bzhh, bzbz, fcxy):java.lang.Object");
    }

    public final Object b(Object obj, final avbk avbkVar, final bzbz bzbzVar, final Optional optional) {
        final String str = bzbzVar.a;
        fdap fdapVar = new fdap() { // from class: bzgx
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                bzca bzcaVar = (bzca) obj2;
                bzcaVar.getClass();
                this.a.f.b(avbkVar, str, optional, bzcaVar.a(), bzbzVar);
                return fctx.a;
            }
        };
        if (fctk.d(obj)) {
            try {
                fdapVar.invoke(obj);
            } catch (Throwable th) {
                obj = fctl.a(th);
            }
        }
        fdap fdapVar2 = new fdap() { // from class: bzgy
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                Throwable th2 = (Throwable) obj2;
                th2.getClass();
                Optional.of(th2);
                this.a.f.e(avbkVar, str, bzbzVar);
                return fctx.a;
            }
        };
        Throwable thC = fctk.c(obj);
        if (thC == null) {
            return obj;
        }
        try {
            fdapVar2.invoke(thC);
            throw thC;
        } catch (Throwable th2) {
            return fctl.a(th2);
        }
    }

    public final void c(bzhh bzhhVar, Throwable th) {
        String strC = bzhhVar.c(this.e);
        emcn emcnVarA = auls.a(th);
        emcnVarA.getClass();
        int i = emcnVarA.bs;
        Integer numValueOf = i == 0 ? null : Integer.valueOf(i);
        if (numValueOf != null) {
            this.b.e(strC, numValueOf.intValue());
        }
    }

    public final void d(Object obj, bzbz bzbzVar) {
        Throwable thC = fctk.c(obj);
        if (thC != null) {
            h(bzbzVar, thC);
        }
    }

    public final void e(Object obj, bzbz bzbzVar) {
        Throwable thC = fctk.c(obj);
        if (thC != null) {
            auvw.k(this.g, null, null, new bzhd(thC, this, bzbzVar, null), 3);
        }
    }

    public final void g(Object obj, bzhh bzhhVar) {
        if (fctk.d(obj)) {
            this.b.e(bzhhVar.c(this.e), 22);
        }
        Throwable thC = fctk.c(obj);
        if (thC != null) {
            c(bzhhVar, thC);
        }
    }
}
