package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffme extends IOException {
    Exception a;

    public ffme(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public ffme(String str, Exception exc) {
        super(str);
        this.a = exc;
    }
}
