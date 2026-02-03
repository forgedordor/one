package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edly extends edmm {
    public final ejwi a;
    public final int b;

    public edly(int i, ejwi ejwiVar) {
        if (i == 0) {
            throw new NullPointerException("Null entryPoint");
        }
        this.b = i;
        this.a = ejwiVar;
    }

    @Override // defpackage.edmm
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.edmm
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edmm) {
            edmm edmmVar = (edmm) obj;
            if (this.b == edmmVar.b() && this.a.equals(edmmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        ejwi ejwiVar = this.a;
        return "ProfilePhotoMetadata{entryPoint=" + Integer.toString(i - 1) + ", illustrationId=" + ejwiVar.toString() + "}";
    }
}
