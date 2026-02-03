package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egsw extends RuntimeException {
    public egsw() {
        super("Worker is not an account worker, or lost its tag!");
    }

    public egsw(Throwable th) {
        super("Account was no longer valid when task executed.", th);
    }
}
