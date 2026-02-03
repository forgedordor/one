package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aufy {
    public static final /* synthetic */ aufx a(aufs aufsVar) {
        evsn evsnVarBuild = aufsVar.build();
        evsnVarBuild.getClass();
        return (aufx) evsnVarBuild;
    }

    public static final void b(aufu aufuVar, aufs aufsVar) {
        aufuVar.getClass();
        aufsVar.copyOnWrite();
        aufx aufxVar = (aufx) aufsVar.instance;
        aufx aufxVar2 = aufx.a;
        aufxVar.d = aufuVar.e;
        aufxVar.b |= 2;
    }

    public static final void c(aufw aufwVar, aufs aufsVar) {
        aufwVar.getClass();
        aufsVar.copyOnWrite();
        aufx aufxVar = (aufx) aufsVar.instance;
        aufx aufxVar2 = aufx.a;
        aufxVar.c = aufwVar.d;
        aufxVar.b |= 1;
    }

    public static final void d(aufs aufsVar) {
        aufsVar.copyOnWrite();
        aufx aufxVar = (aufx) aufsVar.instance;
        aufx aufxVar2 = aufx.a;
        aufxVar.b |= 4;
        aufxVar.e = false;
    }
}
