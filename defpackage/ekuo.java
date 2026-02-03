package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekuo extends ekvf {
    public static final ekuo a = new ekuo(ekvp.a);
    public final AtomicReference b;

    public ekuo(ekvf ekvfVar) {
        this.b = new AtomicReference(ekvfVar);
    }

    @Override // defpackage.ekvf
    public final ekte b() {
        return ((ekvf) this.b.get()).b();
    }

    @Override // defpackage.ekvf
    public final ekvv c() {
        return ((ekvf) this.b.get()).c();
    }

    @Override // defpackage.ekvf
    public final ekwe d() {
        return ((ekvf) this.b.get()).d();
    }

    @Override // defpackage.ekvf
    public final void e(String str, Level level, boolean z) {
        ((ekvf) this.b.get()).e(str, level, z);
    }
}
