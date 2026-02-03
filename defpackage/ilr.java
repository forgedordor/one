package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ilr {
    private final ilg a;
    private final ilg b;
    private final ilg c;

    public ilr(ilg ilgVar, ilg ilgVar2, ilg ilgVar3) {
        this.a = ilgVar;
        this.b = ilgVar2;
        this.c = ilgVar3;
    }

    public long a(long j) {
        ilg ilgVar = this.b;
        float fD = ije.d(j);
        float fC = ije.c(j);
        float fB = ije.b(j);
        long jD = ilgVar.d(fD, fC, fB);
        return this.c.e(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)), ilgVar.c(fD, fC, fB), ije.a(j), this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ilr(ilg ilgVar, ilg ilgVar2) {
        ilg ilgVarG;
        if (ilf.b(ilgVar.b, 12884901888L)) {
            imq imqVar = ilu.a;
            ilgVar = ilh.g(ilgVar, ilu.b);
        }
        if (ilf.b(ilgVar2.b, 12884901888L)) {
            imq imqVar2 = ilu.a;
            ilgVarG = ilh.g(ilgVar2, ilu.b);
        } else {
            ilgVarG = ilgVar2;
        }
        this(ilgVar2, ilgVar, ilgVarG);
    }
}
