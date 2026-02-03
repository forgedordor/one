package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feot implements Set, Serializable {
    private static final long serialVersionUID = -2317587285790834492L;
    public ferg a;
    public boolean b;
    public final boolean c;
    private final Set d;

    public feot() {
        this(true, false);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        if (obj instanceof feos) {
            return this.d.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(feos.class.getName())));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.d.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        feot feotVar = (feot) obj;
        ffhf ffhfVar = new ffhf();
        ffhfVar.c(this.d, feotVar.d);
        ffhfVar.c(this.a, feotVar.a);
        boolean z = this.b;
        ffhfVar.d(z, z);
        return ffhfVar.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.d);
        ffhgVar.c(this.a);
        ffhgVar.d(this.b);
        return ffhgVar.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.d.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.d.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.d.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.d.toArray();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toString());
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public feot(String str) {
        this();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            add(new feos(stringTokenizer.nextToken()));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.d.toArray(objArr);
    }

    public feot(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.d = z2 ? Collections.EMPTY_SET : new TreeSet();
    }
}
