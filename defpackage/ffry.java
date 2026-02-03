package defpackage;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffry extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ffop ffopVarZ = ffsq.z(subjectPublicKeyInfo.a.a);
        try {
            ASN1Primitive aSN1PrimitiveA = subjectPublicKeyInfo.a();
            ffnf ffnfVar = aSN1PrimitiveA != null ? new ffnf(ASN1Sequence.j(aSN1PrimitiveA)) : null;
            return new ffor(ffopVarZ, ffwk.c(ffnfVar.a), ffwk.c(ffnfVar.b));
        } catch (Exception unused) {
            return new ffor(ffopVarZ, subjectPublicKeyInfo.b.n());
        }
    }
}
