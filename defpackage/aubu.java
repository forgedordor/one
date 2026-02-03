package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aubu {
    public static final /* synthetic */ aubt a(aubs aubsVar) {
        evsn evsnVarBuild = aubsVar.build();
        evsnVarBuild.getClass();
        return (aubt) evsnVarBuild;
    }

    public static final void b(evqs evqsVar, aubs aubsVar) {
        evqsVar.getClass();
        aubsVar.copyOnWrite();
        aubt aubtVar = (aubt) aubsVar.instance;
        aubt aubtVar2 = aubt.a;
        aubtVar.b |= 2;
        aubtVar.d = evqsVar;
    }

    public static final void c(aubx aubxVar, aubs aubsVar) {
        aubxVar.getClass();
        aubsVar.copyOnWrite();
        aubt aubtVar = (aubt) aubsVar.instance;
        aubt aubtVar2 = aubt.a;
        aubtVar.c = aubxVar;
        aubtVar.b |= 1;
    }
}
