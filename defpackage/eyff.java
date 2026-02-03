package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyff extends PhantomReference implements eyfe {
    public final Runnable a;
    public eyff b;
    public eyff c;
    private final eyfh d;

    public eyff(eyfh eyfhVar, Object obj, ReferenceQueue referenceQueue, Runnable runnable) {
        super(obj, referenceQueue);
        this.d = eyfhVar;
        this.a = runnable;
    }

    @Override // defpackage.eyfe
    public final void a() {
        eyfh eyfhVar = eyfh.a;
        if (this.d.b(this)) {
            this.a.run();
        }
    }
}
