package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqo extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ qqr d;
    final /* synthetic */ qnm e;
    final /* synthetic */ int f;
    final /* synthetic */ float g;
    final /* synthetic */ qrn h;
    final /* synthetic */ hox i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqo(boolean z, boolean z2, qqr qqrVar, qnm qnmVar, int i, float f, qrn qrnVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = z2;
        this.d = qqrVar;
        this.e = qnmVar;
        this.f = i;
        this.g = f;
        this.h = qrnVar;
        this.i = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qqo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (defpackage.qqq.b(r3, r4, r5, r6, r7, r8, 1, r12, 514) == r0) goto L18;
     */
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
            r2 = 1
            defpackage.fctl.b(r13)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2d
            goto L56
        Ld:
            boolean r13 = r12.b
            if (r13 == 0) goto L2d
            hox r13 = r12.i
            java.lang.Object r13 = r13.a()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L2d
            boolean r13 = r12.c
            if (r13 == 0) goto L2d
            qqr r13 = r12.d
            r12.a = r2
            java.lang.Object r13 = defpackage.qrb.b(r13, r12)
            if (r13 == r0) goto L55
        L2d:
            hox r13 = r12.i
            boolean r1 = r12.b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r13.b(r2)
            if (r1 == 0) goto L56
            qqr r3 = r12.d
            qnm r4 = r12.e
            int r5 = r12.f
            float r6 = r12.g
            qrn r7 = r12.h
            float r8 = r3.e()
            r13 = 2
            r12.a = r13
            r9 = 1
            r11 = 514(0x202, float:7.2E-43)
            r10 = r12
            java.lang.Object r13 = defpackage.qqq.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L56
        L55:
            return r0
        L56:
            fctx r13 = defpackage.fctx.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qqo(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, fcxyVar);
    }
}
