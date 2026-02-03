package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edww extends edwx {
    public final String a;
    public final Object b;

    public edww(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edww)) {
            return false;
        }
        edww edwwVar = (edww) obj;
        return fdbq.f(this.a, edwwVar.a) && fdbq.f(this.b, edwwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Uploading(name=" + this.a + ", avatarGlideModel=" + this.b + ")";
    }
}
