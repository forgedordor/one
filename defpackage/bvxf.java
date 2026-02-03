package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvxf {
    public static final /* synthetic */ bvxc a(bvxb bvxbVar) {
        evsn evsnVarBuild = bvxbVar.build();
        evsnVarBuild.getClass();
        return (bvxc) evsnVarBuild;
    }

    public static final void b(String str, bvxb bvxbVar) {
        bvxbVar.copyOnWrite();
        bvxc bvxcVar = (bvxc) bvxbVar.instance;
        bvxc bvxcVar2 = bvxc.a;
        bvxcVar.b = str;
    }

    public static final /* synthetic */ void c(Iterable iterable, bvxb bvxbVar) {
        bvxbVar.copyOnWrite();
        bvxc bvxcVar = (bvxc) bvxbVar.instance;
        bvxc bvxcVar2 = bvxc.a;
        evtg evtgVar = bvxcVar.d;
        if (!evtgVar.c()) {
            bvxcVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, bvxcVar.d);
    }

    public static final /* synthetic */ void d(Iterable iterable, bvxb bvxbVar) {
        bvxbVar.copyOnWrite();
        bvxc bvxcVar = (bvxc) bvxbVar.instance;
        bvxc bvxcVar2 = bvxc.a;
        evtg evtgVar = bvxcVar.c;
        if (!evtgVar.c()) {
            bvxcVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, bvxcVar.c);
    }

    public static final void e(bvxb bvxbVar) {
        DesugarCollections.unmodifiableList(((bvxc) bvxbVar.instance).d).getClass();
    }
}
