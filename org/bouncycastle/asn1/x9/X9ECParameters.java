package org.bouncycastle.asn1.x9;

import defpackage.ffli;
import defpackage.ffwk;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X9ECParameters extends ASN1Object implements X9ObjectIdentifiers {
    public static final /* synthetic */ int a = 0;
    private static final BigInteger b = BigInteger.valueOf(1);
    private ffli Y;
    private X9ECPoint Z;
    private BigInteger aa;
    private BigInteger ab;
    private byte[] ac;

    public X9ECParameters(ASN1Sequence aSN1Sequence) {
        if (!(aSN1Sequence.h(0) instanceof ASN1Integer) || !((ASN1Integer) aSN1Sequence.h(0)).o(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.aa = ((ASN1Integer) aSN1Sequence.h(4)).j();
        if (aSN1Sequence.e() == 6) {
            this.ab = ((ASN1Integer) aSN1Sequence.h(5)).j();
        }
        ASN1Encodable aSN1EncodableH = aSN1Sequence.h(1);
        X9Curve x9Curve = new X9Curve(aSN1EncodableH instanceof X9FieldID ? (X9FieldID) aSN1EncodableH : aSN1EncodableH != null ? new X9FieldID(ASN1Sequence.j(aSN1EncodableH)) : null, this.aa, this.ab, ASN1Sequence.j(aSN1Sequence.h(2)));
        this.Y = x9Curve.a;
        ASN1Encodable aSN1EncodableH2 = aSN1Sequence.h(3);
        if (aSN1EncodableH2 instanceof X9ECPoint) {
            this.Z = (X9ECPoint) aSN1EncodableH2;
        } else {
            this.Z = new X9ECPoint((ASN1OctetString) aSN1EncodableH2);
        }
        this.ac = ffwk.c(x9Curve.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.b(new ASN1Integer(b));
        aSN1EncodableVector.b(null);
        aSN1EncodableVector.b(new X9Curve(this.Y, this.ac));
        aSN1EncodableVector.b(this.Z);
        aSN1EncodableVector.b(new ASN1Integer(this.aa));
        BigInteger bigInteger = this.ab;
        if (bigInteger != null) {
            aSN1EncodableVector.b(new ASN1Integer(bigInteger));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
