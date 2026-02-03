package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvqs {
    public static final bvqm a(bvqp bvqpVar) {
        bvqm bvqmVar = ((bvqr) bvqpVar.instance).h;
        if (bvqmVar == null) {
            bvqmVar = bvqm.a;
        }
        bvqmVar.getClass();
        return bvqmVar;
    }

    public static final /* synthetic */ bvqr b(bvqp bvqpVar) {
        evsn evsnVarBuild = bvqpVar.build();
        evsnVarBuild.getClass();
        return (bvqr) evsnVarBuild;
    }

    public static final void c(bvqm bvqmVar, bvqp bvqpVar) {
        bvqpVar.copyOnWrite();
        bvqr bvqrVar = (bvqr) bvqpVar.instance;
        bvqr bvqrVar2 = bvqr.a;
        bvqrVar.h = bvqmVar;
        bvqrVar.b |= 2;
    }

    public static final void d(boolean z, bvqp bvqpVar) {
        bvqpVar.copyOnWrite();
        bvqr bvqrVar = (bvqr) bvqpVar.instance;
        bvqr bvqrVar2 = bvqr.a;
        bvqrVar.j = z;
    }

    public static final void e(bvqj bvqjVar, bvqp bvqpVar) {
        bvqpVar.copyOnWrite();
        bvqr bvqrVar = (bvqr) bvqpVar.instance;
        bvqr bvqrVar2 = bvqr.a;
        bvqrVar.e = bvqjVar;
        bvqrVar.b |= 1;
    }

    public static final void f(bvqq bvqqVar, bvqp bvqpVar) {
        bvqqVar.getClass();
        bvqpVar.copyOnWrite();
        bvqr bvqrVar = (bvqr) bvqpVar.instance;
        bvqr bvqrVar2 = bvqr.a;
        bvqrVar.c = bvqqVar.a();
    }

    public static final /* synthetic */ void g(Iterable iterable, bvqp bvqpVar) {
        bvqpVar.copyOnWrite();
        bvqr bvqrVar = (bvqr) bvqpVar.instance;
        bvqr bvqrVar2 = bvqr.a;
        evtg evtgVar = bvqrVar.f;
        if (!evtgVar.c()) {
            bvqrVar.f = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, bvqrVar.f);
    }

    public static final /* synthetic */ void h(Iterable iterable, bvqp bvqpVar) {
        bvqpVar.copyOnWrite();
        bvqr bvqrVar = (bvqr) bvqpVar.instance;
        bvqr bvqrVar2 = bvqr.a;
        evtg evtgVar = bvqrVar.d;
        if (!evtgVar.c()) {
            bvqrVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, bvqrVar.d);
    }

    public static final void j(bvqp bvqpVar) {
        DesugarCollections.unmodifiableList(((bvqr) bvqpVar.instance).d).getClass();
    }
}
