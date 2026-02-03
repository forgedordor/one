package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqge implements fdae {
    final /* synthetic */ int a;
    final /* synthetic */ dqiu b;
    final /* synthetic */ dqcs c;
    final /* synthetic */ hri d;

    public dqge(int i, dqiu dqiuVar, hri hriVar, dqcs dqcsVar) {
        this.a = i;
        this.b = dqiuVar;
        this.d = hriVar;
        this.c = dqcsVar;
    }

    @Override // defpackage.fdae
    public final /* synthetic */ Object invoke() {
        this.d.i(this.a);
        dqbv dqbvVar = (dqbv) dqbw.a.createBuilder();
        dqbvVar.getClass();
        dqbx.c(this.c, dqbvVar);
        this.b.h.invoke(dqbx.a(dqbvVar));
        return fctx.a;
    }
}
