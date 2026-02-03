package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyg extends esyj implements Iterable {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.esyj
    public final String a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return ((esyj) arrayList.get(0)).a();
        }
        throw new IllegalStateException(a.g(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof esyg) && ((esyg) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<esyj> iterator() {
        return this.a.iterator();
    }
}
