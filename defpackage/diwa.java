package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diwa {
    public final String a;
    public final djrr b;
    public final boolean c;
    public final boolean d;
    public final fdae e;
    private final boolean f;

    public diwa(String str, djrr djrrVar, boolean z, boolean z2, fdae fdaeVar) {
        str.getClass();
        fdaeVar.getClass();
        this.a = str;
        this.b = djrrVar;
        this.f = true;
        this.c = z;
        this.d = z2;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diwa)) {
            return false;
        }
        diwa diwaVar = (diwa) obj;
        if (!fdbq.f(this.a, diwaVar.a) || this.b != diwaVar.b) {
            return false;
        }
        boolean z = diwaVar.f;
        return this.c == diwaVar.c && this.d == diwaVar.d && fdbq.f(this.e, diwaVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        djrr djrrVar = this.b;
        return ((((((((iHashCode + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31) + divz.a(true)) * 31) + divz.a(this.c)) * 31) + divz.a(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AiButtonUiData(text=" + this.a + ", icon=" + this.b + ", inProgress=true, enableAnimatedWidth=" + this.c + ", enableRevealAnimation=" + this.d + ", onClick=" + this.e + ")";
    }
}
