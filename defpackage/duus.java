package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duus {
    private Executor a;
    private Context b;
    private ejxr c;
    private ejwi d;
    private ejwi e;

    public duus() {
        ejud ejudVar = ejud.a;
        this.d = ejudVar;
        this.e = ejudVar;
    }

    public final duut a() {
        return new duvd(this.b, this.e, this.a, this.d, this.c);
    }

    public final void b(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void c(Executor executor) {
        executor.getClass();
        this.a = new eoss(executor);
    }

    public final void d(duve duveVar) {
        this.d = ejwi.j(duveVar);
    }

    public final void e(ejxr ejxrVar) {
        this.c = ejxx.a(ejxrVar);
    }

    public final void f(Class cls) {
        this.e = ejwi.j(cls);
    }
}
