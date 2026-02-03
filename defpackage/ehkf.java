package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehkf implements ehea {
    public final efwo a;
    public final ehhy b;
    public final ehkk c;
    public final fcsu d;
    public final String e;
    private final egbf f;
    private final Executor g;

    public ehkf(efwo efwoVar, egbf egbfVar, ehhy ehhyVar, ehkk ehkkVar, fcsu fcsuVar, Executor executor, String str) {
        efwoVar.getClass();
        egbfVar.getClass();
        ehkkVar.getClass();
        fcsuVar.getClass();
        executor.getClass();
        this.a = efwoVar;
        this.f = egbfVar;
        this.b = ehhyVar;
        this.c = ehkkVar;
        this.d = fcsuVar;
        this.g = executor;
        this.e = str;
    }

    @Override // defpackage.ehea
    public final ListenableFuture a(String str, evqs evqsVar, dzzs dzzsVar) {
        return this.c.a(dzzsVar, evqsVar, str, this.e);
    }

    @Override // defpackage.ehea
    public final ListenableFuture b(final evqs evqsVar, final dzzs dzzsVar) {
        fdap fdapVar = new fdap() { // from class: ehkc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ehkf ehkfVar = this.a;
                efwo efwoVar = (efwo) obj;
                ejwi ejwiVar = (ejwi) ((eyig) ehkfVar.d).a;
                boolean zG = ejwiVar.g();
                evqs evqsVar2 = evqsVar;
                dzzs dzzsVar2 = dzzsVar;
                return zG ? eika.k(((efze) ejwiVar.c()).a(new egal(new Intent())), eiid.d(new ehkd(ehkfVar, evqsVar2, dzzsVar2)), eoqg.a) : ehkfVar.c(evqsVar2, efwoVar, ehkfVar.a, dzzsVar2);
            }
        };
        ehkk ehkkVar = this.c;
        ListenableFuture listenableFutureB = ehkkVar.d.b(new ehkl(fdapVar, ehkkVar), eoqg.a);
        listenableFutureB.getClass();
        return listenableFutureB;
    }

    public final ListenableFuture c(final evqs evqsVar, efwo efwoVar, efwo efwoVar2, final dzzs dzzsVar) {
        if (efwoVar == null || !fdbq.f(efwoVar2, efwoVar)) {
            return eork.i(null);
        }
        ListenableFuture listenableFutureC = this.f.c(efwoVar2);
        final fdap fdapVar = new fdap() { // from class: ehkb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                egbs egbsVarB = ((egbe) obj).b();
                ehkf ehkfVar = this.a;
                return ehkfVar.c.a(dzzsVar, evqsVar, ehkfVar.b.a(egbsVarB), ehkfVar.e);
            }
        };
        return eika.k(listenableFutureC, new eooz() { // from class: ehke
            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eooz
            public final /* synthetic */ ListenableFuture a(Object obj) {
                return fdapVar.invoke(obj);
            }
        }, this.g);
    }
}
