package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckal extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    final /* synthetic */ dggn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckal(fcxy fcxyVar, ckbk ckbkVar, dggn dggnVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
        this.c = dggnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r5.d
            ckbk r0 = (defpackage.ckbk) r0
            defpackage.fctl.b(r6)
            goto L24
        Lf:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.d
            fdjx r6 = (defpackage.fdjx) r6
            ckbk r6 = r5.b
            r5.d = r6
            r5.a = r2
            java.lang.Object r1 = r6.w(r5)
            if (r1 == r0) goto L44
            r0 = r6
            r6 = r1
        L24:
            dggn r1 = r5.c
            java.util.Map r6 = (java.util.Map) r6
            boolean r3 = r0.o()
            r4 = 0
            if (r3 != 0) goto L31
        L2f:
            r2 = r4
            goto L3f
        L31:
            java.lang.Object r6 = r6.get(r1)
            if (r6 != 0) goto L3b
            ckcc r6 = r0.p(r1)
        L3b:
            ckcc r0 = defpackage.ckcc.PER_SIM_TOGGLE_STATE_ENABLED
            if (r6 != r0) goto L2f
        L3f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckal.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckal ckalVar = new ckal(fcxyVar, this.b, this.c);
        ckalVar.d = obj;
        return ckalVar;
    }
}
