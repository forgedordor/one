package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfz {
    private final String a;
    private final cvfy b;
    private final boolean c;
    private final fdap d;
    private final String e;

    public cvfz(String str, cvfy cvfyVar, boolean z, fdap fdapVar, String str2) {
        str.getClass();
        this.a = str;
        this.b = cvfyVar;
        this.c = z;
        this.d = fdapVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvfz)) {
            return false;
        }
        cvfz cvfzVar = (cvfz) obj;
        return fdbq.f(this.a, cvfzVar.a) && fdbq.f(this.b, cvfzVar.b) && this.c == cvfzVar.c && fdbq.f(this.d, cvfzVar.d) && fdbq.f(this.e, cvfzVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "RcsSimStatusUiData(title=" + this.a + ", rcsSimStatusTextUiData=" + this.b + ", rcsEnabled=" + this.c + ", onRcsSimCheckboxChanged=" + this.d + ", checkboxContentDescription=" + this.e + ")";
    }
}
