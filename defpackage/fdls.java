package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdls extends CancellationException implements fdjj {
    private final transient fdlr a;

    public fdls(String str, Throwable th, fdlr fdlrVar) {
        super(str);
        this.a = fdlrVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.fdjj
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!fdkb.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new fdls(message, this, b());
    }

    public final fdlr b() {
        fdlr fdlrVar = this.a;
        return fdlrVar == null ? fdmk.a : fdlrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fdls) {
            fdls fdlsVar = (fdls) obj;
            if (fdbq.f(fdlsVar.getMessage(), getMessage()) && fdbq.f(fdlsVar.b(), b()) && fdbq.f(fdlsVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (fdkb.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (message.hashCode() * 31) + b().hashCode();
        Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + b();
    }
}
