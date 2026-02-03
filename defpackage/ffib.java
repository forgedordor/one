package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffib implements Serializable, ffwn {
    private static final long serialVersionUID = 20170722001L;
    private transient CertificateList a;
    private transient Extensions b;

    public ffib(CertificateList certificateList) {
        a(certificateList);
    }

    private final void a(CertificateList certificateList) {
        Extension extensionB;
        this.a = certificateList;
        Extensions extensions = certificateList.a.g;
        this.b = extensions;
        if (extensions != null && (extensionB = extensions.b(Extension.i)) != null) {
            boolean z = IssuingDistributionPoint.a(Extension.a(extensionB)).a;
        }
        new GeneralNames(new GeneralName(certificateList.b()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(CertificateList.c(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(s());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffib) {
            return this.a.equals(((ffib) obj).a);
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
