package j$.util;

/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0182w extends C0180u implements java.util.SortedSet, SortedSet {
    private static final long serialVersionUID = -4929149591599911165L;
    public final java.util.SortedSet b;

    public C0182w(java.util.SortedSet sortedSet) {
        super(sortedSet);
        this.b = sortedSet;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return this.b.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.b.first();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        return new C0182w(this.b.headSet(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.b.last();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return new C0182w(this.b.subSet(obj, obj2));
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        return new C0182w(this.b.tailSet(obj));
    }
}
