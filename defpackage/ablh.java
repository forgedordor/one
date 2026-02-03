package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablh extends RuntimeException {
    public ablh() {
        super("Could not connect to Ditto WebView. Retries exhausted.");
    }

    public ablh(String str, Throwable th) {
        super(str, th);
    }
}
