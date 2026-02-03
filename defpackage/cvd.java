package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvd<E> extends cvu<E> implements Set<E>, fdcs {
    public final cva a;

    public cvd(cva cvaVar) {
        super(cvaVar);
        this.a = cvaVar;
    }

    @Override // defpackage.cvu, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.a.g(e);
    }

    @Override // defpackage.cvu, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        return this.a.h(collection);
    }

    @Override // defpackage.cvu, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.a();
    }

    @Override // defpackage.cvu, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new cvc(this);
    }

    @Override // defpackage.cvu, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.i(obj);
    }

    @Override // defpackage.cvu, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        cva cvaVar = this.a;
        int i = cvaVar.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            cvaVar.b(it.next());
        }
        return i != cvaVar.d;
    }

    @Override // defpackage.cvu, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        collection.getClass();
        cva cvaVar = this.a;
        Object[] objArr = cvaVar.b;
        int i2 = cvaVar.d;
        long[] jArr = cvaVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!fcva.az(collection, objArr[i6])) {
                                cvaVar.f(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != cvaVar.d;
    }
}
