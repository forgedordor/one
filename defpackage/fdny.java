package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdny {
    public static final fdoh a = new fdoh(-1, null, null, 0);
    public static final int b = fdzj.a("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = fdzj.a("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final fdzi d = new fdzi("BUFFERED");
    public static final fdzi e = new fdzi("SHOULD_BUFFER");
    public static final fdzi f = new fdzi("S_RESUMING_BY_RCV");
    public static final fdzi g = new fdzi("RESUMING_BY_EB");
    public static final fdzi h = new fdzi("POISONED");
    public static final fdzi i = new fdzi("DONE_RCV");
    public static final fdzi j = new fdzi("INTERRUPTED_SEND");
    public static final fdzi k = new fdzi("INTERRUPTED_RCV");
    public static final fdzi l = new fdzi("CHANNEL_CLOSED");
    public static final fdzi m = new fdzi("SUSPEND");
    public static final fdzi n = new fdzi("SUSPEND_NO_WAITER");
    public static final fdzi o = new fdzi("FAILED");
    public static final fdzi p = new fdzi("NO_RECEIVE_RESULT");
    public static final fdzi q = new fdzi("CLOSE_HANDLER_CLOSED");
    public static final fdzi r = new fdzi("CLOSE_HANDLER_INVOKED");
    public static final fdzi s = new fdzi("NO_CLOSE_CAUSE");

    public static final long a(long j2, boolean z) {
        return (true != z ? 0L : 4611686018427387904L) + j2;
    }

    public static final long b(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final boolean c(fdis fdisVar, Object obj) {
        Object objL = fdisVar.l(obj, null);
        if (objL == null) {
            return false;
        }
        fdisVar.c(objL);
        return true;
    }
}
