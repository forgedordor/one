package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmd implements fjz {
    private final boolean a;
    private final int b;
    private final int c;
    private final fil d;
    private final fij e;

    public fmd(boolean z, int i, int i2, fil filVar, fij fijVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = filVar;
        this.e = fijVar;
    }

    @Override // defpackage.fjz
    public final int a() {
        return this.c;
    }

    @Override // defpackage.fjz
    public final int b() {
        return 1;
    }

    @Override // defpackage.fjz
    public final int c() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // defpackage.fjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctu d(defpackage.fil r4) {
        /*
            r3 = this;
            boolean r0 = r4.c
            if (r0 != 0) goto Le
            fik r1 = r4.a
            fik r2 = r4.b
            int r1 = r1.a
            int r2 = r2.a
            if (r1 > r2) goto L1a
        Le:
            if (r0 == 0) goto L22
            fik r1 = r4.a
            fik r2 = r4.b
            int r1 = r1.a
            int r2 = r2.a
            if (r1 > r2) goto L22
        L1a:
            r0 = r0 ^ 1
            r1 = 3
            r2 = 0
            fil r4 = defpackage.fil.a(r4, r2, r2, r0, r1)
        L22:
            fij r0 = r3.e
            long r0 = r0.a
            ctu r4 = defpackage.ctv.b(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmd.d(fil):ctu");
    }

    @Override // defpackage.fjz
    public final fij e() {
        return this.e;
    }

    @Override // defpackage.fjz
    public final fij f() {
        return this.e;
    }

    @Override // defpackage.fjz
    public final fij g() {
        return this.e;
    }

    @Override // defpackage.fjz
    public final fij i() {
        return this.e;
    }

    @Override // defpackage.fjz
    public final fil j() {
        return this.d;
    }

    @Override // defpackage.fjz
    public final boolean l() {
        return this.a;
    }

    @Override // defpackage.fjz
    public final boolean m(fjz fjzVar) {
        if (this.d == null || fjzVar == null || !(fjzVar instanceof fmd)) {
            return true;
        }
        fmd fmdVar = (fmd) fjzVar;
        return (this.b == fmdVar.b && this.c == fmdVar.c && this.a == fmdVar.a && !this.e.e(fmdVar.e)) ? false : true;
    }

    @Override // defpackage.fjz
    public final int o() {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return this.e.f();
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + ((Object) fhz.a(o())) + ", info=\n\t" + this.e + ')';
    }

    @Override // defpackage.fjz
    public final void k(fdap fdapVar) {
    }
}
