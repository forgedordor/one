package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtl {
    public static final /* synthetic */ crtk a(crtj crtjVar) {
        evsn evsnVarBuild = crtjVar.build();
        evsnVarBuild.getClass();
        return (crtk) evsnVarBuild;
    }

    public static final /* synthetic */ void b(eofj eofjVar, crtj crtjVar) {
        eofjVar.getClass();
        crtjVar.copyOnWrite();
        crtk crtkVar = (crtk) crtjVar.instance;
        evsy evsyVar = crtk.a;
        evsx evsxVar = crtkVar.g;
        if (!evsxVar.c()) {
            crtkVar.g = evsn.mutableCopy(evsxVar);
        }
        crtkVar.g.h(eofjVar.a());
    }

    public static final /* synthetic */ void c(crtj crtjVar) {
        crtjVar.copyOnWrite();
        crtk crtkVar = (crtk) crtjVar.instance;
        evsy evsyVar = crtk.a;
        evtg evtgVar = crtkVar.d;
        if (!evtgVar.c()) {
            crtkVar.d = evsn.mutableCopy(evtgVar);
        }
        crtkVar.d.add("US");
    }

    public static final /* synthetic */ void d(crtj crtjVar) {
        new evsz(((crtk) crtjVar.instance).g, crtk.b);
    }

    public static final void e(crtj crtjVar) {
        DesugarCollections.unmodifiableList(((crtk) crtjVar.instance).d).getClass();
    }
}
