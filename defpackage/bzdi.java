package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdi extends RuntimeException {
    private final RuntimeException a;

    public bzdi(String str, bzbz bzbzVar, RuntimeException runtimeException) {
        super("Uncaught exception while CmsHandler for " + str + " was processing work item " + bzbzVar.b.a, runtimeException);
        this.a = runtimeException;
    }

    public final boolean equals(Object obj) {
        bzdi bzdiVar = obj instanceof bzdi ? (bzdi) obj : null;
        return bzdiVar != null && fdgn.j(getMessage(), bzdiVar.getMessage(), false) && fdbq.f(this.a, bzdiVar.a);
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.a;
    }
}
