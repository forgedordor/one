package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqc extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdpl c;
    final /* synthetic */ fdau d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqc(fdpl fdplVar, fdau fdauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdplVar;
        this.d = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oqc) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (r7.a(r5, r6) == r0) goto L15;
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
            int r1 = r6.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            if (r1 == r2) goto Le
            defpackage.fctl.b(r7)
            goto L4e
        Le:
            java.lang.Object r1 = r6.a
            java.lang.Object r2 = r6.e
            fdpm r2 = (defpackage.fdpm) r2
            defpackage.fctl.b(r7)
            goto L35
        L18:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.e
            fdpm r7 = (defpackage.fdpm) r7
            fdci r1 = new fdci
            r1.<init>()
            r1.a = r3
            java.lang.Object r4 = r1.a
            r6.e = r7
            r6.a = r1
            r6.b = r2
            java.lang.Object r2 = r7.fO(r4, r6)
            if (r2 == r0) goto L51
            r2 = r7
        L35:
            fdpl r7 = r6.c
            fdau r4 = r6.d
            oqb r5 = new oqb
            fdci r1 = (defpackage.fdci) r1
            r5.<init>(r1, r4, r2)
            r6.e = r3
            r6.a = r3
            r1 = 2
            r6.b = r1
            java.lang.Object r7 = r7.a(r5, r6)
            if (r7 != r0) goto L4e
            goto L51
        L4e:
            fctx r7 = defpackage.fctx.a
            return r7
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        oqc oqcVar = new oqc(this.c, this.d, fcxyVar);
        oqcVar.e = obj;
        return oqcVar;
    }
}
