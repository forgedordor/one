package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enog {
    public static final /* synthetic */ enol a(enoj enojVar) {
        evsn evsnVarBuild = enojVar.build();
        evsnVarBuild.getClass();
        return (enol) evsnVarBuild;
    }

    public static final void b(enoi enoiVar, enoj enojVar) {
        enojVar.copyOnWrite();
        enol enolVar = (enol) enojVar.instance;
        enol enolVar2 = enol.a;
        enolVar.g = enoiVar;
        enolVar.b |= 4;
    }

    public static final void c(evqs evqsVar, enoj enojVar) {
        enojVar.copyOnWrite();
        enol enolVar = (enol) enojVar.instance;
        enol enolVar2 = enol.a;
        enolVar.b |= 2;
        enolVar.f = evqsVar;
    }

    public static final void d(int i, enoj enojVar) {
        enojVar.copyOnWrite();
        enol enolVar = (enol) enojVar.instance;
        enol enolVar2 = enol.a;
        enolVar.e = i - 1;
        enolVar.b |= 1;
    }
}
