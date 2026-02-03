package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eezs extends eezo {
    final /* synthetic */ eezy a;

    public eezs(eezy eezyVar) {
        this.a = eezyVar;
    }

    @Override // defpackage.eezo
    public final void a() {
        eezy eezyVar = this.a;
        synchronized (eezyVar.f) {
            AtomicInteger atomicInteger = eezyVar.l;
            if (atomicInteger.get() > 0 && atomicInteger.decrementAndGet() > 0) {
                eezyVar.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            if (eezyVar.n != null) {
                eezyVar.b.d("Unbind from service.", new Object[0]);
                eezyVar.a.unbindService(eezyVar.m);
                eezyVar.g = false;
                eezyVar.n = null;
                eezyVar.m = null;
            }
            eezyVar.c();
        }
    }
}
