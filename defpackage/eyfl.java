package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfl {
    public final eyfm a;

    public eyfl(eyfm eyfmVar) {
        this.a = eyfmVar;
    }

    public final /* synthetic */ eyfn a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (eyfn) evsnVarBuild;
    }

    public final void b(evqs evqsVar) {
        eyfm eyfmVar = this.a;
        eyfmVar.copyOnWrite();
        eyfn eyfnVar = (eyfn) eyfmVar.instance;
        eyfn eyfnVar2 = eyfn.a;
        eyfnVar.b |= 2;
        eyfnVar.d = evqsVar;
    }

    public final void c(aubx aubxVar) {
        eyfm eyfmVar = this.a;
        eyfmVar.copyOnWrite();
        eyfn eyfnVar = (eyfn) eyfmVar.instance;
        eyfn eyfnVar2 = eyfn.a;
        eyfnVar.g = aubxVar;
        eyfnVar.b |= 16;
    }

    public final void d(evqs evqsVar) {
        eyfm eyfmVar = this.a;
        eyfmVar.copyOnWrite();
        eyfn eyfnVar = (eyfn) eyfmVar.instance;
        eyfn eyfnVar2 = eyfn.a;
        eyfnVar.b |= 1;
        eyfnVar.c = evqsVar;
    }

    public final void e(int i) {
        eyfm eyfmVar = this.a;
        eyfmVar.copyOnWrite();
        eyfn eyfnVar = (eyfn) eyfmVar.instance;
        eyfn eyfnVar2 = eyfn.a;
        eyfnVar.b |= 4;
        eyfnVar.e = i;
    }
}
