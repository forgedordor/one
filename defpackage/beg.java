package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class beg extends bfj {
    public final bti a;
    public final int b;

    public beg(bti btiVar, int i) {
        this.a = btiVar;
        this.b = i;
    }

    @Override // defpackage.bfj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bfj
    public final bti b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfj) {
            bfj bfjVar = (bfj) obj;
            if (this.a.equals(bfjVar.b()) && this.b == bfjVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "In{packet=" + this.a + ", jpegQuality=" + this.b + "}";
    }
}
