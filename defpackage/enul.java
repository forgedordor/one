package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enul {
    public final emzm a;

    public enul(emzm emzmVar) {
        this.a = emzmVar;
    }

    public final /* synthetic */ emzn a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (emzn) evsnVarBuild;
    }

    public final void b(emvw emvwVar) {
        emzm emzmVar = this.a;
        emzmVar.copyOnWrite();
        emzn emznVar = (emzn) emzmVar.instance;
        emzn emznVar2 = emzn.a;
        emznVar.i = emvwVar;
        emznVar.b |= 32;
    }

    public final void c(long j) {
        emzm emzmVar = this.a;
        emzmVar.copyOnWrite();
        emzn emznVar = (emzn) emzmVar.instance;
        emzn emznVar2 = emzn.a;
        emznVar.b |= 1;
        emznVar.c = j;
    }

    public final /* synthetic */ void d(Iterable iterable) {
        iterable.getClass();
        emzm emzmVar = this.a;
        emzmVar.copyOnWrite();
        emzn emznVar = (emzn) emzmVar.instance;
        emzn emznVar2 = emzn.a;
        evtg evtgVar = emznVar.d;
        if (!evtgVar.c()) {
            emznVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, emznVar.d);
    }

    public final /* synthetic */ void e() {
        DesugarCollections.unmodifiableList(((emzn) this.a.instance).d).getClass();
    }
}
