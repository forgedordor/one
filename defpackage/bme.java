package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bme implements bmf {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final bmf b;

    public bme(bmf bmfVar) {
        this.b = bmfVar;
    }

    @Override // defpackage.bmf
    public final void a(bml bmlVar) {
        if (this.a.get()) {
            return;
        }
        this.b.a(bmlVar);
    }

    public final void b() {
        this.a.set(true);
    }
}
