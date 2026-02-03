package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvn implements PrivateKey {
    private static final long serialVersionUID = 7682140473044521395L;
    private transient ASN1ObjectIdentifier a;
    private transient ffto b;
    private transient ASN1Set c;

    public ffvn(PrivateKeyInfo privateKeyInfo) {
        a(privateKeyInfo);
    }

    private final void a(PrivateKeyInfo privateKeyInfo) {
        this.c = privateKeyInfo.b;
        this.a = ffnn.a(privateKeyInfo.a.b).c.a;
        this.b = (ffto) ffrq.a(privateKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(PrivateKeyInfo.b((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffvn) {
            ffvn ffvnVar = (ffvn) obj;
            if (this.a.w(ffvnVar.a) && Arrays.equals(this.b.a(), ffvnVar.b.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return ffrr.a(this.b, this.c).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.a.hashCode() + (ffwk.a(this.b.a()) * 37);
    }
}
