package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqcg {
    public static final /* synthetic */ dqcf a(dqce dqceVar) {
        evsn evsnVarBuild = dqceVar.build();
        evsnVarBuild.getClass();
        return (dqcf) evsnVarBuild;
    }

    public static final /* synthetic */ void b(Iterable iterable, dqce dqceVar) {
        dqceVar.copyOnWrite();
        dqcf dqcfVar = (dqcf) dqceVar.instance;
        dqcf dqcfVar2 = dqcf.a;
        evsx evsxVar = dqcfVar.b;
        if (!evsxVar.c()) {
            dqcfVar.b = evsn.mutableCopy(evsxVar);
        }
        evpz.addAll(iterable, dqcfVar.b);
    }
}
