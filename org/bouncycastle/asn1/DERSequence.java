package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DERSequence extends ASN1Sequence {
    private int c;

    public DERSequence() {
        this.c = -1;
    }

    private final int r() {
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        int length = this.b.length;
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iA += this.b[i2].p().k().a(true);
        }
        this.c = iA;
        return iA;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, r());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.m(z, 48);
        DEROutputStream dEROutputStreamD = aSN1OutputStream.d();
        int length = this.b.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            aSN1OutputStream.h(r());
            while (i < length) {
                this.b[i].p().k().b(dEROutputStreamD, true);
                i++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ASN1Primitive aSN1PrimitiveK = this.b[i2].p().k();
            aSN1PrimitiveArr[i2] = aSN1PrimitiveK;
            iA += aSN1PrimitiveK.a(true);
        }
        this.c = iA;
        aSN1OutputStream.h(iA);
        while (i < length) {
            aSN1PrimitiveArr[i].b(dEROutputStreamD, true);
            i++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1BitString g() {
        return new DERBitString(BERBitString.q(o()), (byte[]) null);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1OctetString i() {
        return new DEROctetString(BEROctetString.h(q()));
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1Set n() {
        return new DLSet(this.b);
    }

    public DERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.c = -1;
    }

    public DERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.c = -1;
    }

    public DERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
        this.c = -1;
    }

    public DERSequence(ASN1Encodable[] aSN1EncodableArr, byte[] bArr) {
        super(aSN1EncodableArr, null);
        this.c = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
