package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgc {
    public final evfw a;

    public evgc(evfw evfwVar) {
        this.a = evfwVar;
    }

    public final /* synthetic */ evfx a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (evfx) evsnVarBuild;
    }

    public final evhs b() {
        evhs evhsVar = ((evfx) this.a.instance).d;
        if (evhsVar == null) {
            evhsVar = evhs.a;
        }
        evhsVar.getClass();
        return evhsVar;
    }

    public final void c(evhs evhsVar) {
        evfw evfwVar = this.a;
        evfwVar.copyOnWrite();
        evfx evfxVar = (evfx) evfwVar.instance;
        evfx evfxVar2 = evfx.a;
        evfxVar.d = evhsVar;
        evfxVar.b |= 2;
    }
}
