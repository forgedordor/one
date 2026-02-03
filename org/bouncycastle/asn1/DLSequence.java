package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DLSequence extends ASN1Sequence {
    private int c;

    public DLSequence() {
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
            iA += this.b[i2].p().l().a(true);
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
        DLOutputStream dLOutputStreamE = aSN1OutputStream.e();
        int length = this.b.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            aSN1OutputStream.h(r());
            while (i < length) {
                dLOutputStreamE.p(this.b[i].p());
                i++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ASN1Primitive aSN1PrimitiveL = this.b[i2].p().l();
            aSN1PrimitiveArr[i2] = aSN1PrimitiveL;
            iA += aSN1PrimitiveL.a(true);
        }
        this.c = iA;
        aSN1OutputStream.h(iA);
        while (i < length) {
            dLOutputStreamE.p(aSN1PrimitiveArr[i]);
            i++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1BitString g() {
        return new DLBitString(BERBitString.q(o()));
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1OctetString i() {
        return new DEROctetString(BEROctetString.h(q()));
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1Set n() {
        return new DLSet(this.b);
    }

    public DLSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.c = -1;
    }

    public DLSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.c = -1;
    }

    public DLSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, null);
        this.c = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
