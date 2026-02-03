package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enmp {
    public static final /* synthetic */ emrt a(emrl emrlVar) {
        evsn evsnVarBuild = emrlVar.build();
        evsnVarBuild.getClass();
        return (emrt) evsnVarBuild;
    }

    public static final void b(int i, emrl emrlVar) {
        emrlVar.copyOnWrite();
        emrt emrtVar = (emrt) emrlVar.instance;
        emrt emrtVar2 = emrt.a;
        emrtVar.i = i - 1;
        emrtVar.b |= 64;
    }

    public static final void c(int i, emrl emrlVar) {
        emrlVar.copyOnWrite();
        emrt emrtVar = (emrt) emrlVar.instance;
        emrt emrtVar2 = emrt.a;
        emrtVar.c = i - 1;
        emrtVar.b |= 1;
    }
}
