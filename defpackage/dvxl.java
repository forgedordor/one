package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxl implements eora {
    final /* synthetic */ dvxm a;
    public final dwcj b;
    private final Random c = new Random();
    private int d = 0;
    private long e = 0;
    private final SettableFuture f;

    public dvxl(dvxm dvxmVar, dwcj dwcjVar, SettableFuture settableFuture) {
        this.a = dvxmVar;
        this.b = dwcjVar;
        this.f = settableFuture;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        this.f.set(obj);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        long jMin;
        if (this.d == 0) {
            jMin = ((dvxd) ((dvxb) this.b.a).a).c;
        } else {
            double d = this.e;
            dvxd dvxdVar = (dvxd) ((dvxb) this.b.a).a;
            jMin = Math.min((long) (d * dvxdVar.d), dvxdVar.b);
        }
        dwcj dwcjVar = this.b;
        Random random = this.c;
        dvxd dvxdVar2 = (dvxd) ((dvxb) dwcjVar.a).a;
        long jNextInt = random.nextInt(dvxdVar2.e);
        if (this.d >= dvxdVar2.a || !dvxm.a(Status.c(th))) {
            this.f.setException(th);
            return;
        }
        long j = jMin + jNextInt;
        this.d++;
        this.e = j;
        this.a.a.postDelayed(new Runnable() { // from class: dvxk
            @Override // java.lang.Runnable
            public final void run() {
                final dwcj dwcjVar2 = this.a.b;
                eork.r(eork.n(new eooy() { // from class: dvxg
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        return dwcm.g(dwcjVar2.b);
                    }
                }, dvie.b().a), this, eoqg.a);
            }
        }, j);
    }
}
