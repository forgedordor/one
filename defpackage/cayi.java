package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cayi {
    public static final cqce a = cqce.g("BugleWorkQueue", "ExecutionStateManager");
    public final dqsn b;
    private final ReentrantLock d = new ReentrantLock();
    final Map c = new HashMap();

    public cayi(dqsn dqsnVar) {
        this.b = dqsnVar;
    }

    final caye a(final cbdg cbdgVar) {
        return (caye) Map.EL.computeIfAbsent(this.c, Long.valueOf(cbdgVar.m()), new Function() { // from class: cayf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                caye cayeVar = new caye(((Long) obj).longValue());
                cayeVar.a = cbdgVar.r();
                return cayeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    final Object b(ejxr ejxrVar) {
        this.d.lock();
        try {
            return ejxrVar.get();
        } finally {
            this.d.unlock();
        }
    }

    final void c(Runnable runnable) {
        this.d.lock();
        try {
            runnable.run();
        } finally {
            this.d.unlock();
        }
    }

    final void d() {
        boolean z = true;
        if (!this.b.i() && this.d.isHeldByCurrentThread()) {
            z = false;
        }
        ejwl.m(z, "wrong locking order");
    }

    final void e(long j) {
        java.util.Map map = this.c;
        Long lValueOf = Long.valueOf(j);
        if (map.containsKey(lValueOf)) {
            map.remove(lValueOf);
            return;
        }
        cqbd cqbdVarB = a.b();
        cqbdVarB.I("trying to remove non-existent rowId");
        cqbdVarB.z("rowId", j);
        cqbdVarB.r();
        throw new cayn();
    }

    final void f(final cbdg cbdgVar, final cbcw cbcwVar) {
        c(new Runnable() { // from class: cayg
            @Override // java.lang.Runnable
            public final void run() {
                cqbd cqbdVarD = cayi.a.d();
                cqbdVarD.I("setFutureResult");
                cbdg cbdgVar2 = cbdgVar;
                cqbdVarD.z("rowId", cbdgVar2.m());
                final cbcw cbcwVar2 = cbcwVar;
                cqbdVarD.A("result", cbcwVar2);
                cqbdVarD.r();
                cayi cayiVar = this.a;
                final caye cayeVarA = cayiVar.a(cbdgVar2);
                cayiVar.b.g(new dqsm() { // from class: cayb
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        return eiiy.k("ExecutionState::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: cayc
                    @Override // java.lang.Runnable
                    public final void run() {
                        cayeVarA.b.set(cbcwVar2);
                    }
                });
            }
        });
    }

    final boolean g(cbdg cbdgVar) {
        return this.c.containsKey(Long.valueOf(cbdgVar.m()));
    }
}
