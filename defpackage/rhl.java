package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhl implements Iterable {
    public final List a;

    public rhl(List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final rhl b() {
        return new rhl(new ArrayList(this.a));
    }

    final boolean c(rtk rtkVar) {
        return this.a.contains(new rhk(rtkVar, rva.b));
    }

    final boolean d() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<rhk> iterator() {
        return this.a.iterator();
    }

    public rhl() {
        this(new ArrayList(2));
    }
}
