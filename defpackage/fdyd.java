package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyd extends RuntimeException {
    private final transient fcyh a;

    public fdyd(fcyh fcyhVar) {
        this.a = fcyhVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.a);
    }
}
