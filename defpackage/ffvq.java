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
public final class ffvq implements PublicKey {
    private static final long serialVersionUID = -5617456225328969766L;
    private transient ffty a;
    private transient ASN1ObjectIdentifier b;

    public ffvq(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        a(subjectPublicKeyInfo);
    }

    private final void a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ffty fftyVar = (ffty) ffso.a(subjectPublicKeyInfo);
        this.a = fftyVar;
        this.b = ffvr.a(fftyVar.b);
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
        if (obj instanceof ffvq) {
            ffvq ffvqVar = (ffvq) obj;
            try {
                if (this.b.w(ffvqVar.b)) {
                    if (Arrays.equals(this.a.a(), ffvqVar.a.a())) {
                        return true;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return ffsp.a(this.a).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        try {
            return this.b.hashCode() + (ffwk.a(this.a.a()) * 37);
        } catch (IOException unused) {
            return this.b.hashCode();
        }
    }
}
