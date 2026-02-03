package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmt {
    public static final /* synthetic */ emjm a(emjk emjkVar) {
        evsn evsnVarBuild = emjkVar.build();
        evsnVarBuild.getClass();
        return (emjm) evsnVarBuild;
    }

    public static final void b(elhc elhcVar, emjk emjkVar) {
        elhcVar.getClass();
        emjkVar.copyOnWrite();
        emjm emjmVar = (emjm) emjkVar.instance;
        emjm emjmVar2 = emjm.a;
        emjmVar.d = elhcVar.a();
        emjmVar.b |= 2;
    }

    public static final void c(eobl eoblVar, emjk emjkVar) {
        emjkVar.copyOnWrite();
        emjm emjmVar = (emjm) emjkVar.instance;
        emjm emjmVar2 = emjm.a;
        emjmVar.c = eoblVar;
        emjmVar.b |= 1;
    }

    public static final void d(int i, emjk emjkVar) {
        emjkVar.copyOnWrite();
        emjm emjmVar = (emjm) emjkVar.instance;
        emjm emjmVar2 = emjm.a;
        emjmVar.f = elgz.a(i);
        emjmVar.b |= 8;
    }

    public static final void e(int i, emjk emjkVar) {
        emjkVar.copyOnWrite();
        emjm emjmVar = (emjm) emjkVar.instance;
        emjm emjmVar2 = emjm.a;
        emjmVar.e = elgz.a(i);
        emjmVar.b |= 4;
    }

    public static final void f(int i, emjk emjkVar) {
        emjkVar.copyOnWrite();
        emjm emjmVar = (emjm) emjkVar.instance;
        emjm emjmVar2 = emjm.a;
        emjmVar.g = i - 1;
        emjmVar.b |= 16;
    }
}
