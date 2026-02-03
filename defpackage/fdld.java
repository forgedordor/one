package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdld {
    public static final fdzi a = new fdzi("REMOVED_TASK");
    public static final fdzi b = new fdzi("CLOSED_EMPTY");

    public static final long a(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
