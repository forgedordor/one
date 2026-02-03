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
public final class ffuk implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient ffow a;
    private transient String b;
    private transient byte[] c;
    private transient ASN1Set d;

    public ffuk(PrivateKeyInfo privateKeyInfo) {
        a(privateKeyInfo);
    }

    private final void a(PrivateKeyInfo privateKeyInfo) {
        ffow ffowVar = (ffow) ffrq.a(privateKeyInfo);
        this.d = privateKeyInfo.b;
        this.a = ffowVar;
        this.b = ffwu.c(ffowVar.b.c);
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
        if (obj instanceof ffuk) {
            return Arrays.equals(getEncoded(), ((ffuk) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.c == null) {
            this.c = ffvm.a(this.a, this.d);
        }
        return ffwk.c(this.c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return ffwk.a(getEncoded());
    }
}
