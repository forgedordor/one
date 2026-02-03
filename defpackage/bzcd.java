package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcd implements bzca {
    public final String a;

    public bzcd(String str) {
        this.a = str;
    }

    @Override // defpackage.bzca
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzcd) && fdbq.f(this.a, ((bzcd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateResult(cmsId=" + this.a + ")";
    }
}
