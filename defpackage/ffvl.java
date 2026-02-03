package defpackage;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffvl extends KeyFactorySpi implements ffks {
    private final Set a;

    protected ffvl(Set set) {
        this.a = set;
    }

    private final void c(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws InvalidKeySpecException {
        if (!this.a.contains(aSN1ObjectIdentifier)) {
            throw new InvalidKeySpecException("incorrect algorithm OID for key: ".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.X(keySpec, "Unsupported key specification: "));
        }
        try {
            PrivateKeyInfo privateKeyInfoB = PrivateKeyInfo.b(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            c(privateKeyInfoB.a.a);
            return a(privateKeyInfoB);
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.I(keySpec, "Unknown key specification: ", "."));
        }
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfoB = SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded());
            c(subjectPublicKeyInfoB.a.a);
            return b(subjectPublicKeyInfoB);
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }
}
