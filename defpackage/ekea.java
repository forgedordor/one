package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekea<E> extends ekes<E> implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue b;

    public ekea(int i) {
        ejwl.d(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    @Override // defpackage.ekei, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        e.getClass();
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (size() == i) {
            this.b.remove();
        }
        this.b.add(e);
        return true;
    }

    @Override // defpackage.ekei, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        int i = this.a;
        if (size < i) {
            return ekjc.l(this, collection.iterator());
        }
        clear();
        return ekis.o(this, ekis.e(collection, size - i));
    }

    @Override // defpackage.ekes, defpackage.ekei
    /* renamed from: b */
    protected final /* synthetic */ Collection hp() {
        return this.b;
    }

    @Override // defpackage.ekes
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.ekei, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekes, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
