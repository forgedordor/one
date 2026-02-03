package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfy {
    private final String a;
    private final int b;

    public cvfy(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvfy)) {
            return false;
        }
        cvfy cvfyVar = (cvfy) obj;
        return fdbq.f(this.a, cvfyVar.a) && this.b == cvfyVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "RcsSimStatusTextUiData(statusText=" + this.a + ", color=" + this.b + ")";
    }
}
