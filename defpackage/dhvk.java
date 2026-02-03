package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvk {
    public static final dhvb a(dhvi dhviVar) {
        dhvb dhvbVar = ((dhvj) dhviVar.instance).c;
        if (dhvbVar == null) {
            dhvbVar = dhvb.a;
        }
        dhvbVar.getClass();
        return dhvbVar;
    }

    public static final /* synthetic */ dhvj b(dhvi dhviVar) {
        evsn evsnVarBuild = dhviVar.build();
        evsnVarBuild.getClass();
        return (dhvj) evsnVarBuild;
    }

    public static final void c(dhvb dhvbVar, dhvi dhviVar) {
        dhviVar.copyOnWrite();
        dhvj dhvjVar = (dhvj) dhviVar.instance;
        dhvj dhvjVar2 = dhvj.a;
        dhvjVar.c = dhvbVar;
        dhvjVar.b |= 1;
    }

    public static final /* synthetic */ void d(dhvn dhvnVar, dhvi dhviVar) {
        dhviVar.copyOnWrite();
        dhvj dhvjVar = (dhvj) dhviVar.instance;
        dhvj dhvjVar2 = dhvj.a;
        evtg evtgVar = dhvjVar.d;
        if (!evtgVar.c()) {
            dhvjVar.d = evsn.mutableCopy(evtgVar);
        }
        dhvjVar.d.add(dhvnVar);
    }
}
