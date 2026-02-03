package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dssa extends fcyz implements fdat {
    int a;
    final /* synthetic */ dssc b;
    final /* synthetic */ dsbi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dssa(dssc dsscVar, dsbi dsbiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsscVar;
        this.c = dsbiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dssa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r5.a.a(r1, null, r4) == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1d
            goto L2e
        Ld:
            dssc r5 = r4.b
            dsbi r1 = r4.c
            dsoo r3 = defpackage.dsoo.SUCCESS
            r4.a = r2
            dsoj r5 = r5.a
            java.lang.Object r5 = r5.b(r1, r3, r4)
            if (r5 == r0) goto L31
        L1d:
            dssc r5 = r4.b
            dsbi r1 = r4.c
            r2 = 2
            r4.a = r2
            dsoj r5 = r5.a
            r2 = 0
            java.lang.Object r5 = r5.a(r1, r2, r4)
            if (r5 != r0) goto L2e
            goto L31
        L2e:
            fctx r5 = defpackage.fctx.a
            return r5
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dssa(this.b, this.c, fcxyVar);
    }
}
