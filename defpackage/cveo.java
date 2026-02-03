package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cveo {
    public final boolean a;
    public final boolean b;

    public cveo(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cveo)) {
            return false;
        }
        cveo cveoVar = (cveo) obj;
        return this.a == cveoVar.a && this.b == cveoVar.b;
    }

    public final int hashCode() {
        return (cven.a(this.a) * 31) + cven.a(this.b);
    }

    public final String toString() {
        return "AapmSpamState(isAapmEnabled=" + this.a + ", isSpamEnabled=" + this.b + ")";
    }
}
