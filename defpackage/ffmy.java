package defpackage;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1Set.AnonymousClass2;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffmy {
    private final CertificationRequest a;

    public ffmy(CertificationRequest certificationRequest) {
        SubjectPublicKeyInfo subjectPublicKeyInfoB;
        ASN1BitString aSN1BitStringI;
        this.a = certificationRequest;
        ASN1Set aSN1Set = certificationRequest.a.d;
        AlgorithmIdentifier algorithmIdentifierA = null;
        if (aSN1Set != null) {
            ASN1Set.AnonymousClass2 anonymousClass2 = aSN1Set.new AnonymousClass2();
            subjectPublicKeyInfoB = null;
            aSN1BitStringI = null;
            while (anonymousClass2.hasMoreElements()) {
                Attribute attributeA = Attribute.a(anonymousClass2.nextElement());
                algorithmIdentifierA = Extension.t.w(attributeA.a) ? AlgorithmIdentifier.a(a(attributeA)) : algorithmIdentifierA;
                subjectPublicKeyInfoB = Extension.s.w(attributeA.a) ? SubjectPublicKeyInfo.b(a(attributeA)) : subjectPublicKeyInfoB;
                if (Extension.u.w(attributeA.a)) {
                    aSN1BitStringI = ASN1BitString.i(a(attributeA));
                }
            }
        } else {
            subjectPublicKeyInfoB = null;
            aSN1BitStringI = null;
        }
        boolean z = algorithmIdentifierA != null;
        boolean z2 = subjectPublicKeyInfoB != null;
        boolean z3 = aSN1BitStringI != null;
        if (((z | z2) || z3) && (!(z2 & z) || !z3)) {
            throw new IllegalArgumentException("invalid alternate public key details found");
        }
    }

    private static ASN1Encodable a(Attribute attribute) {
        ASN1Encodable[] aSN1EncodableArrH = attribute.b.h();
        if (aSN1EncodableArrH.length == 1) {
            return aSN1EncodableArrH[0];
        }
        throw new IllegalArgumentException("single value attribute value not size of 1");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffmy) {
            return this.a.equals(((ffmy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
