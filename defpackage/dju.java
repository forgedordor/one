package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class dju extends fdbo implements fdap {
    public dju(Object obj) {
        super(1, obj, dkd.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    @Override // defpackage.fdap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r17
            java.lang.Object r2 = r1.g
            dkd r2 = (defpackage.dkd) r2
            if (r0 == 0) goto L14
            r2.j()
            goto L72
        L14:
            ebk r0 = r2.i
            if (r0 == 0) goto L6a
            cun r0 = r2.h
            java.lang.Object[] r3 = r0.c
            long[] r0 = r0.a
            int r4 = r0.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6a
            r5 = 0
            r6 = r5
        L25:
            r7 = r0[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L65
            int r9 = r6 - r4
            r10 = r5
        L38:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L5f
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            ebm r11 = (defpackage.ebm) r11
            fdjx r13 = r2.E()
            djx r14 = new djx
            r15 = 0
            r14.<init>(r2, r11, r15)
            r11 = 3
            defpackage.fdil.d(r13, r15, r15, r14, r11)
        L5f:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L38
        L63:
            if (r11 != r12) goto L6a
        L65:
            if (r6 == r4) goto L6a
            int r6 = r6 + 1
            goto L25
        L6a:
            cun r0 = r2.h
            r0.e()
            r2.k()
        L72:
            fctx r0 = defpackage.fctx.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dju.invoke(java.lang.Object):java.lang.Object");
    }
}
