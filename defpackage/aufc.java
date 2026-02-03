package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aufc {
    public static final /* synthetic */ aufb a(aufa aufaVar) {
        evsn evsnVarBuild = aufaVar.build();
        evsnVarBuild.getClass();
        return (aufb) evsnVarBuild;
    }

    public static final void b(aubq aubqVar, aufa aufaVar) {
        aufaVar.copyOnWrite();
        aufb aufbVar = (aufb) aufaVar.instance;
        aufb aufbVar2 = aufb.a;
        aufbVar.c = aubqVar;
        aufbVar.b |= 1;
    }

    public static final void c(evvp evvpVar, aufa aufaVar) {
        aufaVar.copyOnWrite();
        aufb aufbVar = (aufb) aufaVar.instance;
        aufb aufbVar2 = aufb.a;
        aufbVar.d = evvpVar;
        aufbVar.b |= 2;
    }
}
