package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbzj {
    final evuh a;

    public dbzj() {
        this.a = null;
    }

    public static dbzj a(evuh evuhVar) {
        return (evuhVar == null || evuhVar == evrl.a) ? dbzq.a : new dbzj(evuhVar);
    }

    public final boolean equals(Object obj) {
        evuh evuhVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbzj) && (evuhVar = this.a) != null && evuhVar.equals(((dbzj) obj).a);
    }

    public final int hashCode() {
        dclh.h(!dbzq.b.equals(this));
        if (dbzq.a.equals(this)) {
            return 0;
        }
        evuh evuhVar = this.a;
        dclh.m(evuhVar);
        return evuhVar.hashCode();
    }

    public final String toString() {
        if (dbzq.b.equals(this)) {
            return "$use_sticky_dims$";
        }
        if (dbzq.a.equals(this)) {
            return "$no_dims$";
        }
        evuh evuhVar = this.a;
        dclh.m(evuhVar);
        return evuhVar.toString();
    }

    private dbzj(evuh evuhVar) {
        this.a = evuhVar;
    }
}
