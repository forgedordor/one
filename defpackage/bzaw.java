package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzaw {
    public final Object a;

    public bzaw(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzaw) && fdbq.f(this.a, ((bzaw) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AddToCms(localRow=" + this.a + ")";
    }
}
