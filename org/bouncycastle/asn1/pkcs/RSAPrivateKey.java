package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class RSAPrivateKey extends ASN1Object {
    public BigInteger a;
    public BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private BigInteger i;
    private ASN1Sequence j;

    public RSAPrivateKey(ASN1Sequence aSN1Sequence) {
        this.j = null;
        Enumeration enumerationF = aSN1Sequence.f();
        ASN1Integer aSN1Integer = (ASN1Integer) enumerationF.nextElement();
        int iF = aSN1Integer.f();
        if (iF < 0 || iF > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.c = aSN1Integer.j();
        this.a = ((ASN1Integer) enumerationF.nextElement()).j();
        this.b = ((ASN1Integer) enumerationF.nextElement()).j();
        this.d = ((ASN1Integer) enumerationF.nextElement()).j();
        this.e = ((ASN1Integer) enumerationF.nextElement()).j();
        this.f = ((ASN1Integer) enumerationF.nextElement()).j();
        this.g = ((ASN1Integer) enumerationF.nextElement()).j();
        this.h = ((ASN1Integer) enumerationF.nextElement()).j();
        this.i = ((ASN1Integer) enumerationF.nextElement()).j();
        if (enumerationF.hasMoreElements()) {
            this.j = (ASN1Sequence) enumerationF.nextElement();
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        aSN1EncodableVector.b(new ASN1Integer(this.c));
        aSN1EncodableVector.b(new ASN1Integer(this.a));
        aSN1EncodableVector.b(new ASN1Integer(this.b));
        aSN1EncodableVector.b(new ASN1Integer(this.d));
        aSN1EncodableVector.b(new ASN1Integer(this.e));
        aSN1EncodableVector.b(new ASN1Integer(this.f));
        aSN1EncodableVector.b(new ASN1Integer(this.g));
        aSN1EncodableVector.b(new ASN1Integer(this.h));
        aSN1EncodableVector.b(new ASN1Integer(this.i));
        ASN1Sequence aSN1Sequence = this.j;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.b(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
