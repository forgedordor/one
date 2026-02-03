package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccep {
    public final String a;

    public ccep(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccep) && fdbq.f(this.a, ((ccep) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MlsGroup(groupId=" + this.a + ")";
    }
}
