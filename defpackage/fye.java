package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fye extends fcyz implements fdap {
    int a;
    final /* synthetic */ fyf b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ddz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fye(fyf fyfVar, float f, boolean z, ddz ddzVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fyfVar;
        this.c = f;
        this.d = z;
        this.e = ddzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r9.e(r3, r8) != r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            defpackage.fctl.b(r9)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L6d
            return r9
        Ld:
            fyf r9 = r8.b
            int r1 = r9.f()
            r3 = 0
            boolean r1 = defpackage.hbk.b(r1, r3)
            if (r1 == 0) goto L3e
            float r1 = r8.c
            int r1 = defpackage.fyf.n(r1)
            r4 = 12
            int r1 = r1 % r4
            float r1 = (float) r1
            r5 = 1057360530(0x3f060a92, float:0.5235988)
            float r1 = r1 * r5
            r9.c = r1
            hbl r5 = r9.a
            int r1 = defpackage.fyf.n(r1)
            int r1 = r1 % r4
            boolean r6 = defpackage.hbj.A(r9)
            if (r2 == r6) goto L38
            goto L39
        L38:
            r3 = r4
        L39:
            int r1 = r1 + r3
            r5.h(r1)
            goto L54
        L3e:
            float r1 = r8.c
            int r1 = defpackage.fyf.o(r1)
            float r1 = (float) r1
            r3 = 1037465424(0x3dd67750, float:0.10471976)
            float r1 = r1 * r3
            r9.d = r1
            hbl r3 = r9.a
            int r1 = defpackage.fyf.o(r1)
            r3.i(r1)
        L54:
            boolean r1 = r8.d
            if (r1 != 0) goto L70
            ddp r9 = r9.e
            float r1 = r8.c
            java.lang.Float r3 = new java.lang.Float
            float r1 = defpackage.fyf.m(r1)
            r3.<init>(r1)
            r8.a = r2
            java.lang.Object r9 = r9.e(r3, r8)
            if (r9 == r0) goto L90
        L6d:
            fctx r9 = defpackage.fctx.a
            return r9
        L70:
            float r1 = r8.c
            float r1 = defpackage.fyf.m(r1)
            float r1 = r9.a(r1)
            ddp r2 = r9.e
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r1)
            ddz r4 = r8.e
            r9 = 2
            r8.a = r9
            r5 = 0
            r7 = 12
            r6 = r8
            java.lang.Object r9 = defpackage.ddp.k(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L91
        L90:
            return r0
        L91:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fye.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fye(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
