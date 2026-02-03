package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aid {
    final Context a;
    public final String b;
    final Executor c;

    public aid(Context context, String str, Executor executor) {
        this.a = context;
        this.b = str;
        lcg.i(executor);
        this.c = executor;
    }
}
