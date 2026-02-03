package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhy {
    public final boolean a;
    public final boolean b;

    public yhy(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhy)) {
            return false;
        }
        yhy yhyVar = (yhy) obj;
        return this.a == yhyVar.a && this.b == yhyVar.b;
    }

    public final int hashCode() {
        return (yhx.a(this.a) * 31) + yhx.a(this.b);
    }

    public final String toString() {
        return "Flags(animateTypingIndicatorVisibility=" + this.a + ", enablePenpalDsTwoRows=" + this.b + ")";
    }

    public yhy() {
        this(false, false);
    }
}
