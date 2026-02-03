package defpackage;

import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cocw {
    public static final fctc a = fctd.a(new fdae() { // from class: cocu
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = cocw.a;
            return new cocp(new fdat() { // from class: cocq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = cocw.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    if (cobt.f(cnyzVar) && cobt.d(collection) && !cobt.c(collection)) {
                        Object obj3 = null;
                        boolean z2 = false;
                        for (Object obj4 : collection) {
                            if (cobt.g((cnyz) obj4)) {
                                if (z2) {
                                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                                }
                                obj3 = obj4;
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        if (cocb.c(cnyzVar, (cnyz) obj3)) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }, new fdat() { // from class: cocr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = cocw.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    Object obj3 = null;
                    for (Object obj4 : collection) {
                        if (cobt.g((cnyz) obj4)) {
                            if (z) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj3 = obj4;
                        }
                    }
                    if (!z) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    cnyz cnyzVar2 = (cnyz) obj3;
                    cocx cocxVarA = cocw.a(cnyzVar2, cnyzVar);
                    List listB = cocw.b(collection, cnyzVar2, cocxVarA);
                    Collection<cnyz> collection2 = cocxVarA.b;
                    ArrayList arrayList = new ArrayList(fcva.p(collection2, 10));
                    for (cnyz cnyzVar3 : collection2) {
                        evqs evqsVar = cocxVarA.a.e;
                        evqsVar.getClass();
                        arrayList.add(new cobv(cnyzVar3, evqsVar));
                    }
                    return new cobx(listB, 5, arrayList);
                }
            });
        }
    });
    public static final fctc b = fctd.a(new fdae() { // from class: cocv
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = cocw.a;
            return new cocp(new fdat() { // from class: cocs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = cocw.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    if (cobt.g(cnyzVar) && cobt.c(collection)) {
                        Object obj3 = null;
                        boolean z2 = false;
                        for (Object obj4 : collection) {
                            if (cobt.f((cnyz) obj4)) {
                                if (z2) {
                                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                                }
                                obj3 = obj4;
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        if (cocb.c((cnyz) obj3, cnyzVar)) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }, new fdat() { // from class: coct
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = cocw.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    Object obj3 = null;
                    for (Object obj4 : collection) {
                        if (cobt.f((cnyz) obj4)) {
                            if (z) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj3 = obj4;
                        }
                    }
                    if (!z) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    cnyz cnyzVar2 = (cnyz) obj3;
                    cocx cocxVarA = cocw.a(cnyzVar, cnyzVar2);
                    List listB = cocw.b(collection, cnyzVar2, cocxVarA);
                    Collection<cnyz> collection2 = cocxVarA.b;
                    ArrayList arrayList = new ArrayList(fcva.p(collection2, 10));
                    for (cnyz cnyzVar3 : collection2) {
                        evqs evqsVar = cocxVarA.a.e;
                        evqsVar.getClass();
                        arrayList.add(new cobv(cnyzVar3, evqsVar));
                    }
                    return new cobx(listB, 6, arrayList);
                }
            });
        }
    });

    public static final cocx a(cnyz cnyzVar, cnyz cnyzVar2) {
        Collection collectionA = cobt.a(cnyzVar);
        ArrayList arrayList = new ArrayList(fcva.p(collectionA, 10));
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            arrayList.add(cocb.b((cnyz) it.next()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            cnyz cnyzVar3 = (cnyz) next;
            evvp evvpVar = (cnyzVar3.c == 5 ? (cnyt) cnyzVar3.d : cnyt.a).d;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            evvpVar.getClass();
            evvp evvpVar2 = (cnyzVar2.c == 4 ? (cnyr) cnyzVar2.d : cnyr.a).c;
            if (evvpVar2 == null) {
                evvpVar2 = evvp.a;
            }
            evvpVar2.getClass();
            evvp evvpVar3 = evxc.a;
            Boolean boolValueOf = Boolean.valueOf(evxb.a(evvpVar, evvpVar2) >= 0);
            Object arrayList2 = linkedHashMap.get(boolValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(boolValueOf, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        List list = (List) Map.EL.getOrDefault(linkedHashMap, true, fcvo.a);
        List list2 = (List) linkedHashMap.get(false);
        return new cocx(cnyzVar2, list, list2 != null ? cocb.a(list2) : null);
    }

    public static final List b(Collection collection, cnyz cnyzVar, cocx cocxVar) {
        return fcva.ae(fcva.ai(fcva.ai(fcva.ag(collection, cnyzVar), cocxVar.a), cocxVar.c));
    }
}
