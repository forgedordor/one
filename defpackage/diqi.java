package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqi implements diqp {
    public final qrz a;
    public final float b;
    public final int c;
    public final String d;
    public final dirz e;
    private final boolean f = true;

    public diqi(qrz qrzVar, float f, int i, String str, dirz dirzVar) {
        this.a = qrzVar;
        this.b = f;
        this.c = i;
        this.d = str;
        this.e = dirzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diqi)) {
            return false;
        }
        diqi diqiVar = (diqi) obj;
        if (!fdbq.f(this.a, diqiVar.a) || Float.compare(this.b, diqiVar.b) != 0) {
            return false;
        }
        boolean z = diqiVar.f;
        return this.c == diqiVar.c && fdbq.f(this.d, diqiVar.d) && fdbq.f(this.e, diqiVar.e);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + 1231) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Animation(lottie=" + this.a + ", scale=" + this.b + ", isAnimating=true, count=" + this.c + ", contentDescription=" + this.d + ", style=" + this.e + ")";
    }
}
