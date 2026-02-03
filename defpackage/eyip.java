package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyip extends eyiq {
    private final Object a;

    public eyip(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.eyiq
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eyip) {
            return ejwh.a(this.a, ((eyip) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Produced[" + this.a + "]";
    }
}
