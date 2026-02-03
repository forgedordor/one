package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cayx extends Exception {
    public cayx() {
        super("queue is null");
    }

    public cayx(IllegalArgumentException illegalArgumentException) {
        super("no handler", illegalArgumentException);
    }
}
