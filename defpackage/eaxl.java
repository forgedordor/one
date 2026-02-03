package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eaxl extends eayr {
    public final ekgb a;

    public eaxl(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null eventCodes");
        }
        this.a = ekgbVar;
    }

    @Override // defpackage.eayr
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayr) {
            return ekjz.h(this.a, ((eayr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "EventVector{eventCodes=" + this.a.toString() + "}";
    }
}
