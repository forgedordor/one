package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fha {
    public final juo a;
    public juo b;
    public boolean c = false;
    public fgl d = null;

    public fha(juo juoVar, juo juoVar2) {
        this.a = juoVar;
        this.b = juoVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fha)) {
            return false;
        }
        fha fhaVar = (fha) obj;
        return fdbq.f(this.a, fhaVar.a) && fdbq.f(this.b, fhaVar.b) && this.c == fhaVar.c && fdbq.f(this.d, fhaVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = true != this.c ? 1237 : 1231;
        fgl fglVar = this.d;
        return (((iHashCode * 31) + i) * 31) + (fglVar == null ? 0 : fglVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
