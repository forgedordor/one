package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egya extends egzp {
    private final ekhx a;

    public egya(ekhx ekhxVar) {
        if (ekhxVar == null) {
            throw new NullPointerException("Null notificationKeys");
        }
        this.a = ekhxVar;
    }

    @Override // defpackage.egzp, defpackage.egyk
    public final ekhx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egzp) {
            return this.a.equals(((egzp) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetKey{notificationKeys=" + this.a.toString() + "}";
    }
}
