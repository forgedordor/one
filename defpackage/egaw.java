package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egaw implements eooz {
    public final List a;
    public final int b;
    public final Executor c;
    private final ejwm e;
    public int d = -1;
    private final eooz f = eiid.d(this);

    public egaw(List list, ejwm ejwmVar, Executor executor) {
        this.a = list;
        this.b = list.size();
        this.e = ejwmVar;
        this.c = executor;
    }

    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        return this.e.a(obj) ? eork.i(obj) : b();
    }

    public final ListenableFuture b() {
        int i = this.d + 1;
        this.d = i;
        return i < this.b ? eooq.g((ListenableFuture) this.a.get(i), this.f, this.c) : eork.i(null);
    }
}
