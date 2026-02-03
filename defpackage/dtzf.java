package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzf extends dtzp {
    private final dtpg a;

    public dtzf(dtpg dtpgVar) {
        this.a = dtpgVar;
    }

    @Override // defpackage.dtzp
    public final dtpg a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtzp) {
            return this.a.equals(((dtzp) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "InlineDownloadParams{inlineFileContent=" + this.a.toString() + "}";
    }
}
