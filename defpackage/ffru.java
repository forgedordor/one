package defpackage;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffru extends ffsl {
    static ffok b(ffoi ffoiVar, ASN1BitString aSN1BitString) {
        try {
            ASN1Primitive aSN1PrimitiveV = ASN1Primitive.v(aSN1BitString.n());
            if (!(aSN1PrimitiveV instanceof ASN1Sequence)) {
                return new ffok(ffoiVar, ASN1OctetString.f(aSN1PrimitiveV).c);
            }
            ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(aSN1PrimitiveV);
            return new ffok(ffoiVar, ASN1OctetString.f(aSN1SequenceJ.h(0)).c, ASN1OctetString.f(aSN1SequenceJ.h(1)).c);
        } catch (Exception unused) {
            return new ffok(ffoiVar, aSN1BitString.n());
        }
    }

    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return b(ffsq.y(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b);
    }
}
