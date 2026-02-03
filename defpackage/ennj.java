package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennj {
    public static final /* synthetic */ emss a(emsn emsnVar) {
        evsn evsnVarBuild = emsnVar.build();
        evsnVarBuild.getClass();
        return (emss) evsnVarBuild;
    }

    public static final void b(emsp emspVar, emsn emsnVar) {
        emspVar.getClass();
        emsnVar.copyOnWrite();
        emss emssVar = (emss) emsnVar.instance;
        emss emssVar2 = emss.a;
        emssVar.c = emspVar.v;
        emssVar.b |= 1;
    }

    public static final void c(emsr emsrVar, emsn emsnVar) {
        emsnVar.copyOnWrite();
        emss emssVar = (emss) emsnVar.instance;
        emss emssVar2 = emss.a;
        emssVar.d = emsrVar.e;
        emssVar.b |= 2;
    }
}
