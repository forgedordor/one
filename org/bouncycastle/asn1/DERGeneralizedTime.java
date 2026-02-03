package org.bouncycastle.asn1;

import defpackage.ffwu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DERGeneralizedTime extends ASN1GeneralizedTime {
    public DERGeneralizedTime(String str) {
        super(str);
    }

    private final byte[] m() {
        byte[] bArr = this.b;
        int length = bArr.length;
        int i = length - 1;
        if (bArr[i] == 90) {
            if (!i()) {
                byte[] bArr2 = new byte[length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                System.arraycopy(ffwu.d("0000Z"), 0, bArr2, i, 5);
                return bArr2;
            }
            if (!j()) {
                byte[] bArr3 = new byte[length + 2];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                System.arraycopy(ffwu.d("00Z"), 0, bArr3, i, 3);
                return bArr3;
            }
            if (h()) {
                int i2 = length - 2;
                while (i2 > 0 && bArr[i2] == 48) {
                    i2--;
                }
                int i3 = i2 + 1;
                if (bArr[i2] == 46) {
                    byte[] bArr4 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr4, 0, i2);
                    bArr4[i2] = 90;
                    return bArr4;
                }
                byte[] bArr5 = new byte[i2 + 2];
                System.arraycopy(bArr, 0, bArr5, 0, i3);
                bArr5[i3] = 90;
                return bArr5;
            }
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, m().length);
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 24, m());
    }

    public DERGeneralizedTime(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
