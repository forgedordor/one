package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzgr extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzgt c;
    final /* synthetic */ bnar d;
    final /* synthetic */ bzbz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzgr(bzgt bzgtVar, bnar bnarVar, bzbz bzbzVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = bzgtVar;
        this.d = bnarVar;
        this.e = bzbzVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bzgr bzgrVar = new bzgr(this.c, this.d, this.e, (fcxy) obj3);
        bzgrVar.b = (String) obj;
        return bzgrVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r8 != r0) goto L15;
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
            if (r1 == 0) goto L14
            defpackage.fctl.b(r8)
            if (r1 == r3) goto L31
            if (r1 == r2) goto L40
            fctk r8 = (defpackage.fctk) r8
            java.lang.Object r8 = r8.a
            goto L54
        L14:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.b
            bzgt r1 = r7.c
            fcyh r4 = r1.b
            fcyh r4 = defpackage.eicg.a(r4)
            bzgq r5 = new bzgq
            r6 = 0
            java.lang.String r8 = (java.lang.String) r8
            r5.<init>(r6, r1, r8)
            r7.a = r3
            java.lang.Object r8 = defpackage.fdin.a(r4, r5, r7)
            if (r8 == r0) goto L58
        L31:
            bzgt r1 = r7.c
            bnar r3 = r7.d
            r7.a = r2
            bzbe r1 = r1.f
            r2 = 0
            java.lang.Object r8 = defpackage.bzbc.a(r1, r8, r3, r2, r7)
            if (r8 == r0) goto L58
        L40:
            bzgt r1 = r7.c
            bzbz r2 = r7.e
            r3 = 3
            r7.a = r3
            bzce r1 = r1.g
            java.util.EnumSet r3 = defpackage.bzcf.a()
            java.lang.Object r8 = r1.c(r8, r2, r3, r7)
            if (r8 != r0) goto L54
            goto L58
        L54:
            defpackage.fctl.b(r8)
            return r8
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzgr.b(java.lang.Object):java.lang.Object");
    }
}
