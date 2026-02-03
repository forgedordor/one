package defpackage;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.CertificationRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmm implements ffxg {
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws ffme, ffna {
        try {
            try {
                ASN1Primitive aSN1PrimitiveV = ASN1Primitive.v(ffxfVar.d);
                CertificationRequest certificationRequest = aSN1PrimitiveV != null ? new CertificationRequest(ASN1Sequence.j(aSN1PrimitiveV)) : null;
                if (certificationRequest != null) {
                    return new ffmy(certificationRequest);
                }
                throw new ffna();
            } catch (ClassCastException e) {
                throw new ffna("malformed data: ".concat(String.valueOf(e.getMessage())), e);
            } catch (IllegalArgumentException e2) {
                throw new ffna("malformed data: ".concat(String.valueOf(e2.getMessage())), e2);
            }
        } catch (Exception e3) {
            throw new ffme("problem parsing certrequest: ".concat(String.valueOf(e3.toString())), e3);
        }
    }
}
