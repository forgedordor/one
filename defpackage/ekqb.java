package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekqb<E> extends ekpv<E> implements Set<E> {
    private static final long serialVersionUID = 0;

    public ekqb(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.ekpv
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set a() {
        return (Set) super.a();
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }
}
