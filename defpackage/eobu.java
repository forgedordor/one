package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobu {
    private final enke a;

    public eobu(enke enkeVar) {
        this.a = enkeVar;
    }

    public final /* synthetic */ enkf a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (enkf) evsnVarBuild;
    }

    public final void b(enxa enxaVar) {
        enke enkeVar = this.a;
        enkeVar.copyOnWrite();
        enkf enkfVar = (enkf) enkeVar.instance;
        enkf enkfVar2 = enkf.a;
        enkfVar.d = enxaVar;
        enkfVar.b |= 2;
    }

    public final void c(int i) {
        enke enkeVar = this.a;
        enkeVar.copyOnWrite();
        enkf enkfVar = (enkf) enkeVar.instance;
        enkf enkfVar2 = enkf.a;
        enkfVar.c = i - 1;
        enkfVar.b |= 1;
    }
}
