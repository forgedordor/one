package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnz {
    public static mbt a(nns nnsVar, boolean z) {
        mbt mbtVarA = new noh().a(nnsVar, z ? null : nrf.a);
        if (mbtVarA == null || mbtVarA.a() == 0) {
            return null;
        }
        return mbtVarA;
    }

    public static nob b(mfr mfrVar) {
        mfrVar.L(1);
        int iL = mfrVar.l();
        long j = mfrVar.b;
        long j2 = iL;
        int i = iL / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jQ = mfrVar.q();
            if (jQ == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jQ;
            jArrCopyOf2[i2] = mfrVar.q();
            mfrVar.L(2);
            i2++;
        }
        mfrVar.L((int) ((j + j2) - mfrVar.b));
        return new nob(jArrCopyOf, jArrCopyOf2);
    }
}
