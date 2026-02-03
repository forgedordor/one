package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcu {
    public final boolean a;
    public final boolean b;

    public djcu() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djcu)) {
            return false;
        }
        djcu djcuVar = (djcu) obj;
        return this.a == djcuVar.a && this.b == djcuVar.b;
    }

    public final int hashCode() {
        return (djct.a(this.a) * 31) + djct.a(this.b);
    }

    public final String toString() {
        return "Flags(catchNullPointerExceptionsOnTextFieldDraw=" + this.a + ", skipContentSizeAnimation=" + this.b + ")";
    }

    public djcu(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ djcu(boolean z, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), false);
    }
}
