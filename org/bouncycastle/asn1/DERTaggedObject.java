package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DERTaggedObject extends ASN1TaggedObject {
    public DERTaggedObject(int i, int i2, int i3, ASN1Encodable aSN1Encodable) {
        super(i, i2, i3, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        ASN1Primitive aSN1PrimitiveK = this.d.p().k();
        boolean zO = o();
        int iA = aSN1PrimitiveK.a(zO);
        if (zO) {
            iA += ASN1OutputStream.a(iA);
        }
        return iA + (z ? ASN1OutputStream.c(this.c) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        ASN1Primitive aSN1PrimitiveK = this.d.p().k();
        boolean zO = o();
        if (z) {
            int i = this.b;
            if (zO || aSN1PrimitiveK.d()) {
                i |= 32;
            }
            aSN1OutputStream.o(i, this.c);
        }
        if (zO) {
            aSN1OutputStream.h(aSN1PrimitiveK.a(true));
        }
        aSN1PrimitiveK.b(aSN1OutputStream.d(), zO);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return o() || this.d.p().k().d();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public final ASN1Sequence m(ASN1Primitive aSN1Primitive) {
        return new DERSequence(aSN1Primitive);
    }

    public DERTaggedObject(ASN1Encodable aSN1Encodable) {
        super(true, 0, aSN1Encodable);
    }

    public DERTaggedObject(boolean z, int i, ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
