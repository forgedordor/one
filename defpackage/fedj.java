package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedj extends evsf implements evui {
    public fedj() {
        super(fedk.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fedi a(int i) {
        return (fedi) ((fedk) this.instance).m.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fedi b(int i) {
        return (fedi) ((fedk) this.instance).o.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fedi c(int i) {
        return (fedi) ((fedk) this.instance).l.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fedi d(int i) {
        return (fedi) ((fedk) this.instance).k.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fedi e(int i) {
        return (fedi) ((fedk) this.instance).h.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fedi f(int i) {
        return (fedi) ((fedk) this.instance).i.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fedi g(int i) {
        return (fedi) ((fedk) this.instance).j.get(i);
    }

    public final void h(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fedkVar.a();
        evpz.addAll(iterable, fedkVar.m);
    }

    public final void i(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fedkVar.b();
        evpz.addAll(iterable, fedkVar.o);
    }

    public final void j(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        evtg evtgVar = fedkVar.r;
        if (!evtgVar.c()) {
            fedkVar.r = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, fedkVar.r);
    }

    public final void k(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        evtg evtgVar = fedkVar.q;
        if (!evtgVar.c()) {
            fedkVar.q = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, fedkVar.q);
    }

    public final void l(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fedkVar.c();
        evpz.addAll(iterable, fedkVar.l);
    }

    public final void m(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fedkVar.d();
        evpz.addAll(iterable, fedkVar.k);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fedkVar.e();
        evpz.addAll(iterable, fedkVar.h);
    }

    public final void o(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fedkVar.f();
        evpz.addAll(iterable, fedkVar.i);
    }

    public final void p(Iterable iterable) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fedkVar.g();
        evpz.addAll(iterable, fedkVar.j);
    }

    public final void q(int i, fedi fediVar) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fediVar.getClass();
        fedkVar.a();
        fedkVar.m.set(i, fediVar);
    }

    public final void r(int i, fedi fediVar) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fediVar.getClass();
        fedkVar.b();
        fedkVar.o.set(i, fediVar);
    }

    public final void s(int i, fedi fediVar) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fediVar.getClass();
        fedkVar.c();
        fedkVar.l.set(i, fediVar);
    }

    public final void t(int i, fedi fediVar) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fediVar.getClass();
        fedkVar.d();
        fedkVar.k.set(i, fediVar);
    }

    public final void u(int i, fedi fediVar) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fediVar.getClass();
        fedkVar.e();
        fedkVar.h.set(i, fediVar);
    }

    public final void v(int i, fedi fediVar) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fediVar.getClass();
        fedkVar.f();
        fedkVar.i.set(i, fediVar);
    }

    public final void w(int i, fedi fediVar) {
        copyOnWrite();
        fedk fedkVar = (fedk) this.instance;
        fedk fedkVar2 = fedk.a;
        fediVar.getClass();
        fedkVar.g();
        fedkVar.j.set(i, fediVar);
    }
}
