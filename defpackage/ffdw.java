package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdw {
    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int iA;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = (i3 + length) / 2;
            while (i4 >= 0 && bArr[i4] != 10) {
                i4--;
            }
            int i5 = i4 + 1;
            int i6 = 1;
            while (true) {
                i2 = i5 + i6;
                if (bArr[i2] == 10) {
                    break;
                }
                i6++;
            }
            int i7 = i2 - i5;
            int i8 = i;
            boolean z = false;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iA = (z ? 46 : fezr.A(bArr2[i8][i9])) - fezr.A(bArr[i5 + i10]);
                if (iA != 0) {
                    break;
                }
                i10++;
                i9++;
                if (i10 == i7) {
                    break;
                }
                if (bArr2[i8].length != i9) {
                    z = false;
                } else {
                    if (i8 == bArr2.length - 1) {
                        break;
                    }
                    i8++;
                    z = true;
                    i9 = -1;
                }
            }
            iA = 0;
            if (iA >= 0) {
                if (iA <= 0) {
                    int i11 = i7 - i10;
                    int length2 = bArr2[i8].length - i9;
                    int length3 = bArr2.length;
                    for (int i12 = i8 + 1; i12 < length3; i12++) {
                        length2 += bArr2[i12].length;
                    }
                    if (length2 >= i11) {
                        if (length2 <= i11) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i5, i7, charset);
                        }
                    }
                }
                i3 = i2 + 1;
            }
            length = i4;
        }
        return null;
    }
}
