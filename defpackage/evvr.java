package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evvr extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public evvr() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final evtj a() {
        return new evtj(getMessage());
    }
}
