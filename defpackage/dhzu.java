package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzu {
    public static final elcu a;

    static {
        int i = elcz.a;
        elcu elcuVar = elcx.a;
        elcuVar.getClass();
        a = elcuVar;
    }

    public static final byte[] a(byte[] bArr, byte[] bArr2) {
        Object[] objArr;
        bArr.getClass();
        bArr2.getClass();
        elcu elcuVar = a;
        fdbe fdbeVar = new fdbe();
        byte[] bArr3 = fdbeVar.a;
        int i = fdbeVar.b;
        fdbeVar.b = i + 1;
        bArr3[i] = 1;
        fdbeVar.b(bArr);
        fdbeVar.b(bArr2);
        int i2 = 0;
        int iA = 0;
        while (true) {
            objArr = fdbeVar.c;
            Object obj = objArr[i2];
            iA += obj != null ? fdbeVar.a(obj) : 1;
            if (i2 == 2) {
                break;
            }
            i2++;
        }
        byte[] bArr4 = new byte[iA];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            Object obj2 = objArr[i3];
            if (obj2 != null) {
                if (i4 < i3) {
                    int i6 = i3 - i4;
                    System.arraycopy(bArr3, i4, bArr4, i5, i6);
                    i5 += i6;
                }
                int iA2 = fdbeVar.a(obj2);
                System.arraycopy(obj2, 0, bArr4, i5, iA2);
                i5 += iA2;
                i4 = i3 + 1;
            }
            if (i3 == 2) {
                break;
            }
            i3++;
        }
        if (i4 < 3) {
            System.arraycopy(bArr3, i4, bArr4, i5, 3 - i4);
        }
        byte[] bArrE = elcuVar.b(bArr4).e();
        bArrE.getClass();
        return bArrE;
    }
}
