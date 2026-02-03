package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkr extends edku {
    private final String a;
    private final int b;

    public edkr(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null layerName");
        }
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.edku
    public final int a() {
        return this.b;
    }

    @Override // defpackage.edku
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edku) {
            edku edkuVar = (edku) obj;
            if (this.a.equals(edkuVar.b()) && this.b == edkuVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "HueShift{layerName=" + this.a + ", shiftDegrees=" + this.b + "}";
    }
}
