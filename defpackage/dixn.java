package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dixn {
    public final String a;
    public final fdae b;

    public dixn(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dixn)) {
            return false;
        }
        dixn dixnVar = (dixn) obj;
        return fdbq.f(this.a, dixnVar.a) && fdbq.f(this.b, dixnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SwipeButtonUiData(text=" + this.a + ", onSwiped=" + this.b + ")";
    }
}
