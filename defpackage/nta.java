package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nta implements nsx {
    private final int a;
    private final int b;
    private final mfr c;

    public nta(mgh mghVar, mau mauVar) {
        mfr mfrVar = mghVar.a;
        this.c = mfrVar;
        mfrVar.K(12);
        int iM = mfrVar.m();
        if ("audio/raw".equals(mauVar.o)) {
            int iO = mgb.o(mauVar.I, mauVar.G);
            if (iM == 0 || iM % iO != 0) {
                mff.f("BoxParsers", a.s(iM, iO, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                iM = iO;
            }
        }
        this.a = iM == 0 ? -1 : iM;
        this.b = mfrVar.m();
    }

    @Override // defpackage.nsx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nsx
    public final int b() {
        return this.b;
    }

    @Override // defpackage.nsx
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.m() : i;
    }
}
