package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wat {
    public final fdae a;
    public final fdpl b;
    public final fdvc c;

    public wat(fdae fdaeVar, fdpl fdplVar, fdvc fdvcVar) {
        this.a = fdaeVar;
        this.b = fdplVar;
        this.c = fdvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wat)) {
            return false;
        }
        wat watVar = (wat) obj;
        return fdbq.f(this.a, watVar.a) && fdbq.f(this.b, watVar.b) && fdbq.f(this.c, watVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ShowCameraUiData(onCameraButtonClick=" + this.a + ", cameraUiData=" + this.b + ", forceShowCamera=" + this.c + ")";
    }
}
