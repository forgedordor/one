package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtzc extends dtzl {
    private final boolean d;
    private final ekhx e;

    public dtzc(boolean z, ekhx ekhxVar) {
        this.d = z;
        this.e = ekhxVar;
    }

    @Override // defpackage.dtzl
    public final ekhx a() {
        return this.e;
    }

    @Override // defpackage.dtzl
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtzl) {
            dtzl dtzlVar = (dtzl) obj;
            if (this.d == dtzlVar.b() && this.e.equals(dtzlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "DownloadConstraints{requireUnmeteredNetwork=" + this.d + ", requiredNetworkTypes=" + String.valueOf(this.e) + "}";
    }
}
