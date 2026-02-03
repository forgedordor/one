package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyb {
    public final qrz a;
    public final int b;
    public final float c;

    public yyb(qrz qrzVar, int i, float f) {
        this.a = qrzVar;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyb)) {
            return false;
        }
        yyb yybVar = (yyb) obj;
        return fdbq.f(this.a, yybVar.a) && this.b == yybVar.b && Float.compare(this.c, yybVar.c) == 0;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "ReactionAnimation(animation=" + this.a + ", label=" + this.b + ", scale=" + this.c + ")";
    }

    public /* synthetic */ yyb(qrz qrzVar, int i) {
        this(qrzVar, i, 1.0f);
    }
}
