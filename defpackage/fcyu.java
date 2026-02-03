package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcyu implements fcxy {
    public static final fcyu a = new fcyu();

    private fcyu() {
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }
}
