package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcwj<T> extends fcuh<T> {
    public final List a;

    public fcwj(List list) {
        this.a = list;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.fcuh, java.util.List
    public final T get(int i) {
        if (i >= 0 && i <= fcva.e(this)) {
            return (T) this.a.get(fcva.e(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new fddq(0, fcva.e(this)) + "].");
    }

    @Override // defpackage.fcuh, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new fcwi(this, 0);
    }

    @Override // defpackage.fcuh, java.util.List
    public final ListIterator<T> listIterator() {
        return new fcwi(this, 0);
    }

    @Override // defpackage.fcuh, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new fcwi(this, i);
    }
}
