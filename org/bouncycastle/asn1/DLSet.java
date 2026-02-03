package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DLSet extends ASN1Set {
    private int d;

    public DLSet() {
        this.d = -1;
    }

    private final int j() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        int iA = 0;
        for (ASN1Encodable aSN1Encodable : this.b) {
            iA += aSN1Encodable.p().l().a(true);
        }
        this.d = iA;
        return iA;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, j());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.m(z, 49);
        ASN1Encodable[] aSN1EncodableArr = this.b;
        DLOutputStream dLOutputStreamE = aSN1OutputStream.e();
        int length = aSN1EncodableArr.length;
        int i = 0;
        if (this.d >= 0 || length > 16) {
            aSN1OutputStream.h(j());
            while (i < length) {
                dLOutputStreamE.p(aSN1EncodableArr[i].p());
                i++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ASN1Primitive aSN1PrimitiveL = aSN1EncodableArr[i2].p().l();
            aSN1PrimitiveArr[i2] = aSN1PrimitiveL;
            iA += aSN1PrimitiveL.a(true);
        }
        this.d = iA;
        aSN1OutputStream.h(iA);
        while (i < length) {
            dLOutputStreamE.p(aSN1PrimitiveArr[i]);
            i++;
        }
    }

    public DLSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
        this.d = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr) {
        super(false, aSN1EncodableArr);
        this.d = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr, ASN1Encodable[] aSN1EncodableArr2) {
        super(aSN1EncodableArr, aSN1EncodableArr2);
        this.d = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
