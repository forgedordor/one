package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyg {
    public final Activity a;
    public final lbz b;
    public pxc c;
    private final Executor d;

    public pyg(Activity activity, Executor executor, lbz lbzVar) {
        this.a = activity;
        this.d = executor;
        this.b = lbzVar;
    }

    public final void a(final pxc pxcVar) {
        this.c = pxcVar;
        this.d.execute(new Runnable() { // from class: pyf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.accept(pxcVar);
            }
        });
    }
}
