package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvrt extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvrt(bvsb bvsbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvrt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (defpackage.fctx.a == r0) goto L13;
     */
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
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L26
            goto L4e
        Ld:
            bvsb r6 = r5.b
            fcsu r6 = r6.l
            java.lang.Object r6 = r6.b()
            r6.getClass()
            java.lang.Number r6 = (java.lang.Number) r6
            long r3 = r6.longValue()
            r5.a = r2
            java.lang.Object r6 = defpackage.fdkj.c(r3, r5)
            if (r6 == r0) goto L51
        L26:
            bvsb r6 = r5.b
            r1 = 2
            r5.a = r1
            eksp r1 = defpackage.bvsb.a
            ekrw r1 = r1.n()
            java.lang.String r2 = "Allow user to interact."
            r1.q(r2)
            bvrw r1 = new bvrw
            r2 = 0
            r1.<init>(r6, r2)
            fdjx r2 = r6.c
            eiju r1 = defpackage.auvw.h(r2, r1)
            egzh r6 = r6.h
            egyj r2 = defpackage.bvqt.a
            r6.a(r1, r2)
            fctx r6 = defpackage.fctx.a
            if (r6 != r0) goto L4e
            goto L51
        L4e:
            fctx r6 = defpackage.fctx.a
            return r6
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvrt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvrt(this.b, fcxyVar);
    }
}
