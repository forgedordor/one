package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aic {
    private final Context a;
    private final String b;
    private Executor c;

    public aic(Context context, String str) {
        this.a = context;
        if (str.contains("/")) {
            throw new IllegalArgumentException("Database name cannot contain '/'");
        }
        this.b = str;
    }

    public final aid a() {
        if (this.c == null) {
            this.c = aie.a;
        }
        return new aid(this.a, this.b, this.c);
    }

    public final void b(Executor executor) {
        lcg.i(executor);
        this.c = executor;
    }
}
