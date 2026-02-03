package defpackage;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffds implements ffdt {
    private ffdt a;
    private final ffdp b;

    public ffds(ffdp ffdpVar) {
        this.b = ffdpVar;
    }

    private final synchronized ffdt g(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            Class<?> cls = sSLSocket.getClass();
            Class<?> superclass = cls;
            while (superclass != null && !fdbq.f(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    Objects.toString(cls);
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(cls)));
                }
            }
            superclass.getClass();
            this.a = new ffdq(superclass);
        }
        return this.a;
    }

    @Override // defpackage.ffdt
    public final String a(SSLSocket sSLSocket) {
        ffdt ffdtVarG = g(sSLSocket);
        if (ffdtVarG != null) {
            return ffdtVarG.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ffdt
    public final /* synthetic */ X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    @Override // defpackage.ffdt
    public final void c(SSLSocket sSLSocket, String str, List list) {
        ffdt ffdtVarG = g(sSLSocket);
        if (ffdtVarG != null) {
            ffdtVarG.c(sSLSocket, str, list);
        }
    }

    @Override // defpackage.ffdt
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ffdt
    public final boolean e(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }

    @Override // defpackage.ffdt
    public final /* synthetic */ boolean f(SSLSocketFactory sSLSocketFactory) {
        return false;
    }
}
