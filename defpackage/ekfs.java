package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfs extends ekhx {
    private final transient EnumSet a;
    private transient int b;

    public ekfs(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static ekhx a(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new ekfs(enumSet) : new ekph((Enum) ekis.l(enumSet)) : ekon.a;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ekhx
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof ekfs) {
            collection = ((ekfs) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.ekhx, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekfs) {
            obj = ((ekfs) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.ekhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return ekjc.d(this.a.iterator());
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return new ekfr(this.a);
    }
}
