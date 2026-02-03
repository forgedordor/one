package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eket<E> extends ekei<E> implements Set<E> {
    protected eket() {
    }

    @Override // defpackage.ekei
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Set c();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c().hashCode();
    }
}
