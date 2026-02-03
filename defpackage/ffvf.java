package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvf implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient ASN1ObjectIdentifier a;
    private transient ffre b;
    private transient ASN1Set c;

    public ffvf(PrivateKeyInfo privateKeyInfo) {
        a(privateKeyInfo);
    }

    private final void a(PrivateKeyInfo privateKeyInfo) {
        this.c = privateKeyInfo.b;
        this.a = ffnj.a(privateKeyInfo.a.b).a.a;
        this.b = (ffre) ffrq.a(privateKeyInfo);
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
        if (obj instanceof ffvf) {
            ffvf ffvfVar = (ffvf) obj;
            if (this.a.w(ffvfVar.a) && Arrays.equals(this.b.a(), ffvfVar.b.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            ffre ffreVar = this.b;
            String str = ffreVar.b;
            return ffrr.a(ffreVar, this.c).s();
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
