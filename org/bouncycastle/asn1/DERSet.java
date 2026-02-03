package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DERSet extends ASN1Set {
    private int d;

    public DERSet() {
        this.d = -1;
    }

    private final int j() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        int iA = 0;
        for (ASN1Encodable aSN1Encodable : this.b) {
            iA += aSN1Encodable.p().k().a(true);
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
        DEROutputStream dEROutputStreamD = aSN1OutputStream.d();
        ASN1Encodable[] aSN1EncodableArr = this.b;
        int length = aSN1EncodableArr.length;
        int i = 0;
        if (this.d >= 0 || length > 16) {
            aSN1OutputStream.h(j());
            while (i < length) {
                aSN1EncodableArr[i].p().k().b(dEROutputStreamD, true);
                i++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ASN1Primitive aSN1PrimitiveK = aSN1EncodableArr[i2].p().k();
            aSN1PrimitiveArr[i2] = aSN1PrimitiveK;
            iA += aSN1PrimitiveK.a(true);
        }
        this.d = iA;
        aSN1OutputStream.h(iA);
        while (i < length) {
            aSN1PrimitiveArr[i].b(dEROutputStreamD, true);
            i++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        return this.c != null ? this : super.k();
    }

    public DERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.d = -1;
    }

    public DERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, true);
        this.d = -1;
    }

    public DERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(true, aSN1EncodableArr);
        this.d = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
