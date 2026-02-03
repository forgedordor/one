package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enza {
    public static final /* synthetic */ enzq a(enzn enznVar) {
        evsn evsnVarBuild = enznVar.build();
        evsnVarBuild.getClass();
        return (enzq) evsnVarBuild;
    }

    public static final void b(enzp enzpVar, enzn enznVar) {
        enznVar.copyOnWrite();
        enzq enzqVar = (enzq) enznVar.instance;
        enzq enzqVar2 = enzq.a;
        enzqVar.e = enzpVar.o;
        enzqVar.b |= 1;
    }

    public static final void c(aiba aibaVar, enzn enznVar) {
        enznVar.copyOnWrite();
        enzq enzqVar = (enzq) enznVar.instance;
        enzq enzqVar2 = enzq.a;
        enzqVar.h = aibaVar.e;
        enzqVar.b |= 8;
    }

    public static final void d(evqs evqsVar, enzn enznVar) {
        enznVar.copyOnWrite();
        enzq enzqVar = (enzq) enznVar.instance;
        enzq enzqVar2 = enzq.a;
        enzqVar.b |= 2;
        enzqVar.f = evqsVar;
    }
}
