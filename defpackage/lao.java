package defpackage;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lao {
    private final lbe a;
    private final Executor b;

    public lao(lbe lbeVar, Executor executor) {
        this.a = lbeVar;
        this.b = executor;
    }

    final void a(laz lazVar) {
        int i = lazVar.b;
        if (i != 0) {
            this.b.execute(new lan(this.a, i));
        } else {
            Typeface typeface = lazVar.a;
            this.b.execute(new lam(this.a, typeface));
        }
    }
}
