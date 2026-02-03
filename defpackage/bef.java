package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bef extends bff {
    public final bbm a;
    public final int b;
    public final bbb c;

    public bef(bbm bbmVar, int i, bbb bbbVar) {
        this.a = bbmVar;
        this.b = i;
        this.c = bbbVar;
    }

    @Override // defpackage.bff
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bff
    public final bbb b() {
        return this.c;
    }

    @Override // defpackage.bff
    public final bbm c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bff) {
            bff bffVar = (bff) obj;
            if (this.a.equals(bffVar.c()) && this.b == bffVar.a() && this.c.equals(bffVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "In{imageProxy=" + this.a + ", rotationDegrees=" + this.b + ", outputFileOptions=" + this.c + "}";
    }
}
