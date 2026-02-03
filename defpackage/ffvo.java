package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvo implements PublicKey {
    private static final long serialVersionUID = 3230324130542413475L;
    private transient ASN1ObjectIdentifier a;
    private transient fftq b;

    public ffvo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        a(subjectPublicKeyInfo);
    }

    private final void a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        fftq fftqVar = (fftq) ffso.a(subjectPublicKeyInfo);
        this.b = fftqVar;
        this.a = ffvr.a(fftqVar.b);
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
        if (obj instanceof ffvo) {
            ffvo ffvoVar = (ffvo) obj;
            if (this.a.w(ffvoVar.a) && Arrays.equals(this.b.c(), ffvoVar.b.c())) {
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
            return ffsp.a(this.b).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.a.hashCode() + (ffwk.a(this.b.c()) * 37);
    }
}
