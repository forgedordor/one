package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcvm extends fcvj {
    public static final int E(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                fcva.l();
            }
        }
        return i;
    }

    public static final int F(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                fcva.m();
            }
            if (fdbq.f(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int G(List list, Object obj) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static final int H(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static final Comparable I(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Comparable J(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Float K(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Iterable L(final Iterable iterable) {
        iterable.getClass();
        return new fcvw(new fdae() { // from class: fcvk
            @Override // defpackage.fdae
            public final Object invoke() {
                return iterable.iterator();
            }
        });
    }

    public static final Object M(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return fcva.N((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object N(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final Object O(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final Object P(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object Q(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final Object R(Iterable iterable) {
        if (iterable instanceof List) {
            return fcva.S((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final Object S(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(fcva.e(list));
    }

    public static final Object T(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Object U(Iterable iterable, Comparator comparator) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Object V(Iterable iterable, Comparator comparator) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Object W(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return fcva.X((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object X(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final Object Y(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final HashSet Z(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(fcwa.a(fcva.p(iterable, 12)));
        fcva.aG(iterable, hashSet);
        return hashSet;
    }

    public static final double[] aA(Collection collection) {
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = ((Number) it.next()).doubleValue();
            i++;
        }
        return dArr;
    }

    public static final float[] aB(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static final int[] aC(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static final long[] aD(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final void aE(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, fdap fdapVar) throws IOException {
        iterable.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            fdgn.a(appendable, next, fdapVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String aF(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, fdap fdapVar, int i) {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        fcva.aE(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : fdapVar);
        return sb.toString();
    }

    public static final void aG(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final List aH(Iterable iterable, int i, boolean z, fdap fdapVar) {
        fcwr.b(2, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itA = fcwr.a(iterable.iterator(), 2, i, z, true);
            while (itA.hasNext()) {
                arrayList.add(fdapVar.invoke((List) itA.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        fcwg fcwgVar = new fcwg(list);
        while (i2 >= 0 && i2 < size) {
            int iG = fddu.g(2, size - i2);
            if (!z && iG < 2) {
                break;
            }
            int i3 = iG + i2;
            fcud.d(i2, i3, fcwgVar.a.size());
            fcwgVar.b = i2;
            fcwgVar.c = i3 - i2;
            arrayList2.add(fdapVar.invoke(fcwgVar));
            i2 += i;
        }
        return arrayList2;
    }

    public static /* synthetic */ void aI(Iterable iterable, Appendable appendable, fdap fdapVar, int i) {
        fdap fdapVar2 = (i & 64) != 0 ? null : fdapVar;
        CharSequence charSequence = (i & 32) != 0 ? "..." : null;
        int i2 = (i & 16) != 0 ? -1 : 0;
        CharSequence charSequence2 = (i & 8) != 0 ? "" : null;
        fcva.aE(iterable, appendable, (i & 2) != 0 ? ", " : "\n", (i & 4) != 0 ? "" : null, charSequence2, i2, charSequence, fdapVar2);
    }

    public static final List aa(Iterable iterable, int i) {
        iterable.getClass();
        fcwr.b(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itA = fcwr.a(iterable.iterator(), i, i, true, false);
            while (itA.hasNext()) {
                arrayList.add((List) itA.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int iG = fddu.g(i, size - i2);
            ArrayList arrayList3 = new ArrayList(iG);
            for (int i3 = 0; i3 < iG; i3++) {
                arrayList3.add(list.get(i3 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static final List ab(Iterable iterable) {
        return fcva.ao(fcva.au(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List ac(Iterable iterable, int i) {
        iterable.getClass();
        int size = iterable.size() - i;
        if (size <= 0) {
            return fcvo.a;
        }
        if (size == 1) {
            return fcva.b(fcva.R(iterable));
        }
        ArrayList arrayList = new ArrayList(size);
        if (iterable instanceof RandomAccess) {
            int size2 = iterable.size();
            while (i < size2) {
                arrayList.add(iterable.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = iterable.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final List ad(List list, int i) {
        return fcva.am(list, fddu.f(list.size() - i, 0));
    }

    public static final List ae(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List af(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionV = fcva.v(iterable2);
        if (collectionV.isEmpty()) {
            return fcva.ao(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionV.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List ag(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && fdbq.f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final List ah(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            fcva.y(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final List ai(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List aj(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return fcva.ao(iterable);
        }
        List listAp = fcva.ap(iterable);
        Collections.reverse(listAp);
        return listAp;
    }

    public static final List ak(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listAp = fcva.ap(iterable);
            fcva.r(listAp);
            return listAp;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return fcva.ao(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return fcur.c(array);
    }

    public static final List al(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listAp = fcva.ap(iterable);
            fcva.s(listAp, comparator);
            return listAp;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return fcva.ao(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        fcur.e(array, comparator);
        return fcur.c(array);
    }

    public static final List am(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return fcvo.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return fcva.ao(iterable);
            }
            if (i == 1) {
                return fcva.b(fcva.M(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return fcva.j(arrayList);
    }

    public static final List an(List list, int i) {
        list.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return fcvo.a;
        }
        int size = list.size();
        if (i >= size) {
            return fcva.ao(list);
        }
        if (i == 1) {
            return fcva.b(fcva.S(list));
        }
        int i2 = size - i;
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            while (i2 < size) {
                arrayList.add(list.get(i2));
                i2++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final List ao(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return fcva.j(fcva.ap(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return fcvo.a;
        }
        if (size != 1) {
            return fcva.aq(collection);
        }
        return fcva.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List ap(Iterable iterable) {
        if (iterable instanceof Collection) {
            return fcva.aq((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        fcva.aG(iterable, arrayList);
        return arrayList;
    }

    public static final List aq(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List ar(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(fcva.p(iterable, 10), fcva.p(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new fcti(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final Set as(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set setAu = fcva.au(iterable);
        setAu.retainAll(fcva.v(iterable2));
        return setAu;
    }

    public static final Set at(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set setAu = fcva.au(iterable);
        fcva.B(setAu, iterable2);
        return setAu;
    }

    public static final Set au(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        fcva.aG(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final Set av(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            fcva.aG(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : fcwm.b(linkedHashSet.iterator().next()) : fcvq.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return fcvq.a;
        }
        if (size2 == 1) {
            return fcwm.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(fcwa.a(collection.size()));
        fcva.aG(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static final Set aw(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set setAu = fcva.au(iterable);
        fcva.y(setAu, iterable2);
        return setAu;
    }

    public static final fdev ax(Iterable iterable) {
        iterable.getClass();
        return new fcvl(iterable);
    }

    public static final boolean ay(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static final boolean az(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : fcva.F(iterable, obj) >= 0;
    }
}
