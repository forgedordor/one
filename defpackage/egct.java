package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egct {
    private final fcsu a;
    private final Executor b;

    public egct(fcsu fcsuVar, Executor executor) {
        this.b = executor;
        this.a = fcsuVar;
    }

    public final ekgp a() {
        Set<egcf> set = (Set) this.a.b();
        ekgi ekgiVar = new ekgi();
        for (egcf egcfVar : set) {
            ejwl.b(!egcfVar.b().isEmpty(), "AccountProvider's account type cannot be an empty string.");
            ekgiVar.i(egcfVar.b(), egcfVar.a());
        }
        return ekgiVar.c();
    }

    public final ListenableFuture b(final List list) {
        return eork.c(list).a(eiid.l(new Callable() { // from class: egcr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ekfwVar.j((Iterable) eork.q((ListenableFuture) it.next()));
                }
                return ekfwVar.g();
            }
        }), this.b);
    }

    public final ListenableFuture c(final String str, final egce egceVar) {
        return eooq.f(egceVar.a(), eiid.a(new ejvr() { // from class: egcs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                int size = ekgbVar.size();
                for (int i = 0; i < size; i++) {
                    egce egceVar2 = egceVar;
                    String str2 = str;
                    egbs egbsVar = (egbs) ekgbVar.get(i);
                    ejwl.s(str2.equals(egbsVar.k), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", egceVar2, str2, egbsVar.k);
                }
                return ekgbVar;
            }
        }), this.b);
    }
}
