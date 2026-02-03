package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshm implements ejvr {
    public abstract void a(evms evmsVar, etnu etnuVar);

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evms evmsVar = (evms) obj;
        etnu etnuVar = (etnu) etnx.a.createBuilder();
        e(evmsVar, etnuVar);
        g(evmsVar, etnuVar);
        o(evmsVar, etnuVar);
        b(evmsVar, etnuVar);
        i(evmsVar, etnuVar);
        j(evmsVar, etnuVar);
        n(evmsVar, etnuVar);
        m(evmsVar, etnuVar);
        d(evmsVar, etnuVar);
        k(evmsVar, etnuVar);
        l(evmsVar, etnuVar);
        f(evmsVar, etnuVar);
        h(evmsVar, etnuVar);
        c(evmsVar, etnuVar);
        a(evmsVar, etnuVar);
        if ((evmsVar.b & 8) != 0) {
            ejvj ejvjVar = dsjj.b;
            evmr evmrVarB = evmr.b(evmsVar.f);
            if (evmrVarB == null) {
                evmrVarB = evmr.PULSE_ANIMATION_TYPE_UNSPECIFIED;
            }
            etnw etnwVar = (etnw) ejvjVar.fM(evmrVarB);
            etnuVar.copyOnWrite();
            etnx etnxVar = (etnx) etnuVar.instance;
            etnxVar.q = etnwVar.c;
            etnxVar.b |= 4096;
        }
        if ((evmsVar.b & 32) != 0) {
            float f = evmsVar.g;
            etnuVar.copyOnWrite();
            etnx etnxVar2 = (etnx) etnuVar.instance;
            etnxVar2.b |= 8192;
            etnxVar2.r = f;
        }
        if ((evmsVar.b & 64) != 0) {
            boolean z = evmsVar.h;
            etnuVar.copyOnWrite();
            etnx etnxVar3 = (etnx) etnuVar.instance;
            etnxVar3.b |= 16384;
            etnxVar3.s = z;
        }
        return (etnx) etnuVar.build();
    }

    public abstract void b(evms evmsVar, etnu etnuVar);

    public abstract void c(evms evmsVar, etnu etnuVar);

    public abstract void d(evms evmsVar, etnu etnuVar);

    public abstract void e(evms evmsVar, etnu etnuVar);

    public abstract void f(evms evmsVar, etnu etnuVar);

    public abstract void g(evms evmsVar, etnu etnuVar);

    public abstract void h(evms evmsVar, etnu etnuVar);

    public abstract void i(evms evmsVar, etnu etnuVar);

    public abstract void j(evms evmsVar, etnu etnuVar);

    public abstract void k(evms evmsVar, etnu etnuVar);

    public abstract void l(evms evmsVar, etnu etnuVar);

    public abstract void m(evms evmsVar, etnu etnuVar);

    public abstract void n(evms evmsVar, etnu etnuVar);

    public abstract void o(evms evmsVar, etnu etnuVar);
}
