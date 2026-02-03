package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyq implements dpyr {
    private final int a;

    public dpyq(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpyq) && this.a == ((dpyq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Open(selectedItemCount=" + this.a + ")";
    }
}
