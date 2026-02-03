package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuk {
    public final int a;

    public vuk(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuk) && this.a == ((vuk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemovingState(surface=");
        sb.append((Object) (this.a != 2 ? "SELECTOR_TOGGLE" : "ATTACHMENT_PREVIEW"));
        sb.append(")");
        return sb.toString();
    }
}
