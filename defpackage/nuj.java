package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nuj extends num {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] o = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean p;

    public static boolean d(mfr mfrVar, byte[] bArr) {
        if (mfrVar.a() < 8) {
            return false;
        }
        int i = mfrVar.b;
        byte[] bArr2 = new byte[8];
        mfrVar.F(bArr2, 0, 8);
        mfrVar.K(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.num
    protected final long a(mfr mfrVar) {
        byte[] bArr = mfrVar.a;
        return f(nom.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0));
    }

    @Override // defpackage.num
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.p = false;
        }
    }

    @Override // defpackage.num
    protected final boolean c(mfr mfrVar, long j, nuk nukVar) {
        if (d(mfrVar, a)) {
            byte[] bArrCopyOf = Arrays.copyOf(mfrVar.a, mfrVar.c);
            int i = bArrCopyOf[9] & 255;
            List listC = nom.c(bArrCopyOf);
            if (nukVar.a == null) {
                mat matVar = new mat();
                matVar.a("audio/ogg");
                matVar.c("audio/opus");
                matVar.E = i;
                matVar.F = 48000;
                matVar.p = listC;
                nukVar.a = new mau(matVar);
                return true;
            }
        } else {
            if (!d(mfrVar, o)) {
                mee.g(nukVar.a);
                return false;
            }
            mee.g(nukVar.a);
            if (!this.p) {
                this.p = true;
                mfrVar.L(8);
                mbt mbtVarB = npd.b(ekgb.p(npd.c(mfrVar, false, false).a));
                if (mbtVarB != null) {
                    mau mauVar = nukVar.a;
                    mat matVar2 = new mat(mauVar);
                    matVar2.k = mbtVarB.d(mauVar.l);
                    nukVar.a = new mau(matVar2);
                }
            }
        }
        return true;
    }
}
