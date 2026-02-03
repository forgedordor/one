package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxm extends fcyz implements fdat {
    int a;
    final /* synthetic */ doxo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doxm(doxo doxoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = doxoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doxm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (defpackage.fdpy.a(r8, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (defpackage.fdpy.a(r8, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r2.a(r3, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Lc
            goto L7a
        Lc:
            doxo r8 = r7.b
            doxi r1 = r8.e
            r4 = 0
            if (r1 != 0) goto L19
            java.lang.String r1 = "views"
            defpackage.fdbq.c(r1)
            r1 = r4
        L19:
            boolean r5 = r8.bj()
            android.support.v7.widget.RecyclerView r1 = r1.b
            if (r5 == 0) goto L46
            boolean r5 = r8.gC()
            if (r5 == 0) goto L46
            fdpl r2 = defpackage.dphw.c(r1)
            fctc r5 = r8.aR
            java.lang.Object r5 = r5.a()
            fdvc r5 = (defpackage.fdvc) r5
            doxj r6 = new doxj
            r6.<init>(r8, r1, r4)
            fdua r8 = new fdua
            r8.<init>(r2, r5, r6)
            r7.a = r3
            java.lang.Object r8 = defpackage.fdpy.a(r8, r7)
            if (r8 != r0) goto L7a
            goto L79
        L46:
            boolean r3 = r8.gC()
            if (r3 == 0) goto L67
            fdpl r3 = defpackage.dphw.c(r1)
            fduf r5 = r8.aW()
            doxk r6 = new doxk
            r6.<init>(r8, r1, r4)
            fdua r8 = new fdua
            r8.<init>(r3, r5, r6)
            r7.a = r2
            java.lang.Object r8 = defpackage.fdpy.a(r8, r7)
            if (r8 != r0) goto L7a
            goto L79
        L67:
            fdpl r2 = defpackage.dphw.c(r1)
            doxl r3 = new doxl
            r3.<init>(r8, r1)
            r8 = 3
            r7.a = r8
            java.lang.Object r8 = r2.a(r3, r7)
            if (r8 != r0) goto L7a
        L79:
            return r0
        L7a:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doxm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doxm(this.b, fcxyVar);
    }
}
