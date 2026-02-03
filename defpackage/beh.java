package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class beh extends bfm {
    public final bti a;
    public final bbb b;

    public beh(bti btiVar, bbb bbbVar) {
        this.a = btiVar;
        this.b = bbbVar;
    }

    @Override // defpackage.bfm
    public final bbb a() {
        return this.b;
    }

    @Override // defpackage.bfm
    public final bti b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfm) {
            bfm bfmVar = (bfm) obj;
            if (this.a.equals(bfmVar.b()) && this.b.equals(bfmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.a + ", outputFileOptions=" + this.b + "}";
    }
}
