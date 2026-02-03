package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nps implements nnd {
    private final noc a;
    private final int b;
    private final nnx c = new nnx();

    public nps(noc nocVar, int i) {
        this.a = nocVar;
        this.b = i;
    }

    private final long c(nns nnsVar) {
        long j;
        long j2;
        while (true) {
            long jE = nnsVar.e();
            nni nniVar = (nni) nnsVar;
            long j3 = nniVar.a;
            j = (-6) + j3;
            if (jE >= j) {
                j2 = j3;
                break;
            }
            noc nocVar = this.a;
            int i = this.b;
            nnx nnxVar = this.c;
            long jE2 = nnsVar.e();
            byte[] bArr = new byte[2];
            nnsVar.i(bArr, 0, 2);
            if (((bArr[1] & 255) | ((bArr[0] & 255) << 8)) != i) {
                nnsVar.k();
                nnsVar.g((int) (jE2 - nniVar.b));
            } else {
                mfr mfrVar = new mfr(16);
                j2 = j3;
                System.arraycopy(bArr, 0, mfrVar.a, 0, 2);
                mfrVar.J(nnv.a(nnsVar, mfrVar.a, 2, 14));
                nnsVar.k();
                nnsVar.g((int) (jE2 - nniVar.b));
                if (nny.c(mfrVar, nocVar, i, nnxVar)) {
                    break;
                }
            }
            nnsVar.g(1);
        }
        if (nnsVar.e() < j) {
            return this.c.a;
        }
        nnsVar.g((int) (j2 - nnsVar.e()));
        return this.a.j;
    }

    @Override // defpackage.nnd
    public final nnc a(nns nnsVar, long j) {
        long j2 = ((nni) nnsVar).b;
        int i = this.a.c;
        long jC = c(nnsVar);
        long jE = nnsVar.e();
        nnsVar.g(Math.max(6, i));
        long jC2 = c(nnsVar);
        return (jC > j || jC2 <= j) ? jC2 <= j ? new nnc(-2, jC2, nnsVar.e()) : new nnc(-1, jC, j2) : new nnc(0, -9223372036854775807L, jE);
    }

    @Override // defpackage.nnd
    public final /* synthetic */ void b() {
    }
}
