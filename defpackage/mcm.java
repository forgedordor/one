package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcm {
    public final int a;
    public final String b;
    public final int c;
    public final mau[] d;
    private int e;

    static {
        mgb.O(0);
        mgb.O(1);
    }

    public mcm(String str, mau... mauVarArr) {
        int length = mauVarArr.length;
        int i = 1;
        mee.a(length > 0);
        this.b = str;
        this.d = mauVarArr;
        this.a = length;
        int iB = mbw.b(mauVarArr[0].o);
        this.c = iB == -1 ? mbw.b(mauVarArr[0].n) : iB;
        String strC = c(mauVarArr[0].d);
        int iB2 = b(mauVarArr[0].f);
        while (true) {
            mau[] mauVarArr2 = this.d;
            if (i >= mauVarArr2.length) {
                return;
            }
            if (!strC.equals(c(mauVarArr2[i].d))) {
                mau[] mauVarArr3 = this.d;
                d("languages", mauVarArr3[0].d, mauVarArr3[i].d, i);
                return;
            } else {
                mau[] mauVarArr4 = this.d;
                if (iB2 != b(mauVarArr4[i].f)) {
                    d("role flags", Integer.toBinaryString(mauVarArr4[0].f), Integer.toBinaryString(this.d[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    private static int b(int i) {
        return i | 16384;
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i) {
        mff.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final mau a(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mcm mcmVar = (mcm) obj;
            if (this.b.equals(mcmVar.b) && Arrays.equals(this.d, mcmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.d);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
