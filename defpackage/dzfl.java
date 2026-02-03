package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfl implements dzfk {
    private final dzfu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final dzjf i;

    public dzfl(dzfu dzfuVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, dzjf dzjfVar) {
        this.a = dzfuVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.h = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
        this.i = dzjfVar;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (bool.booleanValue()) {
            return;
        }
        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 115, "PrimesApiImpl.java")).q("Primes instant initialization");
        try {
            eiiy.e();
            Iterator it = ((Set) fcsuVar.b()).iterator();
            while (it.hasNext()) {
                ((dzlo) it.next()).n();
            }
        } catch (RuntimeException e) {
            ekrg ekrgVar = dzfq.a;
            ((ekrd) ((ekrd) ((ekrd) ekrgVar.j()).g(e)).h("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", '{', "PrimesApiImpl.java")).q("Primes failed to initialize");
            dzfu dzfuVar2 = this.a;
            if (dzfuVar2.a) {
                return;
            }
            dzfuVar2.a = true;
            ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 33, "Shutdown.java")).q("Shutdown ...");
        }
    }

    @Override // defpackage.dzfk
    public final dzqg a() {
        return (dzqg) this.h.b();
    }

    @Override // defpackage.dzfk
    public final dzub b() {
        return ((dzuc) this.f.b()).d();
    }

    @Override // defpackage.dzfk
    public final void c(dzfh dzfhVar) {
        ((dzuc) this.f.b()).c(dzfhVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fcsu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [fcsu, java.lang.Object] */
    @Override // defpackage.dzfk
    public final void d() {
        dzjf dzjfVar = this.i;
        if (dzjfVar.a.getAndSet(true)) {
            return;
        }
        ((dzne) ((ejwt) dzjfVar.b).a.b()).k();
        ((dzqp) ((ejwt) dzjfVar.c).a.b()).d();
    }

    @Override // defpackage.dzfk
    public final void e(dzfh dzfhVar, feeg feegVar) {
        ((dzqp) this.d.b()).e(dzfhVar, feegVar);
    }

    @Override // defpackage.dzfk
    public final void f(dzrm dzrmVar) {
        ((dzrp) this.e.b()).a(dzrmVar);
    }

    @Override // defpackage.dzfk
    public final void g(dzfh dzfhVar) {
        ((dzuc) this.f.b()).e(dzfhVar);
    }

    @Override // defpackage.dzfk
    public final void h() {
        ((dzqp) this.d.b()).d();
    }

    @Override // defpackage.dzfk
    public final void i(dzub dzubVar, dzfh dzfhVar, feeg feegVar, dzua dzuaVar) {
        ((dzuc) this.f.b()).f(dzubVar, dzfhVar, feegVar, dzuaVar);
    }

    @Override // defpackage.dzfk
    public final boolean j() {
        return ((dzrl) this.c.b()).c();
    }

    @Override // defpackage.dzfk
    public final void k(dzfh dzfhVar, long j, long j2) {
        ((dztw) this.g.b()).a(dzfhVar, j, j2, null);
    }

    @Override // defpackage.dzfk
    public final void l(dzfh dzfhVar, dzua dzuaVar) {
        ((dzuc) this.f.b()).g(dzfhVar, null, null, dzuaVar);
    }
}
