package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Extensions;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffia implements Serializable, ffwn {
    private static final long serialVersionUID = 20170722001L;
    private transient AttributeCertificate a;

    public ffia(AttributeCertificate attributeCertificate) {
        a(attributeCertificate);
    }

    private final void a(AttributeCertificate attributeCertificate) {
        this.a = attributeCertificate;
        Extensions extensions = attributeCertificate.a.a;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(AttributeCertificate.a(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(s());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffia) {
            return this.a.equals(((ffia) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ffwn
    public final byte[] s() {
        return this.a.s();
    }
}
