package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwr extends bxh {
    public final cax a;
    public final bwi b;
    public final int c;

    public bwr(cax caxVar, bwi bwiVar, int i) {
        this.a = caxVar;
        this.b = bwiVar;
        this.c = i;
    }

    @Override // defpackage.bxh
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bxh
    public final bwi b() {
        return this.b;
    }

    @Override // defpackage.bxh
    public final cax c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxh) {
            bxh bxhVar = (bxh) obj;
            if (this.a.equals(bxhVar.c()) && this.b.equals(bxhVar.b()) && this.c == bxhVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "MediaSpec{videoSpec=" + this.a + ", audioSpec=" + this.b + ", outputFormat=" + this.c + "}";
    }
}
