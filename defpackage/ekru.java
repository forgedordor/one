package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekru extends Exception {
    public ekru(Throwable th, eksk ekskVar, StackTraceElement[] stackTraceElementArr) {
        super(ekskVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
