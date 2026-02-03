package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ndh implements ngc {
    public final ngc a;
    public boolean b;
    final /* synthetic */ ndi c;

    public ndh(ndi ndiVar, ngc ngcVar) {
        this.c = ndiVar;
        this.a = ngcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    @Override // defpackage.ngc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.msa r12, defpackage.mix r13, int r14) {
        /*
            r11 = this;
            ndi r0 = r11.c
            boolean r1 = r0.p()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r11.b
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L13
            r13.a = r3
            return r4
        L13:
            long r5 = r0.c()
            ngc r1 = r11.a
            int r14 = r1.a(r12, r13, r14)
            r1 = -5
            r7 = -9223372036854775808
            if (r14 != r1) goto L54
            mau r13 = r12.b
            defpackage.mee.f(r13)
            int r14 = r13.J
            r2 = 0
            if (r14 != 0) goto L31
            int r14 = r13.K
            if (r14 == 0) goto L53
            r14 = r2
        L31:
            long r3 = r0.b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L3a
            r14 = r2
        L3a:
            long r3 = r0.c
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L41
            goto L43
        L41:
            int r2 = r13.K
        L43:
            mat r0 = new mat
            r0.<init>(r13)
            r0.H = r14
            r0.I = r2
            mau r13 = new mau
            r13.<init>(r0)
            r12.b = r13
        L53:
            return r1
        L54:
            long r0 = r0.c
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 == 0) goto L75
            if (r14 != r4) goto L62
            long r9 = r13.f
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 >= 0) goto L6c
        L62:
            if (r14 != r2) goto L75
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L75
            boolean r12 = r13.e
            if (r12 != 0) goto L75
        L6c:
            r13.eP()
            r13.a = r3
            r12 = 1
            r11.b = r12
            return r4
        L75:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndh.a(msa, mix, int):int");
    }

    @Override // defpackage.ngc
    public final int b(long j) {
        if (this.c.p()) {
            return -3;
        }
        return this.a.b(j);
    }

    @Override // defpackage.ngc
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.ngc
    public final boolean d() {
        return !this.c.p() && this.a.d();
    }
}
