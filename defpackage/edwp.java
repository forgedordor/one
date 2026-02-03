package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edwp implements edwq {
    public final String a;
    public final Object b;

    public edwp(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edwp)) {
            return false;
        }
        edwp edwpVar = (edwp) obj;
        return fdbq.f(this.a, edwpVar.a) && fdbq.f(this.b, edwpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UploadingPhoto(name=" + this.a + ", avatarGlideModel=" + this.b + ")";
    }
}
