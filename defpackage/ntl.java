package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ntl {
    public static int a(mfr mfrVar) {
        int iE = mfrVar.e();
        if (mfrVar.e() == 1684108385) {
            mfrVar.L(8);
            int i = iE - 16;
            if (i == 1) {
                return mfrVar.j();
            }
            if (i == 2) {
                return mfrVar.n();
            }
            if (i == 3) {
                return mfrVar.l();
            }
            if (i == 4 && (mfrVar.d() & 128) == 0) {
                return mfrVar.m();
            }
        }
        mff.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static nrg b(int i, String str, mfr mfrVar, boolean z, boolean z2) {
        int iA = a(mfrVar);
        if (z2) {
            iA = Math.min(1, iA);
        }
        if (iA >= 0) {
            return z ? new nrl(str, null, ekgb.r(Integer.toString(iA))) : new nrb("und", str, Integer.toString(iA));
        }
        mff.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(mgi.e(i)));
        return null;
    }

    public static nrl c(int i, String str, mfr mfrVar) {
        int iE = mfrVar.e();
        if (mfrVar.e() == 1684108385 && iE >= 22) {
            mfrVar.L(10);
            int iN = mfrVar.n();
            if (iN > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iN);
                String string = sb.toString();
                int iN2 = mfrVar.n();
                if (iN2 > 0) {
                    string = a.f(iN2, string, "/");
                }
                return new nrl(str, null, ekgb.r(string));
            }
        }
        mff.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(mgi.e(i)));
        return null;
    }

    public static nrl d(int i, String str, mfr mfrVar) {
        int iE = mfrVar.e();
        if (mfrVar.e() == 1684108385) {
            mfrVar.L(8);
            return new nrl(str, null, ekgb.r(mfrVar.x(iE - 16)));
        }
        mff.f("MetadataUtil", "Failed to parse text attribute: ".concat(mgi.e(i)));
        return null;
    }
}
