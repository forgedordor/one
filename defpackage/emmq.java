package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmq {
    public static final /* synthetic */ emga a(emfs emfsVar) {
        evsn evsnVarBuild = emfsVar.build();
        evsnVarBuild.getClass();
        return (emga) evsnVarBuild;
    }

    public static final void b(String str, emfs emfsVar) {
        emfsVar.copyOnWrite();
        emga emgaVar = (emga) emfsVar.instance;
        emga emgaVar2 = emga.a;
        emgaVar.b |= 1;
        emgaVar.c = str;
    }

    public static final void c(emfv emfvVar, emfs emfsVar) {
        emfsVar.copyOnWrite();
        emga emgaVar = (emga) emfsVar.instance;
        emga emgaVar2 = emga.a;
        emgaVar.e = emfvVar.e;
        emgaVar.b |= 4;
    }

    public static final void d(emfy emfyVar, emfs emfsVar) {
        emfsVar.copyOnWrite();
        emga emgaVar = (emga) emfsVar.instance;
        emga emgaVar2 = emga.a;
        emgaVar.d = emfyVar.e;
        emgaVar.b |= 2;
    }

    public static final void e(int i, emfs emfsVar) {
        emfsVar.copyOnWrite();
        emga emgaVar = (emga) emfsVar.instance;
        emga emgaVar2 = emga.a;
        emgaVar.h = i - 1;
        emgaVar.b |= 32;
    }

    public static final void f(int i, emfs emfsVar) {
        emfsVar.copyOnWrite();
        emga emgaVar = (emga) emfsVar.instance;
        emga emgaVar2 = emga.a;
        emgaVar.f = i - 1;
        emgaVar.b |= 8;
    }
}
