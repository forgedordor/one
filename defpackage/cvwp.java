package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwp {
    public final djvp a;
    public final String b;

    public cvwp(djvp djvpVar, String str) {
        this.a = djvpVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvwp)) {
            return false;
        }
        cvwp cvwpVar = (cvwp) obj;
        return fdbq.f(this.a, cvwpVar.a) && fdbq.f(this.b, cvwpVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ActiveSimUiData(activeSim=" + this.a + ", lineTitle=" + this.b + ")";
    }
}
