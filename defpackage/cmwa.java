package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmwa {
    public final byte[] d;
    public final int e;
    public final diep f;
    public cmvz h;
    public int a = 3;
    public int b = 0;
    public int c = 0;
    public int g = 0;

    public cmwa(byte[] bArr, diep diepVar) {
        this.d = bArr;
        this.f = diepVar;
        this.e = bArr.length;
    }

    private final String b(byte[] bArr, int i) {
        if (cqca.q("Bugle", 3)) {
            cqca.c("Bugle", "getStringFromBytes, charSet is " + this.a);
        }
        int i2 = this.a;
        if (i2 == 4) {
            try {
                return new String(bArr, 0, i, "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                cqca.h("Bugle", e, " ISO-8859-1 UnsupportedEncodingException");
                return "";
            }
        }
        if (i2 == 106) {
            try {
                return new String(bArr, 0, i, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                cqca.h("Bugle", e2, " UTF-8 UnsupportedEncodingException");
                return "";
            }
        }
        try {
            return new String(bArr, 0, i, "US-ASCII");
        } catch (UnsupportedEncodingException e3) {
            cqca.h("Bugle", e3, " US-ASCII UnsupportedEncodingException");
            return "";
        }
    }

    public final String a() {
        int i;
        byte b;
        int i2;
        byte b2;
        byte[] bArr = this.d;
        int i3 = this.g;
        byte b3 = bArr[i3];
        int i4 = b3 & 255;
        int i5 = 0;
        if (i4 == 3) {
            int i6 = this.e;
            byte[] bArr2 = new byte[i6 + 1];
            if (b3 == 3) {
                this.g = i3 + 1;
                while (true) {
                    i = this.g;
                    if (i >= i6 || (b = bArr[i]) == 0) {
                        break;
                    }
                    this.g = i + 1;
                    bArr2[i5] = b;
                    i5++;
                }
                if (i == i6) {
                    return null;
                }
                this.g = i + 1;
            }
            return b(bArr2, i5);
        }
        if (i4 != 131) {
            return "";
        }
        if (cqca.q("Bugle", 3)) {
            cqca.c("Bugle", "parseStringTable, pos " + this.g + " table start " + this.b + " end " + this.c);
        }
        int i7 = this.g + 1;
        this.g = i7;
        int i8 = this.b + (bArr[i7] & 255);
        byte[] bArr3 = new byte[(this.c - i8) + 1];
        while (true) {
            i2 = this.c;
            if (i8 > i2 || (b2 = bArr[i8]) == 0) {
                break;
            }
            bArr3[i5] = b2;
            i8++;
            i5++;
        }
        if (i8 > i2) {
            return null;
        }
        this.g++;
        return b(bArr3, i5);
    }
}
