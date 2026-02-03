package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devm extends Exception {
    public devm() {
    }

    public devm(String str) {
        super(str);
    }

    public devm(Throwable th) {
        super("ContentProvider query failed", th);
    }
}
