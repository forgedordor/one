package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iac<T> implements List<T>, RandomAccess, iaw, fdco {
    public iay a;

    public iac() {
        hvj hvjVar = hvj.a;
        hzg hzgVarB = hzt.b();
        iab iabVar = new iab(hzgVarB.v(), hvjVar);
        if (!(hzgVarB instanceof hyz)) {
            iabVar.h = new iab(1L, hvjVar);
        }
        this.a = iabVar;
    }

    public static final boolean i(iab iabVar, int i, huv huvVar, boolean z) {
        boolean z2;
        synchronized (iad.a) {
            int i2 = iabVar.b;
            if (i2 == i) {
                iabVar.a = huvVar;
                z2 = true;
                if (z) {
                    iabVar.c++;
                }
                iabVar.b = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    private final boolean j(fdap fdapVar) {
        int i;
        huv huvVar;
        Object objInvoke;
        hzg hzgVarB;
        boolean zI;
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huu huuVarB = huvVar.b();
            objInvoke = fdapVar.invoke(huuVarB);
            huv huvVarA = huuVarB.a();
            if (fdbq.f(huvVarA, huvVar)) {
                break;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i, huvVarA, true);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
        return ((Boolean) objInvoke).booleanValue();
    }

    public final int a() {
        return c().a.size();
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i2 = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huv huvVarD = huvVar.d(i, t);
            if (fdbq.f(huvVarD, huvVar)) {
                return;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i2, huvVarD, true);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection<? extends T> collection) {
        return j(new fdap() { // from class: iaa
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    public final int b() {
        iay iayVar = this.a;
        iayVar.getClass();
        return ((iab) hzt.e(iayVar)).c;
    }

    public final iab c() {
        iay iayVar = this.a;
        iayVar.getClass();
        return (iab) hzt.j(iayVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        hzg hzgVarB;
        iay iayVar = this.a;
        iayVar.getClass();
        synchronized (hzt.c) {
            hzgVarB = hzt.b();
            iab iabVar = (iab) hzt.l(iayVar, this, hzgVarB);
            synchronized (iad.a) {
                iabVar.a = hvj.a;
                iabVar.b++;
                iabVar.c++;
            }
        }
        hzt.t(hzgVarB, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return c().a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return c().a.containsAll(collection);
    }

    @Override // defpackage.iaw
    public final iay d() {
        return this.a;
    }

    @Override // defpackage.iaw
    public final void e(iay iayVar) {
        iayVar.h = this.a;
        iayVar.getClass();
        this.a = (iab) iayVar;
    }

    public final Object f(int i) {
        int i2;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        T t = get(i);
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i2 = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huv huvVarI = huvVar.i(i);
            if (fdbq.f(huvVarI, huvVar)) {
                break;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i2, huvVarI, true);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
        return t;
    }

    @Override // defpackage.iaw
    public final /* synthetic */ iay g(iay iayVar, iay iayVar2, iay iayVar3) {
        return null;
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) c().a.get(i);
    }

    public final void h(int i, int i2) {
        int i3;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i3 = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huu huuVarB = huvVar.b();
            huuVarB.subList(i, i2).clear();
            huv huvVarA = huuVarB.a();
            if (fdbq.f(huvVarA, huvVar)) {
                return;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i3, huvVarA, true);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return c().a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new iaq(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new iaq(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) f(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huv huvVarG = huvVar.g(collection);
            if (fdbq.f(huvVarG, huvVar)) {
                return false;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i, huvVarG, true);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(final Collection<?> collection) {
        return j(new fdap() { // from class: hzz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).retainAll(collection));
            }
        });
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        T t2 = get(i);
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i2 = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huv huvVarJ = huvVar.j(i, t);
            if (fdbq.f(huvVarJ, huvVar)) {
                break;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i2, huvVarJ, false);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            hpq.a("fromIndex or toIndex are out of bounds");
        }
        return new iba(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fdbj.a(this);
    }

    public final String toString() {
        iay iayVar = this.a;
        iayVar.getClass();
        return "SnapshotStateList(value=" + ((iab) hzt.e(iayVar)).a + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huv huvVarE = huvVar.e(collection);
            if (fdbq.f(huvVarE, huvVar)) {
                return false;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i, huvVarE, true);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new iaq(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huv huvVarF = huvVar.f(obj);
            if (fdbq.f(huvVarF, huvVar)) {
                return false;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i, huvVarF, true);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) fdbj.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        huv huvVar;
        hzg hzgVarB;
        boolean zI;
        do {
            synchronized (iad.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iab iabVar = (iab) hzt.e(iayVar);
                i = iabVar.b;
                huvVar = iabVar.a;
            }
            huvVar.getClass();
            huv huvVarC = huvVar.c(t);
            if (fdbq.f(huvVarC, huvVar)) {
                return false;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zI = i((iab) hzt.l(iayVar2, this, hzgVarB), i, huvVarC, true);
            }
            hzt.t(hzgVarB, this);
        } while (!zI);
        return true;
    }
}
