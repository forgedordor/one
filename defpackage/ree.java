package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ree extends IOException {
    private static final long serialVersionUID = 1;
    public final int a;

    public ree(String str, int i) {
        this(str, i, null);
    }

    public ree(String str, int i, Throwable th) {
        super(a.f(i, str, ", status code: "), th);
        this.a = i;
    }
}
