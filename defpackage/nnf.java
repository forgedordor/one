package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnf {
    public static void a(long j, mfr mfrVar, nox[] noxVarArr) {
        int iE;
        while (true) {
            if (mfrVar.a() <= 1) {
                return;
            }
            int iC = c(mfrVar);
            int iC2 = c(mfrVar);
            int i = mfrVar.b + iC2;
            if (iC2 == -1 || iC2 > mfrVar.a()) {
                mff.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i = mfrVar.c;
            } else if (iC == 4 && iC2 >= 8) {
                int iJ = mfrVar.j();
                int iN = mfrVar.n();
                if (iN == 49) {
                    iE = mfrVar.e();
                    iN = 49;
                } else {
                    iE = 0;
                }
                int iJ2 = mfrVar.j();
                if (iN == 47) {
                    mfrVar.L(1);
                    iN = 47;
                }
                boolean z = iJ == 181 && (iN == 49 || iN == 47) && iJ2 == 3;
                if (iN == 49) {
                    z &= iE == 1195456820;
                }
                if (z) {
                    b(j, mfrVar, noxVarArr);
                }
            }
            mfrVar.K(i);
        }
    }

    public static void b(long j, mfr mfrVar, nox[] noxVarArr) {
        int iJ = mfrVar.j();
        if ((iJ & 64) != 0) {
            int i = iJ & 31;
            mfrVar.L(1);
            int i2 = mfrVar.b;
            for (nox noxVar : noxVarArr) {
                int i3 = i * 3;
                mfrVar.K(i2);
                noxVar.m(mfrVar, i3);
                mee.c(j != -9223372036854775807L);
                noxVar.o(j, 1, i3, 0, null);
            }
        }
    }

    private static int c(mfr mfrVar) {
        int i = 0;
        while (mfrVar.a() != 0) {
            int iJ = mfrVar.j();
            i += iJ;
            if (iJ != 255) {
                return i;
            }
        }
        return -1;
    }
}
