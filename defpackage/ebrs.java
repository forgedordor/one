package defpackage;

import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebrs {
    public final ebrw a;
    public final long b = System.nanoTime();
    private final Throwable c;

    public ebrs(ebrw ebrwVar, Throwable th) {
        this.a = ebrwVar;
        this.c = th;
    }

    public static ebrs a(ebrw ebrwVar, Throwable th) {
        th.getClass();
        return new ebrs(ebrwVar, th);
    }

    public final Optional b() {
        return Optional.ofNullable(this.c);
    }

    public final boolean c() {
        return this.c == null;
    }

    public final String toString() {
        Locale locale = Locale.US;
        ebrw ebrwVar = this.a;
        return String.format(locale, "StateTransition<%s>(state: %s, isValid: %s, transitionTimeNanos: %d, failureCause: %s)", ebrwVar.getClass().getName(), ebrwVar, Boolean.valueOf(c()), Long.valueOf(this.b), b().orElse(null));
    }
}
