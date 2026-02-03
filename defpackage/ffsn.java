package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsn extends ffsl {
    @Override // defpackage.ffsl
    public final ffiz a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ffnn ffnnVarA = ffnn.a(subjectPublicKeyInfo.a.b);
        if (ffnnVarA == null) {
            byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
            fftp fftpVar = new fftp((fftm) fftm.a.get(Integer.valueOf(ffwp.a(bArr, 0))));
            fftpVar.d = ffua.g(bArr);
            return new fftq(fftpVar);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ffnnVarA.c.a;
        ffnr ffnrVarA = ffnr.a(subjectPublicKeyInfo.a());
        fftp fftpVar2 = new fftp(new fftm(ffnnVarA.a, ffnnVarA.b, ffsq.v(aSN1ObjectIdentifier)));
        fftpVar2.c = ffua.g(ffnrVarA.b());
        fftpVar2.b = ffua.g(ffnrVarA.c());
        return new fftq(fftpVar2);
    }
}
