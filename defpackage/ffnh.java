package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnh extends ASN1Object {
    public final int a;
    public final int b;
    public final ffvz c;
    public final AlgorithmIdentifier d;

    public ffnh(int i, int i2, ffvz ffvzVar, AlgorithmIdentifier algorithmIdentifier) {
        this.a = i;
        this.b = i2;
        this.c = new ffvz(ffvzVar.a());
        this.d = algorithmIdentifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.a));
        aSN1EncodableVector.b(new ASN1Integer(this.b));
        aSN1EncodableVector.b(new DEROctetString(this.c.a()));
        aSN1EncodableVector.b(this.d);
        return new DERSequence(aSN1EncodableVector);
    }

    public ffnh(ASN1Sequence aSN1Sequence) {
        this.a = ((ASN1Integer) aSN1Sequence.h(0)).f();
        this.b = ((ASN1Integer) aSN1Sequence.h(1)).f();
        this.c = new ffvz(((ASN1OctetString) aSN1Sequence.h(2)).c);
        this.d = AlgorithmIdentifier.a(aSN1Sequence.h(3));
    }
}
