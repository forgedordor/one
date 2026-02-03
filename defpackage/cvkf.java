package defpackage;

import android.content.res.Resources;
import android.view.View;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cvkf {
    public Runnable a;
    public Runnable b;
    protected cvkd c;
    private final BiConsumer d;

    public cvkf(BiConsumer biConsumer, cvkd cvkdVar) {
        this.c = cvkdVar;
        this.d = biConsumer;
        b(cvkdVar);
    }

    public abstract View a();

    public abstract void b(cvkd cvkdVar);

    public final void c(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    final void d(cvkd cvkdVar) throws Resources.NotFoundException {
        cqca.l("SimpleIcons", "Button " + a().getResources().getResourceEntryName(a().getId()) + " got state set to " + String.valueOf(cvkdVar) + ". Current was " + String.valueOf(this.c));
        if (this.c != cvkdVar) {
            b(cvkdVar);
            this.c = cvkdVar;
            this.d.accept(this, cvkdVar);
        }
    }
}
