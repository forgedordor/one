package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epmt {
    public static final /* synthetic */ epms a(epmq epmqVar) {
        evsn evsnVarBuild = epmqVar.build();
        evsnVarBuild.getClass();
        return (epms) evsnVarBuild;
    }

    public static final void b(epnc epncVar, epmq epmqVar) {
        epmqVar.copyOnWrite();
        epms epmsVar = (epms) epmqVar.instance;
        epms epmsVar2 = epms.a;
        epmsVar.c = epncVar;
        epmsVar.b = 16;
    }
}
