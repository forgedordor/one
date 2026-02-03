package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eyiw implements eyiy {
    private final AtomicBoolean b = new AtomicBoolean();
    public final eyiv a = new eyiv();

    protected eyiw() {
    }

    @Override // defpackage.eyir
    public final ListenableFuture d() {
        if (this.b.compareAndSet(false, true)) {
            this.a.o(e());
        }
        return this.a;
    }

    protected abstract ListenableFuture e();

    @Override // defpackage.eyiy
    public final eyir f() {
        return new eyiu(this);
    }

    @Override // defpackage.eyiy
    public final eyir g(eyiz eyizVar) {
        eyiu eyiuVar = new eyiu(this);
        eyiuVar.a.b(new eyit(eyiuVar, eyizVar), eoqg.a);
        return eyiuVar;
    }

    @Override // defpackage.eyiy
    public final void h(boolean z) {
        this.b.set(true);
        this.a.d(z);
    }
}
