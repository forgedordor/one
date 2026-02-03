package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqy extends icr implements jgg, iqp {
    public iqp a;
    public iqt b;
    private iqy c;
    private final Object d;

    public iqy(iqp iqpVar, iqt iqtVar) {
        this.a = iqpVar;
        this.b = iqtVar == null ? new iqt() : iqtVar;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final iqp j() {
        if (this.C) {
            return f();
        }
        return null;
    }

    @Override // defpackage.iqp
    public final long a(long j, long j2, int i) {
        long jA = this.a.a(j, j2, i);
        iqp iqpVarJ = j();
        return ihs.e(jA, iqpVarJ != null ? iqpVarJ.a(ihs.e(j, jA), ihs.d(j2, jA), i) : 0L);
    }

    @Override // defpackage.iqp
    public final long b(long j, int i) {
        iqp iqpVarJ = j();
        long jB = iqpVarJ != null ? iqpVarJ.b(j, i) : 0L;
        return ihs.e(jB, this.a.b(ihs.d(j, jB), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r11, long r13, defpackage.fcxy r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.iqv
            if (r0 == 0) goto L13
            r0 = r15
            iqv r0 = (defpackage.iqv) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            iqv r0 = new iqv
            r0.<init>(r10, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.c
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L35
            if (r1 != r7) goto L2d
            long r11 = r6.a
            defpackage.fctl.b(r15)
            goto L77
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            long r13 = r6.b
            long r11 = r6.a
            defpackage.fctl.b(r15)
            goto L52
        L3d:
            defpackage.fctl.b(r15)
            iqp r1 = r10.a
            r6.a = r11
            r6.b = r13
            r6.e = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.c(r2, r4, r6)
            if (r15 == r0) goto L89
            r11 = r2
            r13 = r4
        L52:
            kjo r15 = (defpackage.kjo) r15
            long r8 = r15.a
            boolean r15 = r10.C
            if (r15 == 0) goto L5f
            iqp r15 = r10.j()
            goto L61
        L5f:
            iqy r15 = r10.c
        L61:
            r1 = r15
            if (r1 == 0) goto L7d
            long r2 = defpackage.kjo.d(r11, r8)
            long r4 = defpackage.kjo.c(r13, r8)
            r6.a = r8
            r6.e = r7
            java.lang.Object r15 = r1.c(r2, r4, r6)
            if (r15 == r0) goto L89
            r11 = r8
        L77:
            kjo r15 = (defpackage.kjo) r15
            long r13 = r15.a
            r8 = r11
            goto L7f
        L7d:
            r13 = 0
        L7f:
            long r11 = defpackage.kjo.d(r8, r13)
            kjo r13 = new kjo
            r13.<init>(r11)
            return r13
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqy.c(long, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r7, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.iqw
            if (r0 == 0) goto L13
            r0 = r9
            iqw r0 = (defpackage.iqw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            iqw r0 = new iqw
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r7 = r0.a
            defpackage.fctl.b(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            long r7 = r0.a
            defpackage.fctl.b(r9)
            goto L4d
        L3a:
            defpackage.fctl.b(r9)
            iqp r9 = r6.j()
            if (r9 == 0) goto L52
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L73
        L4d:
            kjo r9 = (defpackage.kjo) r9
            long r4 = r9.a
            goto L54
        L52:
            r4 = 0
        L54:
            iqp r9 = r6.a
            long r7 = defpackage.kjo.c(r7, r4)
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L73
            r7 = r4
        L65:
            kjo r9 = (defpackage.kjo) r9
            long r0 = r9.a
            long r7 = defpackage.kjo.d(r7, r0)
            kjo r9 = new kjo
            r9.<init>(r7)
            return r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqy.d(long, fcxy):java.lang.Object");
    }

    @Override // defpackage.icr
    public final void dU() {
        i();
    }

    @Override // defpackage.jgg
    public final Object dZ() {
        return this.d;
    }

    public final iqy f() {
        if (this.C) {
            return (iqy) jgh.a(this);
        }
        return null;
    }

    public final fdjx g() {
        fdjx fdjxVarG;
        iqy iqyVarF = f();
        if (iqyVarF != null && (fdjxVarG = iqyVarF.g()) != null) {
            return fdjxVarG;
        }
        fdjx fdjxVar = this.b.d;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void h() {
        iqt iqtVar = this.b;
        if (iqtVar.a == this) {
            iqtVar.a = null;
        }
    }

    public final void i() {
        iqt iqtVar = this.b;
        iqtVar.a = this;
        iqtVar.b = null;
        this.c = null;
        iqtVar.c = new iqx(this);
        iqtVar.d = E();
    }

    @Override // defpackage.icr
    public final void s() {
        fdci fdciVar = new fdci();
        jgh.b(this, new iqz(fdciVar));
        iqy iqyVar = (iqy) ((jgg) fdciVar.a);
        this.c = iqyVar;
        this.b.b = iqyVar;
        h();
    }
}
