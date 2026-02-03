package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarw extends aarx {
    public final int a;
    public final int b;
    public final int c;

    public aarw(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.aarx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aarx
    public final int b() {
        return this.a;
    }

    @Override // defpackage.aarx
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aarx) {
            aarx aarxVar = (aarx) obj;
            if (this.a == aarxVar.b() && this.b == aarxVar.a() && this.c == aarxVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "EditDistanceResult{insertions=" + this.a + ", deletions=" + this.b + ", substitutions=" + this.c + "}";
    }
}
