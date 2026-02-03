package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doij {
    public static final /* synthetic */ int a = 0;
    private static final doin[] b = doin.values();

    public static final dohq a(dohr dohrVar, dogp dogpVar) {
        dogpVar.getClass();
        return d(dohrVar, dogpVar, doin.b, null);
    }

    public static final dohq b(dohs dohsVar, dogp dogpVar) {
        dogpVar.getClass();
        doin doinVar = doin.b;
        doinVar.getClass();
        if (dohsVar instanceof dohr) {
            return d((dohr) dohsVar, dogpVar, doinVar, null);
        }
        if (dohsVar instanceof dohq) {
            return (dohq) dohsVar;
        }
        throw new fctg();
    }

    public static final dohq c(dohs dohsVar, doht dohtVar, Long l) {
        dohsVar.getClass();
        return e(dohsVar, dohtVar, doin.d, l);
    }

    public static final dohq d(dohr dohrVar, dogp dogpVar, final doin doinVar, Long l) {
        Object obj;
        doinVar.getClass();
        Iterable iterableC = dohrVar.c();
        dohq dohqVar = (dohq) fcva.O(iterableC);
        if (dohqVar == null) {
            throw new IllegalStateException("Variation list can't be empty");
        }
        int iOrdinal = doinVar.ordinal();
        do {
            final doin doinVar2 = b[iOrdinal];
            fdap fdapVar = doinVar2 == doinVar ? new fdap() { // from class: doih
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    doin doinVar3 = (doin) obj2;
                    int i = doij.a;
                    doinVar3.getClass();
                    return Boolean.valueOf(doinVar3.compareTo(doinVar) >= 0);
                }
            } : new fdap() { // from class: doii
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    doin doinVar3 = (doin) obj2;
                    int i = doij.a;
                    doinVar3.getClass();
                    return Boolean.valueOf(doinVar3 == doinVar2);
                }
            };
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterableC) {
                dohq dohqVar2 = (dohq) obj2;
                if (l == null || dohqVar2.a() <= l.longValue()) {
                    if (((Boolean) fdapVar.invoke(dohqVar2.n())).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (dogpVar.a(((dohq) obj3).l())) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long jA = ((dohq) next).a();
                    do {
                        Object next2 = it.next();
                        long jA2 = ((dohq) next2).a();
                        if (jA > jA2) {
                            jA = jA2;
                        }
                        if (jA > jA2) {
                            next = next2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            dohq dohqVar3 = (dohq) obj;
            if (dohqVar3 != null) {
                return dohqVar3;
            }
            iOrdinal--;
        } while (iOrdinal >= 0);
        return dohqVar;
    }

    public static final dohq e(dohs dohsVar, doht dohtVar, doin doinVar, Long l) {
        doinVar.getClass();
        if (dohsVar instanceof dohq) {
            return (dohq) dohsVar;
        }
        doif doifVarM = dohsVar.m();
        if (fdbq.f(doifVarM, doid.a)) {
            return d((dohr) dohsVar, dohtVar.a, doinVar, l);
        }
        if (fdbq.f(doifVarM, doie.a)) {
            return d((dohr) dohsVar, dohtVar.b, doinVar, l);
        }
        if (fdbq.f(doifVarM, doia.a)) {
            throw new IllegalArgumentException("Audio media doesn't have variations");
        }
        if (!(doifVarM instanceof dohz)) {
            throw new fctg();
        }
        doif doifVarM2 = dohsVar.m();
        Objects.toString(doifVarM2);
        throw new IllegalArgumentException("Unhandled Media Type ".concat(doifVarM2.toString()));
    }
}
