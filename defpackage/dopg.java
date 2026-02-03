package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dopg {
    public final boolean a;
    public final int b = 3;

    public dopg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dopg)) {
            return false;
        }
        dopg dopgVar = (dopg) obj;
        if (this.a != dopgVar.a) {
            return false;
        }
        int i = dopgVar.b;
        return true;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + 3;
    }

    public final String toString() {
        return "PhotosApiConfiguration(usePrimesInterceptor=" + this.a + ", requestSource=" + ((Object) Integer.toString(1)) + ")";
    }
}
