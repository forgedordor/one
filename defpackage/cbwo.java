package defpackage;

import j$.util.DateRetargetClass;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwo {
    public static final cbue a(byte[] bArr) throws CertificateException {
        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        certificateGenerateCertificate.getClass();
        X509Certificate x509Certificate = (X509Certificate) certificateGenerateCertificate;
        evvp evvpVarB = evwz.b(DateRetargetClass.toInstant(x509Certificate.getNotBefore()));
        evvp evvpVarB2 = evwz.b(DateRetargetClass.toInstant(x509Certificate.getNotAfter()));
        evvpVarB.getClass();
        evvpVarB2.getClass();
        return new cbue(evvpVarB, evvpVarB2);
    }
}
