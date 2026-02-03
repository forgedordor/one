package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aftb {
    public final String a;
    public final fdae b;

    public aftb(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aftb)) {
            return false;
        }
        aftb aftbVar = (aftb) obj;
        return fdbq.f(this.a, aftbVar.a) && fdbq.f(this.b, aftbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ClickableText(text=" + this.a + ", onToggle=" + this.b + ")";
    }
}
