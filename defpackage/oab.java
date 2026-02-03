package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oab {
    public static oaa a(int i, nns nnsVar, mfr mfrVar) throws mby {
        oaa oaaVarA = oaa.a(nnsVar, mfrVar);
        while (true) {
            int i2 = oaaVarA.a;
            if (i2 == i) {
                return oaaVarA;
            }
            mff.f("WavHeaderReader", a.g(i2, "Ignoring unknown WAV chunk: "));
            long j = oaaVarA.b;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw new mby(a.g(i2, "Chunk is too large (~2GB+) to skip; id: "), null, false, 1);
            }
            nnsVar.l((int) j2);
            oaaVarA = oaa.a(nnsVar, mfrVar);
        }
    }

    public static boolean b(nns nnsVar) {
        mfr mfrVar = new mfr(8);
        int i = oaa.a(nnsVar, mfrVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        nnsVar.i(mfrVar.a, 0, 4);
        mfrVar.K(0);
        int iE = mfrVar.e();
        if (iE == 1463899717) {
            return true;
        }
        mff.c("WavHeaderReader", a.g(iE, "Unsupported form type: "));
        return false;
    }
}
