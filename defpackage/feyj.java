package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyj {
    public static final feyk a(SSLSession sSLSession) throws IOException {
        final List listB;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (fdbq.f(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || fdbq.f(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        fexq fexqVarA = fexq.a.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (fdbq.f("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        fezn feznVar = fezn.a;
        fezn feznVarA = fezm.a(protocol);
        try {
            listB = b(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listB = fcvo.a;
        }
        return new feyk(feznVarA, fexqVarA, b(sSLSession.getLocalCertificates()), new fdae() { // from class: feyi
            @Override // defpackage.fdae
            public final Object invoke() {
                return listB;
            }
        });
    }

    private static final List b(Certificate[] certificateArr) {
        return certificateArr != null ? fezr.o(Arrays.copyOf(certificateArr, certificateArr.length)) : fcvo.a;
    }
}
