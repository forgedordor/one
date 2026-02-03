package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aonu implements aonv {
    public final aont a;

    public aonu(aont aontVar) {
        this.a = aontVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aonu) && fdbq.f(this.a, ((aonu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unavailable(reason=" + this.a + ")";
    }
}
