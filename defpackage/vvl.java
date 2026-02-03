package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvl {
    private final String a;

    public vvl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvl) && fdbq.f(this.a, ((vvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AttachmentId(value=" + this.a + ")";
    }
}
