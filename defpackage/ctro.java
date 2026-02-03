package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctro {
    public final String a;
    public final boolean b;

    public ctro() {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctro) && fdbq.f(this.a, ((ctro) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupNameConfig(name=" + this.a + ")";
    }

    public ctro(String str) {
        this.a = str;
        this.b = str.length() > 0;
    }
}
