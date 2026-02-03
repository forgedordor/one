package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cirh {
    public static final /* synthetic */ cirg a(cirf cirfVar) {
        evsn evsnVarBuild = cirfVar.build();
        evsnVarBuild.getClass();
        return (cirg) evsnVarBuild;
    }

    public static final void b(int i, cirf cirfVar) {
        cirfVar.copyOnWrite();
        cirg cirgVar = (cirg) cirfVar.instance;
        cirg cirgVar2 = cirg.a;
        cirgVar.e = i;
    }

    public static final void c(String str, cirf cirfVar) {
        cirfVar.copyOnWrite();
        cirg cirgVar = (cirg) cirfVar.instance;
        cirg cirgVar2 = cirg.a;
        cirgVar.b = str;
    }

    public static final void d(int i, cirf cirfVar) {
        cirfVar.copyOnWrite();
        cirg cirgVar = (cirg) cirfVar.instance;
        cirg cirgVar2 = cirg.a;
        cirgVar.f = i;
    }

    public static final /* synthetic */ void e(Iterable iterable, cirf cirfVar) {
        cirfVar.copyOnWrite();
        cirg cirgVar = (cirg) cirfVar.instance;
        cirg cirgVar2 = cirg.a;
        evtg evtgVar = cirgVar.c;
        if (!evtgVar.c()) {
            cirgVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cirgVar.c);
    }

    public static final void f(int i, cirf cirfVar) {
        cirfVar.copyOnWrite();
        cirg cirgVar = (cirg) cirfVar.instance;
        cirg cirgVar2 = cirg.a;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        cirgVar.d = i - 2;
    }

    public static final void g(cirf cirfVar) {
        DesugarCollections.unmodifiableList(((cirg) cirfVar.instance).c).getClass();
    }
}
