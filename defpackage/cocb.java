package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cocb {
    public static final cnyz a(Collection collection) {
        collection.getClass();
        ArrayList<cnyz> arrayList = new ArrayList();
        for (Object obj : collection) {
            if (cobt.g((cnyz) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        for (cnyz cnyzVar : arrayList) {
            evvp evvpVar = (cnyzVar.c == 5 ? (cnyt) cnyzVar.d : cnyt.a).d;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            arrayList2.add(evvpVar);
        }
        evvp evvpVar2 = evxc.a;
        evxb evxbVar = evxb.a;
        evxbVar.getClass();
        evvp evvpVarB = (evvp) fcva.U(arrayList2, evxbVar);
        ArrayList arrayList3 = new ArrayList(fcva.p(arrayList, 10));
        for (cnyz cnyzVar2 : arrayList) {
            evvp evvpVar3 = (cnyzVar2.c == 5 ? (cnyt) cnyzVar2.d : cnyt.a).d;
            if (evvpVar3 == null) {
                evvpVar3 = evvp.a;
            }
            arrayList3.add(evvpVar3);
        }
        evxbVar.getClass();
        evvp evvpVarB2 = (evvp) fcva.V(arrayList3, evxbVar);
        cnyz cnyzVar3 = (cnyz) fcva.P(arrayList);
        if (cnyzVar3 == null) {
            return null;
        }
        cnyu cnyuVar = (cnyu) cnyzVar3.toBuilder();
        cnyuVar.getClass();
        DesugarCollections.unmodifiableList(((cnyz) cnyuVar.instance).h).getClass();
        cnzi.i(cnyuVar);
        DesugarCollections.unmodifiableList(((cnyz) cnyuVar.instance).h).getClass();
        List listAg = fcva.ag(arrayList, cnyzVar3);
        cnyuVar.copyOnWrite();
        cnyz cnyzVar4 = (cnyz) cnyuVar.instance;
        cnyzVar4.a();
        evpz.addAll(listAg, cnyzVar4.h);
        cnys cnysVar = (cnys) cnzi.b(cnyuVar).toBuilder();
        cnysVar.getClass();
        if (evvpVarB2 == null) {
            evvpVarB2 = cnzh.b(cnysVar);
        }
        cnzh.c(evvpVarB2, cnysVar);
        if (evvpVarB == null) {
            evvpVarB = cnzh.b(cnysVar);
        }
        cnzh.d(evvpVarB, cnysVar);
        cnzi.f(cnzh.a(cnysVar), cnyuVar);
        return cnzi.c(cnyuVar);
    }

    public static final cnyz b(cnyz cnyzVar) {
        cnyzVar.getClass();
        if (!cobt.g(cnyzVar)) {
            return cnyzVar;
        }
        cnyu cnyuVar = (cnyu) cnyzVar.toBuilder();
        cnyuVar.getClass();
        cnys cnysVar = (cnys) cnzi.b(cnyuVar).toBuilder();
        cnysVar.getClass();
        cnzh.c(cnzh.b(cnysVar), cnysVar);
        cnzh.d(cnzh.b(cnysVar), cnysVar);
        cnzi.f(cnzh.a(cnysVar), cnyuVar);
        return cnzi.c(cnyuVar);
    }

    public static final boolean c(cnyz cnyzVar, cnyz cnyzVar2) {
        cnyzVar.getClass();
        cnyzVar2.getClass();
        Collection<cnyz> collectionA = cobt.a(cnyzVar2);
        if (collectionA.isEmpty()) {
            return false;
        }
        for (cnyz cnyzVar3 : collectionA) {
            evvp evvpVar = (cnyzVar3.c == 5 ? (cnyt) cnyzVar3.d : cnyt.a).f;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            evvpVar.getClass();
            evvp evvpVar2 = (cnyzVar.c == 4 ? (cnyr) cnyzVar.d : cnyr.a).c;
            if (evvpVar2 == null) {
                evvpVar2 = evvp.a;
            }
            evvpVar2.getClass();
            evvp evvpVar3 = evxc.a;
            if (evxb.a(evvpVar, evvpVar2) >= 0) {
                return true;
            }
        }
        return false;
    }
}
