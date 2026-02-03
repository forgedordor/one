package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxu<T> implements Iterable<T>, fdcn {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Object obj) {
        this.a.add(obj);
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        Iterator<T> it = this.a.iterator();
        it.getClass();
        return it;
    }
}
