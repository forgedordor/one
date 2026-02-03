package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhl {
    public final evhi a;

    public evhl(evhi evhiVar) {
        this.a = evhiVar;
    }

    public final /* synthetic */ evhj a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (evhj) evsnVarBuild;
    }

    public final void b(evff evffVar) {
        evffVar.getClass();
        evhi evhiVar = this.a;
        evhiVar.copyOnWrite();
        evhj evhjVar = (evhj) evhiVar.instance;
        evhj evhjVar2 = evhj.a;
        evhjVar.d = evffVar;
        evhjVar.b |= 2;
    }

    public final void c() {
        evhi evhiVar = this.a;
        evhiVar.copyOnWrite();
        evhj evhjVar = (evhj) evhiVar.instance;
        evhj evhjVar2 = evhj.a;
        evhjVar.c = 3;
        evhjVar.b |= 1;
    }
}
