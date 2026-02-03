package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknl implements dknr {
    public final String a;
    public final fdae b;

    public dknl(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dknl)) {
            return false;
        }
        dknl dknlVar = (dknl) obj;
        return fdbq.f(this.a, dknlVar.a) && fdbq.f(this.b, dknlVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Downloadable(label=" + this.a + ", onDownloadButtonClicked=" + this.b + ")";
    }
}
