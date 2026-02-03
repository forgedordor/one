package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bck {
    public static final bck a = new bck(false, 0);
    public static final bck b = new bck(true, 500);
    public static final bck c;
    public final long d;
    public final boolean e;
    public final boolean f;

    static {
        new bck(true, 100L);
        c = new bck(false, 0L, true);
    }

    private bck(boolean z, long j) {
        this(z, j, false);
    }

    private bck(boolean z, long j, boolean z2) {
        this.e = z;
        this.d = j;
        if (z2) {
            lcg.b(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.f = z2;
    }
}
