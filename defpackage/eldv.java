package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldv extends eldy {
    final char[] a;

    public eldv(eldu elduVar) {
        super(elduVar, null);
        this.a = new char[512];
        ejwl.a(elduVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = elduVar.a(i >>> 4);
            this.a[i | 256] = elduVar.a(i & 15);
        }
    }

    @Override // defpackage.eldy, defpackage.eldz
    public final int a(byte[] bArr, CharSequence charSequence) throws eldx {
        if (charSequence.length() % 2 == 1) {
            throw new eldx("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            eldu elduVar = this.b;
            bArr[i2] = (byte) (elduVar.b(charSequence.charAt(i + 1)) | (elduVar.b(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.eldy
    public final eldz b(eldu elduVar, Character ch) {
        return new eldv(elduVar);
    }

    @Override // defpackage.eldy, defpackage.eldz
    public final void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        ejwl.k(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }
}
