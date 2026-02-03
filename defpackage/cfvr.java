package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfvr extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cfvs c;
    final /* synthetic */ cfuy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfvr(cfvs cfvsVar, cfuy cfuyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cfvsVar;
        this.d = cfuyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfvr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r6.a(r5) != r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto Le
            defpackage.fctl.b(r6)
            goto L60
        Le:
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L4e
        L14:
            defpackage.fctl.b(r6)
            cfvs r6 = r5.c
            cfvh r1 = r6.c
            java.lang.Class r1 = r1.getClass()
            int r4 = defpackage.fdcj.a
            fdbi r4 = new fdbi
            r4.<init>(r1)
            java.util.Map r1 = r6.d
            java.lang.Object r1 = r1.get(r4)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L39
            cfuy r4 = r5.d
            java.lang.Object r1 = r1.get(r4)
            fddy r1 = (defpackage.fddy) r1
            goto L3a
        L39:
            r1 = r2
        L3a:
            if (r1 == 0) goto L60
            cfvl r4 = r6.b
            cfvh r1 = r4.a(r1)
            cfvh r6 = r6.c
            r5.a = r1
            r5.b = r3
            java.lang.Object r6 = r6.c()
            if (r6 == r0) goto L5f
        L4e:
            cfvs r6 = r5.c
            r6.c = r1
            cfvh r6 = r6.c
            r5.a = r2
            r1 = 2
            r5.b = r1
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L60
        L5f:
            return r0
        L60:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfvr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfvr(this.c, this.d, fcxyVar);
    }
}
