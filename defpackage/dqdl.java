package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqdl implements dqdp {
    public final int a;

    public dqdl(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqdl) && this.a == ((dqdl) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Error(errorMessage=" + this.a + ")";
    }
}
