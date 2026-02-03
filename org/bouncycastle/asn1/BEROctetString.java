package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BEROctetString extends ASN1OctetString {
    private final ASN1OctetString[] d;

    public BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr) {
        super(bArr);
        this.d = aSN1OctetStringArr;
    }

    static byte[] h(ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length == 0) {
            return b;
        }
        if (length == 1) {
            return aSN1OctetStringArr[0].c;
        }
        int length2 = 0;
        for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
            length2 += aSN1OctetString.c.length;
        }
        byte[] bArr = new byte[length2];
        int i = 0;
        for (ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
            byte[] bArr2 = aSN1OctetString2.c;
            int length3 = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i, length3);
            i += length3;
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int iA = true != z ? 3 : 4;
        ASN1OctetString[] aSN1OctetStringArr = this.d;
        if (aSN1OctetStringArr != null) {
            for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
                iA += aSN1OctetString.a(true);
            }
            return iA;
        }
        int length = this.c.length;
        int i = length / 1000;
        int iH = iA + (DEROctetString.h(1000) * i);
        int i2 = length - (i * 1000);
        return i2 > 0 ? iH + DEROctetString.h(i2) : iH;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.m(z, 36);
        aSN1OutputStream.f(128);
        ASN1OctetString[] aSN1OctetStringArr = this.d;
        if (aSN1OctetStringArr == null) {
            int i = 0;
            while (true) {
                int length = this.c.length;
                if (i >= length) {
                    break;
                }
                int iMin = Math.min(length - i, 1000);
                aSN1OutputStream.k(true, 4, this.c, i, iMin);
                i += iMin;
            }
        } else {
            aSN1OutputStream.n(aSN1OctetStringArr);
        }
        aSN1OutputStream.f(0);
        aSN1OutputStream.f(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return true;
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(h(aSN1OctetStringArr), aSN1OctetStringArr);
    }
}
