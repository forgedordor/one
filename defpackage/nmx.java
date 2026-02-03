package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmx {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    private nmx(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static nmx a(mfr mfrVar) {
        String strD;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            mfrVar.L(4);
            int iJ = (mfrVar.j() & 3) + 1;
            if (iJ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iJ2 = mfrVar.j() & 31;
            for (int i9 = 0; i9 < iJ2; i9++) {
                arrayList.add(b(mfrVar));
            }
            int iJ3 = mfrVar.j();
            for (int i10 = 0; i10 < iJ3; i10++) {
                arrayList.add(b(mfrVar));
            }
            if (iJ2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = mgy.a;
                mgx mgxVarI = mgy.i(bArr2, 4, bArr.length);
                int i11 = mgxVarI.e;
                int i12 = mgxVarI.f;
                int i13 = mgxVarI.h + 8;
                int i14 = mgxVarI.i + 8;
                int i15 = mgxVarI.j;
                int i16 = mgxVarI.k;
                int i17 = mgxVarI.l;
                int i18 = mgxVarI.m;
                float f2 = mgxVarI.g;
                strD = mek.d(mgxVarI.a, mgxVarI.b, mgxVarI.c);
                i4 = i16;
                i5 = i17;
                i6 = i18;
                f = f2;
                i2 = i12;
                i3 = i13;
                i7 = i14;
                i8 = i15;
                i = i11;
            } else {
                strD = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new nmx(arrayList, iJ, i, i2, i3, i7, i8, i4, i5, i6, f, strD);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new mby("Error parsing AVC config", e, true, 1);
        }
    }

    private static byte[] b(mfr mfrVar) {
        int iN = mfrVar.n();
        int i = mfrVar.b;
        mfrVar.L(iN);
        byte[] bArr = mfrVar.a;
        byte[] bArr2 = mek.a;
        byte[] bArr3 = new byte[iN + 4];
        System.arraycopy(mek.a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, iN);
        return bArr3;
    }
}
