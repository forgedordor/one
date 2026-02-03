package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjp<E> extends AbstractList<E> implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object[] b;

    public ekjp(Object obj, Object[] objArr) {
        this.a = obj;
        this.b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        ejwl.v(i, size());
        return i == 0 ? (E) this.a : (E) this.b[i - 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int length = this.b.length;
        return eoln.c(3, 1);
    }
}
