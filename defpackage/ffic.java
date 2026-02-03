package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extensions;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffic implements Serializable, ffwn {
    private static final long serialVersionUID = 20170722001L;
    private transient Certificate a;

    public ffic(byte[] bArr) throws ffhy {
        try {
            a(Certificate.c(ffhz.a(bArr)));
        } catch (ClassCastException e) {
            throw new ffhy("malformed data: ".concat(String.valueOf(e.getMessage())), e);
        } catch (IllegalArgumentException e2) {
            throw new ffhy("malformed data: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    private final void a(Certificate certificate) {
        this.a = certificate;
        Extensions extensions = certificate.b.l;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(Certificate.c(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(s());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffic) {
            return this.a.equals(((ffic) obj).a);
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
