package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fene implements List, Serializable {
    private static final long serialVersionUID = -3700862452550012357L;
    public final fety a;
    public ferg b;
    public boolean c;
    private final List d;

    public fene() {
        this.a = fety.f;
        this.d = new ArrayList();
    }

    public final void a(ferg fergVar) {
        if (!fety.e.equals(this.a)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                ((fenh) it.next()).a(fergVar);
            }
        }
        this.b = fergVar;
        this.c = false;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.d.add(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.d.addAll(i, collection);
    }

    public final void b(fend fendVar) {
        if (!(fendVar instanceof fenh)) {
            if (!fety.e.equals(this.a)) {
                fenh fenhVar = new fenh(fendVar);
                fenhVar.a(this.b);
                add(fenhVar);
                return;
            }
        } else if (this.c) {
            ((fenh) fendVar).b(true);
        } else {
            ferg fergVar = this.b;
            if (fergVar != null) {
                ((fenh) fendVar).a(fergVar);
            }
        }
        add(fendVar);
    }

    public final void c() {
        if (!fety.e.equals(this.a)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                ((fenh) it.next()).b(true);
            }
        }
        this.b = null;
        this.c = true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.d.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        fene feneVar = (fene) obj;
        ffhf ffhfVar = new ffhf();
        ffhfVar.c(this.d, feneVar.d);
        ffhfVar.c(this.a, feneVar.a);
        ffhfVar.c(this.b, feneVar.b);
        boolean z = this.c;
        ffhfVar.d(z, z);
        return ffhfVar.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.d.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.d);
        ffhgVar.c(this.a);
        ffhgVar.c(this.b);
        ffhgVar.d(this.c);
        return ffhgVar.a;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.d.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.d.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.d.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.d.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.d.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.d.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.d.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.d.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.d.toArray();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        if (obj instanceof fend) {
            return this.d.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(fend.class.getName())));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.d.addAll(collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.d.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.d.toArray(objArr);
    }

    public fene(String str, fety fetyVar, ferg fergVar) {
        this(fetyVar, fergVar);
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            if (fety.e.equals(this.a)) {
                add(new fend(stringTokenizer.nextToken()));
            } else {
                add(new fenh(stringTokenizer.nextToken(), fergVar));
            }
        }
    }

    public fene(fety fetyVar) {
        this(fetyVar, null);
    }

    public fene(fety fetyVar, ferg fergVar) {
        if (fetyVar == null) {
            this.a = fety.f;
        } else {
            this.a = fetyVar;
        }
        this.b = fergVar;
        this.d = new ArrayList();
    }
}
