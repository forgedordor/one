package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eosk {
    static void a() {
        Thread.currentThread().interrupt();
    }

    static void b(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    static void c(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }
}
