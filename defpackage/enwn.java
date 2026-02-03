package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwn {
    public static final /* synthetic */ enfa a(enew enewVar) {
        evsn evsnVarBuild = enewVar.build();
        evsnVarBuild.getClass();
        return (enfa) evsnVarBuild;
    }

    public static final void b(boolean z, enew enewVar) {
        enewVar.copyOnWrite();
        enfa enfaVar = (enfa) enewVar.instance;
        enfa enfaVar2 = enfa.a;
        enfaVar.b |= 4;
        enfaVar.e = z;
    }

    public static final void c(int i, enew enewVar) {
        enewVar.copyOnWrite();
        enfa enfaVar = (enfa) enewVar.instance;
        enfa enfaVar2 = enfa.a;
        enfaVar.d = i - 1;
        enfaVar.b |= 2;
    }

    public static final void d(int i, enew enewVar) {
        enewVar.copyOnWrite();
        enfa enfaVar = (enfa) enewVar.instance;
        enfa enfaVar2 = enfa.a;
        enfaVar.c = i - 1;
        enfaVar.b |= 1;
    }
}
