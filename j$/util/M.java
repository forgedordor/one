package j$.util;

/* loaded from: classes9.dex */
public final class M extends m0 {
    public final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(java.util.SortedSet sortedSet, java.util.SortedSet sortedSet2) {
        super(sortedSet2, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.m0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f.comparator();
    }
}
