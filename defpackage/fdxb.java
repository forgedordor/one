package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxb extends fcyv implements fdpm, fcyw {
    public final fdpm a;
    public final fcyh b;
    public final int c;
    private fcyh d;
    private fcxy e;

    public fdxb(fdpm fdpmVar, fcyh fcyhVar) {
        super(fdwx.a, fcyi.a);
        this.a = fdpmVar;
        this.b = fcyhVar;
        this.c = ((Number) fcyhVar.fold(0, new fdat() { // from class: fdxa
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            }
        })).intValue();
    }

    @Override // defpackage.fcyt
    protected final Object b(Object obj) {
        Throwable thC = fctk.c(obj);
        if (thC != null) {
            this.d = new fdwp(thC, u());
        }
        fcxy fcxyVar = this.e;
        if (fcxyVar != null) {
            fcxyVar.w(obj);
        }
        return fcyl.a;
    }

    @Override // defpackage.fcyt, defpackage.fcyw
    public final fcyw dJ() {
        fcxy fcxyVar = this.e;
        if (fcxyVar instanceof fcyw) {
            return (fcyw) fcxyVar;
        }
        return null;
    }

    @Override // defpackage.fcyv, defpackage.fcyt
    public final void f() {
        super.f();
    }

    @Override // defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        try {
            fcyh fcyhVarU = fcxyVar.u();
            fdlw.f(fcyhVarU);
            fcyh fcyhVar = this.d;
            if (fcyhVar != fcyhVarU) {
                if (fcyhVar instanceof fdwp) {
                    throw new IllegalStateException(fdgn.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((fdwp) fcyhVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                if (((Number) fcyhVarU.fold(0, new fdat() { // from class: fdxe
                    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                    @Override // defpackage.fdat
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            r4 = this;
                            java.lang.Integer r5 = (java.lang.Integer) r5
                            int r5 = r5.intValue()
                            fcyf r6 = (defpackage.fcyf) r6
                            fcyg r0 = r6.getKey()
                            fdxb r1 = r4.a
                            fcyh r1 = r1.b
                            fcyf r1 = r1.get(r0)
                            fdlq r2 = defpackage.fdlr.c
                            if (r0 == r2) goto L20
                            if (r6 == r1) goto L1d
                            r5 = -2147483648(0xffffffff80000000, float:-0.0)
                            goto L45
                        L1d:
                            int r5 = r5 + 1
                            goto L45
                        L20:
                            fdlr r1 = (defpackage.fdlr) r1
                            r6.getClass()
                            fdlr r6 = (defpackage.fdlr) r6
                        L27:
                            r0 = 0
                            if (r6 != 0) goto L2c
                            r6 = r0
                            goto L41
                        L2c:
                            if (r6 == r1) goto L41
                            boolean r2 = r6 instanceof defpackage.fdze
                            if (r2 == 0) goto L41
                            fdze r6 = (defpackage.fdze) r6
                            fdiz r6 = r6.I()
                            if (r6 == 0) goto L3f
                            fdlr r6 = r6.c()
                            goto L27
                        L3f:
                            r6 = r0
                            goto L27
                        L41:
                            if (r6 != r1) goto L4a
                            if (r1 != 0) goto L1d
                        L45:
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                            return r5
                        L4a:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                            java.lang.String r2 = ", expected child of "
                            java.lang.String r3 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                            java.lang.String r6 = defpackage.a.j(r1, r6, r0, r2, r3)
                            r5.<init>(r6)
                            throw r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdxe.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                })).intValue() != this.c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + fcyhVarU + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.d = fcyhVarU;
            }
            this.e = fcxyVar;
            fdau fdauVar = fdxd.a;
            fdpm fdpmVar = this.a;
            fdpmVar.getClass();
            Object objA = fdauVar.a(fdpmVar, obj, this);
            fcyl fcylVar = fcyl.a;
            if (!fdbq.f(objA, fcylVar)) {
                this.e = null;
            }
            if (objA == fcylVar) {
                fcxyVar.getClass();
            }
            return objA == fcylVar ? objA : fctx.a;
        } catch (Throwable th) {
            this.d = new fdwp(th, fcxyVar.u());
            throw th;
        }
    }

    @Override // defpackage.fcyv, defpackage.fcxy
    public final fcyh u() {
        fcyh fcyhVar = this.d;
        return fcyhVar == null ? fcyi.a : fcyhVar;
    }

    @Override // defpackage.fcyt, defpackage.fcyw
    public final void dK() {
    }
}
