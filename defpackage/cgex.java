package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgex extends RuntimeException {
    public cgex() {
    }

    public cgex(Throwable th) {
        super("Unable to find or allocate a thread ID.", th);
    }
}
