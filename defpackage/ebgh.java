package defpackage;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebgh extends BrowserCompatHostnameVerifier implements HandshakeCompletedListener {
    private static final dhip a = new dhip("SipProxyHostVerifier");
    private final String b;
    private final ebgg c;

    public ebgh(String str, ebgg ebggVar) {
        this.b = str;
        this.c = ebggVar;
    }

    private static X509Certificate a(HandshakeCompletedEvent handshakeCompletedEvent) throws SSLPeerUnverifiedException {
        try {
            Certificate[] peerCertificates = handshakeCompletedEvent.getPeerCertificates();
            if (peerCertificates != null && peerCertificates.length != 0) {
                Certificate certificate = peerCertificates[0];
                if (certificate instanceof X509Certificate) {
                    return (X509Certificate) certificate;
                }
            }
        } catch (SSLPeerUnverifiedException unused) {
        }
        return null;
    }

    @Override // javax.net.ssl.HandshakeCompletedListener
    public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) throws SSLPeerUnverifiedException {
        Principal subjectDN;
        dhip dhipVar = a;
        dhja.d(dhipVar, "TLS handshake completed: %s", handshakeCompletedEvent);
        X509Certificate x509CertificateA = a(handshakeCompletedEvent);
        String name = null;
        if (x509CertificateA != null && (subjectDN = x509CertificateA.getSubjectDN()) != null) {
            name = subjectDN.getName();
        }
        String str = this.b;
        dhja.d(dhipVar, "Verifying SIP proxy host %s against certificate for %s.", str, name);
        if (verify(str, handshakeCompletedEvent.getSession())) {
            dhja.c("SIP host verification succeeded for host %s", str);
            return;
        }
        ebgg ebggVar = this.c;
        dhja.q("SIP host verification failed for host %s! Terminating transport!", str);
        ebrf ebrfVar = (ebrf) ebggVar;
        ebrfVar.q(ewnq.SOCKET_FAILURE_HOST_VERIFICATION_FAILED);
        if (((Boolean) ebrf.a.a()).booleanValue()) {
            ebrfVar.l();
        } else {
            dhja.q("Not terminating SIP transport even though host verification failed.", new Object[0]);
        }
    }
}
