package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddly extends ddmd {
    private final String a;
    private final ejwi b;

    public ddly(String str, ejwi ejwiVar) {
        if (str == null) {
            throw new NullPointerException("Null appPackage");
        }
        this.a = str;
        this.b = ejwiVar;
    }

    @Override // defpackage.ddmd
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.ddmd
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddmd) {
            ddmd ddmdVar = (ddmd) obj;
            if (this.a.equals(ddmdVar.b()) && this.b.equals(ddmdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CallerInfo{appPackage=" + this.a + ", appVersionCode=" + this.b.toString() + "}";
    }
}
