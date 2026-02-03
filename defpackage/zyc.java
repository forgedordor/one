package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyc implements zye {
    public final Object a;

    public zyc(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyc) && fdbq.f(this.a, ((zyc) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Loaded(uiData=" + this.a + ")";
    }
}
