package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyu {
    public static final /* synthetic */ engw a(engv engvVar) {
        evsn evsnVarBuild = engvVar.build();
        evsnVarBuild.getClass();
        return (engw) evsnVarBuild;
    }

    public static final void b(boolean z, engv engvVar) {
        engvVar.copyOnWrite();
        engw engwVar = (engw) engvVar.instance;
        engw engwVar2 = engw.a;
        engwVar.b |= 4;
        engwVar.e = z;
    }

    public static final void c(boolean z, engv engvVar) {
        engvVar.copyOnWrite();
        engw engwVar = (engw) engvVar.instance;
        engw engwVar2 = engw.a;
        engwVar.b |= 1;
        engwVar.c = z;
    }

    public static final void d(String str, engv engvVar) {
        engvVar.copyOnWrite();
        engw engwVar = (engw) engvVar.instance;
        engw engwVar2 = engw.a;
        engwVar.b |= 2;
        engwVar.d = str;
    }
}
