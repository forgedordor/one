package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class got {
    public final Boolean a;
    public final Boolean b;
    public final int c;

    public got() {
        this.c = 1;
        this.a = null;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof got)) {
            return false;
        }
        got gotVar = (got) obj;
        int i = gotVar.c;
        return fdbq.f(this.a, gotVar.a) && fdbq.f(this.b, gotVar.b);
    }

    public final int hashCode() {
        kod.a(1);
        Boolean bool = this.a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Boolean bool2 = this.b;
        return ((iHashCode + 39122) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public got(boolean z, boolean z2) {
        this.c = 1;
        this.a = Boolean.valueOf(z);
        this.b = Boolean.valueOf(z2);
    }
}
