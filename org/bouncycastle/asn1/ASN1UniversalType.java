package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1UniversalType extends ASN1Type {
    public ASN1UniversalType(Class cls) {
        super(cls);
    }

    public ASN1Primitive a(DEROctetString dEROctetString) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public ASN1Primitive b(ASN1Sequence aSN1Sequence) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public final ASN1Primitive c(byte[] bArr) throws IOException {
        ASN1Primitive aSN1PrimitiveV = ASN1Primitive.v(bArr);
        e(aSN1PrimitiveV);
        return aSN1PrimitiveV;
    }

    public final ASN1Primitive d(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Util.c(aSN1TaggedObject);
        ASN1Primitive aSN1PrimitiveI = aSN1TaggedObject.i(z, this);
        e(aSN1PrimitiveI);
        return aSN1PrimitiveI;
    }

    final void e(ASN1Primitive aSN1Primitive) {
        if (!this.a.isInstance(aSN1Primitive)) {
            throw new IllegalStateException("unexpected object: ".concat(String.valueOf(aSN1Primitive.getClass().getName())));
        }
    }
}
