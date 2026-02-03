package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldm extends elcj implements Serializable {
    public static final elcu a = new eldm();
    private static final long serialVersionUID = 0;
    private final int b = 0;
    private final boolean c = true;

    static {
        int i = elcz.a;
    }

    public static int h(byte[] bArr, int i) {
        return eonc.c(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    public static int i(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static int j(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public static long k(char c) {
        int i = ((c >>> 6) & 63) | 128;
        return (i << 8) | (c >>> '\f') | 224 | (((c & '?') | 128) << 16);
    }

    public static long l(char c) {
        return (c >>> 6) | 192 | (((c & '?') | 128) << 8);
    }

    public static long m(int i) {
        return (((i & 63) | 128) << 24) | ((((i >>> 12) & 63) | 128) << 8) | (i >>> 18) | 240 | ((((i >>> 6) & 63) | 128) << 16);
    }

    public static elct n(int i, int i2) {
        int i3 = elct.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new elcr(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.elcj, defpackage.elcu
    public final elct c(CharSequence charSequence, Charset charset) {
        long jK;
        if (!charset.equals(StandardCharsets.UTF_8)) {
            return b(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 + 4;
            jK = 0;
            if (i5 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = charSequence.charAt(i2 + 1);
            char cCharAt3 = charSequence.charAt(i2 + 2);
            char cCharAt4 = charSequence.charAt(i2 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            i3 = i(i3, j((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i4 += 4;
            i2 = i5;
        }
        while (i2 < length) {
            char cCharAt5 = charSequence.charAt(i2);
            if (cCharAt5 < 128) {
                jK |= cCharAt5 << i;
                i4++;
                i += 8;
            } else if (cCharAt5 < 2048) {
                jK |= l(cCharAt5) << i;
                i4 += 2;
                i += 16;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jK |= k(cCharAt5) << i;
                i4 += 3;
                i += 24;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i2);
                if (iCodePointAt == cCharAt5) {
                    return b(charSequence.toString().getBytes(charset));
                }
                jK |= m(iCodePointAt) << i;
                i4 += 4;
                i += 32;
                i2++;
            }
            if (i >= 32) {
                i3 = i(i3, j((int) jK));
                jK >>>= 32;
                i -= 32;
            }
            i2++;
        }
        return n(j((int) jK) ^ i3, i4);
    }

    @Override // defpackage.elcj
    public final elct e(byte[] bArr, int i) {
        int i2 = 0;
        ejwl.k(0, i, bArr.length);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + 4;
            if (i5 > i) {
                break;
            }
            i4 = i(i4, j(h(bArr, i3)));
            i3 = i5;
        }
        int i6 = 0;
        while (i3 < i) {
            i2 ^= (bArr[i3] & 255) << i6;
            i3++;
            i6 += 8;
        }
        return n(j(i2) ^ i4, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eldm)) {
            return false;
        }
        eldm eldmVar = (eldm) obj;
        int i = eldmVar.b;
        boolean z = eldmVar.c;
        return true;
    }

    @Override // defpackage.elcu
    public final elcv f() {
        return new eldl();
    }

    @Override // defpackage.elcu
    public final int g() {
        throw null;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_32(0)";
    }
}
