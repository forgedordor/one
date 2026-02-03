package defpackage;

import java.security.cert.CertificateException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffjr extends CertificateException {
    private final Throwable a;

    public ffjr(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
