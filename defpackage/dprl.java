package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprl {
    public final boolean a;
    public final ddp b;
    public final ddp c;
    public final hsf d;
    public final hsf e;
    public final hox f;
    public final hox g;
    public final hox h;
    public final hsf i;
    private final dplv j;

    public dprl(dplv dplvVar, boolean z) {
        this.j = dplvVar;
        this.a = z;
        ddp ddpVarA = ddq.a(1.0f);
        this.b = ddpVarA;
        ddp ddpVar = new ddp(new ihs(0L), diu.f, null, 12);
        this.c = ddpVar;
        this.d = ddpVarA.a;
        this.e = ddpVar.a;
        kjg kjgVar = new kjg(0L);
        hsi hsiVar = hsi.a;
        this.f = new hpl(kjgVar, hsiVar);
        hpl hplVar = new hpl(false, hsiVar);
        this.g = hplVar;
        this.h = new hpl(false, hsiVar);
        this.i = hplVar;
    }

    private final long d(float f, float f2, float f3) {
        hox hoxVar = this.f;
        long j = ((kjg) hoxVar.a()).a >> 32;
        long j2 = ((kjg) hoxVar.a()).a & 4294967295L;
        dplv dplvVar = this.j;
        int iB = kil.b(dplvVar.a());
        int iA = kil.a(dplvVar.a());
        float fE = e(((int) j) * f3, iB);
        float fE2 = fddu.e(f, -fE, fE);
        float fE3 = e(((int) j2) * f3, iA);
        float fE4 = fddu.e(f2, -fE3, fE3);
        return (Float.floatToRawIntBits(fE4) & 4294967295L) | (Float.floatToRawIntBits(fE2) << 32);
    }

    private static final float e(float f, float f2) {
        return fddu.c((f - f2) / 2.0f, 0.0f);
    }

    public final Object a(float f, float f2, float f3, fcxy fcxyVar) {
        Object objA = fdjy.a(new dprj(this, d(f, f2, f3), f3, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
    
        if (r12.e(r13, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, float r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.dprk
            if (r0 == 0) goto L13
            r0 = r13
            dprk r0 = (defpackage.dprk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dprk r0 = new dprk
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            defpackage.fctl.b(r13)
            goto Lc3
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            long r10 = r0.a
            defpackage.fctl.b(r13)
            goto L60
        L3b:
            defpackage.fctl.b(r13)
            ddp r13 = r9.b
            java.lang.Object r2 = r13.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 * r12
            r12 = 1082130432(0x40800000, float:4.0)
            float r12 = defpackage.fddu.e(r2, r3, r12)
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r12)
            r0.a = r10
            r0.d = r5
            java.lang.Object r12 = r13.e(r2, r0)
            if (r12 == r1) goto Lc6
        L60:
            ddp r12 = r9.c
            ddp r13 = r9.b
            java.lang.Object r2 = r13.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L75
            r10 = 0
            goto Lb5
        L75:
            java.lang.Object r2 = r12.d()
            ihs r2 = (defpackage.ihs) r2
            long r2 = r2.a
            r5 = 32
            long r2 = r2 >> r5
            long r5 = r10 >> r5
            int r5 = (int) r5
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r3 = java.lang.Float.intBitsToFloat(r5)
            float r2 = r2 + r3
            java.lang.Object r3 = r12.d()
            ihs r3 = (defpackage.ihs) r3
            long r5 = r3.a
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r10 = r10 & r7
            int r10 = (int) r10
            int r11 = (int) r5
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r11 = r11 + r10
            java.lang.Object r10 = r13.d()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            long r10 = r9.d(r2, r11, r10)
        Lb5:
            ihs r13 = new ihs
            r13.<init>(r10)
            r0.d = r4
            java.lang.Object r10 = r12.e(r13, r0)
            if (r10 != r1) goto Lc3
            goto Lc6
        Lc3:
            fctx r10 = defpackage.fctx.a
            return r10
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprl.b(long, float, fcxy):java.lang.Object");
    }

    public final boolean c() {
        return (((Number) this.d.a()).floatValue() == 1.0f && ihs.h(((ihs) this.e.a()).a, 0L)) || ((Boolean) this.h.a()).booleanValue();
    }
}
