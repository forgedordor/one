package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpy extends ekpz implements ekmj {
    private static final long serialVersionUID = 0;
    transient Collection a;
    transient Map b;

    public ekpy(ekmj ekmjVar) {
        super(ekmjVar, null);
    }

    @Override // defpackage.ekmj
    public final boolean A() {
        throw null;
    }

    @Override // defpackage.ekmj
    public final boolean B(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ekmj
    public final void C(ekmj ekmjVar) {
        throw null;
    }

    final ekmj a() {
        return (ekmj) this.f;
    }

    @Override // defpackage.ekmj
    public final Collection c(Object obj) {
        Collection collectionA;
        Object obj2 = this.g;
        synchronized (obj2) {
            collectionA = ekqd.a(a().c(obj), obj2);
        }
        return collectionA;
    }

    @Override // defpackage.ekmj
    public final Collection d(Object obj) {
        Collection collectionD;
        synchronized (this.g) {
            collectionD = a().d(obj);
        }
        return collectionD;
    }

    @Override // defpackage.ekmj
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // defpackage.ekmj
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.ekmj
    public final int i() {
        throw null;
    }

    @Override // defpackage.ekmj
    public final void q() {
        throw null;
    }

    @Override // defpackage.ekmj
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.ekmj
    public final boolean t(Object obj, Object obj2) {
        boolean zT;
        synchronized (this.g) {
            zT = a().t(obj, obj2);
        }
        return zT;
    }

    @Override // defpackage.ekmj
    public final Collection u() {
        Collection collection;
        Object obj = this.g;
        synchronized (obj) {
            if (this.a == null) {
                this.a = ekqd.a(a().u(), obj);
            }
            collection = this.a;
        }
        return collection;
    }

    @Override // defpackage.ekmj
    public final Collection v() {
        throw null;
    }

    @Override // defpackage.ekmj
    public final Map w() {
        Map map;
        Object obj = this.g;
        synchronized (obj) {
            if (this.b == null) {
                this.b = new ekpp(a().w(), obj);
            }
            map = this.b;
        }
        return map;
    }

    @Override // defpackage.ekmj
    public final Set x() {
        throw null;
    }

    @Override // defpackage.ekmj
    public final boolean y(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ekmj
    public final boolean z(Object obj) {
        throw null;
    }
}
