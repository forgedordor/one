package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktr implements dkts {
    public final int a;

    public dktr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dktr) && this.a == ((dktr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Static(resId=" + this.a + ")";
    }
}
