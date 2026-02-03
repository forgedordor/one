package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpg {
    public static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static ekpf b(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new ekoz(set, set2);
    }

    public static ekpf c(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new ekox(set, set2);
    }

    public static ekpf d(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new ekov(set, set2);
    }

    public static HashSet e(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet hashSet = new HashSet();
        ekjc.l(hashSet, it);
        return hashSet;
    }

    public static HashSet f(Object... objArr) {
        HashSet hashSetG = g(objArr.length);
        Collections.addAll(hashSetG, objArr);
        return hashSetG;
    }

    public static HashSet g(int i) {
        return new HashSet(ekmi.a(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set h(Set set, ejwm ejwmVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof ekpc)) {
                set.getClass();
                return new ekpc(set, ejwmVar);
            }
            ekpc ekpcVar = (ekpc) set;
            return new ekpc(ekpcVar.a, ejws.a(ekpcVar.b, ejwmVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof ekpc)) {
            sortedSet.getClass();
            return new ekpd(sortedSet, ejwmVar);
        }
        ekpc ekpcVar2 = (ekpc) sortedSet;
        return new ekpd((SortedSet) ekpcVar2.a, ejws.a(ekpcVar2.b, ejwmVar));
    }

    public static Set i() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set j() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static TreeSet k(Iterable iterable) {
        TreeSet treeSet = new TreeSet();
        ekis.o(treeSet, iterable);
        return treeSet;
    }

    static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean m(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof ekni) {
            collection = ((ekni) collection).i();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? n(set, collection.iterator()) : ekjc.n(set.iterator(), collection);
    }

    static boolean n(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
