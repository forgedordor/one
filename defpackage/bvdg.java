package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvdg {
    public String a;
    public final int b;

    public bvdg(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bvdg)) {
            return false;
        }
        String str = this.a;
        return str != null ? fdbq.f(str, ((bvdg) obj).a) : this.b == ((bvdg) obj).b;
    }

    public final int hashCode() {
        String str = this.a;
        return str != null ? str.hashCode() : this.b;
    }

    public final String toString() {
        String str = this.a;
        return str == null ? String.valueOf(this.b) : str;
    }

    public bvdg(String str) {
        this.b = -1;
        this.a = str;
    }
}
