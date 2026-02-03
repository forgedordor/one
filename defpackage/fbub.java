package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbub {
    public static final fbub a;
    public final int b;

    static {
        fbua fbuaVar = new fbua(0);
        fbuaVar.b(1);
        a = fbuaVar.a();
    }

    public fbub(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((fbub) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "BindServiceFlags{" + Integer.toHexString(this.b) + "}";
    }
}
