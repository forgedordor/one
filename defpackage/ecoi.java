package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecoi {
    public final String a;
    public final Class b;

    public ecoi(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecoi) {
            ecoi ecoiVar = (ecoi) obj;
            if (this.b == ecoiVar.b && this.a.equals(ecoiVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
