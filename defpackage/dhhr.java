package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhhr {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    private volatile Optional b = Optional.empty();

    public static final void c(final dhhq dhhqVar, final Object obj) {
        Function functionD = dhhqVar.d();
        if (functionD == null || ((Boolean) functionD.apply(obj)).booleanValue()) {
            dhhqVar.c().execute(eiid.k(new Runnable() { // from class: dhhm
                @Override // java.lang.Runnable
                public final void run() {
                    dhhqVar.a().a(obj);
                }
            }));
        }
    }

    private final void e(Object obj) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            c((dhhq) it.next(), obj);
        }
    }

    private final synchronized void f(Object obj) {
        this.b = Optional.ofNullable(obj);
        e(obj);
    }

    public final void a(final dhhq dhhqVar) {
        dhhg dhhgVar = (dhhg) dhhqVar;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = dhhgVar.b;
        if (concurrentHashMap.containsKey(obj)) {
            return;
        }
        concurrentHashMap.put(obj, dhhqVar);
        if (dhhgVar.a) {
            this.b.ifPresent(new Consumer() { // from class: dhhn
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    dhhr.c(dhhqVar, obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void b(Object obj) {
        if (eotp.a("cslib.enable_synchronized_update_value_flag", "cslib")) {
            f(obj);
        } else {
            this.b = Optional.ofNullable(obj);
            e(obj);
        }
    }

    public final void d(Object obj) {
        this.a.remove(obj);
    }
}
