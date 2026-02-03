package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcji implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ fckn b;
    final /* synthetic */ Future c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Future e;
    final /* synthetic */ fckp f;

    public fcji(fckp fckpVar, Collection collection, fckn fcknVar, Future future, boolean z, Future future2) {
        this.a = collection;
        this.b = fcknVar;
        this.c = future;
        this.d = z;
        this.e = future2;
        this.f = fckpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (fckn fcknVar : this.a) {
            if (fcknVar != this.b) {
                fcknVar.a.c(fckp.g);
            }
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
            if (!this.d) {
                fckp fckpVar = this.f;
                if (fckpVar.z.decrementAndGet() == Integer.MIN_VALUE) {
                    fckpVar.l.execute(new fcjh(this));
                }
            }
        }
        Future future2 = this.e;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f.r();
    }
}
