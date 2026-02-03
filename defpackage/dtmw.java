package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmw extends dtvp {
    private final int a;

    public dtmw(int i) {
        this.a = i;
    }

    @Override // defpackage.dtvp
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dtvp) && this.a == ((dtvp) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "RemoveFileGroupsByFilterResponse{removedFileGroupsCount=" + this.a + "}";
    }
}
