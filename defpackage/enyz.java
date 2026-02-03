package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyz {
    public static final /* synthetic */ enzl a(enzk enzkVar) {
        evsn evsnVarBuild = enzkVar.build();
        evsnVarBuild.getClass();
        return (enzl) evsnVarBuild;
    }

    public static final void b(int i, enzk enzkVar) {
        enzkVar.copyOnWrite();
        enzl enzlVar = (enzl) enzkVar.instance;
        enzl enzlVar2 = enzl.a;
        enzlVar.b |= 2;
        enzlVar.d = i;
    }

    public static final void c(int i, enzk enzkVar) {
        enzkVar.copyOnWrite();
        enzl enzlVar = (enzl) enzkVar.instance;
        enzl enzlVar2 = enzl.a;
        enzlVar.b |= 4;
        enzlVar.e = i;
    }

    public static final void d(int i, enzk enzkVar) {
        enzkVar.copyOnWrite();
        enzl enzlVar = (enzl) enzkVar.instance;
        enzl enzlVar2 = enzl.a;
        enzlVar.b |= 8;
        enzlVar.f = i;
    }

    public static final void e(int i, enzk enzkVar) {
        enzkVar.copyOnWrite();
        enzl enzlVar = (enzl) enzkVar.instance;
        enzl enzlVar2 = enzl.a;
        enzlVar.b |= 1;
        enzlVar.c = i;
    }
}
