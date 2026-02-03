package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eldw extends eldy {
    private eldw(eldu elduVar, Character ch) {
        super(elduVar, ch);
        ejwl.a(elduVar.b.length == 64);
    }

    @Override // defpackage.eldy, defpackage.eldz
    public final int a(byte[] bArr, CharSequence charSequence) throws eldx {
        CharSequence charSequenceH = h(charSequence);
        int length = charSequenceH.length();
        eldu elduVar = this.b;
        if (!elduVar.f(length)) {
            throw new eldx("Invalid input length " + charSequenceH.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceH.length()) {
            int i3 = i2 + 1;
            int iB = (elduVar.b(charSequenceH.charAt(i + 1)) << 12) | (elduVar.b(charSequenceH.charAt(i)) << 18);
            bArr[i2] = (byte) (iB >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceH.length()) {
                int i5 = i + 3;
                int iB2 = iB | (elduVar.b(charSequenceH.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iB2 >>> 8) & 255);
                if (i5 < charSequenceH.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iB2 | elduVar.b(charSequenceH.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.eldy
    public final eldz b(eldu elduVar, Character ch) {
        return new eldw(elduVar, ch);
    }

    @Override // defpackage.eldy, defpackage.eldz
    public final void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        ejwl.k(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            eldu elduVar = this.b;
            int i7 = (i5 << 8) | (i4 << 16) | i6;
            appendable.append(elduVar.a(i7 >>> 18));
            appendable.append(elduVar.a((i7 >>> 12) & 63));
            appendable.append(elduVar.a((i7 >>> 6) & 63));
            appendable.append(elduVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            i(appendable, bArr, i2, i - i2);
        }
    }

    public eldw(String str, String str2, Character ch) {
        this(new eldu(str, str2.toCharArray()), ch);
    }
}
