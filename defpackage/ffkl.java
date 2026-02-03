package defpackage;

import java.security.cert.CertificateEncodingException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffkl extends CertificateEncodingException {
    private final Throwable a;

    public ffkl(Throwable th) {
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
