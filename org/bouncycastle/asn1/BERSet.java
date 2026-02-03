package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BERSet extends ASN1Set {
    public BERSet() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int iA = true != z ? 3 : 4;
        for (ASN1Encodable aSN1Encodable : this.b) {
            iA += aSN1Encodable.p().a(true);
        }
        return iA;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.l(z, 49, this.b);
    }

    public BERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    public BERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(false, aSN1EncodableArr);
    }
}
