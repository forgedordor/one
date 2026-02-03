package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edvv {
    public final String a;
    public final Object b;
    public final boolean c;
    private final String d;

    public edvv(String str, String str2, Object obj, boolean z) {
        str.getClass();
        this.d = str;
        this.a = str2;
        this.b = obj;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edvv)) {
            return false;
        }
        edvv edvvVar = (edvv) obj;
        return fdbq.f(this.d, edvvVar.d) && fdbq.f(this.a, edvvVar.a) && fdbq.f(this.b, edvvVar.b) && this.c == edvvVar.c;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "AccountInfo(accountName=" + this.d + ", displayName=" + this.a + ", avatarGlideModel=" + this.b + ", hasDefaultPhoto=" + this.c + ")";
    }
}
