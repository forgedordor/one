package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fflj extends ffln {
    public final int a() {
        int iC = c();
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(iC);
        ffln fflnVarE = this;
        int i = 1;
        while (iNumberOfLeadingZeros > 0) {
            fflnVarE = fflnVarE.p(i).e(fflnVarE);
            iNumberOfLeadingZeros--;
            i = iC >>> iNumberOfLeadingZeros;
            if ((i & 1) != 0) {
                fflnVarE = fflnVarE.n().e(this);
            }
        }
        if (fflnVarE.s()) {
            return 0;
        }
        if (fflnVarE.r()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }
}
