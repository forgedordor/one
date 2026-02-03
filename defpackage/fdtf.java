package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdtf extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdus b;
    final /* synthetic */ fdpl c;
    final /* synthetic */ fdue d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdtf(fdus fdusVar, fdpl fdplVar, fdue fdueVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdusVar;
        this.c = fdplVar;
        this.d = fdueVar;
        this.e = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdtf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r7.a(r1, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7.a(r1, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (defpackage.fdpy.b(r7, r5, r6) == r0) goto L23;
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
            int r1 = r6.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 == r4) goto L12
            if (r1 == r3) goto Le
            goto L12
        Le:
            defpackage.fctl.b(r7)
            goto L44
        L12:
            defpackage.fctl.b(r7)
            goto L72
        L16:
            defpackage.fctl.b(r7)
            fdus r7 = r6.b
            fdus r1 = defpackage.fdur.a
            if (r7 != r1) goto L2c
            fdpl r7 = r6.c
            fdue r1 = r6.d
            r6.a = r4
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L72
            goto L71
        L2c:
            fdus r1 = defpackage.fdur.b
            r4 = 0
            if (r7 != r1) goto L51
            fdue r7 = r6.d
            fdvc r7 = r7.b()
            fdtd r1 = new fdtd
            r1.<init>(r4)
            r6.a = r3
            java.lang.Object r7 = defpackage.fdtc.b(r7, r1, r6)
            if (r7 == r0) goto L71
        L44:
            fdpl r7 = r6.c
            fdue r1 = r6.d
            r6.a = r2
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L72
            goto L71
        L51:
            fdue r1 = r6.d
            fdvc r2 = r1.b()
            fdpl r7 = r7.a(r2)
            fdpl r7 = defpackage.fdqq.a(r7)
            fdpl r2 = r6.c
            java.lang.Object r3 = r6.e
            fdte r5 = new fdte
            r5.<init>(r2, r1, r3, r4)
            r1 = 4
            r6.a = r1
            java.lang.Object r7 = defpackage.fdpy.b(r7, r5, r6)
            if (r7 != r0) goto L72
        L71:
            return r0
        L72:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdtf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fdtf(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
