package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class comp extends conb {
    private final String a;

    public comp(String str) {
        this.a = str;
    }

    @Override // defpackage.conb
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof conb) {
            return this.a.equals(((conb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DownloadResult{downloadId=" + this.a + "}";
    }
}
