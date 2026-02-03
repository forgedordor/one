package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyt {
    public static final /* synthetic */ enys a(enyi enyiVar) {
        evsn evsnVarBuild = enyiVar.build();
        evsnVarBuild.getClass();
        return (enys) evsnVarBuild;
    }

    public static final void b(enym enymVar, enyi enyiVar) {
        enyiVar.copyOnWrite();
        enys enysVar = (enys) enyiVar.instance;
        enys enysVar2 = enys.a;
        enysVar.e = enymVar;
        enysVar.b |= 256;
    }

    public static final void c(int i, enyi enyiVar) {
        enyiVar.copyOnWrite();
        enys enysVar = (enys) enyiVar.instance;
        enys enysVar2 = enys.a;
        enysVar.c = i - 1;
        enysVar.b |= 1;
    }
}
