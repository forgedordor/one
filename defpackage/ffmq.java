package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmq implements ffmg {
    @Override // defpackage.ffmg
    public final ffmf a(byte[] bArr) throws IOException {
        try {
            ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(bArr);
            if (aSN1SequenceJ.e() != 9) {
                throw new ffme("malformed sequence in RSA private key");
            }
            RSAPrivateKey rSAPrivateKey = aSN1SequenceJ != null ? new RSAPrivateKey(ASN1Sequence.j(aSN1SequenceJ)) : null;
            RSAPublicKey rSAPublicKey = new RSAPublicKey(rSAPrivateKey.a, rSAPrivateKey.b);
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.wB, DERNull.a);
            new SubjectPublicKeyInfo(algorithmIdentifier, rSAPublicKey);
            new PrivateKeyInfo(algorithmIdentifier, rSAPrivateKey);
            return new ffmf();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new ffme("problem creating RSA private key: ".concat(String.valueOf(e2.toString())), e2);
        }
    }
}
