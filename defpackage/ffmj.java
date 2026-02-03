package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmj implements ffmg {
    @Override // defpackage.ffmg
    public final ffmf a(byte[] bArr) throws IOException {
        try {
            ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(bArr);
            ECPrivateKey eCPrivateKey = aSN1SequenceJ != null ? new ECPrivateKey(ASN1Sequence.j(aSN1SequenceJ)) : null;
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(X9ObjectIdentifiers.l, eCPrivateKey.b(0, -1));
            new PrivateKeyInfo(algorithmIdentifier, eCPrivateKey);
            if (eCPrivateKey.a() == null) {
                return new ffmf();
            }
            new SubjectPublicKeyInfo(algorithmIdentifier, eCPrivateKey.a().m());
            return new ffmf();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new ffme("problem creating EC private key: ".concat(String.valueOf(e2.toString())), e2);
        }
    }
}
