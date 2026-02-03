package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayd {
    public final Executor c;
    kog f;
    private final amb g;
    public boolean a = false;
    public boolean b = false;
    public final Object d = new Object();
    public ald e = new ald();

    public ayd(amb ambVar, Executor executor) {
        this.g = ambVar;
        this.c = executor;
    }

    public final void a(Exception exc) {
        kog kogVar = this.f;
        if (kogVar != null) {
            kogVar.c(exc);
            this.f = null;
        }
    }

    public final void b(kog kogVar) {
        this.b = true;
        a(new ayw("Camera2CameraControl was updated with new options."));
        this.f = kogVar;
        if (this.a) {
            c();
        }
    }

    public final void c() {
        this.g.m().b(new Runnable() { // from class: axz
            @Override // java.lang.Runnable
            public final void run() {
                ayd aydVar = this.a;
                kog kogVar = aydVar.f;
                if (kogVar != null) {
                    kogVar.b(null);
                    aydVar.f = null;
                }
            }
        }, this.c);
        this.b = false;
    }
}
