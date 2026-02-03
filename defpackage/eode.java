package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eode {
    public static final /* synthetic */ enln a(enll enllVar) {
        evsn evsnVarBuild = enllVar.build();
        evsnVarBuild.getClass();
        return (enln) evsnVarBuild;
    }

    public static final void b(int i, enll enllVar) {
        enllVar.copyOnWrite();
        enln enlnVar = (enln) enllVar.instance;
        enln enlnVar2 = enln.a;
        enlnVar.c = i - 1;
        enlnVar.b |= 1;
    }

    public static final void c(int i, enll enllVar) {
        enllVar.copyOnWrite();
        enln enlnVar = (enln) enllVar.instance;
        enln enlnVar2 = enln.a;
        enlnVar.d = dqcv.a(i);
        enlnVar.b |= 2;
    }
}
