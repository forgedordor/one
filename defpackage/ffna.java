package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffna extends IOException {
    private Throwable a;

    public ffna() {
        super("empty data passed to constructor");
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public ffna(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
