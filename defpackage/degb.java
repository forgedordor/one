package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class degb implements dega {
    private final Object a = new Object();
    private final int b;
    private final defv c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public degb(int i, defv defvVar) {
        this.b = i;
        this.c = defvVar;
    }

    private final void b() {
        int i = this.d + this.e + this.f;
        int i2 = this.b;
        if (i == i2) {
            if (this.g == null) {
                if (this.h) {
                    this.c.x();
                    return;
                } else {
                    this.c.v(null);
                    return;
                }
            }
            this.c.u(new ExecutionException(this.e + " out of " + i2 + " underlying tasks failed", this.g));
        }
    }

    @Override // defpackage.deey
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            b();
        }
    }

    @Override // defpackage.defe
    public final void d(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            b();
        }
    }

    @Override // defpackage.defh
    public final void e(Object obj) {
        synchronized (this.a) {
            this.d++;
            b();
        }
    }
}
