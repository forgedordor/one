package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffur implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient ffor a;
    private transient String b;
    private transient byte[] c;

    public ffur(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        a(subjectPublicKeyInfo);
    }

    private final void a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ffor fforVar = (ffor) ffso.a(subjectPublicKeyInfo);
        this.a = fforVar;
        this.b = ffwu.c(fforVar.b.d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(SubjectPublicKeyInfo.b((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffur) {
            return Arrays.equals(getEncoded(), ((ffur) obj).getEncoded());
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
            this.c = ffvm.b(this.a);
        }
        return ffwk.c(this.c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return ffwk.a(getEncoded());
    }
}
