package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqbx {
    public static final /* synthetic */ dqbw a(dqbv dqbvVar) {
        evsn evsnVarBuild = dqbvVar.build();
        evsnVarBuild.getClass();
        return (dqbw) evsnVarBuild;
    }

    public static final void b(dqcf dqcfVar, dqbv dqbvVar) {
        dqbvVar.copyOnWrite();
        dqbw dqbwVar = (dqbw) dqbvVar.instance;
        dqbw dqbwVar2 = dqbw.a;
        dqbwVar.d = dqcfVar;
        dqbwVar.b |= 2;
    }

    public static final void c(dqcs dqcsVar, dqbv dqbvVar) {
        dqcsVar.getClass();
        dqbvVar.copyOnWrite();
        dqbw dqbwVar = (dqbw) dqbvVar.instance;
        dqbw dqbwVar2 = dqbw.a;
        dqbwVar.c = dqcsVar;
        dqbwVar.b |= 1;
    }
}
