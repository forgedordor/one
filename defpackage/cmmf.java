package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmf {
    public static final /* synthetic */ cmme a(cmmd cmmdVar) {
        evsn evsnVarBuild = cmmdVar.build();
        evsnVarBuild.getClass();
        return (cmme) evsnVarBuild;
    }

    public static final void b(cmmb cmmbVar, cmmd cmmdVar) {
        cmmbVar.getClass();
        cmmdVar.copyOnWrite();
        cmme cmmeVar = (cmme) cmmdVar.instance;
        cmme cmmeVar2 = cmme.a;
        cmmeVar.d = cmmbVar;
        cmmeVar.b |= 1;
    }

    public static final /* synthetic */ void c(Iterable iterable, cmmd cmmdVar) {
        iterable.getClass();
        cmmdVar.copyOnWrite();
        cmme cmmeVar = (cmme) cmmdVar.instance;
        cmme cmmeVar2 = cmme.a;
        evtg evtgVar = cmmeVar.c;
        if (!evtgVar.c()) {
            cmmeVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cmmeVar.c);
    }
}
