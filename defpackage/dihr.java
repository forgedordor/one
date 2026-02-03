package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dihr {
    public final String a;
    public final djrr b;
    public final fdae c;
    private final boolean d = false;

    public dihr(String str, djrr djrrVar, fdae fdaeVar) {
        this.a = str;
        this.b = djrrVar;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dihr)) {
            return false;
        }
        dihr dihrVar = (dihr) obj;
        if (!fdbq.f(this.a, dihrVar.a) || this.b != dihrVar.b) {
            return false;
        }
        boolean z = dihrVar.d;
        return fdbq.f(this.c, dihrVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "IconActionUiData(title=" + this.a + ", icon=" + this.b + ", shouldTint=false, execute=" + this.c + ")";
    }
}
