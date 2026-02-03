package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fflp extends ffls {
    protected fflp(ffli ffliVar, ffln fflnVar, ffln fflnVar2) {
        super(ffliVar, fflnVar, fflnVar2);
    }

    @Override // defpackage.ffls
    public final boolean a() {
        ffln fflnVar = this.c;
        ffln fflnVar2 = this.d;
        ffli ffliVar = this.b;
        ffln fflnVarI = ffliVar.e;
        ffln fflnVarI2 = ffliVar.f;
        ffln fflnVarN = fflnVar2.n();
        int iJ = j();
        if (iJ != 0) {
            if (iJ == 1) {
                ffln fflnVar3 = this.e[0];
                if (!fflnVar3.r()) {
                    ffln fflnVarN2 = fflnVar3.n();
                    ffln fflnVarI3 = fflnVar3.i(fflnVarN2);
                    fflnVarN = fflnVarN.i(fflnVar3);
                    fflnVarI = fflnVarI.i(fflnVarN2);
                    fflnVarI2 = fflnVarI2.i(fflnVarI3);
                }
            } else {
                if (iJ != 2 && iJ != 3 && iJ != 4) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                ffln fflnVar4 = this.e[0];
                if (!fflnVar4.r()) {
                    ffln fflnVarN3 = fflnVar4.n();
                    ffln fflnVarN4 = fflnVarN3.n();
                    ffln fflnVarI4 = fflnVarN3.i(fflnVarN4);
                    fflnVarI = fflnVarI.i(fflnVarN4);
                    fflnVarI2 = fflnVarI2.i(fflnVarI4);
                }
            }
        }
        return fflnVarN.equals(fflnVar.n().e(fflnVarI).i(fflnVar).e(fflnVarI2));
    }

    protected fflp(ffli ffliVar, ffln fflnVar, ffln fflnVar2, ffln[] fflnVarArr) {
        super(ffliVar, fflnVar, fflnVar2, fflnVarArr);
    }
}
