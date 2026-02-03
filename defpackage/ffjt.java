package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffjt extends CRLException {
    final Throwable a;

    public ffjt(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
