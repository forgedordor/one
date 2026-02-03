package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfn extends dlfp {
    public final int a;

    public dlfn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlfn) && this.a == ((dlfn) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ResourceId(id=" + this.a + ")";
    }
}
