package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsm extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ffnm ffnmVarA = ffnm.a(subjectPublicKeyInfo.a.b);
        if (ffnmVarA == null) {
            byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
            fftx fftxVar = new fftx((fftu) fftu.a.get(Integer.valueOf(ffwp.a(bArr, 0))));
            fftxVar.d = ffua.g(bArr);
            return new ffty(fftxVar);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ffnmVarA.b.a;
        ffnr ffnrVarA = ffnr.a(subjectPublicKeyInfo.a());
        fftx fftxVar2 = new fftx(new fftu(ffnmVarA.a, ffsq.v(aSN1ObjectIdentifier)));
        fftxVar2.c = ffua.g(ffnrVarA.b());
        fftxVar2.b = ffua.g(ffnrVarA.c());
        return new ffty(fftxVar2);
    }
}
