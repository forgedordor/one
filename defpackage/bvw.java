package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvw extends bwc {
    private final lvj a;
    private final bqz b;

    public bvw(lvj lvjVar, bqz bqzVar) {
        this.a = lvjVar;
        this.b = bqzVar;
    }

    @Override // defpackage.bwc
    public final bqz a() {
        return this.b;
    }

    @Override // defpackage.bwc
    public final lvj b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwc) {
            bwc bwcVar = (bwc) obj;
            if (this.a.equals(bwcVar.b()) && this.b.equals(bwcVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
