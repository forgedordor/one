package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BERBitString extends ASN1BitString {
    private final ASN1BitString[] c;

    public BERBitString(byte[] bArr, int i) {
        super(bArr, i);
        this.c = null;
    }

    static byte[] q(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return aSN1BitStringArr[0].b;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            if (aSN1BitStringArr[i2].b[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += r6.length - 1;
        }
        byte[] bArr = aSN1BitStringArr[i].b;
        byte b = bArr[0];
        byte[] bArr2 = new byte[length2 + bArr.length];
        bArr2[0] = b;
        int i3 = 1;
        for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
            byte[] bArr3 = aSN1BitString.b;
            int length3 = bArr3.length - 1;
            System.arraycopy(bArr3, 1, bArr2, i3, length3);
            i3 += length3;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        if (!d()) {
            int length = this.b.length;
            int i = DLBitString.c;
            return ASN1OutputStream.b(z, length);
        }
        int iA = true != z ? 3 : 4;
        ASN1BitString[] aSN1BitStringArr = this.c;
        if (aSN1BitStringArr != null) {
            for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
                iA += aSN1BitString.a(true);
            }
            return iA;
        }
        int length2 = this.b.length;
        if (length2 < 2) {
            return iA;
        }
        int i2 = DLBitString.c;
        int i3 = (length2 - 2) / 999;
        return iA + (ASN1OutputStream.b(true, 1000) * i3) + ASN1OutputStream.b(true, length2 - (i3 * 999));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        if (!d()) {
            byte[] bArr = this.b;
            int length = bArr.length;
            int i = DLBitString.c;
            aSN1OutputStream.k(z, 3, bArr, 0, length);
            return;
        }
        aSN1OutputStream.m(z, 35);
        aSN1OutputStream.f(128);
        ASN1BitString[] aSN1BitStringArr = this.c;
        if (aSN1BitStringArr != null) {
            aSN1OutputStream.n(aSN1BitStringArr);
        } else {
            byte[] bArr2 = this.b;
            int length2 = bArr2.length;
            if (length2 >= 2) {
                byte b = bArr2[0];
                int i2 = length2 - 1;
                while (i2 > 999) {
                    DLBitString.q(aSN1OutputStream, (byte) 0, bArr2, length2 - i2, 999);
                    i2 -= 999;
                }
                DLBitString.q(aSN1OutputStream, b, bArr2, length2 - i2, i2);
            }
        }
        aSN1OutputStream.f(0);
        aSN1OutputStream.f(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return this.c != null || this.b.length > 1000;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        super(q(aSN1BitStringArr));
        this.c = aSN1BitStringArr;
    }
}
