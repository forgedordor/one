package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nzi implements nnd {
    private final mfy a;
    private final mfr b = new mfr();
    private final int c;

    public nzi(int i, mfy mfyVar) {
        this.c = i;
        this.a = mfyVar;
    }

    @Override // defpackage.nnd
    public final nnc a(nns nnsVar, long j) {
        int iA;
        int iA2;
        nni nniVar = (nni) nnsVar;
        long j2 = nniVar.a;
        long j3 = nniVar.b;
        int iMin = (int) Math.min(112800L, j2 - j3);
        mfr mfrVar = this.b;
        mfrVar.G(iMin);
        nnsVar.i(mfrVar.a, 0, iMin);
        int i = mfrVar.c;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        long j6 = -1;
        while (mfrVar.a() >= 188 && (iA2 = (iA = nzs.a(mfrVar.a, mfrVar.b, i)) + 188) <= i) {
            long jB = nzs.b(mfrVar, iA, this.c);
            if (jB != -9223372036854775807L) {
                long jB2 = this.a.b(jB);
                if (jB2 > j) {
                    return j5 == -9223372036854775807L ? new nnc(-1, jB2, j3) : new nnc(0, -9223372036854775807L, j3 + j6);
                }
                j5 = jB2;
                long j7 = iA;
                if (100000 + j5 > j) {
                    return new nnc(0, -9223372036854775807L, j3 + j7);
                }
                j6 = j7;
            }
            mfrVar.K(iA2);
            j4 = iA2;
        }
        return j5 != -9223372036854775807L ? new nnc(-2, j5, j3 + j4) : nnc.a;
    }

    @Override // defpackage.nnd
    public final void b() {
        this.b.H(mgb.b);
    }
}
