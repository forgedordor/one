package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class barf extends barg {
    public final auej a;

    public barf(auej auejVar) {
        if (auejVar == null) {
            throw new NullPointerException("Null value");
        }
        this.a = auejVar;
    }

    @Override // defpackage.barg
    public final auej a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof barg) {
            return this.a.equals(((barg) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RcsGroupJoinStatus{value=" + this.a.toString() + "}";
    }
}
