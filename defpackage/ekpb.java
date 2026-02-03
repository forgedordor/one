package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpb extends ekpf {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public ekpb(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.ekpf
    public final int a() {
        return eoln.c(d(this.a), d(this.b));
    }

    @Override // defpackage.ekpf
    public final int b() {
        Set set = this.b;
        Set set2 = this.a;
        int iE = e(set2) - d(set);
        return iE >= 0 ? iE : Math.max(e(set) - d(set2), 0);
    }

    @Override // defpackage.ekpf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c */
    public final ekqg iterator() {
        Set set = this.a;
        Iterator it = set.iterator();
        Set set2 = this.b;
        return new ekpa(it, set2, set2.iterator(), set);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set set = this.b;
        return set.contains(obj) ^ this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.equals(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set set = this.a;
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (!set.contains(it2.next())) {
                i++;
            }
        }
        return i;
    }
}
