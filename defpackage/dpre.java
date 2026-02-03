package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpre extends fcyz implements fdat {
    int a;
    final /* synthetic */ dprl b;
    final /* synthetic */ ihs c;
    final /* synthetic */ hsf d;
    final /* synthetic */ hox e;
    final /* synthetic */ hox f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpre(dprl dprlVar, ihs ihsVar, hsf hsfVar, hox hoxVar, hox hoxVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dprlVar;
        this.c = ihsVar;
        this.d = hsfVar;
        this.e = hoxVar;
        this.f = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpre) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r12 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (r12.a(r2, r3, 2.0f, r11) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.a
            r2 = 1
            defpackage.fctl.b(r12)
            if (r1 == 0) goto Lb
            goto L72
        Lb:
            hsf r12 = r11.d
            float r12 = defpackage.dprg.b(r12)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 <= 0) goto L38
            hox r12 = r11.e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r12.b(r3)
            dprl r12 = r11.b
            r11.a = r2
            r2 = 0
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Object r12 = r12.a(r3, r2, r1, r11)
            if (r12 == r0) goto L35
            fctx r12 = defpackage.fctx.a
        L35:
            if (r12 != r0) goto L72
            goto L71
        L38:
            dprl r12 = r11.b
            hox r1 = r11.f
            long r2 = defpackage.dprg.d(r1)
            r4 = 32
            long r2 = r2 >> r4
            ihs r5 = r11.c
            long r5 = r5.a
            long r7 = r5 >> r4
            int r2 = (int) r2
            float r2 = (float) r2
            int r3 = (int) r7
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r2 = r2 - r3
            long r7 = defpackage.dprg.d(r1)
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            long r5 = r5 & r9
            int r1 = (int) r5
            int r3 = (int) r7
            float r3 = (float) r3
            float r3 = r3 / r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r3 = r3 - r1
            r1 = 2
            r11.a = r1
            java.lang.Object r12 = r12.a(r2, r3, r4, r11)
            if (r12 != r0) goto L72
        L71:
            return r0
        L72:
            dprl r12 = r11.b
            java.lang.String r0 = "Finished handling double tap"
            defpackage.dprg.f(r12, r0)
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpre.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpre(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
