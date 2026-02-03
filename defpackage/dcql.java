package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcql extends dcqu {
    public final String a;

    public dcql(String str) {
        this.a = str;
    }

    @Override // defpackage.dcqu
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcqu) {
            return this.a.equals(((dcqu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "VmKey{version=" + this.a + "}";
    }
}
