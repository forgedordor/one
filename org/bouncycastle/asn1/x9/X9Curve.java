package org.bouncycastle.asn1.x9;

import defpackage.ffld;
import defpackage.fflg;
import defpackage.fflh;
import defpackage.ffli;
import defpackage.fflv;
import defpackage.ffly;
import defpackage.ffwk;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X9Curve extends ASN1Object implements X9ObjectIdentifiers {
    private ASN1ObjectIdentifier Y;
    public ffli a;
    public byte[] b;

    public X9Curve(X9FieldID x9FieldID, BigInteger bigInteger, BigInteger bigInteger2, ASN1Sequence aSN1Sequence) {
        int iF;
        int iF2;
        int i;
        this.Y = null;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = x9FieldID.a;
        this.Y = aSN1ObjectIdentifier;
        if (aSN1ObjectIdentifier.w(e)) {
            this.a = new fflh(((ASN1Integer) x9FieldID.b).j(), new BigInteger(1, ASN1OctetString.f(aSN1Sequence.h(0)).c), new BigInteger(1, ASN1OctetString.f(aSN1Sequence.h(1)).c), bigInteger, bigInteger2);
        } else {
            if (!this.Y.w(f)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(x9FieldID.b);
            int iF3 = ((ASN1Integer) aSN1SequenceJ.h(0)).f();
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1SequenceJ.h(1);
            if (aSN1ObjectIdentifier2.w(g)) {
                iF2 = ASN1Integer.m(aSN1SequenceJ.h(2)).f();
                i = 0;
                iF = 0;
            } else {
                if (!aSN1ObjectIdentifier2.w(h)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                ASN1Sequence aSN1SequenceJ2 = ASN1Sequence.j(aSN1SequenceJ.h(2));
                int iF4 = ASN1Integer.m(aSN1SequenceJ2.h(0)).f();
                int iF5 = ASN1Integer.m(aSN1SequenceJ2.h(1)).f();
                iF = ASN1Integer.m(aSN1SequenceJ2.h(2)).f();
                iF2 = iF4;
                i = iF5;
            }
            this.a = new fflg(iF3, iF2, i, iF, new BigInteger(1, ASN1OctetString.f(aSN1Sequence.h(0)).c), new BigInteger(1, ASN1OctetString.f(aSN1Sequence.h(1)).c), bigInteger, bigInteger2);
        }
        if (aSN1Sequence.e() == 3) {
            this.b = ((DERBitString) aSN1Sequence.h(2)).m();
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        if (this.Y.w(e) || this.Y.w(f)) {
            aSN1EncodableVector.b(new X9FieldElement(this.a.e).p());
            aSN1EncodableVector.b(new X9FieldElement(this.a.f).p());
        }
        if (this.b != null) {
            aSN1EncodableVector.b(new DERBitString(this.b));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X9Curve(ffli ffliVar, byte[] bArr) {
        this.Y = null;
        this.a = ffliVar;
        this.b = ffwk.c(bArr);
        if (this.a.d.a() == 1) {
            this.Y = e;
            return;
        }
        fflv fflvVar = this.a.d;
        if (fflvVar.a() <= 1 || !fflvVar.b().equals(ffld.c) || !(fflvVar instanceof ffly)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        this.Y = f;
    }
}
