package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgn {
    public final int a;
    public final int b;
    private final int c;

    public dpgn(int i, int i2, int i3) {
        this.c = i;
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpgn)) {
            return false;
        }
        dpgn dpgnVar = (dpgn) obj;
        return this.c == dpgnVar.c && this.a == dpgnVar.a && this.b == dpgnVar.b;
    }

    public final int hashCode() {
        return (((this.c * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        return "PhotomojiButtonColors(imageTint=" + this.c + ", border=" + this.a + ", background=" + this.b + ")";
    }
}
