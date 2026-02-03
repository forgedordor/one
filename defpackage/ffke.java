package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffke extends CRLException {
    private final Throwable a;

    public ffke(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public ffke(Throwable th) {
        this.a = th;
    }
}
