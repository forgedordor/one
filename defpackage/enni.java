package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enni {
    public static final /* synthetic */ emsm a(emsf emsfVar) {
        evsn evsnVarBuild = emsfVar.build();
        evsnVarBuild.getClass();
        return (emsm) evsnVarBuild;
    }

    public static final void b(int i, emsf emsfVar) {
        emsfVar.copyOnWrite();
        emsm emsmVar = (emsm) emsfVar.instance;
        emsm emsmVar2 = emsm.a;
        emsmVar.b |= 4;
        emsmVar.i = i;
    }

    public static final void c(emss emssVar, emsf emsfVar) {
        emsfVar.copyOnWrite();
        emsm emsmVar = (emsm) emsfVar.instance;
        emsm emsmVar2 = emsm.a;
        emsmVar.g = emssVar;
        emsmVar.b |= 1;
    }

    public static final void d(int i, emsf emsfVar) {
        emsfVar.copyOnWrite();
        emsm emsmVar = (emsm) emsfVar.instance;
        emsm emsmVar2 = emsm.a;
        emsmVar.b |= 2;
        emsmVar.h = i;
    }
}
