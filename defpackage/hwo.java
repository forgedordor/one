package defpackage;

import j$.util.Set;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwo<E> extends fcuo<E> implements Set<E>, Collection, hut, fdcn {
    public static final hwo a;
    public final Object b;
    public final Object c;
    public final hvp d;

    static {
        hwr hwrVar = hwr.a;
        a = new hwo(hwrVar, hwrVar, hvp.a);
    }

    public hwo(Object obj, Object obj2, hvp hvpVar) {
        this.b = obj;
        this.c = obj2;
        this.d = hvpVar;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.d.b();
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.fcuo, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new hwp(this.b, this.d);
    }
}
