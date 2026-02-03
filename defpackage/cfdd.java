package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfdd extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bvks d;
    final /* synthetic */ cfdf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdd(bvks bvksVar, cfdf cfdfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = bvksVar;
        this.e = cfdfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r1.c(r7, r6) == r0) goto L20;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            if (r1 == 0) goto L19
            if (r1 == r2) goto L11
            defpackage.fctl.b(r7)
            goto L65
        L11:
            java.lang.Object r0 = r6.b
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L49
        L19:
            defpackage.fctl.b(r7)
            bvks r7 = r6.d
            ezol r1 = r7.a
            java.lang.String r1 = r1.d
            java.lang.String r4 = "GDitto"
            boolean r1 = defpackage.fdbq.f(r1, r4)
            if (r1 == 0) goto L59
            cfdf r1 = r6.e
            fcsu r4 = r1.a
            java.lang.Object r4 = r4.b()
            bvkr r4 = (defpackage.bvkr) r4
            java.lang.String r5 = r7.b
            bvix r4 = r4.f(r5)
            if (r4 == 0) goto L53
            r6.a = r1
            r6.b = r7
            r6.c = r2
            java.lang.Object r2 = r1.d(r4, r6)
            if (r2 == r0) goto L64
            r0 = r7
        L49:
            bvks r0 = (defpackage.bvks) r0
            ezol r7 = r0.d
            cfdf r1 = (defpackage.cfdf) r1
            r1.e(r7)
            return r3
        L53:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L59:
            cfdf r1 = r6.e
            r2 = 2
            r6.c = r2
            java.lang.Object r7 = r1.c(r7, r6)
            if (r7 != r0) goto L65
        L64:
            return r0
        L65:
            cfdf r7 = r6.e
            bvks r0 = r6.d
            ezol r0 = r0.d
            r7.e(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfdd(this.d, this.e, fcxyVar);
    }
}
