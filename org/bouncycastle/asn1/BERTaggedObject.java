package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    public BERTaggedObject(int i, int i2, int i3, ASN1Encodable aSN1Encodable) {
        super(i, i2, i3, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        ASN1Primitive aSN1PrimitiveP = this.d.p();
        boolean zO = o();
        int iA = aSN1PrimitiveP.a(zO);
        if (zO) {
            iA += 3;
        }
        return iA + (z ? ASN1OutputStream.c(this.c) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        ASN1Primitive aSN1PrimitiveP = this.d.p();
        boolean zO = o();
        if (z) {
            int i = this.b;
            if (zO || aSN1PrimitiveP.d()) {
                i |= 32;
            }
            aSN1OutputStream.o(i, this.c);
        }
        if (!zO) {
            aSN1PrimitiveP.b(aSN1OutputStream, false);
            return;
        }
        aSN1OutputStream.f(128);
        aSN1PrimitiveP.b(aSN1OutputStream, true);
        aSN1OutputStream.f(0);
        aSN1OutputStream.f(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return o() || this.d.p().d();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public final ASN1Sequence m(ASN1Primitive aSN1Primitive) {
        return new BERSequence(aSN1Primitive);
    }

    public BERTaggedObject(ASN1Encodable aSN1Encodable) {
        super(true, 0, aSN1Encodable);
    }

    public BERTaggedObject(ASN1Encodable aSN1Encodable, byte[] bArr) {
        super(true, 0, aSN1Encodable);
    }
}
