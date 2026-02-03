package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwp {
    private final enwz a;

    public enwp(enwz enwzVar) {
        this.a = enwzVar;
    }

    public final /* synthetic */ enxa a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (enxa) evsnVarBuild;
    }

    public final void b(enpl enplVar) {
        enwz enwzVar = this.a;
        enwzVar.copyOnWrite();
        enxa enxaVar = (enxa) enwzVar.instance;
        enxa enxaVar2 = enxa.a;
        enxaVar.d = enplVar;
        enxaVar.b |= 2;
    }

    public final void c(enwr enwrVar) {
        enwz enwzVar = this.a;
        enwzVar.copyOnWrite();
        enxa enxaVar = (enxa) enwzVar.instance;
        enxa enxaVar2 = enxa.a;
        enxaVar.c = enwrVar.N;
        enxaVar.b |= 1;
    }
}
