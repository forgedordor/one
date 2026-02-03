package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffuw implements Key, PrivateKey {
    private static final long serialVersionUID = 1;
    private transient ffpw a;
    private transient ASN1Set b;

    public ffuw(PrivateKeyInfo privateKeyInfo) {
        a(privateKeyInfo);
    }

    private final void a(PrivateKeyInfo privateKeyInfo) {
        this.b = privateKeyInfo.b;
        this.a = (ffpw) ffrq.a(privateKeyInfo);
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
        if (obj instanceof ffuw) {
            return Arrays.equals(this.a.a(), ((ffuw) obj).a.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return ffrr.a(this.a, this.b).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        short[] sArrA = this.a.a();
        if (sArrA == null) {
            return 0;
        }
        int length = sArrA.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArrA[length] & 255);
        }
    }
}
