package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkrz extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkrz(ddp ddpVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkrz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (defpackage.ddp.k(r6, r7, r8, null, r12, 12) != r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            r2 = -1020002304(0xffffffffc3340000, float:-180.0)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L13
            defpackage.fctl.b(r13)
            if (r1 == r5) goto L20
            if (r1 == r4) goto L3a
            goto L61
        L13:
            defpackage.fctl.b(r13)
            ddp r13 = r12.b
            r12.a = r5
            java.lang.Object r13 = r13.f(r12)
            if (r13 == r0) goto L64
        L20:
            ddp r13 = r12.b
            hox r1 = r12.c
            boolean r1 = defpackage.dksh.e(r1)
            if (r5 == r1) goto L2c
            r1 = r2
            goto L2d
        L2c:
            r1 = r3
        L2d:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r12.a = r4
            java.lang.Object r13 = r13.e(r6, r12)
            if (r13 == r0) goto L64
        L3a:
            ddp r6 = r12.b
            hox r13 = r12.c
            boolean r13 = defpackage.dksh.e(r13)
            if (r5 == r13) goto L45
            r2 = r3
        L45:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r2)
            r13 = 0
            des r1 = defpackage.dev.a
            r2 = 300(0x12c, float:4.2E-43)
            dia r8 = defpackage.dea.c(r2, r13, r1, r4)
            r13 = 3
            r12.a = r13
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r13 = defpackage.ddp.k(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L61
            goto L64
        L61:
            fctx r13 = defpackage.fctx.a
            return r13
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkrz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dkrz(this.b, this.c, fcxyVar);
    }
}
