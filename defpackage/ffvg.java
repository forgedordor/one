package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvg implements PublicKey, Key {
    private static final long serialVersionUID = 1;
    private transient ASN1ObjectIdentifier a;
    private transient ffrf b;

    public ffvg(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        a(subjectPublicKeyInfo);
    }

    private final void a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.a = ffnj.a(subjectPublicKeyInfo.a.b).a.a;
        this.b = (ffrf) ffso.a(subjectPublicKeyInfo);
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
        if (obj instanceof ffvg) {
            ffvg ffvgVar = (ffvg) obj;
            if (this.a.w(ffvgVar.a) && Arrays.equals(this.b.a(), ffvgVar.b.a())) {
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
            ffrf ffrfVar = this.b;
            String str = ffrfVar.b;
            return ffsp.a(ffrfVar).s();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.a.hashCode() + (ffwk.a(this.b.a()) * 37);
    }
}
